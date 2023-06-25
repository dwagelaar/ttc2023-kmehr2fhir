package fhir2kmehr;


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;

public class TestsGUI extends JFrame implements ActionListener
{ JPanel panel = new JPanel();
  Controller cont = Controller.inst();
  JButton loadModelButton = new JButton("loadModel");
  JButton saveModelButton = new JButton("saveModel");
    JButton loadCSVButton = new JButton("Mutation Tests");
    JButton fhir2kmehrButton = new JButton("fhir2kmehr");

 public TestsGUI()
  { super("Select use case to test");
    setContentPane(panel);
    addWindowListener(new WindowAdapter() 
    { public void windowClosing(WindowEvent e)
      { System.exit(0); } });
    panel.add(loadModelButton);
    loadModelButton.addActionListener(this);
    panel.add(saveModelButton);
    saveModelButton.addActionListener(this);
    panel.add(loadCSVButton);
    loadCSVButton.addActionListener(this);
    panel.add(fhir2kmehrButton);
    fhir2kmehrButton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  { if (e == null) { return; }
    String cmd = e.getActionCommand();
    if ("loadModel".equals(cmd))
    { Controller.loadModel("in.txt");
      cont.checkCompleteness();
      System.err.println("Model loaded");
      return; } 
    if ("saveModel".equals(cmd))
    { cont.saveModel("out.txt");  
      return; } 
    if ("Mutation Tests".equals(cmd))
    { System.err.println("Mutation tests");
      int texttypes_instances = Controller.inst().texttypes.size();
      int idhcpartys_instances = Controller.inst().idhcpartys.size();
      int idinsurances_instances = Controller.inst().idinsurances.size();
      int idkmehrs_instances = Controller.inst().idkmehrs.size();
      int idpatients_instances = Controller.inst().idpatients.size();
      int idprofessions_instances = Controller.inst().idprofessions.size();
      int insss_instances = Controller.inst().insss.size();
      int cdaccessrights_instances = Controller.inst().cdaccessrights.size();
      int cdacknowledgments_instances = Controller.inst().cdacknowledgments.size();
      int cdactsnursings_instances = Controller.inst().cdactsnursings.size();
      int cdaddresss_instances = Controller.inst().cdaddresss.size();
      int cdadministrationunits_instances = Controller.inst().cdadministrationunits.size();
      int cdatcs_instances = Controller.inst().cdatcs.size();
      int cdautonomys_instances = Controller.inst().cdautonomys.size();
      int cdballondevices_instances = Controller.inst().cdballondevices.size();
      int cdbcrdifferentationdegrees_instances = Controller.inst().cdbcrdifferentationdegrees.size();
      int cdbearingsurfaces_instances = Controller.inst().cdbearingsurfaces.size();
      int cdbvtavailablematerialss_instances = Controller.inst().cdbvtavailablematerialss.size();
      int cdbvtconservationdelays_instances = Controller.inst().cdbvtconservationdelays.size();
      int cdbvtconservationmodes_instances = Controller.inst().cdbvtconservationmodes.size();
      int cdbvtlateralitys_instances = Controller.inst().cdbvtlateralitys.size();
      int cdbvtpatientoppositions_instances = Controller.inst().cdbvtpatientoppositions.size();
      int cdbvtsampletypes_instances = Controller.inst().cdbvtsampletypes.size();
      int cdbvtstatuss_instances = Controller.inst().cdbvtstatuss.size();
      int cdcarenetaccidenttypes_instances = Controller.inst().cdcarenetaccidenttypes.size();
      int cdcarenetagreementtypes_instances = Controller.inst().cdcarenetagreementtypes.size();
      int cdcarenetdocuments_instances = Controller.inst().cdcarenetdocuments.size();
      int cdcarenetinsurancystatuss_instances = Controller.inst().cdcarenetinsurancystatuss.size();
      int cdcarenetmessages_instances = Controller.inst().cdcarenetmessages.size();
      int cdcarenetmutationindicators_instances = Controller.inst().cdcarenetmutationindicators.size();
      int cdcarenetnationalinsurances_instances = Controller.inst().cdcarenetnationalinsurances.size();
      int cdcarenetpersonalparts_instances = Controller.inst().cdcarenetpersonalparts.size();
      int cdcarenetrefusalreasons_instances = Controller.inst().cdcarenetrefusalreasons.size();
      int cdcarenetsiscarderrors_instances = Controller.inst().cdcarenetsiscarderrors.size();
      int cdcarenetthirdpayercontracts_instances = Controller.inst().cdcarenetthirdpayercontracts.size();
      int cdcarenettypes_instances = Controller.inst().cdcarenettypes.size();
      int cdcarepaths_instances = Controller.inst().cdcarepaths.size();
      int cdcertaintys_instances = Controller.inst().cdcertaintys.size();
      int cdchapter4categorys_instances = Controller.inst().cdchapter4categorys.size();
      int cdchapter4criterias_instances = Controller.inst().cdchapter4criterias.size();
      int cdchapter4documentseqappendixs_instances = Controller.inst().cdchapter4documentseqappendixs.size();
      int cdchapter4formalinterpretations_instances = Controller.inst().cdchapter4formalinterpretations.size();
      int cdchapter4paragraphs_instances = Controller.inst().cdchapter4paragraphs.size();
      int cdchapter4verses_instances = Controller.inst().cdchapter4verses.size();
      int cdchapter4verseseqappendixs_instances = Controller.inst().cdchapter4verseseqappendixs.size();
      int cdcivilstates_instances = Controller.inst().cdcivilstates.size();
      int cdclinicals_instances = Controller.inst().cdclinicals.size();
      int cdclinicalplans_instances = Controller.inst().cdclinicalplans.size();
      int cdconsents_instances = Controller.inst().cdconsents.size();
      int cdcontactpersons_instances = Controller.inst().cdcontactpersons.size();
      int cdcontents_instances = Controller.inst().cdcontents.size();
      int cdcountrys_instances = Controller.inst().cdcountrys.size();
      int cdcurrencys_instances = Controller.inst().cdcurrencys.size();
      int cddayperiods_instances = Controller.inst().cddayperiods.size();
      int cddischargetypes_instances = Controller.inst().cddischargetypes.size();
      int cddrugcnks_instances = Controller.inst().cddrugcnks.size();
      int cddrugpresentations_instances = Controller.inst().cddrugpresentations.size();
      int cddrugroutes_instances = Controller.inst().cddrugroutes.size();
      int cdebirthartificialrespirationtypes_instances = Controller.inst().cdebirthartificialrespirationtypes.size();
      int cdebirthcaesareanindications_instances = Controller.inst().cdebirthcaesareanindications.size();
      int cdebirthchildpositions_instances = Controller.inst().cdebirthchildpositions.size();
      int cdebirthcongenitalmalformations_instances = Controller.inst().cdebirthcongenitalmalformations.size();
      int cdebirthdeliveryways_instances = Controller.inst().cdebirthdeliveryways.size();
      int cdebirthfoetalmonitorings_instances = Controller.inst().cdebirthfoetalmonitorings.size();
      int cdebirthneonataldepttypes_instances = Controller.inst().cdebirthneonataldepttypes.size();
      int cdebirthplaces_instances = Controller.inst().cdebirthplaces.size();
      int cdebirthpregnancyorigins_instances = Controller.inst().cdebirthpregnancyorigins.size();
      int cdebirthspecialvaluess_instances = Controller.inst().cdebirthspecialvaluess.size();
      int cdecgs_instances = Controller.inst().cdecgs.size();
      int cdemergencyevaluations_instances = Controller.inst().cdemergencyevaluations.size();
      int cdemploymentsituations_instances = Controller.inst().cdemploymentsituations.size();
      int cdencounters_instances = Controller.inst().cdencounters.size();
      int cdencountersafetyissues_instances = Controller.inst().cdencountersafetyissues.size();
      int cdencryptionactors_instances = Controller.inst().cdencryptionactors.size();
      int cdencryptionmethods_instances = Controller.inst().cdencryptionmethods.size();
      int cderrors_instances = Controller.inst().cderrors.size();
      int cderrormycarenets_instances = Controller.inst().cderrormycarenets.size();
      int cdexternalsources_instances = Controller.inst().cdexternalsources.size();
      int cdformularys_instances = Controller.inst().cdformularys.size();
      int cdgalenicforms_instances = Controller.inst().cdgalenicforms.size();
      int cdhcpartys_instances = Controller.inst().cdhcpartys.size();
      int cdheadings_instances = Controller.inst().cdheadings.size();
      int cdheadingregs_instances = Controller.inst().cdheadingregs.size();
      int cdimplantationdevices_instances = Controller.inst().cdimplantationdevices.size();
      int cdimplantationtypes_instances = Controller.inst().cdimplantationtypes.size();
      int cdincapacitys_instances = Controller.inst().cdincapacitys.size();
      int cdincapacityreasons_instances = Controller.inst().cdincapacityreasons.size();
      int cdinnclusters_instances = Controller.inst().cdinnclusters.size();
      int cditems_instances = Controller.inst().cditems.size();
      int cditembvts_instances = Controller.inst().cditembvts.size();
      int cditemcarenets_instances = Controller.inst().cditemcarenets.size();
      int cditemebirths_instances = Controller.inst().cditemebirths.size();
      int cditemmaas_instances = Controller.inst().cditemmaas.size();
      int cditemmss_instances = Controller.inst().cditemmss.size();
      int cditemmycarenets_instances = Controller.inst().cditemmycarenets.size();
      int cditemregs_instances = Controller.inst().cditemregs.size();
      int cdlabs_instances = Controller.inst().cdlabs.size();
      int cdlegalservices_instances = Controller.inst().cdlegalservices.size();
      int cdlifecycles_instances = Controller.inst().cdlifecycles.size();
      int cdmaacoveragetypes_instances = Controller.inst().cdmaacoveragetypes.size();
      int cdmaarefusaljustifications_instances = Controller.inst().cdmaarefusaljustifications.size();
      int cdmaarequesttypes_instances = Controller.inst().cdmaarequesttypes.size();
      int cdmaaresponsetypes_instances = Controller.inst().cdmaaresponsetypes.size();
      int cdmaatypes_instances = Controller.inst().cdmaatypes.size();
      int cdmedications_instances = Controller.inst().cdmedications.size();
      int cdmessages_instances = Controller.inst().cdmessages.size();
      int cdmicroorganisms_instances = Controller.inst().cdmicroorganisms.size();
      int cdmkgadmissions_instances = Controller.inst().cdmkgadmissions.size();
      int cdmkgdestinations_instances = Controller.inst().cdmkgdestinations.size();
      int cdmkgdischarges_instances = Controller.inst().cdmkgdischarges.size();
      int cdmkgorigins_instances = Controller.inst().cdmkgorigins.size();
      int cdmkgreferrers_instances = Controller.inst().cdmkgreferrers.size();
      int cdmsadaptations_instances = Controller.inst().cdmsadaptations.size();
      int cdmsmedicationtypes_instances = Controller.inst().cdmsmedicationtypes.size();
      int cdmsorigins_instances = Controller.inst().cdmsorigins.size();
      int cdmycarenetjustifications_instances = Controller.inst().cdmycarenetjustifications.size();
      int cdorthoapproachs_instances = Controller.inst().cdorthoapproachs.size();
      int cdorthodiagnosiss_instances = Controller.inst().cdorthodiagnosiss.size();
      int cdorthografts_instances = Controller.inst().cdorthografts.size();
      int cdorthointerfaces_instances = Controller.inst().cdorthointerfaces.size();
      int cdorthokneeinserts_instances = Controller.inst().cdorthokneeinserts.size();
      int cdorthonavcoms_instances = Controller.inst().cdorthonavcoms.size();
      int cdorthotechrevisions_instances = Controller.inst().cdorthotechrevisions.size();
      int cdorthotypes_instances = Controller.inst().cdorthotypes.size();
      int cdparameters_instances = Controller.inst().cdparameters.size();
      int cdpatientwills_instances = Controller.inst().cdpatientwills.size();
      int cdpatientwillhosps_instances = Controller.inst().cdpatientwillhosps.size();
      int cdpatientwillress_instances = Controller.inst().cdpatientwillress.size();
      int cdperiodicitys_instances = Controller.inst().cdperiodicitys.size();
      int cdproofs_instances = Controller.inst().cdproofs.size();
      int cdquantityprefixs_instances = Controller.inst().cdquantityprefixs.size();
      int cdrefscopes_instances = Controller.inst().cdrefscopes.size();
      int cdreimbursementnomenclatures_instances = Controller.inst().cdreimbursementnomenclatures.size();
      int cdrevcomponents_instances = Controller.inst().cdrevcomponents.size();
      int cdseveritys_instances = Controller.inst().cdseveritys.size();
      int cdsexs_instances = Controller.inst().cdsexs.size();
      int cdsites_instances = Controller.inst().cdsites.size();
      int cdsnomeds_instances = Controller.inst().cdsnomeds.size();
      int cdstandards_instances = Controller.inst().cdstandards.size();
      int cdstentbridgetypes_instances = Controller.inst().cdstentbridgetypes.size();
      int cdstentdevices_instances = Controller.inst().cdstentdevices.size();
      int cdstentdominances_instances = Controller.inst().cdstentdominances.size();
      int cdstentlesiontypes_instances = Controller.inst().cdstentlesiontypes.size();
      int cdstentsegments_instances = Controller.inst().cdstentsegments.size();
      int cdsubstances_instances = Controller.inst().cdsubstances.size();
      int cdtechnicals_instances = Controller.inst().cdtechnicals.size();
      int cdtelecoms_instances = Controller.inst().cdtelecoms.size();
      int[] cdtelecoms_newCDTELECOM_counts = new int[100]; 
      int[] cdtelecoms_newCDTELECOM_totals = new int[100]; 
      if (cdtelecoms_instances > 0)
      { CDTELECOM _ex = (CDTELECOM) Controller.inst().cdtelecoms.get(0);
        MutationTest.newCDTELECOM_mutation_tests(_ex,cdtelecoms_newCDTELECOM_counts, cdtelecoms_newCDTELECOM_totals);
      }
      System.out.println();
      int cdtemporalitys_instances = Controller.inst().cdtemporalitys.size();
      int cdtherapeuticlinks_instances = Controller.inst().cdtherapeuticlinks.size();
      int cdtimeunits_instances = Controller.inst().cdtimeunits.size();
      int cdtransactions_instances = Controller.inst().cdtransactions.size();
      int cdtransactioncarenets_instances = Controller.inst().cdtransactioncarenets.size();
      int cdtransactionmaas_instances = Controller.inst().cdtransactionmaas.size();
      int cdtransactionmycarenets_instances = Controller.inst().cdtransactionmycarenets.size();
      int cdtransactionregs_instances = Controller.inst().cdtransactionregs.size();
      int cdtransactiontypes_instances = Controller.inst().cdtransactiontypes.size();
      int cdtucopathologytypes_instances = Controller.inst().cdtucopathologytypes.size();
      int cdtucostemitypes_instances = Controller.inst().cdtucostemitypes.size();
      int cdunits_instances = Controller.inst().cdunits.size();
      int cdurgencys_instances = Controller.inst().cdurgencys.size();
      int cdvaccines_instances = Controller.inst().cdvaccines.size();
      int cdvaccineindications_instances = Controller.inst().cdvaccineindications.size();
      int cdweekdays_instances = Controller.inst().cdweekdays.size();
      int emptys_instances = Controller.inst().emptys.size();
      int icds_instances = Controller.inst().icds.size();
      int icpcs_instances = Controller.inst().icpcs.size();
      int lnktypes_instances = Controller.inst().lnktypes.size();
      int locals_instances = Controller.inst().locals.size();
      int acknowledgmenttypes_instances = Controller.inst().acknowledgmenttypes.size();
      int countrytypes_instances = Controller.inst().countrytypes.size();
      int[] countrytypes_newCountryType_counts = new int[100]; 
      int[] countrytypes_newCountryType_totals = new int[100]; 
      if (countrytypes_instances > 0)
      { CountryType _ex = (CountryType) Controller.inst().countrytypes.get(0);
        MutationTest.newCountryType_mutation_tests(_ex,countrytypes_newCountryType_counts, countrytypes_newCountryType_totals);
      }
      System.out.println();
      int addresstypes_instances = Controller.inst().addresstypes.size();
      int unittypes_instances = Controller.inst().unittypes.size();
      int urgencytypes_instances = Controller.inst().urgencytypes.size();
      int weekdaytype1s_instances = Controller.inst().weekdaytype1s.size();
      int administrationunittypes_instances = Controller.inst().administrationunittypes.size();
      int administrationquantitytypes_instances = Controller.inst().administrationquantitytypes.size();
      int quantityprefixtypes_instances = Controller.inst().quantityprefixtypes.size();
      int quantitytypes_instances = Controller.inst().quantitytypes.size();
      int strengthtypes_instances = Controller.inst().strengthtypes.size();
      int substanceproducttypes_instances = Controller.inst().substanceproducttypes.size();
      int substancetypes_instances = Controller.inst().substancetypes.size();
      int takestypes_instances = Controller.inst().takestypes.size();
      int temporalitytypes_instances = Controller.inst().temporalitytypes.size();
      int textwithlayouttypes_instances = Controller.inst().textwithlayouttypes.size();
      int thirdpayercontracttypes_instances = Controller.inst().thirdpayercontracttypes.size();
      int timeunittypes_instances = Controller.inst().timeunittypes.size();
      int timequantitytypes_instances = Controller.inst().timequantitytypes.size();
      int nationalitytypes_instances = Controller.inst().nationalitytypes.size();
      int telecomtypes_instances = Controller.inst().telecomtypes.size();
      int hcpartytypes_instances = Controller.inst().hcpartytypes.size();
      int authortypes_instances = Controller.inst().authortypes.size();
      int base64encryptedvaluetypes_instances = Controller.inst().base64encryptedvaluetypes.size();
      int base64encrypteddatatypes_instances = Controller.inst().base64encrypteddatatypes.size();
      int galenicformtypes_instances = Controller.inst().galenicformtypes.size();
      int certaintytypes_instances = Controller.inst().certaintytypes.size();
      int civilstatetypes_instances = Controller.inst().civilstatetypes.size();
      int formularyreferencetypes_instances = Controller.inst().formularyreferencetypes.size();
      int medicinalproducttypes_instances = Controller.inst().medicinalproducttypes.size();
      int memberinsurancetypes_instances = Controller.inst().memberinsurancetypes.size();
      int minreftypes_instances = Controller.inst().minreftypes.size();
      int compoundtypes_instances = Controller.inst().compoundtypes.size();
      int compoundprescriptiontypes_instances = Controller.inst().compoundprescriptiontypes.size();
      int confidentialitytypes_instances = Controller.inst().confidentialitytypes.size();
      int professiontypes_instances = Controller.inst().professiontypes.size();
      int persontypes_instances = Controller.inst().persontypes.size();
      int contentlocalitemattributetypes_instances = Controller.inst().contentlocalitemattributetypes.size();
      int contenttypes_instances = Controller.inst().contenttypes.size();
      int costtypes_instances = Controller.inst().costtypes.size();
      int datetypes_instances = Controller.inst().datetypes.size();
      int dayperiodtypes_instances = Controller.inst().dayperiodtypes.size();
      int daytimetypes_instances = Controller.inst().daytimetypes.size();
      int denominatortypes_instances = Controller.inst().denominatortypes.size();
      int documentroots_instances = Controller.inst().documentroots.size();
      int durationtypes_instances = Controller.inst().durationtypes.size();
      int errormycarenettypes_instances = Controller.inst().errormycarenettypes.size();
      int errortypes_instances = Controller.inst().errortypes.size();
      int externalsourcetypes_instances = Controller.inst().externalsourcetypes.size();
      int fcmaxtypes_instances = Controller.inst().fcmaxtypes.size();
      int fcmintypes_instances = Controller.inst().fcmintypes.size();
      int feedbacktypes_instances = Controller.inst().feedbacktypes.size();
      int foldertypes_instances = Controller.inst().foldertypes.size();
      int frequencytypes_instances = Controller.inst().frequencytypes.size();
      int headertypes_instances = Controller.inst().headertypes.size();
      int headingtypes_instances = Controller.inst().headingtypes.size();
      int holtertypes_instances = Controller.inst().holtertypes.size();
      int incapacityreasontypes_instances = Controller.inst().incapacityreasontypes.size();
      int incapacitytypes_instances = Controller.inst().incapacitytypes.size();
      int insurancetypes_instances = Controller.inst().insurancetypes.size();
      int itemtypes_instances = Controller.inst().itemtypes.size();
      int kmehrmessages_instances = Controller.inst().kmehrmessages.size();
      int lifecycletypes_instances = Controller.inst().lifecycletypes.size();
      int localitemattributetypes_instances = Controller.inst().localitemattributetypes.size();
      int locationbirthplacetypes_instances = Controller.inst().locationbirthplacetypes.size();
      int maxreftypes_instances = Controller.inst().maxreftypes.size();
      int medicationtypes_instances = Controller.inst().medicationtypes.size();
      int nominatortypes_instances = Controller.inst().nominatortypes.size();
      int packagetypes_instances = Controller.inst().packagetypes.size();
      int periodicitytypes_instances = Controller.inst().periodicitytypes.size();
      int personalparttypes_instances = Controller.inst().personalparttypes.size();
      int persontypelights_instances = Controller.inst().persontypelights.size();
      int posologytypes_instances = Controller.inst().posologytypes.size();
      int presentationtypes_instances = Controller.inst().presentationtypes.size();
      int recipienttypes_instances = Controller.inst().recipienttypes.size();
      int refscopetypes_instances = Controller.inst().refscopetypes.size();
      int refvaluetypes_instances = Controller.inst().refvaluetypes.size();
      int regimentypes_instances = Controller.inst().regimentypes.size();
      int renewaltypes_instances = Controller.inst().renewaltypes.size();
      int routetypes_instances = Controller.inst().routetypes.size();
      int rrmaxtypes_instances = Controller.inst().rrmaxtypes.size();
      int rrmintypes_instances = Controller.inst().rrmintypes.size();
      int sendertypes_instances = Controller.inst().sendertypes.size();
      int severitytypes_instances = Controller.inst().severitytypes.size();
      int sextypes_instances = Controller.inst().sextypes.size();
      int[] sextypes_newSexType_counts = new int[100]; 
      int[] sextypes_newSexType_totals = new int[100]; 
      if (sextypes_instances > 0)
      { SexType _ex = (SexType) Controller.inst().sextypes.get(0);
        MutationTest.newSexType_mutation_tests(_ex,sextypes_newSexType_counts, sextypes_newSexType_totals);
      }
      System.out.println();
      int sitetypes_instances = Controller.inst().sitetypes.size();
      int sourcetypes_instances = Controller.inst().sourcetypes.size();
      int specialisationtypes_instances = Controller.inst().specialisationtypes.size();
      int standardtypes_instances = Controller.inst().standardtypes.size();
      int transactiontypes_instances = Controller.inst().transactiontypes.size();
      int fhirbooleans_instances = Controller.inst().fhirbooleans.size();
      int[] fhirbooleans_newFhirBoolean_counts = new int[100]; 
      int[] fhirbooleans_newFhirBoolean_totals = new int[100]; 
      if (fhirbooleans_instances > 0)
      { FhirBoolean _ex = (FhirBoolean) Controller.inst().fhirbooleans.get(0);
        MutationTest.newFhirBoolean_mutation_tests(_ex,fhirbooleans_newFhirBoolean_counts, fhirbooleans_newFhirBoolean_totals);
      }
      System.out.println();
      int fhirintegers_instances = Controller.inst().fhirintegers.size();
      int[] fhirintegers_newFhirInteger_counts = new int[100]; 
      int[] fhirintegers_newFhirInteger_totals = new int[100]; 
      if (fhirintegers_instances > 0)
      { FhirInteger _ex = (FhirInteger) Controller.inst().fhirintegers.get(0);
        MutationTest.newFhirInteger_mutation_tests(_ex,fhirintegers_newFhirInteger_counts, fhirintegers_newFhirInteger_totals);
      }
      System.out.println();
      int ids_instances = Controller.inst().ids.size();
      int[] ids_newId_counts = new int[100]; 
      int[] ids_newId_totals = new int[100]; 
      if (ids_instances > 0)
      { Id _ex = (Id) Controller.inst().ids.get(0);
        MutationTest.newId_mutation_tests(_ex,ids_newId_counts, ids_newId_totals);
      }
      System.out.println();
      int uris_instances = Controller.inst().uris.size();
      int[] uris_newUri_counts = new int[100]; 
      int[] uris_newUri_totals = new int[100]; 
      if (uris_instances > 0)
      { Uri _ex = (Uri) Controller.inst().uris.get(0);
        MutationTest.newUri_mutation_tests(_ex,uris_newUri_counts, uris_newUri_totals);
      }
      System.out.println();
      int[] uris_newUrn_counts = new int[100]; 
      int[] uris_newUrn_totals = new int[100]; 
      if (uris_instances > 0)
      { Uri _ex = (Uri) Controller.inst().uris.get(0);
        MutationTest.newUrn_mutation_tests(_ex,uris_newUrn_counts, uris_newUrn_totals);
      }
      System.out.println();
      int urls_instances = Controller.inst().urls.size();
      int fhirstrings_instances = Controller.inst().fhirstrings.size();
      int[] fhirstrings_newFhirString_counts = new int[100]; 
      int[] fhirstrings_newFhirString_totals = new int[100]; 
      if (fhirstrings_instances > 0)
      { FhirString _ex = (FhirString) Controller.inst().fhirstrings.get(0);
        MutationTest.newFhirString_mutation_tests(_ex,fhirstrings_newFhirString_counts, fhirstrings_newFhirString_totals);
      }
      System.out.println();
      int fhirdates_instances = Controller.inst().fhirdates.size();
      int[] fhirdates_newFhirDate_counts = new int[100]; 
      int[] fhirdates_newFhirDate_totals = new int[100]; 
      if (fhirdates_instances > 0)
      { FhirDate _ex = (FhirDate) Controller.inst().fhirdates.get(0);
        MutationTest.newFhirDate_mutation_tests(_ex,fhirdates_newFhirDate_counts, fhirdates_newFhirDate_totals);
      }
      System.out.println();
      int datetimes_instances = Controller.inst().datetimes.size();
      int[] datetimes_newDateTime_counts = new int[100]; 
      int[] datetimes_newDateTime_totals = new int[100]; 
      if (datetimes_instances > 0)
      { DateTime _ex = (DateTime) Controller.inst().datetimes.get(0);
        MutationTest.newDateTime_mutation_tests(_ex,datetimes_newDateTime_counts, datetimes_newDateTime_totals);
      }
      System.out.println();
      int decimals_instances = Controller.inst().decimals.size();
      int[] decimals_newDecimal_counts = new int[100]; 
      int[] decimals_newDecimal_totals = new int[100]; 
      if (decimals_instances > 0)
      { Decimal _ex = (Decimal) Controller.inst().decimals.get(0);
        MutationTest.newDecimal_mutation_tests(_ex,decimals_newDecimal_counts, decimals_newDecimal_totals);
      }
      System.out.println();
      int periods_instances = Controller.inst().periods.size();
      int fhiraddresstypes_instances = Controller.inst().fhiraddresstypes.size();
      int addressuses_instances = Controller.inst().addressuses.size();
      int addresss_instances = Controller.inst().addresss.size();
      int extensions_instances = Controller.inst().extensions.size();
      int positiveints_instances = Controller.inst().positiveints.size();
      int[] positiveints_newPositiveInt_counts = new int[100]; 
      int[] positiveints_newPositiveInt_totals = new int[100]; 
      if (positiveints_instances > 0)
      { PositiveInt _ex = (PositiveInt) Controller.inst().positiveints.get(0);
        MutationTest.newPositiveInt_mutation_tests(_ex,positiveints_newPositiveInt_counts, positiveints_newPositiveInt_totals);
      }
      System.out.println();
      int codes_instances = Controller.inst().codes.size();
      int[] codes_newCode_counts = new int[100]; 
      int[] codes_newCode_totals = new int[100]; 
      if (codes_instances > 0)
      { Code _ex = (Code) Controller.inst().codes.get(0);
        MutationTest.newCode_mutation_tests(_ex,codes_newCode_counts, codes_newCode_totals);
      }
      System.out.println();
      int codings_instances = Controller.inst().codings.size();
      int[] codings_newCoding_counts = new int[100]; 
      int[] codings_newCoding_totals = new int[100]; 
      if (codings_instances > 0)
      { Coding _ex = (Coding) Controller.inst().codings.get(0);
        MutationTest.newCoding_mutation_tests(_ex,codings_newCoding_counts, codings_newCoding_totals);
      }
      System.out.println();
      int[] codings_newCodingDisplay_counts = new int[100]; 
      int[] codings_newCodingDisplay_totals = new int[100]; 
      if (codings_instances > 0)
      { Coding _ex = (Coding) Controller.inst().codings.get(0);
        MutationTest.newCodingDisplay_mutation_tests(_ex,codings_newCodingDisplay_counts, codings_newCodingDisplay_totals);
      }
      System.out.println();
      int codeableconcepts_instances = Controller.inst().codeableconcepts.size();
      int[] codeableconcepts_newCodeableConcept_counts = new int[100]; 
      int[] codeableconcepts_newCodeableConcept_totals = new int[100]; 
      if (codeableconcepts_instances > 0)
      { CodeableConcept _ex = (CodeableConcept) Controller.inst().codeableconcepts.get(0);
        MutationTest.newCodeableConcept_mutation_tests(_ex,codeableconcepts_newCodeableConcept_counts, codeableconcepts_newCodeableConcept_totals);
      }
      System.out.println();
      int[] codeableconcepts_newCodeableConceptCodings_counts = new int[100]; 
      int[] codeableconcepts_newCodeableConceptCodings_totals = new int[100]; 
      if (codeableconcepts_instances > 0)
      { CodeableConcept _ex = (CodeableConcept) Controller.inst().codeableconcepts.get(0);
        MutationTest.newCodeableConceptCodings_mutation_tests(_ex,codeableconcepts_newCodeableConceptCodings_counts, codeableconcepts_newCodeableConceptCodings_totals);
      }
      System.out.println();
      int contactpointsystems_instances = Controller.inst().contactpointsystems.size();
      int contactpointuses_instances = Controller.inst().contactpointuses.size();
      int contactpoints_instances = Controller.inst().contactpoints.size();
      int instants_instances = Controller.inst().instants.size();
      int canonicals_instances = Controller.inst().canonicals.size();
      int unsignedints_instances = Controller.inst().unsignedints.size();
      int metas_instances = Controller.inst().metas.size();
      int narrativestatuss_instances = Controller.inst().narrativestatuss.size();
      int narratives_instances = Controller.inst().narratives.size();
      int allergyintolerancecategorys_instances = Controller.inst().allergyintolerancecategorys.size();
      int allergyintolerancecriticalitys_instances = Controller.inst().allergyintolerancecriticalitys.size();
      int[] allergyintolerancecriticalitys_newAllergyIntoleranceCriticality_counts = new int[100]; 
      int[] allergyintolerancecriticalitys_newAllergyIntoleranceCriticality_totals = new int[100]; 
      if (allergyintolerancecriticalitys_instances > 0)
      { AllergyIntoleranceCriticality _ex = (AllergyIntoleranceCriticality) Controller.inst().allergyintolerancecriticalitys.get(0);
        MutationTest.newAllergyIntoleranceCriticality_mutation_tests(_ex,allergyintolerancecriticalitys_newAllergyIntoleranceCriticality_counts, allergyintolerancecriticalitys_newAllergyIntoleranceCriticality_totals);
      }
      System.out.println();
      int ages_instances = Controller.inst().ages.size();
      int allergyintolerances_instances = Controller.inst().allergyintolerances.size();
      int conditions_instances = Controller.inst().conditions.size();
      int immunizationstatuscodess_instances = Controller.inst().immunizationstatuscodess.size();
      int[] immunizationstatuscodess_newImmunizationStatusCodes_counts = new int[100]; 
      int[] immunizationstatuscodess_newImmunizationStatusCodes_totals = new int[100]; 
      if (immunizationstatuscodess_instances > 0)
      { ImmunizationStatusCodes _ex = (ImmunizationStatusCodes) Controller.inst().immunizationstatuscodess.get(0);
        MutationTest.newImmunizationStatusCodes_mutation_tests(_ex,immunizationstatuscodess_newImmunizationStatusCodes_counts, immunizationstatuscodess_newImmunizationStatusCodes_totals);
      }
      System.out.println();
      int immunizations_instances = Controller.inst().immunizations.size();
      int organizations_instances = Controller.inst().organizations.size();
      int practitioners_instances = Controller.inst().practitioners.size();
      int medicationbatchs_instances = Controller.inst().medicationbatchs.size();
      int ratios_instances = Controller.inst().ratios.size();
      int medicationingredients_instances = Controller.inst().medicationingredients.size();
      int medicationstatuscodess_instances = Controller.inst().medicationstatuscodess.size();
      int[] medicationstatuscodess_newMedicationStatusCodes_counts = new int[100]; 
      int[] medicationstatuscodess_newMedicationStatusCodes_totals = new int[100]; 
      if (medicationstatuscodess_instances > 0)
      { MedicationStatusCodes _ex = (MedicationStatusCodes) Controller.inst().medicationstatuscodess.get(0);
        MutationTest.newMedicationStatusCodes_mutation_tests(_ex,medicationstatuscodess_newMedicationStatusCodes_counts, medicationstatuscodess_newMedicationStatusCodes_totals);
      }
      System.out.println();
      int medications_instances = Controller.inst().medications.size();
      int resourcecontainers_instances = Controller.inst().resourcecontainers.size();
      int[] resourcecontainers_newResourceContainer_counts = new int[100]; 
      int[] resourcecontainers_newResourceContainer_totals = new int[100]; 
      if (resourcecontainers_instances > 0)
      { ResourceContainer _ex = (ResourceContainer) Controller.inst().resourcecontainers.get(0);
        MutationTest.newResourceContainer_mutation_tests(_ex,resourcecontainers_newResourceContainer_counts, resourcecontainers_newResourceContainer_totals);
      }
      System.out.println();
      int identifieruses_instances = Controller.inst().identifieruses.size();
      int references_instances = Controller.inst().references.size();
      int[] references_newReference_counts = new int[100]; 
      int[] references_newReference_totals = new int[100]; 
      if (references_instances > 0)
      { Reference _ex = (Reference) Controller.inst().references.get(0);
        MutationTest.newReference_mutation_tests(_ex,references_newReference_counts, references_newReference_totals);
      }
      System.out.println();
      int[] references_newPatientReference_counts = new int[100]; 
      int[] references_newPatientReference_totals = new int[100]; 
      if (references_instances > 0)
      { Reference _ex = (Reference) Controller.inst().references.get(0);
        MutationTest.newPatientReference_mutation_tests(_ex,references_newPatientReference_counts, references_newPatientReference_totals);
      }
      System.out.println();
      int identifiers_instances = Controller.inst().identifiers.size();
      int nameuses_instances = Controller.inst().nameuses.size();
      int humannames_instances = Controller.inst().humannames.size();
      int administrativegenders_instances = Controller.inst().administrativegenders.size();
      int base64binarys_instances = Controller.inst().base64binarys.size();
      int integer64s_instances = Controller.inst().integer64s.size();
      int attachments_instances = Controller.inst().attachments.size();
      int patientcommunications_instances = Controller.inst().patientcommunications.size();
      int patientcontacts_instances = Controller.inst().patientcontacts.size();
      int linktypes_instances = Controller.inst().linktypes.size();
      int patientlinks_instances = Controller.inst().patientlinks.size();
      int patients_instances = Controller.inst().patients.size();
      int signatures_instances = Controller.inst().signatures.size();
      int linkrelationtypess_instances = Controller.inst().linkrelationtypess.size();
      int bundlelinks_instances = Controller.inst().bundlelinks.size();
      int bundleentrys_instances = Controller.inst().bundleentrys.size();
      int[] bundleentrys_newBundleEntry_counts = new int[100]; 
      int[] bundleentrys_newBundleEntry_totals = new int[100]; 
      if (bundleentrys_instances > 0)
      { BundleEntry _ex = (BundleEntry) Controller.inst().bundleentrys.get(0);
        MutationTest.newBundleEntry_mutation_tests(_ex,bundleentrys_newBundleEntry_counts, bundleentrys_newBundleEntry_totals);
      }
      System.out.println();
      int bundletypes_instances = Controller.inst().bundletypes.size();
      int[] bundletypes_newBundleType_counts = new int[100]; 
      int[] bundletypes_newBundleType_totals = new int[100]; 
      if (bundletypes_instances > 0)
      { BundleType _ex = (BundleType) Controller.inst().bundletypes.get(0);
        MutationTest.newBundleType_mutation_tests(_ex,bundletypes_newBundleType_counts, bundletypes_newBundleType_totals);
      }
      System.out.println();
      int bundles_instances = Controller.inst().bundles.size();
      int codeablereferences_instances = Controller.inst().codeablereferences.size();
      int[] codeablereferences_newCodeableReference_counts = new int[100]; 
      int[] codeablereferences_newCodeableReference_totals = new int[100]; 
      if (codeablereferences_instances > 0)
      { CodeableReference _ex = (CodeableReference) Controller.inst().codeablereferences.get(0);
        MutationTest.newCodeableReference_mutation_tests(_ex,codeablereferences_newCodeableReference_counts, codeablereferences_newCodeableReference_totals);
      }
      System.out.println();
      int fhirdocumentroots_instances = Controller.inst().fhirdocumentroots.size();
      int compositionsections_instances = Controller.inst().compositionsections.size();
      int[] compositionsections_newCompositionSection_counts = new int[100]; 
      int[] compositionsections_newCompositionSection_totals = new int[100]; 
      if (compositionsections_instances > 0)
      { CompositionSection _ex = (CompositionSection) Controller.inst().compositionsections.get(0);
        MutationTest.newCompositionSection_mutation_tests(_ex,compositionsections_newCompositionSection_counts, compositionsections_newCompositionSection_totals);
      }
      System.out.println();
      int compositionattesters_instances = Controller.inst().compositionattesters.size();
      int compositionevents_instances = Controller.inst().compositionevents.size();
      int compositionstatuss_instances = Controller.inst().compositionstatuss.size();
      int[] compositionstatuss_newCompositionStatus_counts = new int[100]; 
      int[] compositionstatuss_newCompositionStatus_totals = new int[100]; 
      if (compositionstatuss_instances > 0)
      { CompositionStatus _ex = (CompositionStatus) Controller.inst().compositionstatuss.get(0);
        MutationTest.newCompositionStatus_mutation_tests(_ex,compositionstatuss_newCompositionStatus_counts, compositionstatuss_newCompositionStatus_totals);
      }
      System.out.println();
      int markdowns_instances = Controller.inst().markdowns.size();
      int annotations_instances = Controller.inst().annotations.size();
      int quantitycomparators_instances = Controller.inst().quantitycomparators.size();
      int ranges_instances = Controller.inst().ranges.size();
      int usagecontexts_instances = Controller.inst().usagecontexts.size();
      int compositions_instances = Controller.inst().compositions.size();
      int auxopss_instances = Controller.inst().auxopss.size();
      int[] auxopss_streetValue_counts = new int[100]; 
      int[] auxopss_streetValue_totals = new int[100]; 
      if (auxopss_instances > 0)
      { AuxOps _ex = (AuxOps) Controller.inst().auxopss.get(0);
        MutationTest.streetValue_mutation_tests(_ex,auxopss_streetValue_counts, auxopss_streetValue_totals);
      }
      System.out.println();
      int[] auxopss_houseNumber_counts = new int[100]; 
      int[] auxopss_houseNumber_totals = new int[100]; 
      if (auxopss_instances > 0)
      { AuxOps _ex = (AuxOps) Controller.inst().auxopss.get(0);
        MutationTest.houseNumber_mutation_tests(_ex,auxopss_houseNumber_counts, auxopss_houseNumber_totals);
      }
      System.out.println();
      int[] auxopss_postboxNumber_counts = new int[100]; 
      int[] auxopss_postboxNumber_totals = new int[100]; 
      if (auxopss_instances > 0)
      { AuxOps _ex = (AuxOps) Controller.inst().auxopss.get(0);
        MutationTest.postboxNumber_mutation_tests(_ex,auxopss_postboxNumber_counts, auxopss_postboxNumber_totals);
      }
      System.out.println();
      return;
    } 
    int[] intTestValues = {0, -1, 1, -1025, 1024};
    long[] longTestValues = {0, -1, 1, -999999, 100000};
    double[] doubleTestValues = {0, -1, 1, 3125.0891, 4.9E-324};
    boolean[] booleanTestValues = {false, true};
    String[] stringTestValues = {"", " abc_XZ ", "#�$* &~@'"};
    int MAXOBJECTS = 500;

    if ("fhir2kmehr".equals(cmd))
    {       System.out.println();
      System.out.print(">>> Test: " + "");
      try {  cont.fhir2kmehr();
      }
      catch (Throwable _e) { System.out.println(" !! Exception occurred: test failed !! "); }

      System.out.println();
      System.out.println();

      return;
    } 
  }

  public static void main(String[] args)
  { TestsGUI gui = new TestsGUI();
    gui.setSize(550,400);
    gui.setVisible(true);
  }
 }
