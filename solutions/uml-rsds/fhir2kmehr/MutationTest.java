package fhir2kmehr;

import java.util.Vector;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MutationTest
{
  public static void newCDTELECOM_mutation_tests(CDTELECOM _self, int[] _counts, int[] _totals)
  {   try {
        String tval = "";

    CDTELECOM newCDTELECOM_result = _self.newCDTELECOM(tval);
    System.out.println("Test 0 of newCDTELECOM on " + _self + " result = " + newCDTELECOM_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String tval = " abc_XZ ";

    CDTELECOM newCDTELECOM_result = _self.newCDTELECOM(tval);
    System.out.println("Test 1 of newCDTELECOM on " + _self + " result = " + newCDTELECOM_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String tval = "#�$* &~@':";

    CDTELECOM newCDTELECOM_result = _self.newCDTELECOM(tval);
    System.out.println("Test 2 of newCDTELECOM on " + _self + " result = " + newCDTELECOM_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCDTELECOM mutants"); }
     }
   }



  public static void newCountryType_mutation_tests(CountryType _self, int[] _counts, int[] _totals)
  {   try {
        String cc = "";

    CountryType newCountryType_result = _self.newCountryType(cc);
    System.out.println("Test 0 of newCountryType on " + _self + " result = " + newCountryType_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String cc = " abc_XZ ";

    CountryType newCountryType_result = _self.newCountryType(cc);
    System.out.println("Test 1 of newCountryType on " + _self + " result = " + newCountryType_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String cc = "#�$* &~@':";

    CountryType newCountryType_result = _self.newCountryType(cc);
    System.out.println("Test 2 of newCountryType on " + _self + " result = " + newCountryType_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCountryType mutants"); }
     }
   }



  public static void newSexType_mutation_tests(SexType _self, int[] _counts, int[] _totals)
  {   try {
        String sval = "";

    SexType newSexType_result = _self.newSexType(sval);
    System.out.println("Test 0 of newSexType on " + _self + " result = " + newSexType_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sval = " abc_XZ ";

    SexType newSexType_result = _self.newSexType(sval);
    System.out.println("Test 1 of newSexType on " + _self + " result = " + newSexType_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sval = "#�$* &~@':";

    SexType newSexType_result = _self.newSexType(sval);
    System.out.println("Test 2 of newSexType on " + _self + " result = " + newSexType_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newSexType mutants"); }
     }
   }



  public static void newFhirBoolean_mutation_tests(FhirBoolean _self, int[] _counts, int[] _totals)
  {   try {
        String strx = "";

    FhirBoolean newFhirBoolean_result = _self.newFhirBoolean(strx);
    System.out.println("Test 0 of newFhirBoolean on " + _self + " result = " + newFhirBoolean_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String strx = " abc_XZ ";

    FhirBoolean newFhirBoolean_result = _self.newFhirBoolean(strx);
    System.out.println("Test 1 of newFhirBoolean on " + _self + " result = " + newFhirBoolean_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String strx = "#�$* &~@':";

    FhirBoolean newFhirBoolean_result = _self.newFhirBoolean(strx);
    System.out.println("Test 2 of newFhirBoolean on " + _self + " result = " + newFhirBoolean_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newFhirBoolean mutants"); }
     }
   }



  public static void newFhirInteger_mutation_tests(FhirInteger _self, int[] _counts, int[] _totals)
  {   try {
        String strx = "";

    FhirInteger newFhirInteger_result = _self.newFhirInteger(strx);
    System.out.println("Test 0 of newFhirInteger on " + _self + " result = " + newFhirInteger_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String strx = " abc_XZ ";

    FhirInteger newFhirInteger_result = _self.newFhirInteger(strx);
    System.out.println("Test 1 of newFhirInteger on " + _self + " result = " + newFhirInteger_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String strx = "#�$* &~@':";

    FhirInteger newFhirInteger_result = _self.newFhirInteger(strx);
    System.out.println("Test 2 of newFhirInteger on " + _self + " result = " + newFhirInteger_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newFhirInteger mutants"); }
     }
   }



  public static void newId_mutation_tests(Id _self, int[] _counts, int[] _totals)
  {   try {
        String uid = "";

    Id newId_result = _self.newId(uid);
    System.out.println("Test 0 of newId on " + _self + " result = " + newId_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String uid = " abc_XZ ";

    Id newId_result = _self.newId(uid);
    System.out.println("Test 1 of newId on " + _self + " result = " + newId_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String uid = "#�$* &~@':";

    Id newId_result = _self.newId(uid);
    System.out.println("Test 2 of newId on " + _self + " result = " + newId_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newId mutants"); }
     }
   }



  public static void newUri_mutation_tests(Uri _self, int[] _counts, int[] _totals)
  {   try {
        String sys = "";

    Uri newUri_result = _self.newUri(sys);
    System.out.println("Test 0 of newUri on " + _self + " result = " + newUri_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";

    Uri newUri_result = _self.newUri(sys);
    System.out.println("Test 1 of newUri on " + _self + " result = " + newUri_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";

    Uri newUri_result = _self.newUri(sys);
    System.out.println("Test 2 of newUri on " + _self + " result = " + newUri_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newUri mutants"); }
     }
   }



  public static void newUrn_mutation_tests(Uri _self, int[] _counts, int[] _totals)
  {   try {
        String uid = "";

    Uri newUrn_result = _self.newUrn(uid);
    System.out.println("Test 0 of newUrn on " + _self + " result = " + newUrn_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String uid = " abc_XZ ";

    Uri newUrn_result = _self.newUrn(uid);
    System.out.println("Test 1 of newUrn on " + _self + " result = " + newUrn_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String uid = "#�$* &~@':";

    Uri newUrn_result = _self.newUrn(uid);
    System.out.println("Test 2 of newUrn on " + _self + " result = " + newUrn_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newUrn mutants"); }
     }
   }



  public static void newFhirString_mutation_tests(FhirString _self, int[] _counts, int[] _totals)
  {   try {
        String sx = "";

    FhirString newFhirString_result = _self.newFhirString(sx);
    System.out.println("Test 0 of newFhirString on " + _self + " result = " + newFhirString_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = " abc_XZ ";

    FhirString newFhirString_result = _self.newFhirString(sx);
    System.out.println("Test 1 of newFhirString on " + _self + " result = " + newFhirString_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = "#�$* &~@':";

    FhirString newFhirString_result = _self.newFhirString(sx);
    System.out.println("Test 2 of newFhirString on " + _self + " result = " + newFhirString_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newFhirString mutants"); }
     }
   }



  public static void newFhirDate_mutation_tests(FhirDate _self, int[] _counts, int[] _totals)
  {   try {
        String sx = "";

    FhirDate newFhirDate_result = _self.newFhirDate(sx);
    System.out.println("Test 0 of newFhirDate on " + _self + " result = " + newFhirDate_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = " abc_XZ ";

    FhirDate newFhirDate_result = _self.newFhirDate(sx);
    System.out.println("Test 1 of newFhirDate on " + _self + " result = " + newFhirDate_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = "#�$* &~@':";

    FhirDate newFhirDate_result = _self.newFhirDate(sx);
    System.out.println("Test 2 of newFhirDate on " + _self + " result = " + newFhirDate_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newFhirDate mutants"); }
     }
   }



  public static void newDateTime_mutation_tests(DateTime _self, int[] _counts, int[] _totals)
  {   try {
        String sx = "";

    DateTime newDateTime_result = _self.newDateTime(sx);
    System.out.println("Test 0 of newDateTime on " + _self + " result = " + newDateTime_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = " abc_XZ ";

    DateTime newDateTime_result = _self.newDateTime(sx);
    System.out.println("Test 1 of newDateTime on " + _self + " result = " + newDateTime_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = "#�$* &~@':";

    DateTime newDateTime_result = _self.newDateTime(sx);
    System.out.println("Test 2 of newDateTime on " + _self + " result = " + newDateTime_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newDateTime mutants"); }
     }
   }



  public static void newDecimal_mutation_tests(Decimal _self, int[] _counts, int[] _totals)
  {   try {
        String sx = "";

    Decimal newDecimal_result = _self.newDecimal(sx);
    System.out.println("Test 0 of newDecimal on " + _self + " result = " + newDecimal_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = " abc_XZ ";

    Decimal newDecimal_result = _self.newDecimal(sx);
    System.out.println("Test 1 of newDecimal on " + _self + " result = " + newDecimal_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = "#�$* &~@':";

    Decimal newDecimal_result = _self.newDecimal(sx);
    System.out.println("Test 2 of newDecimal on " + _self + " result = " + newDecimal_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newDecimal mutants"); }
     }
   }



  public static void newPositiveInt_mutation_tests(PositiveInt _self, int[] _counts, int[] _totals)
  {   try {
        String sx = "";

    PositiveInt newPositiveInt_result = _self.newPositiveInt(sx);
    System.out.println("Test 0 of newPositiveInt on " + _self + " result = " + newPositiveInt_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = " abc_XZ ";

    PositiveInt newPositiveInt_result = _self.newPositiveInt(sx);
    System.out.println("Test 1 of newPositiveInt on " + _self + " result = " + newPositiveInt_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sx = "#�$* &~@':";

    PositiveInt newPositiveInt_result = _self.newPositiveInt(sx);
    System.out.println("Test 2 of newPositiveInt on " + _self + " result = " + newPositiveInt_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newPositiveInt mutants"); }
     }
   }



  public static void newCode_mutation_tests(Code _self, int[] _counts, int[] _totals)
  {   try {
        String cde = "";

    Code newCode_result = _self.newCode(cde);
    System.out.println("Test 0 of newCode on " + _self + " result = " + newCode_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String cde = " abc_XZ ";

    Code newCode_result = _self.newCode(cde);
    System.out.println("Test 1 of newCode on " + _self + " result = " + newCode_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String cde = "#�$* &~@':";

    Code newCode_result = _self.newCode(cde);
    System.out.println("Test 2 of newCode on " + _self + " result = " + newCode_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCode mutants"); }
     }
   }



  public static void newCoding_mutation_tests(Coding _self, int[] _counts, int[] _totals)
  {   try {
        String sys = "";
    String cde = "";

    Coding newCoding_result = _self.newCoding(sys, cde);
    System.out.println("Test 0 of newCoding on " + _self + " result = " + newCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = " abc_XZ ";

    Coding newCoding_result = _self.newCoding(sys, cde);
    System.out.println("Test 1 of newCoding on " + _self + " result = " + newCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "#�$* &~@':";

    Coding newCoding_result = _self.newCoding(sys, cde);
    System.out.println("Test 2 of newCoding on " + _self + " result = " + newCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "";

    Coding newCoding_result = _self.newCoding(sys, cde);
    System.out.println("Test 3 of newCoding on " + _self + " result = " + newCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = " abc_XZ ";

    Coding newCoding_result = _self.newCoding(sys, cde);
    System.out.println("Test 4 of newCoding on " + _self + " result = " + newCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "#�$* &~@':";

    Coding newCoding_result = _self.newCoding(sys, cde);
    System.out.println("Test 5 of newCoding on " + _self + " result = " + newCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "";

    Coding newCoding_result = _self.newCoding(sys, cde);
    System.out.println("Test 6 of newCoding on " + _self + " result = " + newCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = " abc_XZ ";

    Coding newCoding_result = _self.newCoding(sys, cde);
    System.out.println("Test 7 of newCoding on " + _self + " result = " + newCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "#�$* &~@':";

    Coding newCoding_result = _self.newCoding(sys, cde);
    System.out.println("Test 8 of newCoding on " + _self + " result = " + newCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCoding mutants"); }
     }
   }



  public static void newCodingDisplay_mutation_tests(Coding _self, int[] _counts, int[] _totals)
  {   try {
        String idx = "";
    String dispx = "";

    Coding newCodingDisplay_result = _self.newCodingDisplay(idx, dispx);
    System.out.println("Test 0 of newCodingDisplay on " + _self + " result = " + newCodingDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "";
    String dispx = " abc_XZ ";

    Coding newCodingDisplay_result = _self.newCodingDisplay(idx, dispx);
    System.out.println("Test 1 of newCodingDisplay on " + _self + " result = " + newCodingDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "";
    String dispx = "#�$* &~@':";

    Coding newCodingDisplay_result = _self.newCodingDisplay(idx, dispx);
    System.out.println("Test 2 of newCodingDisplay on " + _self + " result = " + newCodingDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = " abc_XZ ";
    String dispx = "";

    Coding newCodingDisplay_result = _self.newCodingDisplay(idx, dispx);
    System.out.println("Test 3 of newCodingDisplay on " + _self + " result = " + newCodingDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = " abc_XZ ";
    String dispx = " abc_XZ ";

    Coding newCodingDisplay_result = _self.newCodingDisplay(idx, dispx);
    System.out.println("Test 4 of newCodingDisplay on " + _self + " result = " + newCodingDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = " abc_XZ ";
    String dispx = "#�$* &~@':";

    Coding newCodingDisplay_result = _self.newCodingDisplay(idx, dispx);
    System.out.println("Test 5 of newCodingDisplay on " + _self + " result = " + newCodingDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "#�$* &~@':";
    String dispx = "";

    Coding newCodingDisplay_result = _self.newCodingDisplay(idx, dispx);
    System.out.println("Test 6 of newCodingDisplay on " + _self + " result = " + newCodingDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "#�$* &~@':";
    String dispx = " abc_XZ ";

    Coding newCodingDisplay_result = _self.newCodingDisplay(idx, dispx);
    System.out.println("Test 7 of newCodingDisplay on " + _self + " result = " + newCodingDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "#�$* &~@':";
    String dispx = "#�$* &~@':";

    Coding newCodingDisplay_result = _self.newCodingDisplay(idx, dispx);
    System.out.println("Test 8 of newCodingDisplay on " + _self + " result = " + newCodingDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCodingDisplay mutants"); }
     }
   }



  public static void newCodeableConcept_mutation_tests(CodeableConcept _self, int[] _counts, int[] _totals)
  {   try {
        Coding codingx = (Coding) Controller.inst().codings.get(0);

    CodeableConcept newCodeableConcept_result = _self.newCodeableConcept(codingx);
    System.out.println("Test 0 of newCodeableConcept on " + _self + " result = " + newCodeableConcept_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCodeableConcept mutants"); }
     }
   }



  public static void newCodeableConceptCodings_mutation_tests(CodeableConcept _self, int[] _counts, int[] _totals)
  {   try {
        String idx = "";
    ArrayList codingsx = new ArrayList();

    CodeableConcept newCodeableConceptCodings_result = _self.newCodeableConceptCodings(idx, codingsx);
    System.out.println("Test 0 of newCodeableConceptCodings on " + _self + " result = " + newCodeableConceptCodings_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "";
    ArrayList codingsx = SystemTypes.Set.addSequence(new ArrayList(), codingx_0);

    CodeableConcept newCodeableConceptCodings_result = _self.newCodeableConceptCodings(idx, codingsx);
    System.out.println("Test 1 of newCodeableConceptCodings on " + _self + " result = " + newCodeableConceptCodings_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = " abc_XZ ";
    ArrayList codingsx = new ArrayList();

    CodeableConcept newCodeableConceptCodings_result = _self.newCodeableConceptCodings(idx, codingsx);
    System.out.println("Test 2 of newCodeableConceptCodings on " + _self + " result = " + newCodeableConceptCodings_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = " abc_XZ ";
    ArrayList codingsx = SystemTypes.Set.addSequence(new ArrayList(), codingx_0);

    CodeableConcept newCodeableConceptCodings_result = _self.newCodeableConceptCodings(idx, codingsx);
    System.out.println("Test 3 of newCodeableConceptCodings on " + _self + " result = " + newCodeableConceptCodings_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "#�$* &~@':";
    ArrayList codingsx = new ArrayList();

    CodeableConcept newCodeableConceptCodings_result = _self.newCodeableConceptCodings(idx, codingsx);
    System.out.println("Test 4 of newCodeableConceptCodings on " + _self + " result = " + newCodeableConceptCodings_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "#�$* &~@':";
    ArrayList codingsx = SystemTypes.Set.addSequence(new ArrayList(), codingx_0);

    CodeableConcept newCodeableConceptCodings_result = _self.newCodeableConceptCodings(idx, codingsx);
    System.out.println("Test 5 of newCodeableConceptCodings on " + _self + " result = " + newCodeableConceptCodings_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCodeableConceptCodings mutants"); }
     }
   }



  public static void newAllergyIntoleranceCriticality_mutation_tests(AllergyIntoleranceCriticality _self, int[] _counts, int[] _totals)
  {   try {
        String valx = "";

    AllergyIntoleranceCriticality newAllergyIntoleranceCriticality_result = _self.newAllergyIntoleranceCriticality(valx);
    System.out.println("Test 0 of newAllergyIntoleranceCriticality on " + _self + " result = " + newAllergyIntoleranceCriticality_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = " abc_XZ ";

    AllergyIntoleranceCriticality newAllergyIntoleranceCriticality_result = _self.newAllergyIntoleranceCriticality(valx);
    System.out.println("Test 1 of newAllergyIntoleranceCriticality on " + _self + " result = " + newAllergyIntoleranceCriticality_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = "#�$* &~@':";

    AllergyIntoleranceCriticality newAllergyIntoleranceCriticality_result = _self.newAllergyIntoleranceCriticality(valx);
    System.out.println("Test 2 of newAllergyIntoleranceCriticality on " + _self + " result = " + newAllergyIntoleranceCriticality_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newAllergyIntoleranceCriticality mutants"); }
     }
   }



  public static void newImmunizationStatusCodes_mutation_tests(ImmunizationStatusCodes _self, int[] _counts, int[] _totals)
  {   try {
        String valx = "";

    ImmunizationStatusCodes newImmunizationStatusCodes_result = _self.newImmunizationStatusCodes(valx);
    System.out.println("Test 0 of newImmunizationStatusCodes on " + _self + " result = " + newImmunizationStatusCodes_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = " abc_XZ ";

    ImmunizationStatusCodes newImmunizationStatusCodes_result = _self.newImmunizationStatusCodes(valx);
    System.out.println("Test 1 of newImmunizationStatusCodes on " + _self + " result = " + newImmunizationStatusCodes_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = "#�$* &~@':";

    ImmunizationStatusCodes newImmunizationStatusCodes_result = _self.newImmunizationStatusCodes(valx);
    System.out.println("Test 2 of newImmunizationStatusCodes on " + _self + " result = " + newImmunizationStatusCodes_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newImmunizationStatusCodes mutants"); }
     }
   }



  public static void newMedicationStatusCodes_mutation_tests(MedicationStatusCodes _self, int[] _counts, int[] _totals)
  {   try {
        String valx = "";

    MedicationStatusCodes newMedicationStatusCodes_result = _self.newMedicationStatusCodes(valx);
    System.out.println("Test 0 of newMedicationStatusCodes on " + _self + " result = " + newMedicationStatusCodes_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = " abc_XZ ";

    MedicationStatusCodes newMedicationStatusCodes_result = _self.newMedicationStatusCodes(valx);
    System.out.println("Test 1 of newMedicationStatusCodes on " + _self + " result = " + newMedicationStatusCodes_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = "#�$* &~@':";

    MedicationStatusCodes newMedicationStatusCodes_result = _self.newMedicationStatusCodes(valx);
    System.out.println("Test 2 of newMedicationStatusCodes on " + _self + " result = " + newMedicationStatusCodes_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newMedicationStatusCodes mutants"); }
     }
   }



  public static void newResourceContainer_mutation_tests(ResourceContainer _self, int[] _counts, int[] _totals)
  {   try {
        String idx = "";

    ResourceContainer newResourceContainer_result = _self.newResourceContainer(idx);
    System.out.println("Test 0 of newResourceContainer on " + _self + " result = " + newResourceContainer_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = " abc_XZ ";

    ResourceContainer newResourceContainer_result = _self.newResourceContainer(idx);
    System.out.println("Test 1 of newResourceContainer on " + _self + " result = " + newResourceContainer_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "#�$* &~@':";

    ResourceContainer newResourceContainer_result = _self.newResourceContainer(idx);
    System.out.println("Test 2 of newResourceContainer on " + _self + " result = " + newResourceContainer_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newResourceContainer mutants"); }
     }
   }



  public static void newReference_mutation_tests(Reference _self, int[] _counts, int[] _totals)
  {   try {
        String reftext = "";

    Reference newReference_result = _self.newReference(reftext);
    System.out.println("Test 0 of newReference on " + _self + " result = " + newReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String reftext = " abc_XZ ";

    Reference newReference_result = _self.newReference(reftext);
    System.out.println("Test 1 of newReference on " + _self + " result = " + newReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String reftext = "#�$* &~@':";

    Reference newReference_result = _self.newReference(reftext);
    System.out.println("Test 2 of newReference on " + _self + " result = " + newReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newReference mutants"); }
     }
   }



  public static void newPatientReference_mutation_tests(Reference _self, int[] _counts, int[] _totals)
  {   try {
        String pid = "";

    Reference newPatientReference_result = _self.newPatientReference(pid);
    System.out.println("Test 0 of newPatientReference on " + _self + " result = " + newPatientReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String pid = " abc_XZ ";

    Reference newPatientReference_result = _self.newPatientReference(pid);
    System.out.println("Test 1 of newPatientReference on " + _self + " result = " + newPatientReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String pid = "#�$* &~@':";

    Reference newPatientReference_result = _self.newPatientReference(pid);
    System.out.println("Test 2 of newPatientReference on " + _self + " result = " + newPatientReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newPatientReference mutants"); }
     }
   }



  public static void newBundleEntry_mutation_tests(BundleEntry _self, int[] _counts, int[] _totals)
  {   try {
        String idx = "";

    BundleEntry newBundleEntry_result = _self.newBundleEntry(idx);
    System.out.println("Test 0 of newBundleEntry on " + _self + " result = " + newBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = " abc_XZ ";

    BundleEntry newBundleEntry_result = _self.newBundleEntry(idx);
    System.out.println("Test 1 of newBundleEntry on " + _self + " result = " + newBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "#�$* &~@':";

    BundleEntry newBundleEntry_result = _self.newBundleEntry(idx);
    System.out.println("Test 2 of newBundleEntry on " + _self + " result = " + newBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newBundleEntry mutants"); }
     }
   }



  public static void newBundleType_mutation_tests(BundleType _self, int[] _counts, int[] _totals)
  {   try {
        String valx = "";

    BundleType newBundleType_result = _self.newBundleType(valx);
    System.out.println("Test 0 of newBundleType on " + _self + " result = " + newBundleType_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = " abc_XZ ";

    BundleType newBundleType_result = _self.newBundleType(valx);
    System.out.println("Test 1 of newBundleType on " + _self + " result = " + newBundleType_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = "#�$* &~@':";

    BundleType newBundleType_result = _self.newBundleType(valx);
    System.out.println("Test 2 of newBundleType on " + _self + " result = " + newBundleType_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newBundleType mutants"); }
     }
   }



  public static void newCodeableReference_mutation_tests(CodeableReference _self, int[] _counts, int[] _totals)
  {   try {
        CodeableConcept ccx = (CodeableConcept) Controller.inst().codeableconcepts.get(0);

    CodeableReference newCodeableReference_result = _self.newCodeableReference(ccx);
    System.out.println("Test 0 of newCodeableReference on " + _self + " result = " + newCodeableReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCodeableReference mutants"); }
     }
   }



  public static void newCompositionSection_mutation_tests(CompositionSection _self, int[] _counts, int[] _totals)
  {   try {
        String idx = "";

    CompositionSection newCompositionSection_result = _self.newCompositionSection(idx);
    System.out.println("Test 0 of newCompositionSection on " + _self + " result = " + newCompositionSection_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = " abc_XZ ";

    CompositionSection newCompositionSection_result = _self.newCompositionSection(idx);
    System.out.println("Test 1 of newCompositionSection on " + _self + " result = " + newCompositionSection_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String idx = "#�$* &~@':";

    CompositionSection newCompositionSection_result = _self.newCompositionSection(idx);
    System.out.println("Test 2 of newCompositionSection on " + _self + " result = " + newCompositionSection_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCompositionSection mutants"); }
     }
   }



  public static void newCompositionStatus_mutation_tests(CompositionStatus _self, int[] _counts, int[] _totals)
  {   try {
        String valx = "";

    CompositionStatus newCompositionStatus_result = _self.newCompositionStatus(valx);
    System.out.println("Test 0 of newCompositionStatus on " + _self + " result = " + newCompositionStatus_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = " abc_XZ ";

    CompositionStatus newCompositionStatus_result = _self.newCompositionStatus(valx);
    System.out.println("Test 1 of newCompositionStatus on " + _self + " result = " + newCompositionStatus_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = "#�$* &~@':";

    CompositionStatus newCompositionStatus_result = _self.newCompositionStatus(valx);
    System.out.println("Test 2 of newCompositionStatus on " + _self + " result = " + newCompositionStatus_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCompositionStatus mutants"); }
     }
   }



  public static void streetValue_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        FhirString ss = (FhirString) Controller.inst().fhirstrings.get(0);

    String streetValue_result = _self.streetValue(ss);
    System.out.println("Test 0 of streetValue on " + _self + " result = " + streetValue_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% streetValue mutants"); }
     }
   }



  public static void houseNumber_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        FhirString ss = (FhirString) Controller.inst().fhirstrings.get(0);

    String houseNumber_result = _self.houseNumber(ss);
    System.out.println("Test 0 of houseNumber on " + _self + " result = " + houseNumber_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% houseNumber mutants"); }
     }
   }



  public static void postboxNumber_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        FhirString ss = (FhirString) Controller.inst().fhirstrings.get(0);

    String postboxNumber_result = _self.postboxNumber(ss);
    System.out.println("Test 0 of postboxNumber on " + _self + " result = " + postboxNumber_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% postboxNumber mutants"); }
     }
   }



}
