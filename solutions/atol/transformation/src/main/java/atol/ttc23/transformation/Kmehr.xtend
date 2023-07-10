package atol.ttc23.transformation

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage
import be.fgov.ehealth.standards.kmehr.cd.cd.CdPackage
import be.fgov.ehealth.standards.kmehr.dt.dt.DtPackage
import be.fgov.ehealth.standards.kmehr.id.id.IdPackage
import fr.eseo.aof.xtend.utils.AOFAccessors

import be.fgov.ehealth.standards.kmehr.schema.kmehr.TelecomType

import static fr.eseo.atol.gen.MetamodelUtils.*

@AOFAccessors(value = #[KmehrPackage, CdPackage, DtPackage, IdPackage], enumLiteralSuffix = "")
class Kmehr {

	public val __telecomnumber = <TelecomType, String>oneDefault("")[
		_telecomnumber
	]
}
