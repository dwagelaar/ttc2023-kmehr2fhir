package kmehr;

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



  public static void newPeriod_mutation_tests(Period _self, int[] _counts, int[] _totals)
  {   try {
        DateTime dt1 = (DateTime) Controller.inst().datetimes.get(0);
    DateTime dt2 = (DateTime) Controller.inst().datetimes.get(0);

    Period newPeriod_result = _self.newPeriod(dt1, dt2);
    System.out.println("Test 0 of newPeriod on " + _self + " result = " + newPeriod_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newPeriod mutants"); }
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



  public static void newMedicationReference_mutation_tests(Reference _self, int[] _counts, int[] _totals)
  {   try {
        String pid = "";

    Reference newMedicationReference_result = _self.newMedicationReference(pid);
    System.out.println("Test 0 of newMedicationReference on " + _self + " result = " + newMedicationReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String pid = " abc_XZ ";

    Reference newMedicationReference_result = _self.newMedicationReference(pid);
    System.out.println("Test 1 of newMedicationReference on " + _self + " result = " + newMedicationReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String pid = "#�$* &~@':";

    Reference newMedicationReference_result = _self.newMedicationReference(pid);
    System.out.println("Test 2 of newMedicationReference on " + _self + " result = " + newMedicationReference_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newMedicationReference mutants"); }
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



  public static void newCodeableRef_mutation_tests(CodeableReference _self, int[] _counts, int[] _totals)
  {   try {
        Reference ccx = (Reference) Controller.inst().references.get(0);

    CodeableReference newCodeableRef_result = _self.newCodeableRef(ccx);
    System.out.println("Test 0 of newCodeableRef on " + _self + " result = " + newCodeableRef_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newCodeableRef mutants"); }
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



  public static void newEventTiming_mutation_tests(EventTiming _self, int[] _counts, int[] _totals)
  {   try {
        String valx = "";

    EventTiming newEventTiming_result = _self.newEventTiming(valx);
    System.out.println("Test 0 of newEventTiming on " + _self + " result = " + newEventTiming_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = " abc_XZ ";

    EventTiming newEventTiming_result = _self.newEventTiming(valx);
    System.out.println("Test 1 of newEventTiming on " + _self + " result = " + newEventTiming_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String valx = "#�$* &~@':";

    EventTiming newEventTiming_result = _self.newEventTiming(valx);
    System.out.println("Test 2 of newEventTiming on " + _self + " result = " + newEventTiming_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newEventTiming mutants"); }
     }
   }



  public static void newUnitsOfTime_mutation_tests(UnitsOfTime _self, int[] _counts, int[] _totals)
  {   try {
        String vx = "";

    UnitsOfTime newUnitsOfTime_result = _self.newUnitsOfTime(vx);
    System.out.println("Test 0 of newUnitsOfTime on " + _self + " result = " + newUnitsOfTime_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String vx = " abc_XZ ";

    UnitsOfTime newUnitsOfTime_result = _self.newUnitsOfTime(vx);
    System.out.println("Test 1 of newUnitsOfTime on " + _self + " result = " + newUnitsOfTime_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String vx = "#�$* &~@':";

    UnitsOfTime newUnitsOfTime_result = _self.newUnitsOfTime(vx);
    System.out.println("Test 2 of newUnitsOfTime on " + _self + " result = " + newUnitsOfTime_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newUnitsOfTime mutants"); }
     }
   }



  public static void newMedicationStatementStatusCodes_mutation_tests(MedicationStatementStatusCodes _self, int[] _counts, int[] _totals)
  {   try {
        String vx = "";

    MedicationStatementStatusCodes newMedicationStatementStatusCodes_result = _self.newMedicationStatementStatusCodes(vx);
    System.out.println("Test 0 of newMedicationStatementStatusCodes on " + _self + " result = " + newMedicationStatementStatusCodes_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String vx = " abc_XZ ";

    MedicationStatementStatusCodes newMedicationStatementStatusCodes_result = _self.newMedicationStatementStatusCodes(vx);
    System.out.println("Test 1 of newMedicationStatementStatusCodes on " + _self + " result = " + newMedicationStatementStatusCodes_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String vx = "#�$* &~@':";

    MedicationStatementStatusCodes newMedicationStatementStatusCodes_result = _self.newMedicationStatementStatusCodes(vx);
    System.out.println("Test 2 of newMedicationStatementStatusCodes on " + _self + " result = " + newMedicationStatementStatusCodes_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newMedicationStatementStatusCodes mutants"); }
     }
   }



  public static void toGender_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        CDSEXvalues genderx = changed;

    AdministrativeGenderEnum toGender_result = _self.toGender(genderx);
    System.out.println("Test 0 of toGender on " + _self + " result = " + toGender_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        CDSEXvalues genderx = female;

    AdministrativeGenderEnum toGender_result = _self.toGender(genderx);
    System.out.println("Test 1 of toGender on " + _self + " result = " + toGender_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        CDSEXvalues genderx = male;

    AdministrativeGenderEnum toGender_result = _self.toGender(genderx);
    System.out.println("Test 2 of toGender on " + _self + " result = " + toGender_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        CDSEXvalues genderx = unknown;

    AdministrativeGenderEnum toGender_result = _self.toGender(genderx);
    System.out.println("Test 3 of toGender on " + _self + " result = " + toGender_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        CDSEXvalues genderx = undefined;

    AdministrativeGenderEnum toGender_result = _self.toGender(genderx);
    System.out.println("Test 4 of toGender on " + _self + " result = " + toGender_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% toGender mutants"); }
     }
   }



  public static void toGender_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        String genstr = "";

    String toGender_result = _self.toGender(genstr);
    System.out.println("Test 0 of toGender on " + _self + " result = " + toGender_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String genstr = " abc_XZ ";

    String toGender_result = _self.toGender(genstr);
    System.out.println("Test 1 of toGender on " + _self + " result = " + toGender_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String genstr = "#�$* &~@':";

    String toGender_result = _self.toGender(genstr);
    System.out.println("Test 2 of toGender on " + _self + " result = " + toGender_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% toGender mutants"); }
     }
   }



  public static void SexType2AdministrativeGender_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        SexType sexx = (SexType) Controller.inst().sextypes.get(0);

    AdministrativeGender SexType2AdministrativeGender_result = _self.SexType2AdministrativeGender(sexx);
    System.out.println("Test 0 of SexType2AdministrativeGender on " + _self + " result = " + SexType2AdministrativeGender_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% SexType2AdministrativeGender mutants"); }
     }
   }



  public static void toEventTiming_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        CDDAYPERIOD cdx = (CDDAYPERIOD) Controller.inst().cddayperiods.get(0);

    String toEventTiming_result = _self.toEventTiming(cdx);
    System.out.println("Test 0 of toEventTiming on " + _self + " result = " + toEventTiming_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% toEventTiming mutants"); }
     }
   }



  public static void MomentType2DateTime_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        DateType mmt = (DateType) Controller.inst().datetypes.get(0);

    DateTime MomentType2DateTime_result = _self.MomentType2DateTime(mmt);
    System.out.println("Test 0 of MomentType2DateTime on " + _self + " result = " + MomentType2DateTime_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% MomentType2DateTime mutants"); }
     }
   }



  public static void Moments2Period_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        DateType mmt1 = (DateType) Controller.inst().datetypes.get(0);
    DateType mmt2 = (DateType) Controller.inst().datetypes.get(0);

    Period Moments2Period_result = _self.Moments2Period(mmt1, mmt2);
    System.out.println("Test 0 of Moments2Period on " + _self + " result = " + Moments2Period_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% Moments2Period mutants"); }
     }
   }



  public static void ItemType2Dosage_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    Dosage ItemType2Dosage_result = _self.ItemType2Dosage(itemx);
    System.out.println("Test 0 of ItemType2Dosage on " + _self + " result = " + ItemType2Dosage_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% ItemType2Dosage mutants"); }
     }
   }



  public static void getFhirRelationshipCode_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        String krel = "";

    String getFhirRelationshipCode_result = _self.getFhirRelationshipCode(krel);
    System.out.println("Test 0 of getFhirRelationshipCode on " + _self + " result = " + getFhirRelationshipCode_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String krel = " abc_XZ ";

    String getFhirRelationshipCode_result = _self.getFhirRelationshipCode(krel);
    System.out.println("Test 1 of getFhirRelationshipCode on " + _self + " result = " + getFhirRelationshipCode_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String krel = "#�$* &~@':";

    String getFhirRelationshipCode_result = _self.getFhirRelationshipCode(krel);
    System.out.println("Test 2 of getFhirRelationshipCode on " + _self + " result = " + getFhirRelationshipCode_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% getFhirRelationshipCode mutants"); }
     }
   }



  public static void uuid_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  { 
   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% uuid mutants"); }
     }
   }



  public static void TranslateCodingWithDisplay_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        String sys = "";
    String cde = "";
    String disp = "";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 0 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "";
    String disp = " abc_XZ ";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 1 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "";
    String disp = "#�$* &~@':";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 2 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = " abc_XZ ";
    String disp = "";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 3 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = " abc_XZ ";
    String disp = " abc_XZ ";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 4 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = " abc_XZ ";
    String disp = "#�$* &~@':";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 5 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "#�$* &~@':";
    String disp = "";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 6 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "#�$* &~@':";
    String disp = " abc_XZ ";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 7 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "#�$* &~@':";
    String disp = "#�$* &~@':";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 8 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "";
    String disp = "";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 9 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "";
    String disp = " abc_XZ ";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 10 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "";
    String disp = "#�$* &~@':";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 11 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = " abc_XZ ";
    String disp = "";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 12 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = " abc_XZ ";
    String disp = " abc_XZ ";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 13 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = " abc_XZ ";
    String disp = "#�$* &~@':";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 14 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "#�$* &~@':";
    String disp = "";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 15 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "#�$* &~@':";
    String disp = " abc_XZ ";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 16 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "#�$* &~@':";
    String disp = "#�$* &~@':";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 17 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "";
    String disp = "";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 18 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "";
    String disp = " abc_XZ ";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 19 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "";
    String disp = "#�$* &~@':";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 20 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = " abc_XZ ";
    String disp = "";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 21 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = " abc_XZ ";
    String disp = " abc_XZ ";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 22 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = " abc_XZ ";
    String disp = "#�$* &~@':";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 23 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "#�$* &~@':";
    String disp = "";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 24 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "#�$* &~@':";
    String disp = " abc_XZ ";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 25 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "#�$* &~@':";
    String disp = "#�$* &~@':";

    Coding TranslateCodingWithDisplay_result = _self.TranslateCodingWithDisplay(sys, cde, disp);
    System.out.println("Test 26 of TranslateCodingWithDisplay on " + _self + " result = " + TranslateCodingWithDisplay_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% TranslateCodingWithDisplay mutants"); }
     }
   }



  public static void CDContent2Coding_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        CDCONTENT cdx = (CDCONTENT) Controller.inst().cdcontents.get(0);

    Coding CDContent2Coding_result = _self.CDContent2Coding(cdx);
    System.out.println("Test 0 of CDContent2Coding on " + _self + " result = " + CDContent2Coding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% CDContent2Coding mutants"); }
     }
   }



  public static void ContentType2Coding_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ContentType contentx = (ContentType) Controller.inst().contenttypes.get(0);

    Coding ContentType2Coding_result = _self.ContentType2Coding(contentx);
    System.out.println("Test 0 of ContentType2Coding on " + _self + " result = " + ContentType2Coding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% ContentType2Coding mutants"); }
     }
   }



  public static void CodeableConceptForCoding_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        String sys = "";
    String cde = "";
    String disp = "";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 0 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "";
    String disp = " abc_XZ ";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 1 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "";
    String disp = "#�$* &~@':";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 2 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = " abc_XZ ";
    String disp = "";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 3 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = " abc_XZ ";
    String disp = " abc_XZ ";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 4 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = " abc_XZ ";
    String disp = "#�$* &~@':";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 5 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "#�$* &~@':";
    String disp = "";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 6 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "#�$* &~@':";
    String disp = " abc_XZ ";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 7 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "";
    String cde = "#�$* &~@':";
    String disp = "#�$* &~@':";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 8 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "";
    String disp = "";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 9 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "";
    String disp = " abc_XZ ";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 10 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "";
    String disp = "#�$* &~@':";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 11 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = " abc_XZ ";
    String disp = "";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 12 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = " abc_XZ ";
    String disp = " abc_XZ ";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 13 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = " abc_XZ ";
    String disp = "#�$* &~@':";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 14 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "#�$* &~@':";
    String disp = "";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 15 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "#�$* &~@':";
    String disp = " abc_XZ ";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 16 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = " abc_XZ ";
    String cde = "#�$* &~@':";
    String disp = "#�$* &~@':";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 17 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "";
    String disp = "";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 18 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "";
    String disp = " abc_XZ ";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 19 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "";
    String disp = "#�$* &~@':";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 20 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = " abc_XZ ";
    String disp = "";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 21 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = " abc_XZ ";
    String disp = " abc_XZ ";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 22 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = " abc_XZ ";
    String disp = "#�$* &~@':";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 23 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "#�$* &~@':";
    String disp = "";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 24 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "#�$* &~@':";
    String disp = " abc_XZ ";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 25 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        String sys = "#�$* &~@':";
    String cde = "#�$* &~@':";
    String disp = "#�$* &~@':";

    CodeableConcept CodeableConceptForCoding_result = _self.CodeableConceptForCoding(sys, cde, disp);
    System.out.println("Test 26 of CodeableConceptForCoding on " + _self + " result = " + CodeableConceptForCoding_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% CodeableConceptForCoding mutants"); }
     }
   }



  public static void CodeableConceptFromCodedContent_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    CodeableConcept CodeableConceptFromCodedContent_result = _self.CodeableConceptFromCodedContent(itemx);
    System.out.println("Test 0 of CodeableConceptFromCodedContent on " + _self + " result = " + CodeableConceptFromCodedContent_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% CodeableConceptFromCodedContent mutants"); }
     }
   }



  public static void CodeableConceptFromVaccineIndications_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    CodeableConcept CodeableConceptFromVaccineIndications_result = _self.CodeableConceptFromVaccineIndications(itemx);
    System.out.println("Test 0 of CodeableConceptFromVaccineIndications on " + _self + " result = " + CodeableConceptFromVaccineIndications_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% CodeableConceptFromVaccineIndications mutants"); }
     }
   }



  public static void PersonType2HumanName_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        PersonType personx = (PersonType) Controller.inst().persontypes.get(0);

    HumanName PersonType2HumanName_result = _self.PersonType2HumanName(personx);
    System.out.println("Test 0 of PersonType2HumanName on " + _self + " result = " + PersonType2HumanName_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% PersonType2HumanName mutants"); }
     }
   }



  public static void HcpartyType2HumanName_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HcpartyType hcx = (HcpartyType) Controller.inst().hcpartytypes.get(0);

    HumanName HcpartyType2HumanName_result = _self.HcpartyType2HumanName(hcx);
    System.out.println("Test 0 of HcpartyType2HumanName on " + _self + " result = " + HcpartyType2HumanName_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% HcpartyType2HumanName mutants"); }
     }
   }



  public static void allContactPersonInformation_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        FolderType folderx = (FolderType) Controller.inst().foldertypes.get(0);

    ArrayList allContactPersonInformation_result = _self.allContactPersonInformation(folderx);
    System.out.println("Test 0 of allContactPersonInformation on " + _self + " result = " + allContactPersonInformation_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% allContactPersonInformation mutants"); }
     }
   }



  public static void getPatientContactRelationship_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        CDITEM cditemx = (CDITEM) Controller.inst().cditems.get(0);

    CodeableConcept getPatientContactRelationship_result = _self.getPatientContactRelationship(cditemx);
    System.out.println("Test 0 of getPatientContactRelationship on " + _self + " result = " + getPatientContactRelationship_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% getPatientContactRelationship mutants"); }
     }
   }



  public static void allPatientContactRelationships_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    ArrayList allPatientContactRelationships_result = _self.allPatientContactRelationships(itemx);
    System.out.println("Test 0 of allPatientContactRelationships on " + _self + " result = " + allPatientContactRelationships_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% allPatientContactRelationships mutants"); }
     }
   }



  public static void CNKCode_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        MedicinalProductType mptx = (MedicinalProductType) Controller.inst().medicinalproducttypes.get(0);

    Coding CNKCode_result = _self.CNKCode(mptx);
    System.out.println("Test 0 of CNKCode on " + _self + " result = " + CNKCode_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% CNKCode mutants"); }
     }
   }



  public static void CompositionBundleEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        TransactionType tx = (TransactionType) Controller.inst().transactiontypes.get(0);

    BundleEntry CompositionBundleEntry_result = _self.CompositionBundleEntry(tx);
    System.out.println("Test 0 of CompositionBundleEntry on " + _self + " result = " + CompositionBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% CompositionBundleEntry mutants"); }
     }
   }



  public static void CompositionBundleEntries_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HashSet txs = new HashSet();

    ArrayList CompositionBundleEntries_result = _self.CompositionBundleEntries(txs);
    System.out.println("Test 0 of CompositionBundleEntries on " + _self + " result = " + CompositionBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        HashSet txs = SystemTypes.Set.addSet(new HashSet(), transactiontypex_0);

    ArrayList CompositionBundleEntries_result = _self.CompositionBundleEntries(txs);
    System.out.println("Test 1 of CompositionBundleEntries on " + _self + " result = " + CompositionBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% CompositionBundleEntries mutants"); }
     }
   }



  public static void PatientBundleEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        PersonType px = (PersonType) Controller.inst().persontypes.get(0);

    BundleEntry PatientBundleEntry_result = _self.PatientBundleEntry(px);
    System.out.println("Test 0 of PatientBundleEntry on " + _self + " result = " + PatientBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% PatientBundleEntry mutants"); }
     }
   }



  public static void OrganizationBundleEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HcpartyType hcx = (HcpartyType) Controller.inst().hcpartytypes.get(0);

    BundleEntry OrganizationBundleEntry_result = _self.OrganizationBundleEntry(hcx);
    System.out.println("Test 0 of OrganizationBundleEntry on " + _self + " result = " + OrganizationBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% OrganizationBundleEntry mutants"); }
     }
   }



  public static void OrganizationBundleEntries_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HashSet txs = new HashSet();

    ArrayList OrganizationBundleEntries_result = _self.OrganizationBundleEntries(txs);
    System.out.println("Test 0 of OrganizationBundleEntries on " + _self + " result = " + OrganizationBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        HashSet txs = SystemTypes.Set.addSet(new HashSet(), transactiontypex_0);

    ArrayList OrganizationBundleEntries_result = _self.OrganizationBundleEntries(txs);
    System.out.println("Test 1 of OrganizationBundleEntries on " + _self + " result = " + OrganizationBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% OrganizationBundleEntries mutants"); }
     }
   }



  public static void PractitionerBundleEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HcpartyType hcx = (HcpartyType) Controller.inst().hcpartytypes.get(0);

    BundleEntry PractitionerBundleEntry_result = _self.PractitionerBundleEntry(hcx);
    System.out.println("Test 0 of PractitionerBundleEntry on " + _self + " result = " + PractitionerBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% PractitionerBundleEntry mutants"); }
     }
   }



  public static void PractitionerBundleEntries_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HashSet txs = new HashSet();

    ArrayList PractitionerBundleEntries_result = _self.PractitionerBundleEntries(txs);
    System.out.println("Test 0 of PractitionerBundleEntries on " + _self + " result = " + PractitionerBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        HashSet txs = SystemTypes.Set.addSet(new HashSet(), transactiontypex_0);

    ArrayList PractitionerBundleEntries_result = _self.PractitionerBundleEntries(txs);
    System.out.println("Test 1 of PractitionerBundleEntries on " + _self + " result = " + PractitionerBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% PractitionerBundleEntries mutants"); }
     }
   }



  public static void MedicationBundleEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    BundleEntry MedicationBundleEntry_result = _self.MedicationBundleEntry(itemx);
    System.out.println("Test 0 of MedicationBundleEntry on " + _self + " result = " + MedicationBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% MedicationBundleEntry mutants"); }
     }
   }



  public static void MedicationBundleEntries_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HashSet txs = new HashSet();

    ArrayList MedicationBundleEntries_result = _self.MedicationBundleEntries(txs);
    System.out.println("Test 0 of MedicationBundleEntries on " + _self + " result = " + MedicationBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        HashSet txs = SystemTypes.Set.addSet(new HashSet(), transactiontypex_0);

    ArrayList MedicationBundleEntries_result = _self.MedicationBundleEntries(txs);
    System.out.println("Test 1 of MedicationBundleEntries on " + _self + " result = " + MedicationBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% MedicationBundleEntries mutants"); }
     }
   }



  public static void PosologyBundleEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        PosologyType posx = (PosologyType) Controller.inst().posologytypes.get(0);

    BundleEntry PosologyBundleEntry_result = _self.PosologyBundleEntry(posx);
    System.out.println("Test 0 of PosologyBundleEntry on " + _self + " result = " + PosologyBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% PosologyBundleEntry mutants"); }
     }
   }



  public static void PosologyBundleEntries_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HashSet txs = new HashSet();

    ArrayList PosologyBundleEntries_result = _self.PosologyBundleEntries(txs);
    System.out.println("Test 0 of PosologyBundleEntries on " + _self + " result = " + PosologyBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        HashSet txs = SystemTypes.Set.addSet(new HashSet(), transactiontypex_0);

    ArrayList PosologyBundleEntries_result = _self.PosologyBundleEntries(txs);
    System.out.println("Test 1 of PosologyBundleEntries on " + _self + " result = " + PosologyBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% PosologyBundleEntries mutants"); }
     }
   }



  public static void AllergyIntoleranceBundleEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    BundleEntry AllergyIntoleranceBundleEntry_result = _self.AllergyIntoleranceBundleEntry(itemx);
    System.out.println("Test 0 of AllergyIntoleranceBundleEntry on " + _self + " result = " + AllergyIntoleranceBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% AllergyIntoleranceBundleEntry mutants"); }
     }
   }



  public static void AllergyIntoleranceBundleEntries_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HashSet txs = new HashSet();

    ArrayList AllergyIntoleranceBundleEntries_result = _self.AllergyIntoleranceBundleEntries(txs);
    System.out.println("Test 0 of AllergyIntoleranceBundleEntries on " + _self + " result = " + AllergyIntoleranceBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        HashSet txs = SystemTypes.Set.addSet(new HashSet(), transactiontypex_0);

    ArrayList AllergyIntoleranceBundleEntries_result = _self.AllergyIntoleranceBundleEntries(txs);
    System.out.println("Test 1 of AllergyIntoleranceBundleEntries on " + _self + " result = " + AllergyIntoleranceBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% AllergyIntoleranceBundleEntries mutants"); }
     }
   }



  public static void ConditionBundleEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    BundleEntry ConditionBundleEntry_result = _self.ConditionBundleEntry(itemx);
    System.out.println("Test 0 of ConditionBundleEntry on " + _self + " result = " + ConditionBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% ConditionBundleEntry mutants"); }
     }
   }



  public static void ConditionBundleEntries_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HashSet txs = new HashSet();

    ArrayList ConditionBundleEntries_result = _self.ConditionBundleEntries(txs);
    System.out.println("Test 0 of ConditionBundleEntries on " + _self + " result = " + ConditionBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        HashSet txs = SystemTypes.Set.addSet(new HashSet(), transactiontypex_0);

    ArrayList ConditionBundleEntries_result = _self.ConditionBundleEntries(txs);
    System.out.println("Test 1 of ConditionBundleEntries on " + _self + " result = " + ConditionBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% ConditionBundleEntries mutants"); }
     }
   }



  public static void ImmunizationBundleEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    BundleEntry ImmunizationBundleEntry_result = _self.ImmunizationBundleEntry(itemx);
    System.out.println("Test 0 of ImmunizationBundleEntry on " + _self + " result = " + ImmunizationBundleEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% ImmunizationBundleEntry mutants"); }
     }
   }



  public static void ImmunizationBundleEntries_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HashSet txs = new HashSet();

    ArrayList ImmunizationBundleEntries_result = _self.ImmunizationBundleEntries(txs);
    System.out.println("Test 0 of ImmunizationBundleEntries on " + _self + " result = " + ImmunizationBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }

  try {
        HashSet txs = SystemTypes.Set.addSet(new HashSet(), transactiontypex_0);

    ArrayList ImmunizationBundleEntries_result = _self.ImmunizationBundleEntries(txs);
    System.out.println("Test 1 of ImmunizationBundleEntries on " + _self + " result = " + ImmunizationBundleEntries_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% ImmunizationBundleEntries mutants"); }
     }
   }



  public static void CompositionIdentifier_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        TransactionType transx = (TransactionType) Controller.inst().transactiontypes.get(0);

    Identifier CompositionIdentifier_result = _self.CompositionIdentifier(transx);
    System.out.println("Test 0 of CompositionIdentifier on " + _self + " result = " + CompositionIdentifier_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% CompositionIdentifier mutants"); }
     }
   }



  public static void CompositionSectionEntry_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    Reference CompositionSectionEntry_result = _self.CompositionSectionEntry(itemx);
    System.out.println("Test 0 of CompositionSectionEntry on " + _self + " result = " + CompositionSectionEntry_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% CompositionSectionEntry mutants"); }
     }
   }



  public static void MedicationSection_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        TransactionType transx = (TransactionType) Controller.inst().transactiontypes.get(0);

    CompositionSection MedicationSection_result = _self.MedicationSection(transx);
    System.out.println("Test 0 of MedicationSection on " + _self + " result = " + MedicationSection_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% MedicationSection mutants"); }
     }
   }



  public static void AllergyIntoleranceSection_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        TransactionType transx = (TransactionType) Controller.inst().transactiontypes.get(0);

    CompositionSection AllergyIntoleranceSection_result = _self.AllergyIntoleranceSection(transx);
    System.out.println("Test 0 of AllergyIntoleranceSection on " + _self + " result = " + AllergyIntoleranceSection_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% AllergyIntoleranceSection mutants"); }
     }
   }



  public static void ActiveProblemSection_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        TransactionType transx = (TransactionType) Controller.inst().transactiontypes.get(0);

    CompositionSection ActiveProblemSection_result = _self.ActiveProblemSection(transx);
    System.out.println("Test 0 of ActiveProblemSection on " + _self + " result = " + ActiveProblemSection_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% ActiveProblemSection mutants"); }
     }
   }



  public static void ImmunizationSection_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        TransactionType transx = (TransactionType) Controller.inst().transactiontypes.get(0);

    CompositionSection ImmunizationSection_result = _self.ImmunizationSection(transx);
    System.out.println("Test 0 of ImmunizationSection on " + _self + " result = " + ImmunizationSection_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% ImmunizationSection mutants"); }
     }
   }



  public static void HistorySection_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        TransactionType transx = (TransactionType) Controller.inst().transactiontypes.get(0);

    CompositionSection HistorySection_result = _self.HistorySection(transx);
    System.out.println("Test 0 of HistorySection on " + _self + " result = " + HistorySection_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% HistorySection mutants"); }
     }
   }



  public static void newNIHII_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        HcpartyType hcx = (HcpartyType) Controller.inst().hcpartytypes.get(0);

    Identifier newNIHII_result = _self.newNIHII(hcx);
    System.out.println("Test 0 of newNIHII on " + _self + " result = " + newNIHII_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% newNIHII mutants"); }
     }
   }



  public static void MedicinalItem2CodeableConcept_mutation_tests(AuxOps _self, int[] _counts, int[] _totals)
  {   try {
        ItemType itemx = (ItemType) Controller.inst().itemtypes.get(0);

    CodeableConcept MedicinalItem2CodeableConcept_result = _self.MedicinalItem2CodeableConcept(itemx);
    System.out.println("Test 0 of MedicinalItem2CodeableConcept on " + _self + " result = " + MedicinalItem2CodeableConcept_result);

  } catch (Throwable _e) { _e.printStackTrace(); }


   for (int i = 0; i < _counts.length; i++)
   { if (_totals[i] > 0)
     { System.out.println("Test " + i + " detects " + (100.0*_counts[i])/_totals[i] + "% MedicinalItem2CodeableConcept mutants"); }
     }
   }



}
