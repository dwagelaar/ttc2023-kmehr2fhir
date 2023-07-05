package atol.ttc23.transformation

import org.eclipse.emf.ecore.EObject

import org.eclipse.papyrus.aof.core.AOFFactory
import org.eclipse.papyrus.aof.core.IBox

import fr.eseo.atol.gen.ATOLGen
import fr.eseo.atol.gen.ATOLGen.Metamodel

import java.math.BigInteger
import javax.xml.datatype.XMLGregorianCalendar
import org.eclipse.emf.ecore.xml.type.impl.XMLTypeFactoryImpl

import org.hl7.emf.fhir.FhirFactory

@ATOLGen(transformation="src/main/resources/KMEHRtoFHIR.generated.atl", metamodels=#[ 
	@Metamodel(name="FHIR", impl=Fhir),
	@Metamodel(name="KMEHR", impl=Kmehr)
], libraries=#[
    "src/main/resources/libKMEHRtoFHIR.atl"
])
class Kmehr2Fhir {
	val factory = AOFFactory.INSTANCE

	def refImmediateComposite(EObject eo) {
		// TODO: make incremental
		factory.createOne(eo.eContainer())
	}

	def IBox<String> randomUUID() {
		return factory.createOne(java.util.UUID.randomUUID().toString())
	}

	val dateFactory = XMLTypeFactoryImpl.init()
	def IBox<XMLGregorianCalendar> createDateTime(IBox<XMLGregorianCalendar> date, IBox<XMLGregorianCalendar> time) {
		date.zipWith(time)[d, t|
			if(d === null || t === null) {
				null
			} else {
				dateFactory.createDateTime(d.toXMLFormat + "T" + t.toXMLFormat)
			}
		]
	}

	// equivalent to ATL/EMFTVM's "#native"!"java::math::BigInteger".refInvokeStaticOperation('valueOf', Sequence{s.longValue()})
	def toBigInteger(Integer l) {
		return factory.createOne(BigInteger.valueOf(l.longValue))
	}

	val fhirFactory = FhirFactory.eINSTANCE

	def _FhirString(String s) {
		val fhirString = fhirFactory.createString()
		fhirString.setValue(s)
		return factory.createOne(fhirString)
	}

	def FhirString(IBox<String> s) {
		s.collectMutable[e | _FhirString(e)]
	}

	def _FhirBoolean(Boolean s) {
		val fhirBoolean = fhirFactory.createBoolean()
		fhirBoolean.setValue(s)
		return fhirBoolean
	}

	def FhirBoolean(IBox<Boolean> s) {
		s.collect[e | _FhirBoolean(e)]
	}

	def _FhirPositiveInt(Integer s) {
		val fhirPositiveInt = fhirFactory.createPositiveInt()
		fhirPositiveInt.setValue(java.math.BigInteger.valueOf(s.longValue))
		return fhirPositiveInt
	}

	def FhirPositiveInt(IBox<Integer> s) {
		s.collect[e | _FhirPositiveInt(e)]
	}

	def _FhirDecimal(Object s) {
		val fhirDecimal = fhirFactory.createDecimal()
		fhirDecimal.setValue(s)
		return fhirDecimal
	}

	def FhirDecimal(IBox<Object> s) {
		s.collect[e | _FhirDecimal(e)]
	}

	// tuple part accessors:

	def _code(Object it) {
		factory.createOne(
			(it as java.util.Map<?, ?>).get("code") as String
		)
	}

	def _system(Object it) {
		factory.createOne(
			(it as java.util.Map<?, ?>).get("system") as String
		)
	}

	def _display(Object it) {
		factory.createOne(
			(it as java.util.Map<?, ?>).get("display") as String
		)
	}
}
