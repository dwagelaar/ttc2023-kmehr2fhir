package kmehr;

import java.util.Date;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

enum IDHCPARTYschemes { IDHCPARTY, INSS, LOCAL, IDENCRYPTIONAPPLICATION, IDENCRYPTIONACTOR, IDENCRYPTIONKEY, IDINSURANCE, IDCBE, IDEHP;

  public static IDHCPARTYschemes parseIDHCPARTYschemes(String _x) {
    if ("IDHCPARTY".equals(_x)) { return IDHCPARTYschemes.IDHCPARTY; }
    if ("INSS".equals(_x)) { return IDHCPARTYschemes.INSS; }
    if ("LOCAL".equals(_x)) { return IDHCPARTYschemes.LOCAL; }
    if ("IDENCRYPTIONAPPLICATION".equals(_x)) { return IDHCPARTYschemes.IDENCRYPTIONAPPLICATION; }
    if ("IDENCRYPTIONACTOR".equals(_x)) { return IDHCPARTYschemes.IDENCRYPTIONACTOR; }
    if ("IDENCRYPTIONKEY".equals(_x)) { return IDHCPARTYschemes.IDENCRYPTIONKEY; }
    if ("IDINSURANCE".equals(_x)) { return IDHCPARTYschemes.IDINSURANCE; }
    if ("IDCBE".equals(_x)) { return IDHCPARTYschemes.IDCBE; }
    if ("IDEHP".equals(_x)) { return IDHCPARTYschemes.IDEHP; }
    return null;
  }
}


enum IDINSURANCEschemes { IDINSURANCE, LOCAL;

  public static IDINSURANCEschemes parseIDINSURANCEschemes(String _x) {
    if ("IDINSURANCE".equals(_x)) { return IDINSURANCEschemes.IDINSURANCE; }
    if ("LOCAL".equals(_x)) { return IDINSURANCEschemes.LOCAL; }
    return null;
  }
}


enum IDKMEHRschemes { IDKMEHR, IDIBAN, IDSERIALNO, LOCAL, IDCBE;

  public static IDKMEHRschemes parseIDKMEHRschemes(String _x) {
    if ("IDKMEHR".equals(_x)) { return IDKMEHRschemes.IDKMEHR; }
    if ("IDIBAN".equals(_x)) { return IDKMEHRschemes.IDIBAN; }
    if ("IDSERIALNO".equals(_x)) { return IDKMEHRschemes.IDSERIALNO; }
    if ("LOCAL".equals(_x)) { return IDKMEHRschemes.LOCAL; }
    if ("IDCBE".equals(_x)) { return IDKMEHRschemes.IDCBE; }
    return null;
  }
}


enum IDPATIENTschemes { IDPATIENT, INSS, EIDCARDNO, SISCARDNO, ISICARDNO, LOCAL;

  public static IDPATIENTschemes parseIDPATIENTschemes(String _x) {
    if ("IDPATIENT".equals(_x)) { return IDPATIENTschemes.IDPATIENT; }
    if ("INSS".equals(_x)) { return IDPATIENTschemes.INSS; }
    if ("EIDCARDNO".equals(_x)) { return IDPATIENTschemes.EIDCARDNO; }
    if ("SISCARDNO".equals(_x)) { return IDPATIENTschemes.SISCARDNO; }
    if ("ISICARDNO".equals(_x)) { return IDPATIENTschemes.ISICARDNO; }
    if ("LOCAL".equals(_x)) { return IDPATIENTschemes.LOCAL; }
    return null;
  }
}


enum IDPROFESSIONschemes { IDMEDEX, IDCBE;

  public static IDPROFESSIONschemes parseIDPROFESSIONschemes(String _x) {
    if ("IDMEDEX".equals(_x)) { return IDPROFESSIONschemes.IDMEDEX; }
    if ("IDCBE".equals(_x)) { return IDPROFESSIONschemes.IDCBE; }
    return null;
  }
}


enum CDACCESSRIGHTschemes { CDACCESSRIGHT, LOCAL;

  public static CDACCESSRIGHTschemes parseCDACCESSRIGHTschemes(String _x) {
    if ("CDACCESSRIGHT".equals(_x)) { return CDACCESSRIGHTschemes.CDACCESSRIGHT; }
    if ("LOCAL".equals(_x)) { return CDACCESSRIGHTschemes.LOCAL; }
    return null;
  }
}


enum CDACCESSRIGHTvalues { allow, disallow;

  public static CDACCESSRIGHTvalues parseCDACCESSRIGHTvalues(String _x) {
    if ("allow".equals(_x)) { return CDACCESSRIGHTvalues.allow; }
    if ("disallow".equals(_x)) { return CDACCESSRIGHTvalues.disallow; }
    return null;
  }
}


enum CDACKNOWLEDGMENTvalues { always, never, onerror, onsuccess;

  public static CDACKNOWLEDGMENTvalues parseCDACKNOWLEDGMENTvalues(String _x) {
    if ("always".equals(_x)) { return CDACKNOWLEDGMENTvalues.always; }
    if ("never".equals(_x)) { return CDACKNOWLEDGMENTvalues.never; }
    if ("onerror".equals(_x)) { return CDACKNOWLEDGMENTvalues.onerror; }
    if ("onsuccess".equals(_x)) { return CDACKNOWLEDGMENTvalues.onsuccess; }
    return null;
  }
}


enum CDACTSNURSINGvalues { NMF001, NMF002, NMF011, NMF012, NMF013, NMF021, NMF022, NMF031, NMF040, NMF041, NMF042, NMF043, NMF044, NMF045, NMF046, NMF047, NMF051, NMF052, NMF061, NMF062, NMF071, NMF072, NMF073, NMF074, NMF081, NMF082, NMF091, NMF092, NMF093, NMF101, NMF111, NMF112, NMF113, NMF114, NMF115, NMF116, NMF121, NMF999;

  public static CDACTSNURSINGvalues parseCDACTSNURSINGvalues(String _x) {
    if ("NMF001".equals(_x)) { return CDACTSNURSINGvalues.NMF001; }
    if ("NMF002".equals(_x)) { return CDACTSNURSINGvalues.NMF002; }
    if ("NMF011".equals(_x)) { return CDACTSNURSINGvalues.NMF011; }
    if ("NMF012".equals(_x)) { return CDACTSNURSINGvalues.NMF012; }
    if ("NMF013".equals(_x)) { return CDACTSNURSINGvalues.NMF013; }
    if ("NMF021".equals(_x)) { return CDACTSNURSINGvalues.NMF021; }
    if ("NMF022".equals(_x)) { return CDACTSNURSINGvalues.NMF022; }
    if ("NMF031".equals(_x)) { return CDACTSNURSINGvalues.NMF031; }
    if ("NMF040".equals(_x)) { return CDACTSNURSINGvalues.NMF040; }
    if ("NMF041".equals(_x)) { return CDACTSNURSINGvalues.NMF041; }
    if ("NMF042".equals(_x)) { return CDACTSNURSINGvalues.NMF042; }
    if ("NMF043".equals(_x)) { return CDACTSNURSINGvalues.NMF043; }
    if ("NMF044".equals(_x)) { return CDACTSNURSINGvalues.NMF044; }
    if ("NMF045".equals(_x)) { return CDACTSNURSINGvalues.NMF045; }
    if ("NMF046".equals(_x)) { return CDACTSNURSINGvalues.NMF046; }
    if ("NMF047".equals(_x)) { return CDACTSNURSINGvalues.NMF047; }
    if ("NMF051".equals(_x)) { return CDACTSNURSINGvalues.NMF051; }
    if ("NMF052".equals(_x)) { return CDACTSNURSINGvalues.NMF052; }
    if ("NMF061".equals(_x)) { return CDACTSNURSINGvalues.NMF061; }
    if ("NMF062".equals(_x)) { return CDACTSNURSINGvalues.NMF062; }
    if ("NMF071".equals(_x)) { return CDACTSNURSINGvalues.NMF071; }
    if ("NMF072".equals(_x)) { return CDACTSNURSINGvalues.NMF072; }
    if ("NMF073".equals(_x)) { return CDACTSNURSINGvalues.NMF073; }
    if ("NMF074".equals(_x)) { return CDACTSNURSINGvalues.NMF074; }
    if ("NMF081".equals(_x)) { return CDACTSNURSINGvalues.NMF081; }
    if ("NMF082".equals(_x)) { return CDACTSNURSINGvalues.NMF082; }
    if ("NMF091".equals(_x)) { return CDACTSNURSINGvalues.NMF091; }
    if ("NMF092".equals(_x)) { return CDACTSNURSINGvalues.NMF092; }
    if ("NMF093".equals(_x)) { return CDACTSNURSINGvalues.NMF093; }
    if ("NMF101".equals(_x)) { return CDACTSNURSINGvalues.NMF101; }
    if ("NMF111".equals(_x)) { return CDACTSNURSINGvalues.NMF111; }
    if ("NMF112".equals(_x)) { return CDACTSNURSINGvalues.NMF112; }
    if ("NMF113".equals(_x)) { return CDACTSNURSINGvalues.NMF113; }
    if ("NMF114".equals(_x)) { return CDACTSNURSINGvalues.NMF114; }
    if ("NMF115".equals(_x)) { return CDACTSNURSINGvalues.NMF115; }
    if ("NMF116".equals(_x)) { return CDACTSNURSINGvalues.NMF116; }
    if ("NMF121".equals(_x)) { return CDACTSNURSINGvalues.NMF121; }
    if ("NMF999".equals(_x)) { return CDACTSNURSINGvalues.NMF999; }
    return null;
  }
}


enum CDADDRESSschemes { CDADDRESS, LOCAL;

  public static CDADDRESSschemes parseCDADDRESSschemes(String _x) {
    if ("CDADDRESS".equals(_x)) { return CDADDRESSschemes.CDADDRESS; }
    if ("LOCAL".equals(_x)) { return CDADDRESSschemes.LOCAL; }
    return null;
  }
}


enum CDADDRESSvalues { home, other, vacation, work, careaddress;

  public static CDADDRESSvalues parseCDADDRESSvalues(String _x) {
    if ("home".equals(_x)) { return CDADDRESSvalues.home; }
    if ("other".equals(_x)) { return CDADDRESSvalues.other; }
    if ("vacation".equals(_x)) { return CDADDRESSvalues.vacation; }
    if ("work".equals(_x)) { return CDADDRESSvalues.work; }
    if ("careaddress".equals(_x)) { return CDADDRESSvalues.careaddress; }
    return null;
  }
}


enum CDADMINISTRATIONUNITvalues { _00001, _00002, _00003, _00004, _00005, _00006, _00007, _00008, _00009, _00010, _00011, _00012, _00013, _00014, _00015, _00016, _00017, _00018, _00019, _00020, _00021, _00022, _00023, _00024, _00025, _00026, _00027, _00028, _00029, _00030, cm, dropsperminute, gm, internationalunits, mckH, mckKgMinute, measure, mgH, mlH, tbl, tsp, untH, mg, mgMl, meq, miu, iu, mmol, effervescentTablet, micrograms, bandage, piece, box, liter, syringe, ampoule, bottle, syringeAmpoule;

  public static CDADMINISTRATIONUNITvalues parseCDADMINISTRATIONUNITvalues(String _x) {
    if ("_00001".equals(_x)) { return CDADMINISTRATIONUNITvalues._00001; }
    if ("_00002".equals(_x)) { return CDADMINISTRATIONUNITvalues._00002; }
    if ("_00003".equals(_x)) { return CDADMINISTRATIONUNITvalues._00003; }
    if ("_00004".equals(_x)) { return CDADMINISTRATIONUNITvalues._00004; }
    if ("_00005".equals(_x)) { return CDADMINISTRATIONUNITvalues._00005; }
    if ("_00006".equals(_x)) { return CDADMINISTRATIONUNITvalues._00006; }
    if ("_00007".equals(_x)) { return CDADMINISTRATIONUNITvalues._00007; }
    if ("_00008".equals(_x)) { return CDADMINISTRATIONUNITvalues._00008; }
    if ("_00009".equals(_x)) { return CDADMINISTRATIONUNITvalues._00009; }
    if ("_00010".equals(_x)) { return CDADMINISTRATIONUNITvalues._00010; }
    if ("_00011".equals(_x)) { return CDADMINISTRATIONUNITvalues._00011; }
    if ("_00012".equals(_x)) { return CDADMINISTRATIONUNITvalues._00012; }
    if ("_00013".equals(_x)) { return CDADMINISTRATIONUNITvalues._00013; }
    if ("_00014".equals(_x)) { return CDADMINISTRATIONUNITvalues._00014; }
    if ("_00015".equals(_x)) { return CDADMINISTRATIONUNITvalues._00015; }
    if ("_00016".equals(_x)) { return CDADMINISTRATIONUNITvalues._00016; }
    if ("_00017".equals(_x)) { return CDADMINISTRATIONUNITvalues._00017; }
    if ("_00018".equals(_x)) { return CDADMINISTRATIONUNITvalues._00018; }
    if ("_00019".equals(_x)) { return CDADMINISTRATIONUNITvalues._00019; }
    if ("_00020".equals(_x)) { return CDADMINISTRATIONUNITvalues._00020; }
    if ("_00021".equals(_x)) { return CDADMINISTRATIONUNITvalues._00021; }
    if ("_00022".equals(_x)) { return CDADMINISTRATIONUNITvalues._00022; }
    if ("_00023".equals(_x)) { return CDADMINISTRATIONUNITvalues._00023; }
    if ("_00024".equals(_x)) { return CDADMINISTRATIONUNITvalues._00024; }
    if ("_00025".equals(_x)) { return CDADMINISTRATIONUNITvalues._00025; }
    if ("_00026".equals(_x)) { return CDADMINISTRATIONUNITvalues._00026; }
    if ("_00027".equals(_x)) { return CDADMINISTRATIONUNITvalues._00027; }
    if ("_00028".equals(_x)) { return CDADMINISTRATIONUNITvalues._00028; }
    if ("_00029".equals(_x)) { return CDADMINISTRATIONUNITvalues._00029; }
    if ("_00030".equals(_x)) { return CDADMINISTRATIONUNITvalues._00030; }
    if ("cm".equals(_x)) { return CDADMINISTRATIONUNITvalues.cm; }
    if ("dropsperminute".equals(_x)) { return CDADMINISTRATIONUNITvalues.dropsperminute; }
    if ("gm".equals(_x)) { return CDADMINISTRATIONUNITvalues.gm; }
    if ("internationalunits".equals(_x)) { return CDADMINISTRATIONUNITvalues.internationalunits; }
    if ("mckH".equals(_x)) { return CDADMINISTRATIONUNITvalues.mckH; }
    if ("mckKgMinute".equals(_x)) { return CDADMINISTRATIONUNITvalues.mckKgMinute; }
    if ("measure".equals(_x)) { return CDADMINISTRATIONUNITvalues.measure; }
    if ("mgH".equals(_x)) { return CDADMINISTRATIONUNITvalues.mgH; }
    if ("mlH".equals(_x)) { return CDADMINISTRATIONUNITvalues.mlH; }
    if ("tbl".equals(_x)) { return CDADMINISTRATIONUNITvalues.tbl; }
    if ("tsp".equals(_x)) { return CDADMINISTRATIONUNITvalues.tsp; }
    if ("untH".equals(_x)) { return CDADMINISTRATIONUNITvalues.untH; }
    if ("mg".equals(_x)) { return CDADMINISTRATIONUNITvalues.mg; }
    if ("mgMl".equals(_x)) { return CDADMINISTRATIONUNITvalues.mgMl; }
    if ("meq".equals(_x)) { return CDADMINISTRATIONUNITvalues.meq; }
    if ("miu".equals(_x)) { return CDADMINISTRATIONUNITvalues.miu; }
    if ("iu".equals(_x)) { return CDADMINISTRATIONUNITvalues.iu; }
    if ("mmol".equals(_x)) { return CDADMINISTRATIONUNITvalues.mmol; }
    if ("effervescentTablet".equals(_x)) { return CDADMINISTRATIONUNITvalues.effervescentTablet; }
    if ("micrograms".equals(_x)) { return CDADMINISTRATIONUNITvalues.micrograms; }
    if ("bandage".equals(_x)) { return CDADMINISTRATIONUNITvalues.bandage; }
    if ("piece".equals(_x)) { return CDADMINISTRATIONUNITvalues.piece; }
    if ("box".equals(_x)) { return CDADMINISTRATIONUNITvalues.box; }
    if ("liter".equals(_x)) { return CDADMINISTRATIONUNITvalues.liter; }
    if ("syringe".equals(_x)) { return CDADMINISTRATIONUNITvalues.syringe; }
    if ("ampoule".equals(_x)) { return CDADMINISTRATIONUNITvalues.ampoule; }
    if ("bottle".equals(_x)) { return CDADMINISTRATIONUNITvalues.bottle; }
    if ("syringeAmpoule".equals(_x)) { return CDADMINISTRATIONUNITvalues.syringeAmpoule; }
    return null;
  }
}


enum CDAUTONOMYvalues { homebound;

  public static CDAUTONOMYvalues parseCDAUTONOMYvalues(String _x) {
    if ("homebound".equals(_x)) { return CDAUTONOMYvalues.homebound; }
    return null;
  }
}


enum CDBALLONDEVICEvalues { ballon, deb;

  public static CDBALLONDEVICEvalues parseCDBALLONDEVICEvalues(String _x) {
    if ("ballon".equals(_x)) { return CDBALLONDEVICEvalues.ballon; }
    if ("deb".equals(_x)) { return CDBALLONDEVICEvalues.deb; }
    return null;
  }
}


enum CDBCRDIFFERENTATIONDEGREEvalues { welldifferentiated, moderatelydifferentiated, poorlydifferentiated, undifferentiatedanaplastic, tcell, bcell, nullcell, nkcell, unknown;

  public static CDBCRDIFFERENTATIONDEGREEvalues parseCDBCRDIFFERENTATIONDEGREEvalues(String _x) {
    if ("welldifferentiated".equals(_x)) { return CDBCRDIFFERENTATIONDEGREEvalues.welldifferentiated; }
    if ("moderatelydifferentiated".equals(_x)) { return CDBCRDIFFERENTATIONDEGREEvalues.moderatelydifferentiated; }
    if ("poorlydifferentiated".equals(_x)) { return CDBCRDIFFERENTATIONDEGREEvalues.poorlydifferentiated; }
    if ("undifferentiatedanaplastic".equals(_x)) { return CDBCRDIFFERENTATIONDEGREEvalues.undifferentiatedanaplastic; }
    if ("tcell".equals(_x)) { return CDBCRDIFFERENTATIONDEGREEvalues.tcell; }
    if ("bcell".equals(_x)) { return CDBCRDIFFERENTATIONDEGREEvalues.bcell; }
    if ("nullcell".equals(_x)) { return CDBCRDIFFERENTATIONDEGREEvalues.nullcell; }
    if ("nkcell".equals(_x)) { return CDBCRDIFFERENTATIONDEGREEvalues.nkcell; }
    if ("unknown".equals(_x)) { return CDBCRDIFFERENTATIONDEGREEvalues.unknown; }
    return null;
  }
}


enum CDBEARINGSURFACEvalues { metalpoly, cerampoly, metalmetal, ceramceram, other;

  public static CDBEARINGSURFACEvalues parseCDBEARINGSURFACEvalues(String _x) {
    if ("metalpoly".equals(_x)) { return CDBEARINGSURFACEvalues.metalpoly; }
    if ("cerampoly".equals(_x)) { return CDBEARINGSURFACEvalues.cerampoly; }
    if ("metalmetal".equals(_x)) { return CDBEARINGSURFACEvalues.metalmetal; }
    if ("ceramceram".equals(_x)) { return CDBEARINGSURFACEvalues.ceramceram; }
    if ("other".equals(_x)) { return CDBEARINGSURFACEvalues.other; }
    return null;
  }
}


enum CDBVTAVAILABLEMATERIALSvalues { cytology, dna, rna, proteins, correspondingnormaltissue, tissue, serum, plasma, blood, urine, other;

  public static CDBVTAVAILABLEMATERIALSvalues parseCDBVTAVAILABLEMATERIALSvalues(String _x) {
    if ("cytology".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.cytology; }
    if ("dna".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.dna; }
    if ("rna".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.rna; }
    if ("proteins".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.proteins; }
    if ("correspondingnormaltissue".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.correspondingnormaltissue; }
    if ("tissue".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.tissue; }
    if ("serum".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.serum; }
    if ("plasma".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.plasma; }
    if ("blood".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.blood; }
    if ("urine".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.urine; }
    if ("other".equals(_x)) { return CDBVTAVAILABLEMATERIALSvalues.other; }
    return null;
  }
}


enum CDBVTCONSERVATIONDELAYvalues { lessthan30min, morethan30min, unknown;

  public static CDBVTCONSERVATIONDELAYvalues parseCDBVTCONSERVATIONDELAYvalues(String _x) {
    if ("lessthan30min".equals(_x)) { return CDBVTCONSERVATIONDELAYvalues.lessthan30min; }
    if ("morethan30min".equals(_x)) { return CDBVTCONSERVATIONDELAYvalues.morethan30min; }
    if ("unknown".equals(_x)) { return CDBVTCONSERVATIONDELAYvalues.unknown; }
    return null;
  }
}


enum CDBVTCONSERVATIONMODEvalues { minus20degreesc, minus80degreesc, minus120degreesorcolder, liquidnitrogen, inclusioninparaffin, other;

  public static CDBVTCONSERVATIONMODEvalues parseCDBVTCONSERVATIONMODEvalues(String _x) {
    if ("minus20degreesc".equals(_x)) { return CDBVTCONSERVATIONMODEvalues.minus20degreesc; }
    if ("minus80degreesc".equals(_x)) { return CDBVTCONSERVATIONMODEvalues.minus80degreesc; }
    if ("minus120degreesorcolder".equals(_x)) { return CDBVTCONSERVATIONMODEvalues.minus120degreesorcolder; }
    if ("liquidnitrogen".equals(_x)) { return CDBVTCONSERVATIONMODEvalues.liquidnitrogen; }
    if ("inclusioninparaffin".equals(_x)) { return CDBVTCONSERVATIONMODEvalues.inclusioninparaffin; }
    if ("other".equals(_x)) { return CDBVTCONSERVATIONMODEvalues.other; }
    return null;
  }
}


enum CDBVTLATERALITYvalues { left, right, odd, unknown;

  public static CDBVTLATERALITYvalues parseCDBVTLATERALITYvalues(String _x) {
    if ("left".equals(_x)) { return CDBVTLATERALITYvalues.left; }
    if ("right".equals(_x)) { return CDBVTLATERALITYvalues.right; }
    if ("odd".equals(_x)) { return CDBVTLATERALITYvalues.odd; }
    if ("unknown".equals(_x)) { return CDBVTLATERALITYvalues.unknown; }
    return null;
  }
}


enum CDBVTPATIENTOPPOSITIONvalues { nopatientopposition;

  public static CDBVTPATIENTOPPOSITIONvalues parseCDBVTPATIENTOPPOSITIONvalues(String _x) {
    if ("nopatientopposition".equals(_x)) { return CDBVTPATIENTOPPOSITIONvalues.nopatientopposition; }
    return null;
  }
}


enum CDBVTSAMPLETYPEvalues { primarytumor, metastasis, normaltissue, other;

  public static CDBVTSAMPLETYPEvalues parseCDBVTSAMPLETYPEvalues(String _x) {
    if ("primarytumor".equals(_x)) { return CDBVTSAMPLETYPEvalues.primarytumor; }
    if ("metastasis".equals(_x)) { return CDBVTSAMPLETYPEvalues.metastasis; }
    if ("normaltissue".equals(_x)) { return CDBVTSAMPLETYPEvalues.normaltissue; }
    if ("other".equals(_x)) { return CDBVTSAMPLETYPEvalues.other; }
    return null;
  }
}


enum CDBVTSTATUSvalues { saved, submitted, rejected, inactive, published;

  public static CDBVTSTATUSvalues parseCDBVTSTATUSvalues(String _x) {
    if ("saved".equals(_x)) { return CDBVTSTATUSvalues.saved; }
    if ("submitted".equals(_x)) { return CDBVTSTATUSvalues.submitted; }
    if ("rejected".equals(_x)) { return CDBVTSTATUSvalues.rejected; }
    if ("inactive".equals(_x)) { return CDBVTSTATUSvalues.inactive; }
    if ("published".equals(_x)) { return CDBVTSTATUSvalues.published; }
    return null;
  }
}


enum CDCARENETACCIDENTTYPEvalues { _0, _1, _2, _3;

  public static CDCARENETACCIDENTTYPEvalues parseCDCARENETACCIDENTTYPEvalues(String _x) {
    if ("_0".equals(_x)) { return CDCARENETACCIDENTTYPEvalues._0; }
    if ("_1".equals(_x)) { return CDCARENETACCIDENTTYPEvalues._1; }
    if ("_2".equals(_x)) { return CDCARENETACCIDENTTYPEvalues._2; }
    if ("_3".equals(_x)) { return CDCARENETACCIDENTTYPEvalues._3; }
    return null;
  }
}


enum CDCARENETAGREEMENTTYPEvalues { _0, _1;

  public static CDCARENETAGREEMENTTYPEvalues parseCDCARENETAGREEMENTTYPEvalues(String _x) {
    if ("_0".equals(_x)) { return CDCARENETAGREEMENTTYPEvalues._0; }
    if ("_1".equals(_x)) { return CDCARENETAGREEMENTTYPEvalues._1; }
    return null;
  }
}


enum CDCARENETDOCUMENTvalues { _0, _723000, _727100, _727200;

  public static CDCARENETDOCUMENTvalues parseCDCARENETDOCUMENTvalues(String _x) {
    if ("_0".equals(_x)) { return CDCARENETDOCUMENTvalues._0; }
    if ("_723000".equals(_x)) { return CDCARENETDOCUMENTvalues._723000; }
    if ("_727100".equals(_x)) { return CDCARENETDOCUMENTvalues._727100; }
    if ("_727200".equals(_x)) { return CDCARENETDOCUMENTvalues._727200; }
    return null;
  }
}


enum CDCARENETINSURANCYSTATUSvalues { _0, _1, _2, _3, _4, _5;

  public static CDCARENETINSURANCYSTATUSvalues parseCDCARENETINSURANCYSTATUSvalues(String _x) {
    if ("_0".equals(_x)) { return CDCARENETINSURANCYSTATUSvalues._0; }
    if ("_1".equals(_x)) { return CDCARENETINSURANCYSTATUSvalues._1; }
    if ("_2".equals(_x)) { return CDCARENETINSURANCYSTATUSvalues._2; }
    if ("_3".equals(_x)) { return CDCARENETINSURANCYSTATUSvalues._3; }
    if ("_4".equals(_x)) { return CDCARENETINSURANCYSTATUSvalues._4; }
    if ("_5".equals(_x)) { return CDCARENETINSURANCYSTATUSvalues._5; }
    return null;
  }
}


enum CDCARENETMESSAGEvalues { _721000, _721100, _721200, _721900, _721999, _721008, _721009, _723000, _723900, _723999, _723009, _727100, _727200, _727008, _727009, _727208, _727209, _791000, _725000, _725008, _725009, _730000, _800000, _800900, _777000, _777900, _700000;

  public static CDCARENETMESSAGEvalues parseCDCARENETMESSAGEvalues(String _x) {
    if ("_721000".equals(_x)) { return CDCARENETMESSAGEvalues._721000; }
    if ("_721100".equals(_x)) { return CDCARENETMESSAGEvalues._721100; }
    if ("_721200".equals(_x)) { return CDCARENETMESSAGEvalues._721200; }
    if ("_721900".equals(_x)) { return CDCARENETMESSAGEvalues._721900; }
    if ("_721999".equals(_x)) { return CDCARENETMESSAGEvalues._721999; }
    if ("_721008".equals(_x)) { return CDCARENETMESSAGEvalues._721008; }
    if ("_721009".equals(_x)) { return CDCARENETMESSAGEvalues._721009; }
    if ("_723000".equals(_x)) { return CDCARENETMESSAGEvalues._723000; }
    if ("_723900".equals(_x)) { return CDCARENETMESSAGEvalues._723900; }
    if ("_723999".equals(_x)) { return CDCARENETMESSAGEvalues._723999; }
    if ("_723009".equals(_x)) { return CDCARENETMESSAGEvalues._723009; }
    if ("_727100".equals(_x)) { return CDCARENETMESSAGEvalues._727100; }
    if ("_727200".equals(_x)) { return CDCARENETMESSAGEvalues._727200; }
    if ("_727008".equals(_x)) { return CDCARENETMESSAGEvalues._727008; }
    if ("_727009".equals(_x)) { return CDCARENETMESSAGEvalues._727009; }
    if ("_727208".equals(_x)) { return CDCARENETMESSAGEvalues._727208; }
    if ("_727209".equals(_x)) { return CDCARENETMESSAGEvalues._727209; }
    if ("_791000".equals(_x)) { return CDCARENETMESSAGEvalues._791000; }
    if ("_725000".equals(_x)) { return CDCARENETMESSAGEvalues._725000; }
    if ("_725008".equals(_x)) { return CDCARENETMESSAGEvalues._725008; }
    if ("_725009".equals(_x)) { return CDCARENETMESSAGEvalues._725009; }
    if ("_730000".equals(_x)) { return CDCARENETMESSAGEvalues._730000; }
    if ("_800000".equals(_x)) { return CDCARENETMESSAGEvalues._800000; }
    if ("_800900".equals(_x)) { return CDCARENETMESSAGEvalues._800900; }
    if ("_777000".equals(_x)) { return CDCARENETMESSAGEvalues._777000; }
    if ("_777900".equals(_x)) { return CDCARENETMESSAGEvalues._777900; }
    if ("_700000".equals(_x)) { return CDCARENETMESSAGEvalues._700000; }
    return null;
  }
}


enum CDCARENETMUTATIONINDICATORvalues { _0, _1, _2, _3;

  public static CDCARENETMUTATIONINDICATORvalues parseCDCARENETMUTATIONINDICATORvalues(String _x) {
    if ("_0".equals(_x)) { return CDCARENETMUTATIONINDICATORvalues._0; }
    if ("_1".equals(_x)) { return CDCARENETMUTATIONINDICATORvalues._1; }
    if ("_2".equals(_x)) { return CDCARENETMUTATIONINDICATORvalues._2; }
    if ("_3".equals(_x)) { return CDCARENETMUTATIONINDICATORvalues._3; }
    return null;
  }
}


enum CDCARENETNATIONALINSURANCEvalues { _100, _200, _300, _400, _500, _600, _900;

  public static CDCARENETNATIONALINSURANCEvalues parseCDCARENETNATIONALINSURANCEvalues(String _x) {
    if ("_100".equals(_x)) { return CDCARENETNATIONALINSURANCEvalues._100; }
    if ("_200".equals(_x)) { return CDCARENETNATIONALINSURANCEvalues._200; }
    if ("_300".equals(_x)) { return CDCARENETNATIONALINSURANCEvalues._300; }
    if ("_400".equals(_x)) { return CDCARENETNATIONALINSURANCEvalues._400; }
    if ("_500".equals(_x)) { return CDCARENETNATIONALINSURANCEvalues._500; }
    if ("_600".equals(_x)) { return CDCARENETNATIONALINSURANCEvalues._600; }
    if ("_900".equals(_x)) { return CDCARENETNATIONALINSURANCEvalues._900; }
    return null;
  }
}


enum CDCARENETPERSONALPARTvalues { code1, code2, future;

  public static CDCARENETPERSONALPARTvalues parseCDCARENETPERSONALPARTvalues(String _x) {
    if ("code1".equals(_x)) { return CDCARENETPERSONALPARTvalues.code1; }
    if ("code2".equals(_x)) { return CDCARENETPERSONALPARTvalues.code2; }
    if ("future".equals(_x)) { return CDCARENETPERSONALPARTvalues.future; }
    return null;
  }
}


enum CDCARENETREFUSALREASONvalues { _100, _200, _201, _300, _410, _420, _500;

  public static CDCARENETREFUSALREASONvalues parseCDCARENETREFUSALREASONvalues(String _x) {
    if ("_100".equals(_x)) { return CDCARENETREFUSALREASONvalues._100; }
    if ("_200".equals(_x)) { return CDCARENETREFUSALREASONvalues._200; }
    if ("_201".equals(_x)) { return CDCARENETREFUSALREASONvalues._201; }
    if ("_300".equals(_x)) { return CDCARENETREFUSALREASONvalues._300; }
    if ("_410".equals(_x)) { return CDCARENETREFUSALREASONvalues._410; }
    if ("_420".equals(_x)) { return CDCARENETREFUSALREASONvalues._420; }
    if ("_500".equals(_x)) { return CDCARENETREFUSALREASONvalues._500; }
    return null;
  }
}


enum CDCARENETSISCARDERRORvalues { _20, _21, _22, _23, _24, _26, _27, _28, _29;

  public static CDCARENETSISCARDERRORvalues parseCDCARENETSISCARDERRORvalues(String _x) {
    if ("_20".equals(_x)) { return CDCARENETSISCARDERRORvalues._20; }
    if ("_21".equals(_x)) { return CDCARENETSISCARDERRORvalues._21; }
    if ("_22".equals(_x)) { return CDCARENETSISCARDERRORvalues._22; }
    if ("_23".equals(_x)) { return CDCARENETSISCARDERRORvalues._23; }
    if ("_24".equals(_x)) { return CDCARENETSISCARDERRORvalues._24; }
    if ("_26".equals(_x)) { return CDCARENETSISCARDERRORvalues._26; }
    if ("_27".equals(_x)) { return CDCARENETSISCARDERRORvalues._27; }
    if ("_28".equals(_x)) { return CDCARENETSISCARDERRORvalues._28; }
    if ("_29".equals(_x)) { return CDCARENETSISCARDERRORvalues._29; }
    return null;
  }
}


enum CDCARENETTHIRDPAYERCONTRACTvalues { _0, _1;

  public static CDCARENETTHIRDPAYERCONTRACTvalues parseCDCARENETTHIRDPAYERCONTRACTvalues(String _x) {
    if ("_0".equals(_x)) { return CDCARENETTHIRDPAYERCONTRACTvalues._0; }
    if ("_1".equals(_x)) { return CDCARENETTHIRDPAYERCONTRACTvalues._1; }
    return null;
  }
}


enum CDCARENETTYPEvalues { _11, _12, _21, _22, _91, _92, _93, _94;

  public static CDCARENETTYPEvalues parseCDCARENETTYPEvalues(String _x) {
    if ("_11".equals(_x)) { return CDCARENETTYPEvalues._11; }
    if ("_12".equals(_x)) { return CDCARENETTYPEvalues._12; }
    if ("_21".equals(_x)) { return CDCARENETTYPEvalues._21; }
    if ("_22".equals(_x)) { return CDCARENETTYPEvalues._22; }
    if ("_91".equals(_x)) { return CDCARENETTYPEvalues._91; }
    if ("_92".equals(_x)) { return CDCARENETTYPEvalues._92; }
    if ("_93".equals(_x)) { return CDCARENETTYPEvalues._93; }
    if ("_94".equals(_x)) { return CDCARENETTYPEvalues._94; }
    return null;
  }
}


enum CDCAREPATHvalues { _001, _002, _003, _101, _102, _103, _010;

  public static CDCAREPATHvalues parseCDCAREPATHvalues(String _x) {
    if ("_001".equals(_x)) { return CDCAREPATHvalues._001; }
    if ("_002".equals(_x)) { return CDCAREPATHvalues._002; }
    if ("_003".equals(_x)) { return CDCAREPATHvalues._003; }
    if ("_101".equals(_x)) { return CDCAREPATHvalues._101; }
    if ("_102".equals(_x)) { return CDCAREPATHvalues._102; }
    if ("_103".equals(_x)) { return CDCAREPATHvalues._103; }
    if ("_010".equals(_x)) { return CDCAREPATHvalues._010; }
    return null;
  }
}


enum CDCERTAINTYvalues { excluded, probable, proven, unprobable, undefined;

  public static CDCERTAINTYvalues parseCDCERTAINTYvalues(String _x) {
    if ("excluded".equals(_x)) { return CDCERTAINTYvalues.excluded; }
    if ("probable".equals(_x)) { return CDCERTAINTYvalues.probable; }
    if ("proven".equals(_x)) { return CDCERTAINTYvalues.proven; }
    if ("unprobable".equals(_x)) { return CDCERTAINTYvalues.unprobable; }
    if ("undefined".equals(_x)) { return CDCERTAINTYvalues.undefined; }
    return null;
  }
}


enum CDCLINICALPLANvalues { breastcancerprevention, cervixutericancer, colrectalcancerprevention, primaryprevention, prostatecancerprevention, gmdplus;

  public static CDCLINICALPLANvalues parseCDCLINICALPLANvalues(String _x) {
    if ("breastcancerprevention".equals(_x)) { return CDCLINICALPLANvalues.breastcancerprevention; }
    if ("cervixutericancer".equals(_x)) { return CDCLINICALPLANvalues.cervixutericancer; }
    if ("colrectalcancerprevention".equals(_x)) { return CDCLINICALPLANvalues.colrectalcancerprevention; }
    if ("primaryprevention".equals(_x)) { return CDCLINICALPLANvalues.primaryprevention; }
    if ("prostatecancerprevention".equals(_x)) { return CDCLINICALPLANvalues.prostatecancerprevention; }
    if ("gmdplus".equals(_x)) { return CDCLINICALPLANvalues.gmdplus; }
    return null;
  }
}


enum CDCOMPRESSIONvalues { DF, GZ, Z, ZL;

  public static CDCOMPRESSIONvalues parseCDCOMPRESSIONvalues(String _x) {
    if ("DF".equals(_x)) { return CDCOMPRESSIONvalues.DF; }
    if ("GZ".equals(_x)) { return CDCOMPRESSIONvalues.GZ; }
    if ("Z".equals(_x)) { return CDCOMPRESSIONvalues.Z; }
    if ("ZL".equals(_x)) { return CDCOMPRESSIONvalues.ZL; }
    return null;
  }
}


enum CDCONSENTschemes { CDCONSENTTYPE, LOCAL;

  public static CDCONSENTschemes parseCDCONSENTschemes(String _x) {
    if ("CDCONSENTTYPE".equals(_x)) { return CDCONSENTschemes.CDCONSENTTYPE; }
    if ("LOCAL".equals(_x)) { return CDCONSENTschemes.LOCAL; }
    return null;
  }
}


enum CDCONSENTvalues { local, prospective, retrospective;

  public static CDCONSENTvalues parseCDCONSENTvalues(String _x) {
    if ("local".equals(_x)) { return CDCONSENTvalues.local; }
    if ("prospective".equals(_x)) { return CDCONSENTvalues.prospective; }
    if ("retrospective".equals(_x)) { return CDCONSENTvalues.retrospective; }
    return null;
  }
}


enum CDCONTACTPERSONvalues { mother, father, child, familymember, spouse, husband, partner, other, brother, sister, brotherinlaw, tutor, notary, lawyer, employer, grandparent, son, daughter, grandchild, neighbour, stepson, stepdaughter, stepfather, stepmother, sisterinlaw;

  public static CDCONTACTPERSONvalues parseCDCONTACTPERSONvalues(String _x) {
    if ("mother".equals(_x)) { return CDCONTACTPERSONvalues.mother; }
    if ("father".equals(_x)) { return CDCONTACTPERSONvalues.father; }
    if ("child".equals(_x)) { return CDCONTACTPERSONvalues.child; }
    if ("familymember".equals(_x)) { return CDCONTACTPERSONvalues.familymember; }
    if ("spouse".equals(_x)) { return CDCONTACTPERSONvalues.spouse; }
    if ("husband".equals(_x)) { return CDCONTACTPERSONvalues.husband; }
    if ("partner".equals(_x)) { return CDCONTACTPERSONvalues.partner; }
    if ("other".equals(_x)) { return CDCONTACTPERSONvalues.other; }
    if ("brother".equals(_x)) { return CDCONTACTPERSONvalues.brother; }
    if ("sister".equals(_x)) { return CDCONTACTPERSONvalues.sister; }
    if ("brotherinlaw".equals(_x)) { return CDCONTACTPERSONvalues.brotherinlaw; }
    if ("tutor".equals(_x)) { return CDCONTACTPERSONvalues.tutor; }
    if ("notary".equals(_x)) { return CDCONTACTPERSONvalues.notary; }
    if ("lawyer".equals(_x)) { return CDCONTACTPERSONvalues.lawyer; }
    if ("employer".equals(_x)) { return CDCONTACTPERSONvalues.employer; }
    if ("grandparent".equals(_x)) { return CDCONTACTPERSONvalues.grandparent; }
    if ("son".equals(_x)) { return CDCONTACTPERSONvalues.son; }
    if ("daughter".equals(_x)) { return CDCONTACTPERSONvalues.daughter; }
    if ("grandchild".equals(_x)) { return CDCONTACTPERSONvalues.grandchild; }
    if ("neighbour".equals(_x)) { return CDCONTACTPERSONvalues.neighbour; }
    if ("stepson".equals(_x)) { return CDCONTACTPERSONvalues.stepson; }
    if ("stepdaughter".equals(_x)) { return CDCONTACTPERSONvalues.stepdaughter; }
    if ("stepfather".equals(_x)) { return CDCONTACTPERSONvalues.stepfather; }
    if ("stepmother".equals(_x)) { return CDCONTACTPERSONvalues.stepmother; }
    if ("sisterinlaw".equals(_x)) { return CDCONTACTPERSONvalues.sisterinlaw; }
    return null;
  }
}


enum CDCONTENTschemes { CDLAB, CDTECHNICAL, CDHCPARTY, CDDRUGCNK, CDENCOUNTER, CDMKGADMISSION, CDMKGDISCHARGE, CDMKGORIGIN, CDMKGREFERRER, CDMKGDESTINATION, CDLEGALSERVICE, CDCONTACTPERSON, CDENCOUNTERTYPE, CDCARENETACCIDENTTYPE, CDCARENETAGREEMENTTYPE, CDCARENETSISCARDERROR, CDCARENETSOCIALCODE, CDCARENETREFUSALREASON, CDCARENETNATIONALINSURANCE, CDCARENETMESSAGE, CDCARENETMUTATIONINDICATOR, CDCARENETDOCUMENT, CDCARENETINSURANCYSTATUS, CDCARENETTYPE, CDMAATYPE, CDMAAREQUESTTYPE, CDMAARESPONSETYPE, CDMAAREFUSALJUSTIFICATION, CDMAACOVERAGETYPE, CDSITE, CDINCAPACITY, CDENCOUNTERSAFETYISSUE, CDEMERGENCYEVALUATION, ICD, ICPC, CDCLINICAL, LOCAL, CDECAREHAQVALUE, CDEBIRTHPREGNANCYORIGIN, CDEBIRTHSPECIALVALUES, CDEBIRTHCHILDPOSITION, CDEBIRTHFOETALMONITORING, CDEBIRTHDELIVERYWAY, CDEBIRTHCAESEREANINDICATION, CDEBIRTHARTIFICIALRESPIRATIONTYPE, CDEBIRTHNEONATALDEPTTYPE, CDEBIRTHCONGENITALMALFORMATION, CDVACCINEINDICATION, CDATC, CDCAREPATH, CDCLINICALPLAN, CDPATIENTWILL, CDCONSENT, CDCHAPTER4PARAGRAPH, CDCHAPTER4CATEGORY, CDCHAPTER4CRITERIA, CDCHAPTER4VERSESEQAPPENDIX, CDCHAPTER4DOCUMENTSEQAPPENDIX, CDCHAPTER4VERSE, CDBVTCONSERVATIONMODE, CDBVTCONSERVATIONDELAY, CDBVTAVAILABLEMATERIALS, CDBCRDIFFERENTATIONDEGREE, CDBVTSAMPLETYPE, CDBVTLATERALITY, CDBVTPATIENTOPPOSITION, CDBVTSTATUS, CDITEMREG, CDSTENTDOMINANCE, CDSTENTBRIDGETYPE, CDSTENTLESIONTYPE, CDSTENTSEGMENT, CDSTENTDEVICE, CDTUCOPATHOLOGYTYPE, CDTUCOSTEMITYPE, CDBALLONDEVICE, CDDISCHARGETYPE, CDREIMBURSEMENTNOMENCLATURE, IDSTENTDEVICE, CDORTHOTYPE, CDORTHODIAGNOSIS, CDORTHOAPPROACH, CDORTHONAVCOM, CDIMPLANTATIONDEVICE, CDBEARINGSURFACE, CDORTHOGRAFT, CDORTHOINTERFACE, CDORTHOTECHREVISION, CDIMPLANTATIONTYPE, CDORTHOKNEEINSERT, CDREVCOMPONENT, CDITEMMS, CDEAN, CDMSORIGIN, CDMSADAPTATION, CDMSMEDICATIONTYPE, CDNIHDI, CDSNOMED, CDDEFIBTYPE, CDDEFIBARRHYTHMIA, CDDEFIBSYMPTOM, CDDEFIBAETIOLOGY, CDDEFIBANTECEDENT, CDDEFIBPARAM, CDDEFIBMEDICALCARE, CDDEFIBAFFECTIONTYPE, CDDEFIBRISK, CDDEFIBINFARCTMOMENT, CDDEFIBREVASCULARISATION, CDDEFIBDRUGCARE, CDDEFIBSYNCOPE, CDDEFIBCOMPLICATION, CDDEFIBDIAGNOSIS, CDDEFIBCONFIG, CDDEFIBINDICATION, CDDEFIBSURGERY, CDDEFIBREASON, CDDEFIBFIRM, CDDEFIBELECREASON, CDDEFIBMODEL, CDDEFIBELECTYPE, CDDEFIBRESULT, CDASASCORE, CDQERMIDOPERATIONTYPE, CDQERMIDALIGNMENT, CDQERMIDCUSTOMINSTRUMENT, CDQERMIDORTHOPART, CDQERMIDSUBSTITUTE, CDQERMIDMODNECKFRONTALVIEW, CDQERMIDMODNECKLATERALVIEW, CDQERMIDMODNECKOFFSET, CDQERMIDMATCATEGORY, CDQERMIDMATTYPE, CDQERMIDCEMENT, CDQERMIDINTERVENTIONSUBTYPE, CDMYCARENETJUSTIFICATION, CDPMSYMPTOM, CDPMECG, CDPMAETIOLOGY, CDPMINFOPRIMO, CDPMSTIMULATION, CDPMREASON, CDPMABROADINDICATOR, CDPMELECTYPE, CDPMELECREASON, CDPMCARDIOMYOPATHY, CDPMDISTURBANCE, CDACTSNURSING, CDPMINDICATION, CDTARDISREGISTRATIONTYPE, CDTARDISDIAGNOSIS, CDTARDISDRUG, CDTARDISDRUGENDREASON, CDTARDISDRUGROUTE, CDEBIRTHCAESAREANINDICATION, CDNIHDIRELATEDSERVICE, CDMYCARENETREFUSAL, CDISO3950, CDTARDISPRODUCTTYPE, CDAUTONOMY, CDCHAPTER4FORMALINTERPRETATION, CDPATIENTWILLRES, CDPATIENTWILLHOS, CDLEGALREFERENCE, CDLEGALTEXT, CDFORMALINTERPRETATION, CDREIMBURSEMENTTERMPARAMETER, CDREIMBURSEMENTCONTEXTENVIRONMENT;

  public static CDCONTENTschemes parseCDCONTENTschemes(String _x) {
    if ("CDLAB".equals(_x)) { return CDCONTENTschemes.CDLAB; }
    if ("CDTECHNICAL".equals(_x)) { return CDCONTENTschemes.CDTECHNICAL; }
    if ("CDHCPARTY".equals(_x)) { return CDCONTENTschemes.CDHCPARTY; }
    if ("CDDRUGCNK".equals(_x)) { return CDCONTENTschemes.CDDRUGCNK; }
    if ("CDENCOUNTER".equals(_x)) { return CDCONTENTschemes.CDENCOUNTER; }
    if ("CDMKGADMISSION".equals(_x)) { return CDCONTENTschemes.CDMKGADMISSION; }
    if ("CDMKGDISCHARGE".equals(_x)) { return CDCONTENTschemes.CDMKGDISCHARGE; }
    if ("CDMKGORIGIN".equals(_x)) { return CDCONTENTschemes.CDMKGORIGIN; }
    if ("CDMKGREFERRER".equals(_x)) { return CDCONTENTschemes.CDMKGREFERRER; }
    if ("CDMKGDESTINATION".equals(_x)) { return CDCONTENTschemes.CDMKGDESTINATION; }
    if ("CDLEGALSERVICE".equals(_x)) { return CDCONTENTschemes.CDLEGALSERVICE; }
    if ("CDCONTACTPERSON".equals(_x)) { return CDCONTENTschemes.CDCONTACTPERSON; }
    if ("CDENCOUNTERTYPE".equals(_x)) { return CDCONTENTschemes.CDENCOUNTERTYPE; }
    if ("CDCARENETACCIDENTTYPE".equals(_x)) { return CDCONTENTschemes.CDCARENETACCIDENTTYPE; }
    if ("CDCARENETAGREEMENTTYPE".equals(_x)) { return CDCONTENTschemes.CDCARENETAGREEMENTTYPE; }
    if ("CDCARENETSISCARDERROR".equals(_x)) { return CDCONTENTschemes.CDCARENETSISCARDERROR; }
    if ("CDCARENETSOCIALCODE".equals(_x)) { return CDCONTENTschemes.CDCARENETSOCIALCODE; }
    if ("CDCARENETREFUSALREASON".equals(_x)) { return CDCONTENTschemes.CDCARENETREFUSALREASON; }
    if ("CDCARENETNATIONALINSURANCE".equals(_x)) { return CDCONTENTschemes.CDCARENETNATIONALINSURANCE; }
    if ("CDCARENETMESSAGE".equals(_x)) { return CDCONTENTschemes.CDCARENETMESSAGE; }
    if ("CDCARENETMUTATIONINDICATOR".equals(_x)) { return CDCONTENTschemes.CDCARENETMUTATIONINDICATOR; }
    if ("CDCARENETDOCUMENT".equals(_x)) { return CDCONTENTschemes.CDCARENETDOCUMENT; }
    if ("CDCARENETINSURANCYSTATUS".equals(_x)) { return CDCONTENTschemes.CDCARENETINSURANCYSTATUS; }
    if ("CDCARENETTYPE".equals(_x)) { return CDCONTENTschemes.CDCARENETTYPE; }
    if ("CDMAATYPE".equals(_x)) { return CDCONTENTschemes.CDMAATYPE; }
    if ("CDMAAREQUESTTYPE".equals(_x)) { return CDCONTENTschemes.CDMAAREQUESTTYPE; }
    if ("CDMAARESPONSETYPE".equals(_x)) { return CDCONTENTschemes.CDMAARESPONSETYPE; }
    if ("CDMAAREFUSALJUSTIFICATION".equals(_x)) { return CDCONTENTschemes.CDMAAREFUSALJUSTIFICATION; }
    if ("CDMAACOVERAGETYPE".equals(_x)) { return CDCONTENTschemes.CDMAACOVERAGETYPE; }
    if ("CDSITE".equals(_x)) { return CDCONTENTschemes.CDSITE; }
    if ("CDINCAPACITY".equals(_x)) { return CDCONTENTschemes.CDINCAPACITY; }
    if ("CDENCOUNTERSAFETYISSUE".equals(_x)) { return CDCONTENTschemes.CDENCOUNTERSAFETYISSUE; }
    if ("CDEMERGENCYEVALUATION".equals(_x)) { return CDCONTENTschemes.CDEMERGENCYEVALUATION; }
    if ("ICD".equals(_x)) { return CDCONTENTschemes.ICD; }
    if ("ICPC".equals(_x)) { return CDCONTENTschemes.ICPC; }
    if ("CDCLINICAL".equals(_x)) { return CDCONTENTschemes.CDCLINICAL; }
    if ("LOCAL".equals(_x)) { return CDCONTENTschemes.LOCAL; }
    if ("CDECAREHAQVALUE".equals(_x)) { return CDCONTENTschemes.CDECAREHAQVALUE; }
    if ("CDEBIRTHPREGNANCYORIGIN".equals(_x)) { return CDCONTENTschemes.CDEBIRTHPREGNANCYORIGIN; }
    if ("CDEBIRTHSPECIALVALUES".equals(_x)) { return CDCONTENTschemes.CDEBIRTHSPECIALVALUES; }
    if ("CDEBIRTHCHILDPOSITION".equals(_x)) { return CDCONTENTschemes.CDEBIRTHCHILDPOSITION; }
    if ("CDEBIRTHFOETALMONITORING".equals(_x)) { return CDCONTENTschemes.CDEBIRTHFOETALMONITORING; }
    if ("CDEBIRTHDELIVERYWAY".equals(_x)) { return CDCONTENTschemes.CDEBIRTHDELIVERYWAY; }
    if ("CDEBIRTHCAESEREANINDICATION".equals(_x)) { return CDCONTENTschemes.CDEBIRTHCAESEREANINDICATION; }
    if ("CDEBIRTHARTIFICIALRESPIRATIONTYPE".equals(_x)) { return CDCONTENTschemes.CDEBIRTHARTIFICIALRESPIRATIONTYPE; }
    if ("CDEBIRTHNEONATALDEPTTYPE".equals(_x)) { return CDCONTENTschemes.CDEBIRTHNEONATALDEPTTYPE; }
    if ("CDEBIRTHCONGENITALMALFORMATION".equals(_x)) { return CDCONTENTschemes.CDEBIRTHCONGENITALMALFORMATION; }
    if ("CDVACCINEINDICATION".equals(_x)) { return CDCONTENTschemes.CDVACCINEINDICATION; }
    if ("CDATC".equals(_x)) { return CDCONTENTschemes.CDATC; }
    if ("CDCAREPATH".equals(_x)) { return CDCONTENTschemes.CDCAREPATH; }
    if ("CDCLINICALPLAN".equals(_x)) { return CDCONTENTschemes.CDCLINICALPLAN; }
    if ("CDPATIENTWILL".equals(_x)) { return CDCONTENTschemes.CDPATIENTWILL; }
    if ("CDCONSENT".equals(_x)) { return CDCONTENTschemes.CDCONSENT; }
    if ("CDCHAPTER4PARAGRAPH".equals(_x)) { return CDCONTENTschemes.CDCHAPTER4PARAGRAPH; }
    if ("CDCHAPTER4CATEGORY".equals(_x)) { return CDCONTENTschemes.CDCHAPTER4CATEGORY; }
    if ("CDCHAPTER4CRITERIA".equals(_x)) { return CDCONTENTschemes.CDCHAPTER4CRITERIA; }
    if ("CDCHAPTER4VERSESEQAPPENDIX".equals(_x)) { return CDCONTENTschemes.CDCHAPTER4VERSESEQAPPENDIX; }
    if ("CDCHAPTER4DOCUMENTSEQAPPENDIX".equals(_x)) { return CDCONTENTschemes.CDCHAPTER4DOCUMENTSEQAPPENDIX; }
    if ("CDCHAPTER4VERSE".equals(_x)) { return CDCONTENTschemes.CDCHAPTER4VERSE; }
    if ("CDBVTCONSERVATIONMODE".equals(_x)) { return CDCONTENTschemes.CDBVTCONSERVATIONMODE; }
    if ("CDBVTCONSERVATIONDELAY".equals(_x)) { return CDCONTENTschemes.CDBVTCONSERVATIONDELAY; }
    if ("CDBVTAVAILABLEMATERIALS".equals(_x)) { return CDCONTENTschemes.CDBVTAVAILABLEMATERIALS; }
    if ("CDBCRDIFFERENTATIONDEGREE".equals(_x)) { return CDCONTENTschemes.CDBCRDIFFERENTATIONDEGREE; }
    if ("CDBVTSAMPLETYPE".equals(_x)) { return CDCONTENTschemes.CDBVTSAMPLETYPE; }
    if ("CDBVTLATERALITY".equals(_x)) { return CDCONTENTschemes.CDBVTLATERALITY; }
    if ("CDBVTPATIENTOPPOSITION".equals(_x)) { return CDCONTENTschemes.CDBVTPATIENTOPPOSITION; }
    if ("CDBVTSTATUS".equals(_x)) { return CDCONTENTschemes.CDBVTSTATUS; }
    if ("CDITEMREG".equals(_x)) { return CDCONTENTschemes.CDITEMREG; }
    if ("CDSTENTDOMINANCE".equals(_x)) { return CDCONTENTschemes.CDSTENTDOMINANCE; }
    if ("CDSTENTBRIDGETYPE".equals(_x)) { return CDCONTENTschemes.CDSTENTBRIDGETYPE; }
    if ("CDSTENTLESIONTYPE".equals(_x)) { return CDCONTENTschemes.CDSTENTLESIONTYPE; }
    if ("CDSTENTSEGMENT".equals(_x)) { return CDCONTENTschemes.CDSTENTSEGMENT; }
    if ("CDSTENTDEVICE".equals(_x)) { return CDCONTENTschemes.CDSTENTDEVICE; }
    if ("CDTUCOPATHOLOGYTYPE".equals(_x)) { return CDCONTENTschemes.CDTUCOPATHOLOGYTYPE; }
    if ("CDTUCOSTEMITYPE".equals(_x)) { return CDCONTENTschemes.CDTUCOSTEMITYPE; }
    if ("CDBALLONDEVICE".equals(_x)) { return CDCONTENTschemes.CDBALLONDEVICE; }
    if ("CDDISCHARGETYPE".equals(_x)) { return CDCONTENTschemes.CDDISCHARGETYPE; }
    if ("CDREIMBURSEMENTNOMENCLATURE".equals(_x)) { return CDCONTENTschemes.CDREIMBURSEMENTNOMENCLATURE; }
    if ("IDSTENTDEVICE".equals(_x)) { return CDCONTENTschemes.IDSTENTDEVICE; }
    if ("CDORTHOTYPE".equals(_x)) { return CDCONTENTschemes.CDORTHOTYPE; }
    if ("CDORTHODIAGNOSIS".equals(_x)) { return CDCONTENTschemes.CDORTHODIAGNOSIS; }
    if ("CDORTHOAPPROACH".equals(_x)) { return CDCONTENTschemes.CDORTHOAPPROACH; }
    if ("CDORTHONAVCOM".equals(_x)) { return CDCONTENTschemes.CDORTHONAVCOM; }
    if ("CDIMPLANTATIONDEVICE".equals(_x)) { return CDCONTENTschemes.CDIMPLANTATIONDEVICE; }
    if ("CDBEARINGSURFACE".equals(_x)) { return CDCONTENTschemes.CDBEARINGSURFACE; }
    if ("CDORTHOGRAFT".equals(_x)) { return CDCONTENTschemes.CDORTHOGRAFT; }
    if ("CDORTHOINTERFACE".equals(_x)) { return CDCONTENTschemes.CDORTHOINTERFACE; }
    if ("CDORTHOTECHREVISION".equals(_x)) { return CDCONTENTschemes.CDORTHOTECHREVISION; }
    if ("CDIMPLANTATIONTYPE".equals(_x)) { return CDCONTENTschemes.CDIMPLANTATIONTYPE; }
    if ("CDORTHOKNEEINSERT".equals(_x)) { return CDCONTENTschemes.CDORTHOKNEEINSERT; }
    if ("CDREVCOMPONENT".equals(_x)) { return CDCONTENTschemes.CDREVCOMPONENT; }
    if ("CDITEMMS".equals(_x)) { return CDCONTENTschemes.CDITEMMS; }
    if ("CDEAN".equals(_x)) { return CDCONTENTschemes.CDEAN; }
    if ("CDMSORIGIN".equals(_x)) { return CDCONTENTschemes.CDMSORIGIN; }
    if ("CDMSADAPTATION".equals(_x)) { return CDCONTENTschemes.CDMSADAPTATION; }
    if ("CDMSMEDICATIONTYPE".equals(_x)) { return CDCONTENTschemes.CDMSMEDICATIONTYPE; }
    if ("CDNIHDI".equals(_x)) { return CDCONTENTschemes.CDNIHDI; }
    if ("CDSNOMED".equals(_x)) { return CDCONTENTschemes.CDSNOMED; }
    if ("CDDEFIBTYPE".equals(_x)) { return CDCONTENTschemes.CDDEFIBTYPE; }
    if ("CDDEFIBARRHYTHMIA".equals(_x)) { return CDCONTENTschemes.CDDEFIBARRHYTHMIA; }
    if ("CDDEFIBSYMPTOM".equals(_x)) { return CDCONTENTschemes.CDDEFIBSYMPTOM; }
    if ("CDDEFIBAETIOLOGY".equals(_x)) { return CDCONTENTschemes.CDDEFIBAETIOLOGY; }
    if ("CDDEFIBANTECEDENT".equals(_x)) { return CDCONTENTschemes.CDDEFIBANTECEDENT; }
    if ("CDDEFIBPARAM".equals(_x)) { return CDCONTENTschemes.CDDEFIBPARAM; }
    if ("CDDEFIBMEDICALCARE".equals(_x)) { return CDCONTENTschemes.CDDEFIBMEDICALCARE; }
    if ("CDDEFIBAFFECTIONTYPE".equals(_x)) { return CDCONTENTschemes.CDDEFIBAFFECTIONTYPE; }
    if ("CDDEFIBRISK".equals(_x)) { return CDCONTENTschemes.CDDEFIBRISK; }
    if ("CDDEFIBINFARCTMOMENT".equals(_x)) { return CDCONTENTschemes.CDDEFIBINFARCTMOMENT; }
    if ("CDDEFIBREVASCULARISATION".equals(_x)) { return CDCONTENTschemes.CDDEFIBREVASCULARISATION; }
    if ("CDDEFIBDRUGCARE".equals(_x)) { return CDCONTENTschemes.CDDEFIBDRUGCARE; }
    if ("CDDEFIBSYNCOPE".equals(_x)) { return CDCONTENTschemes.CDDEFIBSYNCOPE; }
    if ("CDDEFIBCOMPLICATION".equals(_x)) { return CDCONTENTschemes.CDDEFIBCOMPLICATION; }
    if ("CDDEFIBDIAGNOSIS".equals(_x)) { return CDCONTENTschemes.CDDEFIBDIAGNOSIS; }
    if ("CDDEFIBCONFIG".equals(_x)) { return CDCONTENTschemes.CDDEFIBCONFIG; }
    if ("CDDEFIBINDICATION".equals(_x)) { return CDCONTENTschemes.CDDEFIBINDICATION; }
    if ("CDDEFIBSURGERY".equals(_x)) { return CDCONTENTschemes.CDDEFIBSURGERY; }
    if ("CDDEFIBREASON".equals(_x)) { return CDCONTENTschemes.CDDEFIBREASON; }
    if ("CDDEFIBFIRM".equals(_x)) { return CDCONTENTschemes.CDDEFIBFIRM; }
    if ("CDDEFIBELECREASON".equals(_x)) { return CDCONTENTschemes.CDDEFIBELECREASON; }
    if ("CDDEFIBMODEL".equals(_x)) { return CDCONTENTschemes.CDDEFIBMODEL; }
    if ("CDDEFIBELECTYPE".equals(_x)) { return CDCONTENTschemes.CDDEFIBELECTYPE; }
    if ("CDDEFIBRESULT".equals(_x)) { return CDCONTENTschemes.CDDEFIBRESULT; }
    if ("CDASASCORE".equals(_x)) { return CDCONTENTschemes.CDASASCORE; }
    if ("CDQERMIDOPERATIONTYPE".equals(_x)) { return CDCONTENTschemes.CDQERMIDOPERATIONTYPE; }
    if ("CDQERMIDALIGNMENT".equals(_x)) { return CDCONTENTschemes.CDQERMIDALIGNMENT; }
    if ("CDQERMIDCUSTOMINSTRUMENT".equals(_x)) { return CDCONTENTschemes.CDQERMIDCUSTOMINSTRUMENT; }
    if ("CDQERMIDORTHOPART".equals(_x)) { return CDCONTENTschemes.CDQERMIDORTHOPART; }
    if ("CDQERMIDSUBSTITUTE".equals(_x)) { return CDCONTENTschemes.CDQERMIDSUBSTITUTE; }
    if ("CDQERMIDMODNECKFRONTALVIEW".equals(_x)) { return CDCONTENTschemes.CDQERMIDMODNECKFRONTALVIEW; }
    if ("CDQERMIDMODNECKLATERALVIEW".equals(_x)) { return CDCONTENTschemes.CDQERMIDMODNECKLATERALVIEW; }
    if ("CDQERMIDMODNECKOFFSET".equals(_x)) { return CDCONTENTschemes.CDQERMIDMODNECKOFFSET; }
    if ("CDQERMIDMATCATEGORY".equals(_x)) { return CDCONTENTschemes.CDQERMIDMATCATEGORY; }
    if ("CDQERMIDMATTYPE".equals(_x)) { return CDCONTENTschemes.CDQERMIDMATTYPE; }
    if ("CDQERMIDCEMENT".equals(_x)) { return CDCONTENTschemes.CDQERMIDCEMENT; }
    if ("CDQERMIDINTERVENTIONSUBTYPE".equals(_x)) { return CDCONTENTschemes.CDQERMIDINTERVENTIONSUBTYPE; }
    if ("CDMYCARENETJUSTIFICATION".equals(_x)) { return CDCONTENTschemes.CDMYCARENETJUSTIFICATION; }
    if ("CDPMSYMPTOM".equals(_x)) { return CDCONTENTschemes.CDPMSYMPTOM; }
    if ("CDPMECG".equals(_x)) { return CDCONTENTschemes.CDPMECG; }
    if ("CDPMAETIOLOGY".equals(_x)) { return CDCONTENTschemes.CDPMAETIOLOGY; }
    if ("CDPMINFOPRIMO".equals(_x)) { return CDCONTENTschemes.CDPMINFOPRIMO; }
    if ("CDPMSTIMULATION".equals(_x)) { return CDCONTENTschemes.CDPMSTIMULATION; }
    if ("CDPMREASON".equals(_x)) { return CDCONTENTschemes.CDPMREASON; }
    if ("CDPMABROADINDICATOR".equals(_x)) { return CDCONTENTschemes.CDPMABROADINDICATOR; }
    if ("CDPMELECTYPE".equals(_x)) { return CDCONTENTschemes.CDPMELECTYPE; }
    if ("CDPMELECREASON".equals(_x)) { return CDCONTENTschemes.CDPMELECREASON; }
    if ("CDPMCARDIOMYOPATHY".equals(_x)) { return CDCONTENTschemes.CDPMCARDIOMYOPATHY; }
    if ("CDPMDISTURBANCE".equals(_x)) { return CDCONTENTschemes.CDPMDISTURBANCE; }
    if ("CDACTSNURSING".equals(_x)) { return CDCONTENTschemes.CDACTSNURSING; }
    if ("CDPMINDICATION".equals(_x)) { return CDCONTENTschemes.CDPMINDICATION; }
    if ("CDTARDISREGISTRATIONTYPE".equals(_x)) { return CDCONTENTschemes.CDTARDISREGISTRATIONTYPE; }
    if ("CDTARDISDIAGNOSIS".equals(_x)) { return CDCONTENTschemes.CDTARDISDIAGNOSIS; }
    if ("CDTARDISDRUG".equals(_x)) { return CDCONTENTschemes.CDTARDISDRUG; }
    if ("CDTARDISDRUGENDREASON".equals(_x)) { return CDCONTENTschemes.CDTARDISDRUGENDREASON; }
    if ("CDTARDISDRUGROUTE".equals(_x)) { return CDCONTENTschemes.CDTARDISDRUGROUTE; }
    if ("CDEBIRTHCAESAREANINDICATION".equals(_x)) { return CDCONTENTschemes.CDEBIRTHCAESAREANINDICATION; }
    if ("CDNIHDIRELATEDSERVICE".equals(_x)) { return CDCONTENTschemes.CDNIHDIRELATEDSERVICE; }
    if ("CDMYCARENETREFUSAL".equals(_x)) { return CDCONTENTschemes.CDMYCARENETREFUSAL; }
    if ("CDISO3950".equals(_x)) { return CDCONTENTschemes.CDISO3950; }
    if ("CDTARDISPRODUCTTYPE".equals(_x)) { return CDCONTENTschemes.CDTARDISPRODUCTTYPE; }
    if ("CDAUTONOMY".equals(_x)) { return CDCONTENTschemes.CDAUTONOMY; }
    if ("CDCHAPTER4FORMALINTERPRETATION".equals(_x)) { return CDCONTENTschemes.CDCHAPTER4FORMALINTERPRETATION; }
    if ("CDPATIENTWILLRES".equals(_x)) { return CDCONTENTschemes.CDPATIENTWILLRES; }
    if ("CDPATIENTWILLHOS".equals(_x)) { return CDCONTENTschemes.CDPATIENTWILLHOS; }
    if ("CDLEGALREFERENCE".equals(_x)) { return CDCONTENTschemes.CDLEGALREFERENCE; }
    if ("CDLEGALTEXT".equals(_x)) { return CDCONTENTschemes.CDLEGALTEXT; }
    if ("CDFORMALINTERPRETATION".equals(_x)) { return CDCONTENTschemes.CDFORMALINTERPRETATION; }
    if ("CDREIMBURSEMENTTERMPARAMETER".equals(_x)) { return CDCONTENTschemes.CDREIMBURSEMENTTERMPARAMETER; }
    if ("CDREIMBURSEMENTCONTEXTENVIRONMENT".equals(_x)) { return CDCONTENTschemes.CDREIMBURSEMENTCONTEXTENVIRONMENT; }
    return null;
  }
}


enum CDCOUNTRYschemes { _CDCOUNTRY, CDFEDCOUNTRY;

  public static CDCOUNTRYschemes parseCDCOUNTRYschemes(String _x) {
    if ("_CDCOUNTRY".equals(_x)) { return CDCOUNTRYschemes._CDCOUNTRY; }
    if ("CDFEDCOUNTRY".equals(_x)) { return CDCOUNTRYschemes.CDFEDCOUNTRY; }
    return null;
  }
}


enum CDCOUNTRYvalues { ad, ae, af, ag, ai, al, am, an, ao, aq, ar, arpa, as, at, au, aw, az, ba, bb, bd, be, bf, bg, bh, bi, bj, bm, bn, bo, br, bs, bt, bv, bw, by, bz, ca, cc, cf, _cd, cg, ch, ci, ck, cl, cm, cn, co, com, cr, cs, cu, cv, cx, cy, cz, de, dj, dk, dm, _do, dz, ec, edu, ee, eg, eh, er, es, et, fi, fj, fk, fm, fo, fr, fx, ga, gb, gd, ge, gf, gh, gi, gl, gm, gn, gov, gp, gr, gs, gt, gu, gw, gy, hk, hm, hn, hr, ht, hu, id, ie, il, in, _int, io, iq, ir, is, it, jm, jo, jp, ke, kg, kh, ki, km, kn, kp, kr, kw, ky, kz, la, lb, lc, li, lk, ls, lt, lu, lv, ly, ma, mc, md, mg, mh, mil, mk, ml, mm, mn, mo, mp, mq, mr, ms, mt, mu, mv, mw, mx, my, mz, na, nato, nc, ne, net, nf, ng, ni, nl, no, np, nr, nt, nu, nz, om, org, pa, pe, pf, pg, ph, pk, pl, pm, pn, pr, pt, pw, py, qa, re, ro, ru, rw, sa, sb, sc, sd, se, sg, sh, si, sj, sk, sl, sm, sn, so, sr, st, su, sv, sy, sz, tc, td, tf, tg, th, tj, tk, tm, tn, to, tp, tr, tt, tv, tw, tz, ua, ug, uk, um, us, uy, uz, va, vc, ve, vg, vi, vn, vu, wf, ws, ye, yt, yu, za, zm, zr, zw;

  public static CDCOUNTRYvalues parseCDCOUNTRYvalues(String _x) {
    if ("ad".equals(_x)) { return CDCOUNTRYvalues.ad; }
    if ("ae".equals(_x)) { return CDCOUNTRYvalues.ae; }
    if ("af".equals(_x)) { return CDCOUNTRYvalues.af; }
    if ("ag".equals(_x)) { return CDCOUNTRYvalues.ag; }
    if ("ai".equals(_x)) { return CDCOUNTRYvalues.ai; }
    if ("al".equals(_x)) { return CDCOUNTRYvalues.al; }
    if ("am".equals(_x)) { return CDCOUNTRYvalues.am; }
    if ("an".equals(_x)) { return CDCOUNTRYvalues.an; }
    if ("ao".equals(_x)) { return CDCOUNTRYvalues.ao; }
    if ("aq".equals(_x)) { return CDCOUNTRYvalues.aq; }
    if ("ar".equals(_x)) { return CDCOUNTRYvalues.ar; }
    if ("arpa".equals(_x)) { return CDCOUNTRYvalues.arpa; }
    if ("as".equals(_x)) { return CDCOUNTRYvalues.as; }
    if ("at".equals(_x)) { return CDCOUNTRYvalues.at; }
    if ("au".equals(_x)) { return CDCOUNTRYvalues.au; }
    if ("aw".equals(_x)) { return CDCOUNTRYvalues.aw; }
    if ("az".equals(_x)) { return CDCOUNTRYvalues.az; }
    if ("ba".equals(_x)) { return CDCOUNTRYvalues.ba; }
    if ("bb".equals(_x)) { return CDCOUNTRYvalues.bb; }
    if ("bd".equals(_x)) { return CDCOUNTRYvalues.bd; }
    if ("be".equals(_x)) { return CDCOUNTRYvalues.be; }
    if ("bf".equals(_x)) { return CDCOUNTRYvalues.bf; }
    if ("bg".equals(_x)) { return CDCOUNTRYvalues.bg; }
    if ("bh".equals(_x)) { return CDCOUNTRYvalues.bh; }
    if ("bi".equals(_x)) { return CDCOUNTRYvalues.bi; }
    if ("bj".equals(_x)) { return CDCOUNTRYvalues.bj; }
    if ("bm".equals(_x)) { return CDCOUNTRYvalues.bm; }
    if ("bn".equals(_x)) { return CDCOUNTRYvalues.bn; }
    if ("bo".equals(_x)) { return CDCOUNTRYvalues.bo; }
    if ("br".equals(_x)) { return CDCOUNTRYvalues.br; }
    if ("bs".equals(_x)) { return CDCOUNTRYvalues.bs; }
    if ("bt".equals(_x)) { return CDCOUNTRYvalues.bt; }
    if ("bv".equals(_x)) { return CDCOUNTRYvalues.bv; }
    if ("bw".equals(_x)) { return CDCOUNTRYvalues.bw; }
    if ("by".equals(_x)) { return CDCOUNTRYvalues.by; }
    if ("bz".equals(_x)) { return CDCOUNTRYvalues.bz; }
    if ("ca".equals(_x)) { return CDCOUNTRYvalues.ca; }
    if ("cc".equals(_x)) { return CDCOUNTRYvalues.cc; }
    if ("cf".equals(_x)) { return CDCOUNTRYvalues.cf; }
    if ("_cd".equals(_x)) { return CDCOUNTRYvalues._cd; }
    if ("cg".equals(_x)) { return CDCOUNTRYvalues.cg; }
    if ("ch".equals(_x)) { return CDCOUNTRYvalues.ch; }
    if ("ci".equals(_x)) { return CDCOUNTRYvalues.ci; }
    if ("ck".equals(_x)) { return CDCOUNTRYvalues.ck; }
    if ("cl".equals(_x)) { return CDCOUNTRYvalues.cl; }
    if ("cm".equals(_x)) { return CDCOUNTRYvalues.cm; }
    if ("cn".equals(_x)) { return CDCOUNTRYvalues.cn; }
    if ("co".equals(_x)) { return CDCOUNTRYvalues.co; }
    if ("com".equals(_x)) { return CDCOUNTRYvalues.com; }
    if ("cr".equals(_x)) { return CDCOUNTRYvalues.cr; }
    if ("cs".equals(_x)) { return CDCOUNTRYvalues.cs; }
    if ("cu".equals(_x)) { return CDCOUNTRYvalues.cu; }
    if ("cv".equals(_x)) { return CDCOUNTRYvalues.cv; }
    if ("cx".equals(_x)) { return CDCOUNTRYvalues.cx; }
    if ("cy".equals(_x)) { return CDCOUNTRYvalues.cy; }
    if ("cz".equals(_x)) { return CDCOUNTRYvalues.cz; }
    if ("de".equals(_x)) { return CDCOUNTRYvalues.de; }
    if ("dj".equals(_x)) { return CDCOUNTRYvalues.dj; }
    if ("dk".equals(_x)) { return CDCOUNTRYvalues.dk; }
    if ("dm".equals(_x)) { return CDCOUNTRYvalues.dm; }
    if ("_do".equals(_x)) { return CDCOUNTRYvalues._do; }
    if ("dz".equals(_x)) { return CDCOUNTRYvalues.dz; }
    if ("ec".equals(_x)) { return CDCOUNTRYvalues.ec; }
    if ("edu".equals(_x)) { return CDCOUNTRYvalues.edu; }
    if ("ee".equals(_x)) { return CDCOUNTRYvalues.ee; }
    if ("eg".equals(_x)) { return CDCOUNTRYvalues.eg; }
    if ("eh".equals(_x)) { return CDCOUNTRYvalues.eh; }
    if ("er".equals(_x)) { return CDCOUNTRYvalues.er; }
    if ("es".equals(_x)) { return CDCOUNTRYvalues.es; }
    if ("et".equals(_x)) { return CDCOUNTRYvalues.et; }
    if ("fi".equals(_x)) { return CDCOUNTRYvalues.fi; }
    if ("fj".equals(_x)) { return CDCOUNTRYvalues.fj; }
    if ("fk".equals(_x)) { return CDCOUNTRYvalues.fk; }
    if ("fm".equals(_x)) { return CDCOUNTRYvalues.fm; }
    if ("fo".equals(_x)) { return CDCOUNTRYvalues.fo; }
    if ("fr".equals(_x)) { return CDCOUNTRYvalues.fr; }
    if ("fx".equals(_x)) { return CDCOUNTRYvalues.fx; }
    if ("ga".equals(_x)) { return CDCOUNTRYvalues.ga; }
    if ("gb".equals(_x)) { return CDCOUNTRYvalues.gb; }
    if ("gd".equals(_x)) { return CDCOUNTRYvalues.gd; }
    if ("ge".equals(_x)) { return CDCOUNTRYvalues.ge; }
    if ("gf".equals(_x)) { return CDCOUNTRYvalues.gf; }
    if ("gh".equals(_x)) { return CDCOUNTRYvalues.gh; }
    if ("gi".equals(_x)) { return CDCOUNTRYvalues.gi; }
    if ("gl".equals(_x)) { return CDCOUNTRYvalues.gl; }
    if ("gm".equals(_x)) { return CDCOUNTRYvalues.gm; }
    if ("gn".equals(_x)) { return CDCOUNTRYvalues.gn; }
    if ("gov".equals(_x)) { return CDCOUNTRYvalues.gov; }
    if ("gp".equals(_x)) { return CDCOUNTRYvalues.gp; }
    if ("gr".equals(_x)) { return CDCOUNTRYvalues.gr; }
    if ("gs".equals(_x)) { return CDCOUNTRYvalues.gs; }
    if ("gt".equals(_x)) { return CDCOUNTRYvalues.gt; }
    if ("gu".equals(_x)) { return CDCOUNTRYvalues.gu; }
    if ("gw".equals(_x)) { return CDCOUNTRYvalues.gw; }
    if ("gy".equals(_x)) { return CDCOUNTRYvalues.gy; }
    if ("hk".equals(_x)) { return CDCOUNTRYvalues.hk; }
    if ("hm".equals(_x)) { return CDCOUNTRYvalues.hm; }
    if ("hn".equals(_x)) { return CDCOUNTRYvalues.hn; }
    if ("hr".equals(_x)) { return CDCOUNTRYvalues.hr; }
    if ("ht".equals(_x)) { return CDCOUNTRYvalues.ht; }
    if ("hu".equals(_x)) { return CDCOUNTRYvalues.hu; }
    if ("id".equals(_x)) { return CDCOUNTRYvalues.id; }
    if ("ie".equals(_x)) { return CDCOUNTRYvalues.ie; }
    if ("il".equals(_x)) { return CDCOUNTRYvalues.il; }
    if ("in".equals(_x)) { return CDCOUNTRYvalues.in; }
    if ("_int".equals(_x)) { return CDCOUNTRYvalues._int; }
    if ("io".equals(_x)) { return CDCOUNTRYvalues.io; }
    if ("iq".equals(_x)) { return CDCOUNTRYvalues.iq; }
    if ("ir".equals(_x)) { return CDCOUNTRYvalues.ir; }
    if ("is".equals(_x)) { return CDCOUNTRYvalues.is; }
    if ("it".equals(_x)) { return CDCOUNTRYvalues.it; }
    if ("jm".equals(_x)) { return CDCOUNTRYvalues.jm; }
    if ("jo".equals(_x)) { return CDCOUNTRYvalues.jo; }
    if ("jp".equals(_x)) { return CDCOUNTRYvalues.jp; }
    if ("ke".equals(_x)) { return CDCOUNTRYvalues.ke; }
    if ("kg".equals(_x)) { return CDCOUNTRYvalues.kg; }
    if ("kh".equals(_x)) { return CDCOUNTRYvalues.kh; }
    if ("ki".equals(_x)) { return CDCOUNTRYvalues.ki; }
    if ("km".equals(_x)) { return CDCOUNTRYvalues.km; }
    if ("kn".equals(_x)) { return CDCOUNTRYvalues.kn; }
    if ("kp".equals(_x)) { return CDCOUNTRYvalues.kp; }
    if ("kr".equals(_x)) { return CDCOUNTRYvalues.kr; }
    if ("kw".equals(_x)) { return CDCOUNTRYvalues.kw; }
    if ("ky".equals(_x)) { return CDCOUNTRYvalues.ky; }
    if ("kz".equals(_x)) { return CDCOUNTRYvalues.kz; }
    if ("la".equals(_x)) { return CDCOUNTRYvalues.la; }
    if ("lb".equals(_x)) { return CDCOUNTRYvalues.lb; }
    if ("lc".equals(_x)) { return CDCOUNTRYvalues.lc; }
    if ("li".equals(_x)) { return CDCOUNTRYvalues.li; }
    if ("lk".equals(_x)) { return CDCOUNTRYvalues.lk; }
    if ("ls".equals(_x)) { return CDCOUNTRYvalues.ls; }
    if ("lt".equals(_x)) { return CDCOUNTRYvalues.lt; }
    if ("lu".equals(_x)) { return CDCOUNTRYvalues.lu; }
    if ("lv".equals(_x)) { return CDCOUNTRYvalues.lv; }
    if ("ly".equals(_x)) { return CDCOUNTRYvalues.ly; }
    if ("ma".equals(_x)) { return CDCOUNTRYvalues.ma; }
    if ("mc".equals(_x)) { return CDCOUNTRYvalues.mc; }
    if ("md".equals(_x)) { return CDCOUNTRYvalues.md; }
    if ("mg".equals(_x)) { return CDCOUNTRYvalues.mg; }
    if ("mh".equals(_x)) { return CDCOUNTRYvalues.mh; }
    if ("mil".equals(_x)) { return CDCOUNTRYvalues.mil; }
    if ("mk".equals(_x)) { return CDCOUNTRYvalues.mk; }
    if ("ml".equals(_x)) { return CDCOUNTRYvalues.ml; }
    if ("mm".equals(_x)) { return CDCOUNTRYvalues.mm; }
    if ("mn".equals(_x)) { return CDCOUNTRYvalues.mn; }
    if ("mo".equals(_x)) { return CDCOUNTRYvalues.mo; }
    if ("mp".equals(_x)) { return CDCOUNTRYvalues.mp; }
    if ("mq".equals(_x)) { return CDCOUNTRYvalues.mq; }
    if ("mr".equals(_x)) { return CDCOUNTRYvalues.mr; }
    if ("ms".equals(_x)) { return CDCOUNTRYvalues.ms; }
    if ("mt".equals(_x)) { return CDCOUNTRYvalues.mt; }
    if ("mu".equals(_x)) { return CDCOUNTRYvalues.mu; }
    if ("mv".equals(_x)) { return CDCOUNTRYvalues.mv; }
    if ("mw".equals(_x)) { return CDCOUNTRYvalues.mw; }
    if ("mx".equals(_x)) { return CDCOUNTRYvalues.mx; }
    if ("my".equals(_x)) { return CDCOUNTRYvalues.my; }
    if ("mz".equals(_x)) { return CDCOUNTRYvalues.mz; }
    if ("na".equals(_x)) { return CDCOUNTRYvalues.na; }
    if ("nato".equals(_x)) { return CDCOUNTRYvalues.nato; }
    if ("nc".equals(_x)) { return CDCOUNTRYvalues.nc; }
    if ("ne".equals(_x)) { return CDCOUNTRYvalues.ne; }
    if ("net".equals(_x)) { return CDCOUNTRYvalues.net; }
    if ("nf".equals(_x)) { return CDCOUNTRYvalues.nf; }
    if ("ng".equals(_x)) { return CDCOUNTRYvalues.ng; }
    if ("ni".equals(_x)) { return CDCOUNTRYvalues.ni; }
    if ("nl".equals(_x)) { return CDCOUNTRYvalues.nl; }
    if ("no".equals(_x)) { return CDCOUNTRYvalues.no; }
    if ("np".equals(_x)) { return CDCOUNTRYvalues.np; }
    if ("nr".equals(_x)) { return CDCOUNTRYvalues.nr; }
    if ("nt".equals(_x)) { return CDCOUNTRYvalues.nt; }
    if ("nu".equals(_x)) { return CDCOUNTRYvalues.nu; }
    if ("nz".equals(_x)) { return CDCOUNTRYvalues.nz; }
    if ("om".equals(_x)) { return CDCOUNTRYvalues.om; }
    if ("org".equals(_x)) { return CDCOUNTRYvalues.org; }
    if ("pa".equals(_x)) { return CDCOUNTRYvalues.pa; }
    if ("pe".equals(_x)) { return CDCOUNTRYvalues.pe; }
    if ("pf".equals(_x)) { return CDCOUNTRYvalues.pf; }
    if ("pg".equals(_x)) { return CDCOUNTRYvalues.pg; }
    if ("ph".equals(_x)) { return CDCOUNTRYvalues.ph; }
    if ("pk".equals(_x)) { return CDCOUNTRYvalues.pk; }
    if ("pl".equals(_x)) { return CDCOUNTRYvalues.pl; }
    if ("pm".equals(_x)) { return CDCOUNTRYvalues.pm; }
    if ("pn".equals(_x)) { return CDCOUNTRYvalues.pn; }
    if ("pr".equals(_x)) { return CDCOUNTRYvalues.pr; }
    if ("pt".equals(_x)) { return CDCOUNTRYvalues.pt; }
    if ("pw".equals(_x)) { return CDCOUNTRYvalues.pw; }
    if ("py".equals(_x)) { return CDCOUNTRYvalues.py; }
    if ("qa".equals(_x)) { return CDCOUNTRYvalues.qa; }
    if ("re".equals(_x)) { return CDCOUNTRYvalues.re; }
    if ("ro".equals(_x)) { return CDCOUNTRYvalues.ro; }
    if ("ru".equals(_x)) { return CDCOUNTRYvalues.ru; }
    if ("rw".equals(_x)) { return CDCOUNTRYvalues.rw; }
    if ("sa".equals(_x)) { return CDCOUNTRYvalues.sa; }
    if ("sb".equals(_x)) { return CDCOUNTRYvalues.sb; }
    if ("sc".equals(_x)) { return CDCOUNTRYvalues.sc; }
    if ("sd".equals(_x)) { return CDCOUNTRYvalues.sd; }
    if ("se".equals(_x)) { return CDCOUNTRYvalues.se; }
    if ("sg".equals(_x)) { return CDCOUNTRYvalues.sg; }
    if ("sh".equals(_x)) { return CDCOUNTRYvalues.sh; }
    if ("si".equals(_x)) { return CDCOUNTRYvalues.si; }
    if ("sj".equals(_x)) { return CDCOUNTRYvalues.sj; }
    if ("sk".equals(_x)) { return CDCOUNTRYvalues.sk; }
    if ("sl".equals(_x)) { return CDCOUNTRYvalues.sl; }
    if ("sm".equals(_x)) { return CDCOUNTRYvalues.sm; }
    if ("sn".equals(_x)) { return CDCOUNTRYvalues.sn; }
    if ("so".equals(_x)) { return CDCOUNTRYvalues.so; }
    if ("sr".equals(_x)) { return CDCOUNTRYvalues.sr; }
    if ("st".equals(_x)) { return CDCOUNTRYvalues.st; }
    if ("su".equals(_x)) { return CDCOUNTRYvalues.su; }
    if ("sv".equals(_x)) { return CDCOUNTRYvalues.sv; }
    if ("sy".equals(_x)) { return CDCOUNTRYvalues.sy; }
    if ("sz".equals(_x)) { return CDCOUNTRYvalues.sz; }
    if ("tc".equals(_x)) { return CDCOUNTRYvalues.tc; }
    if ("td".equals(_x)) { return CDCOUNTRYvalues.td; }
    if ("tf".equals(_x)) { return CDCOUNTRYvalues.tf; }
    if ("tg".equals(_x)) { return CDCOUNTRYvalues.tg; }
    if ("th".equals(_x)) { return CDCOUNTRYvalues.th; }
    if ("tj".equals(_x)) { return CDCOUNTRYvalues.tj; }
    if ("tk".equals(_x)) { return CDCOUNTRYvalues.tk; }
    if ("tm".equals(_x)) { return CDCOUNTRYvalues.tm; }
    if ("tn".equals(_x)) { return CDCOUNTRYvalues.tn; }
    if ("to".equals(_x)) { return CDCOUNTRYvalues.to; }
    if ("tp".equals(_x)) { return CDCOUNTRYvalues.tp; }
    if ("tr".equals(_x)) { return CDCOUNTRYvalues.tr; }
    if ("tt".equals(_x)) { return CDCOUNTRYvalues.tt; }
    if ("tv".equals(_x)) { return CDCOUNTRYvalues.tv; }
    if ("tw".equals(_x)) { return CDCOUNTRYvalues.tw; }
    if ("tz".equals(_x)) { return CDCOUNTRYvalues.tz; }
    if ("ua".equals(_x)) { return CDCOUNTRYvalues.ua; }
    if ("ug".equals(_x)) { return CDCOUNTRYvalues.ug; }
    if ("uk".equals(_x)) { return CDCOUNTRYvalues.uk; }
    if ("um".equals(_x)) { return CDCOUNTRYvalues.um; }
    if ("us".equals(_x)) { return CDCOUNTRYvalues.us; }
    if ("uy".equals(_x)) { return CDCOUNTRYvalues.uy; }
    if ("uz".equals(_x)) { return CDCOUNTRYvalues.uz; }
    if ("va".equals(_x)) { return CDCOUNTRYvalues.va; }
    if ("vc".equals(_x)) { return CDCOUNTRYvalues.vc; }
    if ("ve".equals(_x)) { return CDCOUNTRYvalues.ve; }
    if ("vg".equals(_x)) { return CDCOUNTRYvalues.vg; }
    if ("vi".equals(_x)) { return CDCOUNTRYvalues.vi; }
    if ("vn".equals(_x)) { return CDCOUNTRYvalues.vn; }
    if ("vu".equals(_x)) { return CDCOUNTRYvalues.vu; }
    if ("wf".equals(_x)) { return CDCOUNTRYvalues.wf; }
    if ("ws".equals(_x)) { return CDCOUNTRYvalues.ws; }
    if ("ye".equals(_x)) { return CDCOUNTRYvalues.ye; }
    if ("yt".equals(_x)) { return CDCOUNTRYvalues.yt; }
    if ("yu".equals(_x)) { return CDCOUNTRYvalues.yu; }
    if ("za".equals(_x)) { return CDCOUNTRYvalues.za; }
    if ("zm".equals(_x)) { return CDCOUNTRYvalues.zm; }
    if ("zr".equals(_x)) { return CDCOUNTRYvalues.zr; }
    if ("zw".equals(_x)) { return CDCOUNTRYvalues.zw; }
    return null;
  }
}


enum CDCURRENCYvalues { eur;

  public static CDCURRENCYvalues parseCDCURRENCYvalues(String _x) {
    if ("eur".equals(_x)) { return CDCURRENCYvalues.eur; }
    return null;
  }
}


enum CDDAYPERIODvalues { afterbreakfast, afterdinner, afterlunch, aftermeal, afternoon, beforebreakfast, beforedinner, beforelunch, betweenbreakfastandlunch, betweendinnerandsleep, betweenlunchanddinner, betweenmeals, evening, morning, night, thehourofsleep, duringbreakfast, duringlunch, duringdinner;

  public static CDDAYPERIODvalues parseCDDAYPERIODvalues(String _x) {
    if ("afterbreakfast".equals(_x)) { return CDDAYPERIODvalues.afterbreakfast; }
    if ("afterdinner".equals(_x)) { return CDDAYPERIODvalues.afterdinner; }
    if ("afterlunch".equals(_x)) { return CDDAYPERIODvalues.afterlunch; }
    if ("aftermeal".equals(_x)) { return CDDAYPERIODvalues.aftermeal; }
    if ("afternoon".equals(_x)) { return CDDAYPERIODvalues.afternoon; }
    if ("beforebreakfast".equals(_x)) { return CDDAYPERIODvalues.beforebreakfast; }
    if ("beforedinner".equals(_x)) { return CDDAYPERIODvalues.beforedinner; }
    if ("beforelunch".equals(_x)) { return CDDAYPERIODvalues.beforelunch; }
    if ("betweenbreakfastandlunch".equals(_x)) { return CDDAYPERIODvalues.betweenbreakfastandlunch; }
    if ("betweendinnerandsleep".equals(_x)) { return CDDAYPERIODvalues.betweendinnerandsleep; }
    if ("betweenlunchanddinner".equals(_x)) { return CDDAYPERIODvalues.betweenlunchanddinner; }
    if ("betweenmeals".equals(_x)) { return CDDAYPERIODvalues.betweenmeals; }
    if ("evening".equals(_x)) { return CDDAYPERIODvalues.evening; }
    if ("morning".equals(_x)) { return CDDAYPERIODvalues.morning; }
    if ("night".equals(_x)) { return CDDAYPERIODvalues.night; }
    if ("thehourofsleep".equals(_x)) { return CDDAYPERIODvalues.thehourofsleep; }
    if ("duringbreakfast".equals(_x)) { return CDDAYPERIODvalues.duringbreakfast; }
    if ("duringlunch".equals(_x)) { return CDDAYPERIODvalues.duringlunch; }
    if ("duringdinner".equals(_x)) { return CDDAYPERIODvalues.duringdinner; }
    return null;
  }
}


enum CDDISCHARGETYPEvalues { alive, dead;

  public static CDDISCHARGETYPEvalues parseCDDISCHARGETYPEvalues(String _x) {
    if ("alive".equals(_x)) { return CDDISCHARGETYPEvalues.alive; }
    if ("dead".equals(_x)) { return CDDISCHARGETYPEvalues.dead; }
    return null;
  }
}


enum CDDRUGCNKschemes { CDDRUGCNK, CDCNKCLUSTER, CDAMP;

  public static CDDRUGCNKschemes parseCDDRUGCNKschemes(String _x) {
    if ("CDDRUGCNK".equals(_x)) { return CDDRUGCNKschemes.CDDRUGCNK; }
    if ("CDCNKCLUSTER".equals(_x)) { return CDDRUGCNKschemes.CDCNKCLUSTER; }
    if ("CDAMP".equals(_x)) { return CDDRUGCNKschemes.CDAMP; }
    return null;
  }
}


enum CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues { intubation, balloonMask;

  public static CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues parseCDEBIRTHARTIFICIALRESPIRATIONTYPEvalues(String _x) {
    if ("intubation".equals(_x)) { return CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues.intubation; }
    if ("balloonMask".equals(_x)) { return CDEBIRTHARTIFICIALRESPIRATIONTYPEvalues.balloonMask; }
    return null;
  }
}


enum CDEBIRTHCAESAREANINDICATIONvalues { previouscaesareansection, breechpresentation, transversepresentation, foetaldistress, dystocienotinlabour, dystocieinlabourinsufficientdilatation, dystocieinlabourinsufficientexpulsion, maternalindication, abruptioplacentae, requestedbypatient, multiplepregnancy, other;

  public static CDEBIRTHCAESAREANINDICATIONvalues parseCDEBIRTHCAESAREANINDICATIONvalues(String _x) {
    if ("previouscaesareansection".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.previouscaesareansection; }
    if ("breechpresentation".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.breechpresentation; }
    if ("transversepresentation".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.transversepresentation; }
    if ("foetaldistress".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.foetaldistress; }
    if ("dystocienotinlabour".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.dystocienotinlabour; }
    if ("dystocieinlabourinsufficientdilatation".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.dystocieinlabourinsufficientdilatation; }
    if ("dystocieinlabourinsufficientexpulsion".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.dystocieinlabourinsufficientexpulsion; }
    if ("maternalindication".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.maternalindication; }
    if ("abruptioplacentae".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.abruptioplacentae; }
    if ("requestedbypatient".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.requestedbypatient; }
    if ("multiplepregnancy".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.multiplepregnancy; }
    if ("other".equals(_x)) { return CDEBIRTHCAESAREANINDICATIONvalues.other; }
    return null;
  }
}


enum CDEBIRTHCHILDPOSITIONvalues { headDown, otherHead, breech, transverse;

  public static CDEBIRTHCHILDPOSITIONvalues parseCDEBIRTHCHILDPOSITIONvalues(String _x) {
    if ("headDown".equals(_x)) { return CDEBIRTHCHILDPOSITIONvalues.headDown; }
    if ("otherHead".equals(_x)) { return CDEBIRTHCHILDPOSITIONvalues.otherHead; }
    if ("breech".equals(_x)) { return CDEBIRTHCHILDPOSITIONvalues.breech; }
    if ("transverse".equals(_x)) { return CDEBIRTHCHILDPOSITIONvalues.transverse; }
    return null;
  }
}


enum CDEBIRTHCONGENITALMALFORMATIONvalues { anencephalia, spinabifida, hydrocephalia, splitlippalate, analatresia, membersreduction, diaphragmatichernia, omphalocele, gastroschisis, transpositiegrotevaten, afwijkinglong, atresiedundarm, nieragenese, craniosynostosis, turnersyndrom, obstructievedefecten, tetralogiefallot, oesofagaleatresie, atresieanus, twintotwintransfusionsyndrome, skeletdysplasie, hydropsfoetalis, polymultikystischenierdysplasie, VSD, atresiegalwegen, hypospadias, cystischhygroma, trisomie21, trisomie18, trisomie13, other;

  public static CDEBIRTHCONGENITALMALFORMATIONvalues parseCDEBIRTHCONGENITALMALFORMATIONvalues(String _x) {
    if ("anencephalia".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.anencephalia; }
    if ("spinabifida".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.spinabifida; }
    if ("hydrocephalia".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.hydrocephalia; }
    if ("splitlippalate".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.splitlippalate; }
    if ("analatresia".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.analatresia; }
    if ("membersreduction".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.membersreduction; }
    if ("diaphragmatichernia".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.diaphragmatichernia; }
    if ("omphalocele".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.omphalocele; }
    if ("gastroschisis".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.gastroschisis; }
    if ("transpositiegrotevaten".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.transpositiegrotevaten; }
    if ("afwijkinglong".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.afwijkinglong; }
    if ("atresiedundarm".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.atresiedundarm; }
    if ("nieragenese".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.nieragenese; }
    if ("craniosynostosis".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.craniosynostosis; }
    if ("turnersyndrom".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.turnersyndrom; }
    if ("obstructievedefecten".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.obstructievedefecten; }
    if ("tetralogiefallot".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.tetralogiefallot; }
    if ("oesofagaleatresie".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.oesofagaleatresie; }
    if ("atresieanus".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.atresieanus; }
    if ("twintotwintransfusionsyndrome".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.twintotwintransfusionsyndrome; }
    if ("skeletdysplasie".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.skeletdysplasie; }
    if ("hydropsfoetalis".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.hydropsfoetalis; }
    if ("polymultikystischenierdysplasie".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.polymultikystischenierdysplasie; }
    if ("VSD".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.VSD; }
    if ("atresiegalwegen".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.atresiegalwegen; }
    if ("hypospadias".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.hypospadias; }
    if ("cystischhygroma".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.cystischhygroma; }
    if ("trisomie21".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.trisomie21; }
    if ("trisomie18".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.trisomie18; }
    if ("trisomie13".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.trisomie13; }
    if ("other".equals(_x)) { return CDEBIRTHCONGENITALMALFORMATIONvalues.other; }
    return null;
  }
}


enum CDEBIRTHDELIVERYWAYvalues { spontaneous, vacuumExtraction, forceps, primaryCaesarean, secondaryCaesarean, vaginalBreech;

  public static CDEBIRTHDELIVERYWAYvalues parseCDEBIRTHDELIVERYWAYvalues(String _x) {
    if ("spontaneous".equals(_x)) { return CDEBIRTHDELIVERYWAYvalues.spontaneous; }
    if ("vacuumExtraction".equals(_x)) { return CDEBIRTHDELIVERYWAYvalues.vacuumExtraction; }
    if ("forceps".equals(_x)) { return CDEBIRTHDELIVERYWAYvalues.forceps; }
    if ("primaryCaesarean".equals(_x)) { return CDEBIRTHDELIVERYWAYvalues.primaryCaesarean; }
    if ("secondaryCaesarean".equals(_x)) { return CDEBIRTHDELIVERYWAYvalues.secondaryCaesarean; }
    if ("vaginalBreech".equals(_x)) { return CDEBIRTHDELIVERYWAYvalues.vaginalBreech; }
    return null;
  }
}


enum CDEBIRTHFOETALMONITORINGvalues { CTG, STAN, MBE, intermittentAuscultation;

  public static CDEBIRTHFOETALMONITORINGvalues parseCDEBIRTHFOETALMONITORINGvalues(String _x) {
    if ("CTG".equals(_x)) { return CDEBIRTHFOETALMONITORINGvalues.CTG; }
    if ("STAN".equals(_x)) { return CDEBIRTHFOETALMONITORINGvalues.STAN; }
    if ("MBE".equals(_x)) { return CDEBIRTHFOETALMONITORINGvalues.MBE; }
    if ("intermittentAuscultation".equals(_x)) { return CDEBIRTHFOETALMONITORINGvalues.intermittentAuscultation; }
    return null;
  }
}


enum CDEBIRTHNEONATALDEPTTYPEvalues { nstar, nic;

  public static CDEBIRTHNEONATALDEPTTYPEvalues parseCDEBIRTHNEONATALDEPTTYPEvalues(String _x) {
    if ("nstar".equals(_x)) { return CDEBIRTHNEONATALDEPTTYPEvalues.nstar; }
    if ("nic".equals(_x)) { return CDEBIRTHNEONATALDEPTTYPEvalues.nic; }
    return null;
  }
}


enum CDEBIRTHPLACEvalues { home, hospital, other;

  public static CDEBIRTHPLACEvalues parseCDEBIRTHPLACEvalues(String _x) {
    if ("home".equals(_x)) { return CDEBIRTHPLACEvalues.home; }
    if ("hospital".equals(_x)) { return CDEBIRTHPLACEvalues.hospital; }
    if ("other".equals(_x)) { return CDEBIRTHPLACEvalues.other; }
    return null;
  }
}


enum CDEBIRTHPREGNANCYORIGINvalues { spontaneous, hormonal, IVF, ICSI;

  public static CDEBIRTHPREGNANCYORIGINvalues parseCDEBIRTHPREGNANCYORIGINvalues(String _x) {
    if ("spontaneous".equals(_x)) { return CDEBIRTHPREGNANCYORIGINvalues.spontaneous; }
    if ("hormonal".equals(_x)) { return CDEBIRTHPREGNANCYORIGINvalues.hormonal; }
    if ("IVF".equals(_x)) { return CDEBIRTHPREGNANCYORIGINvalues.IVF; }
    if ("ICSI".equals(_x)) { return CDEBIRTHPREGNANCYORIGINvalues.ICSI; }
    return null;
  }
}


enum CDEBIRTHSPECIALVALUESvalues { noanswer, unknown, nottested;

  public static CDEBIRTHSPECIALVALUESvalues parseCDEBIRTHSPECIALVALUESvalues(String _x) {
    if ("noanswer".equals(_x)) { return CDEBIRTHSPECIALVALUESvalues.noanswer; }
    if ("unknown".equals(_x)) { return CDEBIRTHSPECIALVALUESvalues.unknown; }
    if ("nottested".equals(_x)) { return CDEBIRTHSPECIALVALUESvalues.nottested; }
    return null;
  }
}


enum CDECGvalues { VR, AR, PR, QRS, QT, QTc, P, R, T;

  public static CDECGvalues parseCDECGvalues(String _x) {
    if ("VR".equals(_x)) { return CDECGvalues.VR; }
    if ("AR".equals(_x)) { return CDECGvalues.AR; }
    if ("PR".equals(_x)) { return CDECGvalues.PR; }
    if ("QRS".equals(_x)) { return CDECGvalues.QRS; }
    if ("QT".equals(_x)) { return CDECGvalues.QT; }
    if ("QTc".equals(_x)) { return CDECGvalues.QTc; }
    if ("P".equals(_x)) { return CDECGvalues.P; }
    if ("R".equals(_x)) { return CDECGvalues.R; }
    if ("T".equals(_x)) { return CDECGvalues.T; }
    return null;
  }
}


enum CDEMERGENCYEVALUATIONvalues { couldwaitafterwe, noturgent, urgent, lifethreathning;

  public static CDEMERGENCYEVALUATIONvalues parseCDEMERGENCYEVALUATIONvalues(String _x) {
    if ("couldwaitafterwe".equals(_x)) { return CDEMERGENCYEVALUATIONvalues.couldwaitafterwe; }
    if ("noturgent".equals(_x)) { return CDEMERGENCYEVALUATIONvalues.noturgent; }
    if ("urgent".equals(_x)) { return CDEMERGENCYEVALUATIONvalues.urgent; }
    if ("lifethreathning".equals(_x)) { return CDEMERGENCYEVALUATIONvalues.lifethreathning; }
    return null;
  }
}


enum CDEMPLOYMENTSITUATIONvalues { selfemployed, employed, civilservant;

  public static CDEMPLOYMENTSITUATIONvalues parseCDEMPLOYMENTSITUATIONvalues(String _x) {
    if ("selfemployed".equals(_x)) { return CDEMPLOYMENTSITUATIONvalues.selfemployed; }
    if ("employed".equals(_x)) { return CDEMPLOYMENTSITUATIONvalues.employed; }
    if ("civilservant".equals(_x)) { return CDEMPLOYMENTSITUATIONvalues.civilservant; }
    return null;
  }
}


enum CDENCODINGvalues { B64, TXT;

  public static CDENCODINGvalues parseCDENCODINGvalues(String _x) {
    if ("B64".equals(_x)) { return CDENCODINGvalues.B64; }
    if ("TXT".equals(_x)) { return CDENCODINGvalues.TXT; }
    return null;
  }
}


enum CDENCOUNTERSAFETYISSUEvalues { verbal, fysical, material, notificationtopolice;

  public static CDENCOUNTERSAFETYISSUEvalues parseCDENCOUNTERSAFETYISSUEvalues(String _x) {
    if ("verbal".equals(_x)) { return CDENCOUNTERSAFETYISSUEvalues.verbal; }
    if ("fysical".equals(_x)) { return CDENCOUNTERSAFETYISSUEvalues.fysical; }
    if ("material".equals(_x)) { return CDENCOUNTERSAFETYISSUEvalues.material; }
    if ("notificationtopolice".equals(_x)) { return CDENCOUNTERSAFETYISSUEvalues.notificationtopolice; }
    return null;
  }
}


enum CDENCOUNTERvalues { homevisit, consultation, telephonicconsultation, emergency, hospital, oneday, technical, resthomevisit, consult, multidisciplinaryconsult;

  public static CDENCOUNTERvalues parseCDENCOUNTERvalues(String _x) {
    if ("homevisit".equals(_x)) { return CDENCOUNTERvalues.homevisit; }
    if ("consultation".equals(_x)) { return CDENCOUNTERvalues.consultation; }
    if ("telephonicconsultation".equals(_x)) { return CDENCOUNTERvalues.telephonicconsultation; }
    if ("emergency".equals(_x)) { return CDENCOUNTERvalues.emergency; }
    if ("hospital".equals(_x)) { return CDENCOUNTERvalues.hospital; }
    if ("oneday".equals(_x)) { return CDENCOUNTERvalues.oneday; }
    if ("technical".equals(_x)) { return CDENCOUNTERvalues.technical; }
    if ("resthomevisit".equals(_x)) { return CDENCOUNTERvalues.resthomevisit; }
    if ("consult".equals(_x)) { return CDENCOUNTERvalues.consult; }
    if ("multidisciplinaryconsult".equals(_x)) { return CDENCOUNTERvalues.multidisciplinaryconsult; }
    return null;
  }
}


enum CDENCRYPTIONACTORvalues { NIHII, NIHIIHOSPITAL, NIHIIPHARMACY, CBE, INSS, EHP, SSIN;

  public static CDENCRYPTIONACTORvalues parseCDENCRYPTIONACTORvalues(String _x) {
    if ("NIHII".equals(_x)) { return CDENCRYPTIONACTORvalues.NIHII; }
    if ("NIHIIHOSPITAL".equals(_x)) { return CDENCRYPTIONACTORvalues.NIHIIHOSPITAL; }
    if ("NIHIIPHARMACY".equals(_x)) { return CDENCRYPTIONACTORvalues.NIHIIPHARMACY; }
    if ("CBE".equals(_x)) { return CDENCRYPTIONACTORvalues.CBE; }
    if ("INSS".equals(_x)) { return CDENCRYPTIONACTORvalues.INSS; }
    if ("EHP".equals(_x)) { return CDENCRYPTIONACTORvalues.EHP; }
    if ("SSIN".equals(_x)) { return CDENCRYPTIONACTORvalues.SSIN; }
    return null;
  }
}


enum CDENCRYPTIONMETHODschemes { CDENCRYPTIONMETHOD;

  public static CDENCRYPTIONMETHODschemes parseCDENCRYPTIONMETHODschemes(String _x) {
    if ("CDENCRYPTIONMETHOD".equals(_x)) { return CDENCRYPTIONMETHODschemes.CDENCRYPTIONMETHOD; }
    return null;
  }
}


enum CDENCRYPTIONMETHODvalues { CMS;

  public static CDENCRYPTIONMETHODvalues parseCDENCRYPTIONMETHODvalues(String _x) {
    if ("CMS".equals(_x)) { return CDENCRYPTIONMETHODvalues.CMS; }
    return null;
  }
}


enum CDERRORMYCARENETschemes { CDERROR, CDREFUSALMYCARENET;

  public static CDERRORMYCARENETschemes parseCDERRORMYCARENETschemes(String _x) {
    if ("CDERROR".equals(_x)) { return CDERRORMYCARENETschemes.CDERROR; }
    if ("CDREFUSALMYCARENET".equals(_x)) { return CDERRORMYCARENETschemes.CDREFUSALMYCARENET; }
    return null;
  }
}


enum CDERRORschemes { CDERROR, LOCAL;

  public static CDERRORschemes parseCDERRORschemes(String _x) {
    if ("CDERROR".equals(_x)) { return CDERRORschemes.CDERROR; }
    if ("LOCAL".equals(_x)) { return CDERRORschemes.LOCAL; }
    return null;
  }
}


enum CDEXTERNALSOURCEschemes { CDEXTERNALSOURCE, LOCAL;

  public static CDEXTERNALSOURCEschemes parseCDEXTERNALSOURCEschemes(String _x) {
    if ("CDEXTERNALSOURCE".equals(_x)) { return CDEXTERNALSOURCEschemes.CDEXTERNALSOURCE; }
    if ("LOCAL".equals(_x)) { return CDEXTERNALSOURCEschemes.LOCAL; }
    return null;
  }
}


enum CDFEDCOUNTRYvalues { al, ad, de, at, bg, cy, dk, es, fi, fr, yt, re, pm, gp, mq, gf, nc, pf, wf, gb, bm, vg, tc, ai, ky, ms, fk, pn, lu, gr, hu, ie, is, li, mt, mc, no, pt, ro, sm, se, ch, it, nl, an, cs, va, lv, ee, lt, pl, cz, sk, by, ua, md, ru, hr, si, mk, ba, be, me, rs, xk, xi, xs, lk, tw, sg, kr, in, id, jp, la, kh, my, np, ph, cn, kp, vn, mn, mv, bt, bn, kz, kg, uz, tj, tm, th, mm, bd, am, az, af, sa, ge, iq, ir, il, jo, lb, pk, ae, sy, tr, kw, om, qa, bh, ye, tl, ps, ls, bw, bi, cm, cf, _cd, cg, bf, ci, bj, et, ga, gm, gh, gn, mu, lr, ml, sn, ne, ng, ug, mg, za, rw, sl, so, sz, tz, td, tg, zm, ke, gq, gw, cv, mz, ao, sc, km, zw, dj, st, er, dz, eg, ly, ma, mr, sd, tn, mw, na, eh, sh, ca, us, vi, pr, gu, as, cr, cu, gt, hn, jm, mx, ni, pa, ht, _do, sv, tt, bb, bs, gd, dm, lc, vc, bz, kn, ag, ar, bo, br, cl, co, ec, py, pe, uy, ve, gy, sr, mh, au, hm, nz, nu, tk, ck, ws, nr, to, fj, pg, tv, ki, sb, vu, pw, fm, mp, xr, xa, xe, gg, im, je, aq, aw, ax, bq;

  public static CDFEDCOUNTRYvalues parseCDFEDCOUNTRYvalues(String _x) {
    if ("al".equals(_x)) { return CDFEDCOUNTRYvalues.al; }
    if ("ad".equals(_x)) { return CDFEDCOUNTRYvalues.ad; }
    if ("de".equals(_x)) { return CDFEDCOUNTRYvalues.de; }
    if ("at".equals(_x)) { return CDFEDCOUNTRYvalues.at; }
    if ("bg".equals(_x)) { return CDFEDCOUNTRYvalues.bg; }
    if ("cy".equals(_x)) { return CDFEDCOUNTRYvalues.cy; }
    if ("dk".equals(_x)) { return CDFEDCOUNTRYvalues.dk; }
    if ("es".equals(_x)) { return CDFEDCOUNTRYvalues.es; }
    if ("fi".equals(_x)) { return CDFEDCOUNTRYvalues.fi; }
    if ("fr".equals(_x)) { return CDFEDCOUNTRYvalues.fr; }
    if ("yt".equals(_x)) { return CDFEDCOUNTRYvalues.yt; }
    if ("re".equals(_x)) { return CDFEDCOUNTRYvalues.re; }
    if ("pm".equals(_x)) { return CDFEDCOUNTRYvalues.pm; }
    if ("gp".equals(_x)) { return CDFEDCOUNTRYvalues.gp; }
    if ("mq".equals(_x)) { return CDFEDCOUNTRYvalues.mq; }
    if ("gf".equals(_x)) { return CDFEDCOUNTRYvalues.gf; }
    if ("nc".equals(_x)) { return CDFEDCOUNTRYvalues.nc; }
    if ("pf".equals(_x)) { return CDFEDCOUNTRYvalues.pf; }
    if ("wf".equals(_x)) { return CDFEDCOUNTRYvalues.wf; }
    if ("gb".equals(_x)) { return CDFEDCOUNTRYvalues.gb; }
    if ("bm".equals(_x)) { return CDFEDCOUNTRYvalues.bm; }
    if ("vg".equals(_x)) { return CDFEDCOUNTRYvalues.vg; }
    if ("tc".equals(_x)) { return CDFEDCOUNTRYvalues.tc; }
    if ("ai".equals(_x)) { return CDFEDCOUNTRYvalues.ai; }
    if ("ky".equals(_x)) { return CDFEDCOUNTRYvalues.ky; }
    if ("ms".equals(_x)) { return CDFEDCOUNTRYvalues.ms; }
    if ("fk".equals(_x)) { return CDFEDCOUNTRYvalues.fk; }
    if ("pn".equals(_x)) { return CDFEDCOUNTRYvalues.pn; }
    if ("lu".equals(_x)) { return CDFEDCOUNTRYvalues.lu; }
    if ("gr".equals(_x)) { return CDFEDCOUNTRYvalues.gr; }
    if ("hu".equals(_x)) { return CDFEDCOUNTRYvalues.hu; }
    if ("ie".equals(_x)) { return CDFEDCOUNTRYvalues.ie; }
    if ("is".equals(_x)) { return CDFEDCOUNTRYvalues.is; }
    if ("li".equals(_x)) { return CDFEDCOUNTRYvalues.li; }
    if ("mt".equals(_x)) { return CDFEDCOUNTRYvalues.mt; }
    if ("mc".equals(_x)) { return CDFEDCOUNTRYvalues.mc; }
    if ("no".equals(_x)) { return CDFEDCOUNTRYvalues.no; }
    if ("pt".equals(_x)) { return CDFEDCOUNTRYvalues.pt; }
    if ("ro".equals(_x)) { return CDFEDCOUNTRYvalues.ro; }
    if ("sm".equals(_x)) { return CDFEDCOUNTRYvalues.sm; }
    if ("se".equals(_x)) { return CDFEDCOUNTRYvalues.se; }
    if ("ch".equals(_x)) { return CDFEDCOUNTRYvalues.ch; }
    if ("it".equals(_x)) { return CDFEDCOUNTRYvalues.it; }
    if ("nl".equals(_x)) { return CDFEDCOUNTRYvalues.nl; }
    if ("an".equals(_x)) { return CDFEDCOUNTRYvalues.an; }
    if ("cs".equals(_x)) { return CDFEDCOUNTRYvalues.cs; }
    if ("va".equals(_x)) { return CDFEDCOUNTRYvalues.va; }
    if ("lv".equals(_x)) { return CDFEDCOUNTRYvalues.lv; }
    if ("ee".equals(_x)) { return CDFEDCOUNTRYvalues.ee; }
    if ("lt".equals(_x)) { return CDFEDCOUNTRYvalues.lt; }
    if ("pl".equals(_x)) { return CDFEDCOUNTRYvalues.pl; }
    if ("cz".equals(_x)) { return CDFEDCOUNTRYvalues.cz; }
    if ("sk".equals(_x)) { return CDFEDCOUNTRYvalues.sk; }
    if ("by".equals(_x)) { return CDFEDCOUNTRYvalues.by; }
    if ("ua".equals(_x)) { return CDFEDCOUNTRYvalues.ua; }
    if ("md".equals(_x)) { return CDFEDCOUNTRYvalues.md; }
    if ("ru".equals(_x)) { return CDFEDCOUNTRYvalues.ru; }
    if ("hr".equals(_x)) { return CDFEDCOUNTRYvalues.hr; }
    if ("si".equals(_x)) { return CDFEDCOUNTRYvalues.si; }
    if ("mk".equals(_x)) { return CDFEDCOUNTRYvalues.mk; }
    if ("ba".equals(_x)) { return CDFEDCOUNTRYvalues.ba; }
    if ("be".equals(_x)) { return CDFEDCOUNTRYvalues.be; }
    if ("me".equals(_x)) { return CDFEDCOUNTRYvalues.me; }
    if ("rs".equals(_x)) { return CDFEDCOUNTRYvalues.rs; }
    if ("xk".equals(_x)) { return CDFEDCOUNTRYvalues.xk; }
    if ("xi".equals(_x)) { return CDFEDCOUNTRYvalues.xi; }
    if ("xs".equals(_x)) { return CDFEDCOUNTRYvalues.xs; }
    if ("lk".equals(_x)) { return CDFEDCOUNTRYvalues.lk; }
    if ("tw".equals(_x)) { return CDFEDCOUNTRYvalues.tw; }
    if ("sg".equals(_x)) { return CDFEDCOUNTRYvalues.sg; }
    if ("kr".equals(_x)) { return CDFEDCOUNTRYvalues.kr; }
    if ("in".equals(_x)) { return CDFEDCOUNTRYvalues.in; }
    if ("id".equals(_x)) { return CDFEDCOUNTRYvalues.id; }
    if ("jp".equals(_x)) { return CDFEDCOUNTRYvalues.jp; }
    if ("la".equals(_x)) { return CDFEDCOUNTRYvalues.la; }
    if ("kh".equals(_x)) { return CDFEDCOUNTRYvalues.kh; }
    if ("my".equals(_x)) { return CDFEDCOUNTRYvalues.my; }
    if ("np".equals(_x)) { return CDFEDCOUNTRYvalues.np; }
    if ("ph".equals(_x)) { return CDFEDCOUNTRYvalues.ph; }
    if ("cn".equals(_x)) { return CDFEDCOUNTRYvalues.cn; }
    if ("kp".equals(_x)) { return CDFEDCOUNTRYvalues.kp; }
    if ("vn".equals(_x)) { return CDFEDCOUNTRYvalues.vn; }
    if ("mn".equals(_x)) { return CDFEDCOUNTRYvalues.mn; }
    if ("mv".equals(_x)) { return CDFEDCOUNTRYvalues.mv; }
    if ("bt".equals(_x)) { return CDFEDCOUNTRYvalues.bt; }
    if ("bn".equals(_x)) { return CDFEDCOUNTRYvalues.bn; }
    if ("kz".equals(_x)) { return CDFEDCOUNTRYvalues.kz; }
    if ("kg".equals(_x)) { return CDFEDCOUNTRYvalues.kg; }
    if ("uz".equals(_x)) { return CDFEDCOUNTRYvalues.uz; }
    if ("tj".equals(_x)) { return CDFEDCOUNTRYvalues.tj; }
    if ("tm".equals(_x)) { return CDFEDCOUNTRYvalues.tm; }
    if ("th".equals(_x)) { return CDFEDCOUNTRYvalues.th; }
    if ("mm".equals(_x)) { return CDFEDCOUNTRYvalues.mm; }
    if ("bd".equals(_x)) { return CDFEDCOUNTRYvalues.bd; }
    if ("am".equals(_x)) { return CDFEDCOUNTRYvalues.am; }
    if ("az".equals(_x)) { return CDFEDCOUNTRYvalues.az; }
    if ("af".equals(_x)) { return CDFEDCOUNTRYvalues.af; }
    if ("sa".equals(_x)) { return CDFEDCOUNTRYvalues.sa; }
    if ("ge".equals(_x)) { return CDFEDCOUNTRYvalues.ge; }
    if ("iq".equals(_x)) { return CDFEDCOUNTRYvalues.iq; }
    if ("ir".equals(_x)) { return CDFEDCOUNTRYvalues.ir; }
    if ("il".equals(_x)) { return CDFEDCOUNTRYvalues.il; }
    if ("jo".equals(_x)) { return CDFEDCOUNTRYvalues.jo; }
    if ("lb".equals(_x)) { return CDFEDCOUNTRYvalues.lb; }
    if ("pk".equals(_x)) { return CDFEDCOUNTRYvalues.pk; }
    if ("ae".equals(_x)) { return CDFEDCOUNTRYvalues.ae; }
    if ("sy".equals(_x)) { return CDFEDCOUNTRYvalues.sy; }
    if ("tr".equals(_x)) { return CDFEDCOUNTRYvalues.tr; }
    if ("kw".equals(_x)) { return CDFEDCOUNTRYvalues.kw; }
    if ("om".equals(_x)) { return CDFEDCOUNTRYvalues.om; }
    if ("qa".equals(_x)) { return CDFEDCOUNTRYvalues.qa; }
    if ("bh".equals(_x)) { return CDFEDCOUNTRYvalues.bh; }
    if ("ye".equals(_x)) { return CDFEDCOUNTRYvalues.ye; }
    if ("tl".equals(_x)) { return CDFEDCOUNTRYvalues.tl; }
    if ("ps".equals(_x)) { return CDFEDCOUNTRYvalues.ps; }
    if ("ls".equals(_x)) { return CDFEDCOUNTRYvalues.ls; }
    if ("bw".equals(_x)) { return CDFEDCOUNTRYvalues.bw; }
    if ("bi".equals(_x)) { return CDFEDCOUNTRYvalues.bi; }
    if ("cm".equals(_x)) { return CDFEDCOUNTRYvalues.cm; }
    if ("cf".equals(_x)) { return CDFEDCOUNTRYvalues.cf; }
    if ("_cd".equals(_x)) { return CDFEDCOUNTRYvalues._cd; }
    if ("cg".equals(_x)) { return CDFEDCOUNTRYvalues.cg; }
    if ("bf".equals(_x)) { return CDFEDCOUNTRYvalues.bf; }
    if ("ci".equals(_x)) { return CDFEDCOUNTRYvalues.ci; }
    if ("bj".equals(_x)) { return CDFEDCOUNTRYvalues.bj; }
    if ("et".equals(_x)) { return CDFEDCOUNTRYvalues.et; }
    if ("ga".equals(_x)) { return CDFEDCOUNTRYvalues.ga; }
    if ("gm".equals(_x)) { return CDFEDCOUNTRYvalues.gm; }
    if ("gh".equals(_x)) { return CDFEDCOUNTRYvalues.gh; }
    if ("gn".equals(_x)) { return CDFEDCOUNTRYvalues.gn; }
    if ("mu".equals(_x)) { return CDFEDCOUNTRYvalues.mu; }
    if ("lr".equals(_x)) { return CDFEDCOUNTRYvalues.lr; }
    if ("ml".equals(_x)) { return CDFEDCOUNTRYvalues.ml; }
    if ("sn".equals(_x)) { return CDFEDCOUNTRYvalues.sn; }
    if ("ne".equals(_x)) { return CDFEDCOUNTRYvalues.ne; }
    if ("ng".equals(_x)) { return CDFEDCOUNTRYvalues.ng; }
    if ("ug".equals(_x)) { return CDFEDCOUNTRYvalues.ug; }
    if ("mg".equals(_x)) { return CDFEDCOUNTRYvalues.mg; }
    if ("za".equals(_x)) { return CDFEDCOUNTRYvalues.za; }
    if ("rw".equals(_x)) { return CDFEDCOUNTRYvalues.rw; }
    if ("sl".equals(_x)) { return CDFEDCOUNTRYvalues.sl; }
    if ("so".equals(_x)) { return CDFEDCOUNTRYvalues.so; }
    if ("sz".equals(_x)) { return CDFEDCOUNTRYvalues.sz; }
    if ("tz".equals(_x)) { return CDFEDCOUNTRYvalues.tz; }
    if ("td".equals(_x)) { return CDFEDCOUNTRYvalues.td; }
    if ("tg".equals(_x)) { return CDFEDCOUNTRYvalues.tg; }
    if ("zm".equals(_x)) { return CDFEDCOUNTRYvalues.zm; }
    if ("ke".equals(_x)) { return CDFEDCOUNTRYvalues.ke; }
    if ("gq".equals(_x)) { return CDFEDCOUNTRYvalues.gq; }
    if ("gw".equals(_x)) { return CDFEDCOUNTRYvalues.gw; }
    if ("cv".equals(_x)) { return CDFEDCOUNTRYvalues.cv; }
    if ("mz".equals(_x)) { return CDFEDCOUNTRYvalues.mz; }
    if ("ao".equals(_x)) { return CDFEDCOUNTRYvalues.ao; }
    if ("sc".equals(_x)) { return CDFEDCOUNTRYvalues.sc; }
    if ("km".equals(_x)) { return CDFEDCOUNTRYvalues.km; }
    if ("zw".equals(_x)) { return CDFEDCOUNTRYvalues.zw; }
    if ("dj".equals(_x)) { return CDFEDCOUNTRYvalues.dj; }
    if ("st".equals(_x)) { return CDFEDCOUNTRYvalues.st; }
    if ("er".equals(_x)) { return CDFEDCOUNTRYvalues.er; }
    if ("dz".equals(_x)) { return CDFEDCOUNTRYvalues.dz; }
    if ("eg".equals(_x)) { return CDFEDCOUNTRYvalues.eg; }
    if ("ly".equals(_x)) { return CDFEDCOUNTRYvalues.ly; }
    if ("ma".equals(_x)) { return CDFEDCOUNTRYvalues.ma; }
    if ("mr".equals(_x)) { return CDFEDCOUNTRYvalues.mr; }
    if ("sd".equals(_x)) { return CDFEDCOUNTRYvalues.sd; }
    if ("tn".equals(_x)) { return CDFEDCOUNTRYvalues.tn; }
    if ("mw".equals(_x)) { return CDFEDCOUNTRYvalues.mw; }
    if ("na".equals(_x)) { return CDFEDCOUNTRYvalues.na; }
    if ("eh".equals(_x)) { return CDFEDCOUNTRYvalues.eh; }
    if ("sh".equals(_x)) { return CDFEDCOUNTRYvalues.sh; }
    if ("ca".equals(_x)) { return CDFEDCOUNTRYvalues.ca; }
    if ("us".equals(_x)) { return CDFEDCOUNTRYvalues.us; }
    if ("vi".equals(_x)) { return CDFEDCOUNTRYvalues.vi; }
    if ("pr".equals(_x)) { return CDFEDCOUNTRYvalues.pr; }
    if ("gu".equals(_x)) { return CDFEDCOUNTRYvalues.gu; }
    if ("as".equals(_x)) { return CDFEDCOUNTRYvalues.as; }
    if ("cr".equals(_x)) { return CDFEDCOUNTRYvalues.cr; }
    if ("cu".equals(_x)) { return CDFEDCOUNTRYvalues.cu; }
    if ("gt".equals(_x)) { return CDFEDCOUNTRYvalues.gt; }
    if ("hn".equals(_x)) { return CDFEDCOUNTRYvalues.hn; }
    if ("jm".equals(_x)) { return CDFEDCOUNTRYvalues.jm; }
    if ("mx".equals(_x)) { return CDFEDCOUNTRYvalues.mx; }
    if ("ni".equals(_x)) { return CDFEDCOUNTRYvalues.ni; }
    if ("pa".equals(_x)) { return CDFEDCOUNTRYvalues.pa; }
    if ("ht".equals(_x)) { return CDFEDCOUNTRYvalues.ht; }
    if ("_do".equals(_x)) { return CDFEDCOUNTRYvalues._do; }
    if ("sv".equals(_x)) { return CDFEDCOUNTRYvalues.sv; }
    if ("tt".equals(_x)) { return CDFEDCOUNTRYvalues.tt; }
    if ("bb".equals(_x)) { return CDFEDCOUNTRYvalues.bb; }
    if ("bs".equals(_x)) { return CDFEDCOUNTRYvalues.bs; }
    if ("gd".equals(_x)) { return CDFEDCOUNTRYvalues.gd; }
    if ("dm".equals(_x)) { return CDFEDCOUNTRYvalues.dm; }
    if ("lc".equals(_x)) { return CDFEDCOUNTRYvalues.lc; }
    if ("vc".equals(_x)) { return CDFEDCOUNTRYvalues.vc; }
    if ("bz".equals(_x)) { return CDFEDCOUNTRYvalues.bz; }
    if ("kn".equals(_x)) { return CDFEDCOUNTRYvalues.kn; }
    if ("ag".equals(_x)) { return CDFEDCOUNTRYvalues.ag; }
    if ("ar".equals(_x)) { return CDFEDCOUNTRYvalues.ar; }
    if ("bo".equals(_x)) { return CDFEDCOUNTRYvalues.bo; }
    if ("br".equals(_x)) { return CDFEDCOUNTRYvalues.br; }
    if ("cl".equals(_x)) { return CDFEDCOUNTRYvalues.cl; }
    if ("co".equals(_x)) { return CDFEDCOUNTRYvalues.co; }
    if ("ec".equals(_x)) { return CDFEDCOUNTRYvalues.ec; }
    if ("py".equals(_x)) { return CDFEDCOUNTRYvalues.py; }
    if ("pe".equals(_x)) { return CDFEDCOUNTRYvalues.pe; }
    if ("uy".equals(_x)) { return CDFEDCOUNTRYvalues.uy; }
    if ("ve".equals(_x)) { return CDFEDCOUNTRYvalues.ve; }
    if ("gy".equals(_x)) { return CDFEDCOUNTRYvalues.gy; }
    if ("sr".equals(_x)) { return CDFEDCOUNTRYvalues.sr; }
    if ("mh".equals(_x)) { return CDFEDCOUNTRYvalues.mh; }
    if ("au".equals(_x)) { return CDFEDCOUNTRYvalues.au; }
    if ("hm".equals(_x)) { return CDFEDCOUNTRYvalues.hm; }
    if ("nz".equals(_x)) { return CDFEDCOUNTRYvalues.nz; }
    if ("nu".equals(_x)) { return CDFEDCOUNTRYvalues.nu; }
    if ("tk".equals(_x)) { return CDFEDCOUNTRYvalues.tk; }
    if ("ck".equals(_x)) { return CDFEDCOUNTRYvalues.ck; }
    if ("ws".equals(_x)) { return CDFEDCOUNTRYvalues.ws; }
    if ("nr".equals(_x)) { return CDFEDCOUNTRYvalues.nr; }
    if ("to".equals(_x)) { return CDFEDCOUNTRYvalues.to; }
    if ("fj".equals(_x)) { return CDFEDCOUNTRYvalues.fj; }
    if ("pg".equals(_x)) { return CDFEDCOUNTRYvalues.pg; }
    if ("tv".equals(_x)) { return CDFEDCOUNTRYvalues.tv; }
    if ("ki".equals(_x)) { return CDFEDCOUNTRYvalues.ki; }
    if ("sb".equals(_x)) { return CDFEDCOUNTRYvalues.sb; }
    if ("vu".equals(_x)) { return CDFEDCOUNTRYvalues.vu; }
    if ("pw".equals(_x)) { return CDFEDCOUNTRYvalues.pw; }
    if ("fm".equals(_x)) { return CDFEDCOUNTRYvalues.fm; }
    if ("mp".equals(_x)) { return CDFEDCOUNTRYvalues.mp; }
    if ("xr".equals(_x)) { return CDFEDCOUNTRYvalues.xr; }
    if ("xa".equals(_x)) { return CDFEDCOUNTRYvalues.xa; }
    if ("xe".equals(_x)) { return CDFEDCOUNTRYvalues.xe; }
    if ("gg".equals(_x)) { return CDFEDCOUNTRYvalues.gg; }
    if ("im".equals(_x)) { return CDFEDCOUNTRYvalues.im; }
    if ("je".equals(_x)) { return CDFEDCOUNTRYvalues.je; }
    if ("aq".equals(_x)) { return CDFEDCOUNTRYvalues.aq; }
    if ("aw".equals(_x)) { return CDFEDCOUNTRYvalues.aw; }
    if ("ax".equals(_x)) { return CDFEDCOUNTRYvalues.ax; }
    if ("bq".equals(_x)) { return CDFEDCOUNTRYvalues.bq; }
    return null;
  }
}


enum CDFORMULARYschemes { CDFORMULARY, CDFORMULARYREFERENCE;

  public static CDFORMULARYschemes parseCDFORMULARYschemes(String _x) {
    if ("CDFORMULARY".equals(_x)) { return CDFORMULARYschemes.CDFORMULARY; }
    if ("CDFORMULARYREFERENCE".equals(_x)) { return CDFORMULARYschemes.CDFORMULARYREFERENCE; }
    return null;
  }
}


enum CDGALENICFORMschemes { CDDRUGPRESENTATION, CDMAGISTRALFORM;

  public static CDGALENICFORMschemes parseCDGALENICFORMschemes(String _x) {
    if ("CDDRUGPRESENTATION".equals(_x)) { return CDGALENICFORMschemes.CDDRUGPRESENTATION; }
    if ("CDMAGISTRALFORM".equals(_x)) { return CDGALENICFORMschemes.CDMAGISTRALFORM; }
    return null;
  }
}


enum CDHCPARTYschemes { CDHCPARTY, CDAPPLICATION, CDENCRYPTIONACTOR, CDROLE, LOCAL;

  public static CDHCPARTYschemes parseCDHCPARTYschemes(String _x) {
    if ("CDHCPARTY".equals(_x)) { return CDHCPARTYschemes.CDHCPARTY; }
    if ("CDAPPLICATION".equals(_x)) { return CDHCPARTYschemes.CDAPPLICATION; }
    if ("CDENCRYPTIONACTOR".equals(_x)) { return CDHCPARTYschemes.CDENCRYPTIONACTOR; }
    if ("CDROLE".equals(_x)) { return CDHCPARTYschemes.CDROLE; }
    if ("LOCAL".equals(_x)) { return CDHCPARTYschemes.LOCAL; }
    return null;
  }
}


enum CDHCPARTYvalues { deptanatomopathology, deptanesthesiology, deptbacteriology, deptcardiology, deptdermatology, deptdietetics, deptemergency, deptgastroenterology, deptgeneralpractice, deptgenetics, deptgeriatry, deptgynecology, depthematology, deptintensivecare, deptkinesitherapy, deptlaboratory, deptmedicine, deptmolecularbiology, deptneonatalogy, deptnephrology, deptneurology, deptnte, deptnuclear, deptoncology, deptophtalmology, deptpediatry, deptpharmacy, deptphysiotherapy, deptpneumology, deptpsychiatry, deptradiology, deptradiotherapy, deptrhumatology, deptrheumatology, deptstomatology, deptsurgery, depturology, orghospital, orginsurance, orglaboratory, orgpractice, orgpublichealth, orgpharmacy, persbiologist, persdentist, persnurse, persparamedical, perspharmacist, persphysician, perssocialworker, perstechnician, persadministrative, persmidwife, ecaresafe, application, hub, deptorthopedy, deptalgology, deptcardiacsurgery, depthandsurgery, deptmaxillofacialsurgery, deptpediatricsurgery, deptplasticandreparatorysurgery, deptthoracicsurgery, deptvascularsurgery, deptvisceraldigestiveabdominalsurgery, deptdentistry, deptdiabetology, deptendocrinology, deptoccupationaltherapy, deptmajorburns, deptinfectiousdisease, deptspeechtherapy, deptsportsmedecine, deptphysicalmedecine, depttropicalmedecine, deptneurosurgery, deptnutritiondietetics, deptobstetrics, deptchildandadolescentpsychiatry, deptpodiatry, deptpsychology, deptrevalidation, deptsenology, deptsocialservice, deptpediatricintensivecare, deptpalliativecare, depttoxicology, persambulancefirstaid, persaudician, persaudiologist, perscaregiver, persdietician, perseducator, perslogopedist, persoccupationaltherapist, persorthopedist, persorthoptist, persoptician, perspharmacyassistant, persphysiotherapist, perspodologist, perspracticalnurse, perspsychologist, orgprimaryhealthcarecenter, guardpost, groupofphysicianssameaddress, groupofphysiciansdifferentaddress, groupofnurses, certificateholder, perstrussmaker, patient, orgprevention, persorthotist, perspatientdriver, perspharmacistclinicalbiologist, deptnursing, persoraldentalhygienist, persclinicalpsychologist, persclinicalorthopedagogist, orgretirementhome, orgrevalidationcenter, orgshelteredliving, orgpsychiatriccarehome, orgpolyclinic, persappliedpsychbachelor, persfamilysciencebachelor, persgerontologymaster, persorthopedagogistmaster, perspsychomotortherapymaster, persreadaptationbachelor, perspedagogybachelor, deptpsychogeriatry, deptabdpelvrehabandperinatalphysiotherapy, deptacutemedicine, deptadultpsychiatry, deptaestheticsurgery, deptanesthesiaandresuscitation, deptaudiology, deptcardiovascularphysiotherapy, deptclinicalbiology, deptclinicalgenetics, deptclinicalhematology, deptclinicalinfectiology, deptclinicalorthopedagogy, deptclinicalpsychology, deptdermatovenereology, deptdiabeticeducation, deptendocrinodiabetology, deptforensicpsychiatry, deptfunctionaldisabledrehabilitation, deptgynecologyobstetrics, depthealthdatamanagement, depthearingaidfitting, depthospitalpharmacy, deptinsurancemedicine, deptintensiveemergencycare, deptinternalmedicine, deptinvitronuclear, deptlegalmedecine, deptlogopedy, deptmanualtherapy, deptmedicalmicrobiology, deptneurologicalphysiotherapy, deptneuropsychiatry, deptnonsurgicalaestheticmedicine, deptoccupationalmedicine, deptorthodontics, deptorthopticsoptometry, deptpediatrichematologyoncology, deptpediatricneurology, deptpediatricphysiotherapy, deptperiodontology, deptperioperativecare, deptpodology, deptradiotherapyoncology, deptrespiratoryphysiotherapy, persabdpelvrehabandperinatalphysiotherapist, persadultpsychiatrist, persaestheticsurger, persambulancedriver, persanathomopathologist, persanesthesistandresuscitation, perscardiologist, perscardiovascularphysiotherapist, perschildandadolescentpsychiatrist, persclinialhematologist, persclinicalbiologist, persclinicalinfectiologist, persdentalhygienist, persdermatovenereologist, persdiabeticeducator, persdiabetologist, persemergencyphycisian, persendocrinodiabetologist, persforensicpsychiatrust, persgastroenterologist, persgeneralphysician, persgeriatrist, pershealthdatamanagemer, pershospitalpharmacist, persinsurancephysician, persinternalphysician, perslabtechnologist, perslegalphysician, persmanualtherapist, persmedicalimaging, persmedicalmicrobiologist, persneonatologist, persnephrologist, persneurologicalphysiotherapist, persneurologist, persneuropsychiatrist, persneurosurger, persnonsurgicalaestheticphysician, persoccupationalphysician, personcologist, persophthalmologist, persoralmaxillofacialsurger, persorthodontist, persotolaryngologist, perspediatrichematologistoncologist, perspediatrician, perspediatricneurologist, perspediatricphysiotherapist, persperiodontologist, persphysicalphysician, perspneumologist, persprothesist, perspsychatrist, persrespiratoryphysiotherapist, persrheumatologist, persstomatologist, perssurger, persurologist, persoptometrist, persmobilityimprover, persbandagistorthosiologist, persprosthesiologist, persshoetechnologist, orgpharmacyinvoicingoffice;

  public static CDHCPARTYvalues parseCDHCPARTYvalues(String _x) {
    if ("deptanatomopathology".equals(_x)) { return CDHCPARTYvalues.deptanatomopathology; }
    if ("deptanesthesiology".equals(_x)) { return CDHCPARTYvalues.deptanesthesiology; }
    if ("deptbacteriology".equals(_x)) { return CDHCPARTYvalues.deptbacteriology; }
    if ("deptcardiology".equals(_x)) { return CDHCPARTYvalues.deptcardiology; }
    if ("deptdermatology".equals(_x)) { return CDHCPARTYvalues.deptdermatology; }
    if ("deptdietetics".equals(_x)) { return CDHCPARTYvalues.deptdietetics; }
    if ("deptemergency".equals(_x)) { return CDHCPARTYvalues.deptemergency; }
    if ("deptgastroenterology".equals(_x)) { return CDHCPARTYvalues.deptgastroenterology; }
    if ("deptgeneralpractice".equals(_x)) { return CDHCPARTYvalues.deptgeneralpractice; }
    if ("deptgenetics".equals(_x)) { return CDHCPARTYvalues.deptgenetics; }
    if ("deptgeriatry".equals(_x)) { return CDHCPARTYvalues.deptgeriatry; }
    if ("deptgynecology".equals(_x)) { return CDHCPARTYvalues.deptgynecology; }
    if ("depthematology".equals(_x)) { return CDHCPARTYvalues.depthematology; }
    if ("deptintensivecare".equals(_x)) { return CDHCPARTYvalues.deptintensivecare; }
    if ("deptkinesitherapy".equals(_x)) { return CDHCPARTYvalues.deptkinesitherapy; }
    if ("deptlaboratory".equals(_x)) { return CDHCPARTYvalues.deptlaboratory; }
    if ("deptmedicine".equals(_x)) { return CDHCPARTYvalues.deptmedicine; }
    if ("deptmolecularbiology".equals(_x)) { return CDHCPARTYvalues.deptmolecularbiology; }
    if ("deptneonatalogy".equals(_x)) { return CDHCPARTYvalues.deptneonatalogy; }
    if ("deptnephrology".equals(_x)) { return CDHCPARTYvalues.deptnephrology; }
    if ("deptneurology".equals(_x)) { return CDHCPARTYvalues.deptneurology; }
    if ("deptnte".equals(_x)) { return CDHCPARTYvalues.deptnte; }
    if ("deptnuclear".equals(_x)) { return CDHCPARTYvalues.deptnuclear; }
    if ("deptoncology".equals(_x)) { return CDHCPARTYvalues.deptoncology; }
    if ("deptophtalmology".equals(_x)) { return CDHCPARTYvalues.deptophtalmology; }
    if ("deptpediatry".equals(_x)) { return CDHCPARTYvalues.deptpediatry; }
    if ("deptpharmacy".equals(_x)) { return CDHCPARTYvalues.deptpharmacy; }
    if ("deptphysiotherapy".equals(_x)) { return CDHCPARTYvalues.deptphysiotherapy; }
    if ("deptpneumology".equals(_x)) { return CDHCPARTYvalues.deptpneumology; }
    if ("deptpsychiatry".equals(_x)) { return CDHCPARTYvalues.deptpsychiatry; }
    if ("deptradiology".equals(_x)) { return CDHCPARTYvalues.deptradiology; }
    if ("deptradiotherapy".equals(_x)) { return CDHCPARTYvalues.deptradiotherapy; }
    if ("deptrhumatology".equals(_x)) { return CDHCPARTYvalues.deptrhumatology; }
    if ("deptrheumatology".equals(_x)) { return CDHCPARTYvalues.deptrheumatology; }
    if ("deptstomatology".equals(_x)) { return CDHCPARTYvalues.deptstomatology; }
    if ("deptsurgery".equals(_x)) { return CDHCPARTYvalues.deptsurgery; }
    if ("depturology".equals(_x)) { return CDHCPARTYvalues.depturology; }
    if ("orghospital".equals(_x)) { return CDHCPARTYvalues.orghospital; }
    if ("orginsurance".equals(_x)) { return CDHCPARTYvalues.orginsurance; }
    if ("orglaboratory".equals(_x)) { return CDHCPARTYvalues.orglaboratory; }
    if ("orgpractice".equals(_x)) { return CDHCPARTYvalues.orgpractice; }
    if ("orgpublichealth".equals(_x)) { return CDHCPARTYvalues.orgpublichealth; }
    if ("orgpharmacy".equals(_x)) { return CDHCPARTYvalues.orgpharmacy; }
    if ("persbiologist".equals(_x)) { return CDHCPARTYvalues.persbiologist; }
    if ("persdentist".equals(_x)) { return CDHCPARTYvalues.persdentist; }
    if ("persnurse".equals(_x)) { return CDHCPARTYvalues.persnurse; }
    if ("persparamedical".equals(_x)) { return CDHCPARTYvalues.persparamedical; }
    if ("perspharmacist".equals(_x)) { return CDHCPARTYvalues.perspharmacist; }
    if ("persphysician".equals(_x)) { return CDHCPARTYvalues.persphysician; }
    if ("perssocialworker".equals(_x)) { return CDHCPARTYvalues.perssocialworker; }
    if ("perstechnician".equals(_x)) { return CDHCPARTYvalues.perstechnician; }
    if ("persadministrative".equals(_x)) { return CDHCPARTYvalues.persadministrative; }
    if ("persmidwife".equals(_x)) { return CDHCPARTYvalues.persmidwife; }
    if ("ecaresafe".equals(_x)) { return CDHCPARTYvalues.ecaresafe; }
    if ("application".equals(_x)) { return CDHCPARTYvalues.application; }
    if ("hub".equals(_x)) { return CDHCPARTYvalues.hub; }
    if ("deptorthopedy".equals(_x)) { return CDHCPARTYvalues.deptorthopedy; }
    if ("deptalgology".equals(_x)) { return CDHCPARTYvalues.deptalgology; }
    if ("deptcardiacsurgery".equals(_x)) { return CDHCPARTYvalues.deptcardiacsurgery; }
    if ("depthandsurgery".equals(_x)) { return CDHCPARTYvalues.depthandsurgery; }
    if ("deptmaxillofacialsurgery".equals(_x)) { return CDHCPARTYvalues.deptmaxillofacialsurgery; }
    if ("deptpediatricsurgery".equals(_x)) { return CDHCPARTYvalues.deptpediatricsurgery; }
    if ("deptplasticandreparatorysurgery".equals(_x)) { return CDHCPARTYvalues.deptplasticandreparatorysurgery; }
    if ("deptthoracicsurgery".equals(_x)) { return CDHCPARTYvalues.deptthoracicsurgery; }
    if ("deptvascularsurgery".equals(_x)) { return CDHCPARTYvalues.deptvascularsurgery; }
    if ("deptvisceraldigestiveabdominalsurgery".equals(_x)) { return CDHCPARTYvalues.deptvisceraldigestiveabdominalsurgery; }
    if ("deptdentistry".equals(_x)) { return CDHCPARTYvalues.deptdentistry; }
    if ("deptdiabetology".equals(_x)) { return CDHCPARTYvalues.deptdiabetology; }
    if ("deptendocrinology".equals(_x)) { return CDHCPARTYvalues.deptendocrinology; }
    if ("deptoccupationaltherapy".equals(_x)) { return CDHCPARTYvalues.deptoccupationaltherapy; }
    if ("deptmajorburns".equals(_x)) { return CDHCPARTYvalues.deptmajorburns; }
    if ("deptinfectiousdisease".equals(_x)) { return CDHCPARTYvalues.deptinfectiousdisease; }
    if ("deptspeechtherapy".equals(_x)) { return CDHCPARTYvalues.deptspeechtherapy; }
    if ("deptsportsmedecine".equals(_x)) { return CDHCPARTYvalues.deptsportsmedecine; }
    if ("deptphysicalmedecine".equals(_x)) { return CDHCPARTYvalues.deptphysicalmedecine; }
    if ("depttropicalmedecine".equals(_x)) { return CDHCPARTYvalues.depttropicalmedecine; }
    if ("deptneurosurgery".equals(_x)) { return CDHCPARTYvalues.deptneurosurgery; }
    if ("deptnutritiondietetics".equals(_x)) { return CDHCPARTYvalues.deptnutritiondietetics; }
    if ("deptobstetrics".equals(_x)) { return CDHCPARTYvalues.deptobstetrics; }
    if ("deptchildandadolescentpsychiatry".equals(_x)) { return CDHCPARTYvalues.deptchildandadolescentpsychiatry; }
    if ("deptpodiatry".equals(_x)) { return CDHCPARTYvalues.deptpodiatry; }
    if ("deptpsychology".equals(_x)) { return CDHCPARTYvalues.deptpsychology; }
    if ("deptrevalidation".equals(_x)) { return CDHCPARTYvalues.deptrevalidation; }
    if ("deptsenology".equals(_x)) { return CDHCPARTYvalues.deptsenology; }
    if ("deptsocialservice".equals(_x)) { return CDHCPARTYvalues.deptsocialservice; }
    if ("deptpediatricintensivecare".equals(_x)) { return CDHCPARTYvalues.deptpediatricintensivecare; }
    if ("deptpalliativecare".equals(_x)) { return CDHCPARTYvalues.deptpalliativecare; }
    if ("depttoxicology".equals(_x)) { return CDHCPARTYvalues.depttoxicology; }
    if ("persambulancefirstaid".equals(_x)) { return CDHCPARTYvalues.persambulancefirstaid; }
    if ("persaudician".equals(_x)) { return CDHCPARTYvalues.persaudician; }
    if ("persaudiologist".equals(_x)) { return CDHCPARTYvalues.persaudiologist; }
    if ("perscaregiver".equals(_x)) { return CDHCPARTYvalues.perscaregiver; }
    if ("persdietician".equals(_x)) { return CDHCPARTYvalues.persdietician; }
    if ("perseducator".equals(_x)) { return CDHCPARTYvalues.perseducator; }
    if ("perslogopedist".equals(_x)) { return CDHCPARTYvalues.perslogopedist; }
    if ("persoccupationaltherapist".equals(_x)) { return CDHCPARTYvalues.persoccupationaltherapist; }
    if ("persorthopedist".equals(_x)) { return CDHCPARTYvalues.persorthopedist; }
    if ("persorthoptist".equals(_x)) { return CDHCPARTYvalues.persorthoptist; }
    if ("persoptician".equals(_x)) { return CDHCPARTYvalues.persoptician; }
    if ("perspharmacyassistant".equals(_x)) { return CDHCPARTYvalues.perspharmacyassistant; }
    if ("persphysiotherapist".equals(_x)) { return CDHCPARTYvalues.persphysiotherapist; }
    if ("perspodologist".equals(_x)) { return CDHCPARTYvalues.perspodologist; }
    if ("perspracticalnurse".equals(_x)) { return CDHCPARTYvalues.perspracticalnurse; }
    if ("perspsychologist".equals(_x)) { return CDHCPARTYvalues.perspsychologist; }
    if ("orgprimaryhealthcarecenter".equals(_x)) { return CDHCPARTYvalues.orgprimaryhealthcarecenter; }
    if ("guardpost".equals(_x)) { return CDHCPARTYvalues.guardpost; }
    if ("groupofphysicianssameaddress".equals(_x)) { return CDHCPARTYvalues.groupofphysicianssameaddress; }
    if ("groupofphysiciansdifferentaddress".equals(_x)) { return CDHCPARTYvalues.groupofphysiciansdifferentaddress; }
    if ("groupofnurses".equals(_x)) { return CDHCPARTYvalues.groupofnurses; }
    if ("certificateholder".equals(_x)) { return CDHCPARTYvalues.certificateholder; }
    if ("perstrussmaker".equals(_x)) { return CDHCPARTYvalues.perstrussmaker; }
    if ("patient".equals(_x)) { return CDHCPARTYvalues.patient; }
    if ("orgprevention".equals(_x)) { return CDHCPARTYvalues.orgprevention; }
    if ("persorthotist".equals(_x)) { return CDHCPARTYvalues.persorthotist; }
    if ("perspatientdriver".equals(_x)) { return CDHCPARTYvalues.perspatientdriver; }
    if ("perspharmacistclinicalbiologist".equals(_x)) { return CDHCPARTYvalues.perspharmacistclinicalbiologist; }
    if ("deptnursing".equals(_x)) { return CDHCPARTYvalues.deptnursing; }
    if ("persoraldentalhygienist".equals(_x)) { return CDHCPARTYvalues.persoraldentalhygienist; }
    if ("persclinicalpsychologist".equals(_x)) { return CDHCPARTYvalues.persclinicalpsychologist; }
    if ("persclinicalorthopedagogist".equals(_x)) { return CDHCPARTYvalues.persclinicalorthopedagogist; }
    if ("orgretirementhome".equals(_x)) { return CDHCPARTYvalues.orgretirementhome; }
    if ("orgrevalidationcenter".equals(_x)) { return CDHCPARTYvalues.orgrevalidationcenter; }
    if ("orgshelteredliving".equals(_x)) { return CDHCPARTYvalues.orgshelteredliving; }
    if ("orgpsychiatriccarehome".equals(_x)) { return CDHCPARTYvalues.orgpsychiatriccarehome; }
    if ("orgpolyclinic".equals(_x)) { return CDHCPARTYvalues.orgpolyclinic; }
    if ("persappliedpsychbachelor".equals(_x)) { return CDHCPARTYvalues.persappliedpsychbachelor; }
    if ("persfamilysciencebachelor".equals(_x)) { return CDHCPARTYvalues.persfamilysciencebachelor; }
    if ("persgerontologymaster".equals(_x)) { return CDHCPARTYvalues.persgerontologymaster; }
    if ("persorthopedagogistmaster".equals(_x)) { return CDHCPARTYvalues.persorthopedagogistmaster; }
    if ("perspsychomotortherapymaster".equals(_x)) { return CDHCPARTYvalues.perspsychomotortherapymaster; }
    if ("persreadaptationbachelor".equals(_x)) { return CDHCPARTYvalues.persreadaptationbachelor; }
    if ("perspedagogybachelor".equals(_x)) { return CDHCPARTYvalues.perspedagogybachelor; }
    if ("deptpsychogeriatry".equals(_x)) { return CDHCPARTYvalues.deptpsychogeriatry; }
    if ("deptabdpelvrehabandperinatalphysiotherapy".equals(_x)) { return CDHCPARTYvalues.deptabdpelvrehabandperinatalphysiotherapy; }
    if ("deptacutemedicine".equals(_x)) { return CDHCPARTYvalues.deptacutemedicine; }
    if ("deptadultpsychiatry".equals(_x)) { return CDHCPARTYvalues.deptadultpsychiatry; }
    if ("deptaestheticsurgery".equals(_x)) { return CDHCPARTYvalues.deptaestheticsurgery; }
    if ("deptanesthesiaandresuscitation".equals(_x)) { return CDHCPARTYvalues.deptanesthesiaandresuscitation; }
    if ("deptaudiology".equals(_x)) { return CDHCPARTYvalues.deptaudiology; }
    if ("deptcardiovascularphysiotherapy".equals(_x)) { return CDHCPARTYvalues.deptcardiovascularphysiotherapy; }
    if ("deptclinicalbiology".equals(_x)) { return CDHCPARTYvalues.deptclinicalbiology; }
    if ("deptclinicalgenetics".equals(_x)) { return CDHCPARTYvalues.deptclinicalgenetics; }
    if ("deptclinicalhematology".equals(_x)) { return CDHCPARTYvalues.deptclinicalhematology; }
    if ("deptclinicalinfectiology".equals(_x)) { return CDHCPARTYvalues.deptclinicalinfectiology; }
    if ("deptclinicalorthopedagogy".equals(_x)) { return CDHCPARTYvalues.deptclinicalorthopedagogy; }
    if ("deptclinicalpsychology".equals(_x)) { return CDHCPARTYvalues.deptclinicalpsychology; }
    if ("deptdermatovenereology".equals(_x)) { return CDHCPARTYvalues.deptdermatovenereology; }
    if ("deptdiabeticeducation".equals(_x)) { return CDHCPARTYvalues.deptdiabeticeducation; }
    if ("deptendocrinodiabetology".equals(_x)) { return CDHCPARTYvalues.deptendocrinodiabetology; }
    if ("deptforensicpsychiatry".equals(_x)) { return CDHCPARTYvalues.deptforensicpsychiatry; }
    if ("deptfunctionaldisabledrehabilitation".equals(_x)) { return CDHCPARTYvalues.deptfunctionaldisabledrehabilitation; }
    if ("deptgynecologyobstetrics".equals(_x)) { return CDHCPARTYvalues.deptgynecologyobstetrics; }
    if ("depthealthdatamanagement".equals(_x)) { return CDHCPARTYvalues.depthealthdatamanagement; }
    if ("depthearingaidfitting".equals(_x)) { return CDHCPARTYvalues.depthearingaidfitting; }
    if ("depthospitalpharmacy".equals(_x)) { return CDHCPARTYvalues.depthospitalpharmacy; }
    if ("deptinsurancemedicine".equals(_x)) { return CDHCPARTYvalues.deptinsurancemedicine; }
    if ("deptintensiveemergencycare".equals(_x)) { return CDHCPARTYvalues.deptintensiveemergencycare; }
    if ("deptinternalmedicine".equals(_x)) { return CDHCPARTYvalues.deptinternalmedicine; }
    if ("deptinvitronuclear".equals(_x)) { return CDHCPARTYvalues.deptinvitronuclear; }
    if ("deptlegalmedecine".equals(_x)) { return CDHCPARTYvalues.deptlegalmedecine; }
    if ("deptlogopedy".equals(_x)) { return CDHCPARTYvalues.deptlogopedy; }
    if ("deptmanualtherapy".equals(_x)) { return CDHCPARTYvalues.deptmanualtherapy; }
    if ("deptmedicalmicrobiology".equals(_x)) { return CDHCPARTYvalues.deptmedicalmicrobiology; }
    if ("deptneurologicalphysiotherapy".equals(_x)) { return CDHCPARTYvalues.deptneurologicalphysiotherapy; }
    if ("deptneuropsychiatry".equals(_x)) { return CDHCPARTYvalues.deptneuropsychiatry; }
    if ("deptnonsurgicalaestheticmedicine".equals(_x)) { return CDHCPARTYvalues.deptnonsurgicalaestheticmedicine; }
    if ("deptoccupationalmedicine".equals(_x)) { return CDHCPARTYvalues.deptoccupationalmedicine; }
    if ("deptorthodontics".equals(_x)) { return CDHCPARTYvalues.deptorthodontics; }
    if ("deptorthopticsoptometry".equals(_x)) { return CDHCPARTYvalues.deptorthopticsoptometry; }
    if ("deptpediatrichematologyoncology".equals(_x)) { return CDHCPARTYvalues.deptpediatrichematologyoncology; }
    if ("deptpediatricneurology".equals(_x)) { return CDHCPARTYvalues.deptpediatricneurology; }
    if ("deptpediatricphysiotherapy".equals(_x)) { return CDHCPARTYvalues.deptpediatricphysiotherapy; }
    if ("deptperiodontology".equals(_x)) { return CDHCPARTYvalues.deptperiodontology; }
    if ("deptperioperativecare".equals(_x)) { return CDHCPARTYvalues.deptperioperativecare; }
    if ("deptpodology".equals(_x)) { return CDHCPARTYvalues.deptpodology; }
    if ("deptradiotherapyoncology".equals(_x)) { return CDHCPARTYvalues.deptradiotherapyoncology; }
    if ("deptrespiratoryphysiotherapy".equals(_x)) { return CDHCPARTYvalues.deptrespiratoryphysiotherapy; }
    if ("persabdpelvrehabandperinatalphysiotherapist".equals(_x)) { return CDHCPARTYvalues.persabdpelvrehabandperinatalphysiotherapist; }
    if ("persadultpsychiatrist".equals(_x)) { return CDHCPARTYvalues.persadultpsychiatrist; }
    if ("persaestheticsurger".equals(_x)) { return CDHCPARTYvalues.persaestheticsurger; }
    if ("persambulancedriver".equals(_x)) { return CDHCPARTYvalues.persambulancedriver; }
    if ("persanathomopathologist".equals(_x)) { return CDHCPARTYvalues.persanathomopathologist; }
    if ("persanesthesistandresuscitation".equals(_x)) { return CDHCPARTYvalues.persanesthesistandresuscitation; }
    if ("perscardiologist".equals(_x)) { return CDHCPARTYvalues.perscardiologist; }
    if ("perscardiovascularphysiotherapist".equals(_x)) { return CDHCPARTYvalues.perscardiovascularphysiotherapist; }
    if ("perschildandadolescentpsychiatrist".equals(_x)) { return CDHCPARTYvalues.perschildandadolescentpsychiatrist; }
    if ("persclinialhematologist".equals(_x)) { return CDHCPARTYvalues.persclinialhematologist; }
    if ("persclinicalbiologist".equals(_x)) { return CDHCPARTYvalues.persclinicalbiologist; }
    if ("persclinicalinfectiologist".equals(_x)) { return CDHCPARTYvalues.persclinicalinfectiologist; }
    if ("persdentalhygienist".equals(_x)) { return CDHCPARTYvalues.persdentalhygienist; }
    if ("persdermatovenereologist".equals(_x)) { return CDHCPARTYvalues.persdermatovenereologist; }
    if ("persdiabeticeducator".equals(_x)) { return CDHCPARTYvalues.persdiabeticeducator; }
    if ("persdiabetologist".equals(_x)) { return CDHCPARTYvalues.persdiabetologist; }
    if ("persemergencyphycisian".equals(_x)) { return CDHCPARTYvalues.persemergencyphycisian; }
    if ("persendocrinodiabetologist".equals(_x)) { return CDHCPARTYvalues.persendocrinodiabetologist; }
    if ("persforensicpsychiatrust".equals(_x)) { return CDHCPARTYvalues.persforensicpsychiatrust; }
    if ("persgastroenterologist".equals(_x)) { return CDHCPARTYvalues.persgastroenterologist; }
    if ("persgeneralphysician".equals(_x)) { return CDHCPARTYvalues.persgeneralphysician; }
    if ("persgeriatrist".equals(_x)) { return CDHCPARTYvalues.persgeriatrist; }
    if ("pershealthdatamanagemer".equals(_x)) { return CDHCPARTYvalues.pershealthdatamanagemer; }
    if ("pershospitalpharmacist".equals(_x)) { return CDHCPARTYvalues.pershospitalpharmacist; }
    if ("persinsurancephysician".equals(_x)) { return CDHCPARTYvalues.persinsurancephysician; }
    if ("persinternalphysician".equals(_x)) { return CDHCPARTYvalues.persinternalphysician; }
    if ("perslabtechnologist".equals(_x)) { return CDHCPARTYvalues.perslabtechnologist; }
    if ("perslegalphysician".equals(_x)) { return CDHCPARTYvalues.perslegalphysician; }
    if ("persmanualtherapist".equals(_x)) { return CDHCPARTYvalues.persmanualtherapist; }
    if ("persmedicalimaging".equals(_x)) { return CDHCPARTYvalues.persmedicalimaging; }
    if ("persmedicalmicrobiologist".equals(_x)) { return CDHCPARTYvalues.persmedicalmicrobiologist; }
    if ("persneonatologist".equals(_x)) { return CDHCPARTYvalues.persneonatologist; }
    if ("persnephrologist".equals(_x)) { return CDHCPARTYvalues.persnephrologist; }
    if ("persneurologicalphysiotherapist".equals(_x)) { return CDHCPARTYvalues.persneurologicalphysiotherapist; }
    if ("persneurologist".equals(_x)) { return CDHCPARTYvalues.persneurologist; }
    if ("persneuropsychiatrist".equals(_x)) { return CDHCPARTYvalues.persneuropsychiatrist; }
    if ("persneurosurger".equals(_x)) { return CDHCPARTYvalues.persneurosurger; }
    if ("persnonsurgicalaestheticphysician".equals(_x)) { return CDHCPARTYvalues.persnonsurgicalaestheticphysician; }
    if ("persoccupationalphysician".equals(_x)) { return CDHCPARTYvalues.persoccupationalphysician; }
    if ("personcologist".equals(_x)) { return CDHCPARTYvalues.personcologist; }
    if ("persophthalmologist".equals(_x)) { return CDHCPARTYvalues.persophthalmologist; }
    if ("persoralmaxillofacialsurger".equals(_x)) { return CDHCPARTYvalues.persoralmaxillofacialsurger; }
    if ("persorthodontist".equals(_x)) { return CDHCPARTYvalues.persorthodontist; }
    if ("persotolaryngologist".equals(_x)) { return CDHCPARTYvalues.persotolaryngologist; }
    if ("perspediatrichematologistoncologist".equals(_x)) { return CDHCPARTYvalues.perspediatrichematologistoncologist; }
    if ("perspediatrician".equals(_x)) { return CDHCPARTYvalues.perspediatrician; }
    if ("perspediatricneurologist".equals(_x)) { return CDHCPARTYvalues.perspediatricneurologist; }
    if ("perspediatricphysiotherapist".equals(_x)) { return CDHCPARTYvalues.perspediatricphysiotherapist; }
    if ("persperiodontologist".equals(_x)) { return CDHCPARTYvalues.persperiodontologist; }
    if ("persphysicalphysician".equals(_x)) { return CDHCPARTYvalues.persphysicalphysician; }
    if ("perspneumologist".equals(_x)) { return CDHCPARTYvalues.perspneumologist; }
    if ("persprothesist".equals(_x)) { return CDHCPARTYvalues.persprothesist; }
    if ("perspsychatrist".equals(_x)) { return CDHCPARTYvalues.perspsychatrist; }
    if ("persrespiratoryphysiotherapist".equals(_x)) { return CDHCPARTYvalues.persrespiratoryphysiotherapist; }
    if ("persrheumatologist".equals(_x)) { return CDHCPARTYvalues.persrheumatologist; }
    if ("persstomatologist".equals(_x)) { return CDHCPARTYvalues.persstomatologist; }
    if ("perssurger".equals(_x)) { return CDHCPARTYvalues.perssurger; }
    if ("persurologist".equals(_x)) { return CDHCPARTYvalues.persurologist; }
    if ("persoptometrist".equals(_x)) { return CDHCPARTYvalues.persoptometrist; }
    if ("persmobilityimprover".equals(_x)) { return CDHCPARTYvalues.persmobilityimprover; }
    if ("persbandagistorthosiologist".equals(_x)) { return CDHCPARTYvalues.persbandagistorthosiologist; }
    if ("persprosthesiologist".equals(_x)) { return CDHCPARTYvalues.persprosthesiologist; }
    if ("persshoetechnologist".equals(_x)) { return CDHCPARTYvalues.persshoetechnologist; }
    if ("orgpharmacyinvoicingoffice".equals(_x)) { return CDHCPARTYvalues.orgpharmacyinvoicingoffice; }
    return null;
  }
}


enum CDHEADINGREGvalues { coronaryanatomy, chapter4, nonBiologic, bmi, primarykneeprocedure, approachtechnic, instrumentation, orthopedicanatomy, _interface, revisionplan, material, notifiedMaterial, notNotifiedMaterial, notNotifiedOrthoDevice, criteria, comorbidities, comorbiditiesinformation, results, resynchronisationinfo, crtp, infiltration, das28, haq, posology;

  public static CDHEADINGREGvalues parseCDHEADINGREGvalues(String _x) {
    if ("coronaryanatomy".equals(_x)) { return CDHEADINGREGvalues.coronaryanatomy; }
    if ("chapter4".equals(_x)) { return CDHEADINGREGvalues.chapter4; }
    if ("nonBiologic".equals(_x)) { return CDHEADINGREGvalues.nonBiologic; }
    if ("bmi".equals(_x)) { return CDHEADINGREGvalues.bmi; }
    if ("primarykneeprocedure".equals(_x)) { return CDHEADINGREGvalues.primarykneeprocedure; }
    if ("approachtechnic".equals(_x)) { return CDHEADINGREGvalues.approachtechnic; }
    if ("instrumentation".equals(_x)) { return CDHEADINGREGvalues.instrumentation; }
    if ("orthopedicanatomy".equals(_x)) { return CDHEADINGREGvalues.orthopedicanatomy; }
    if ("_interface".equals(_x)) { return CDHEADINGREGvalues._interface; }
    if ("revisionplan".equals(_x)) { return CDHEADINGREGvalues.revisionplan; }
    if ("material".equals(_x)) { return CDHEADINGREGvalues.material; }
    if ("notifiedMaterial".equals(_x)) { return CDHEADINGREGvalues.notifiedMaterial; }
    if ("notNotifiedMaterial".equals(_x)) { return CDHEADINGREGvalues.notNotifiedMaterial; }
    if ("notNotifiedOrthoDevice".equals(_x)) { return CDHEADINGREGvalues.notNotifiedOrthoDevice; }
    if ("criteria".equals(_x)) { return CDHEADINGREGvalues.criteria; }
    if ("comorbidities".equals(_x)) { return CDHEADINGREGvalues.comorbidities; }
    if ("comorbiditiesinformation".equals(_x)) { return CDHEADINGREGvalues.comorbiditiesinformation; }
    if ("results".equals(_x)) { return CDHEADINGREGvalues.results; }
    if ("resynchronisationinfo".equals(_x)) { return CDHEADINGREGvalues.resynchronisationinfo; }
    if ("crtp".equals(_x)) { return CDHEADINGREGvalues.crtp; }
    if ("infiltration".equals(_x)) { return CDHEADINGREGvalues.infiltration; }
    if ("das28".equals(_x)) { return CDHEADINGREGvalues.das28; }
    if ("haq".equals(_x)) { return CDHEADINGREGvalues.haq; }
    if ("posology".equals(_x)) { return CDHEADINGREGvalues.posology; }
    return null;
  }
}


enum CDHEADINGschemes { CDHEADING, CDHEADINGLAB, CDSITE, LOCAL, CDHEADINGREG;

  public static CDHEADINGschemes parseCDHEADINGschemes(String _x) {
    if ("CDHEADING".equals(_x)) { return CDHEADINGschemes.CDHEADING; }
    if ("CDHEADINGLAB".equals(_x)) { return CDHEADINGschemes.CDHEADINGLAB; }
    if ("CDSITE".equals(_x)) { return CDHEADINGschemes.CDSITE; }
    if ("LOCAL".equals(_x)) { return CDHEADINGschemes.LOCAL; }
    if ("CDHEADINGREG".equals(_x)) { return CDHEADINGschemes.CDHEADINGREG; }
    return null;
  }
}


enum CDHEADINGvalues { assessment, clinical, clinicalplan, subjective, technical, technicalplan, treatment, userdefined, history, familyhistory, prescription, medication, anamnesis, examination, plan, outcomeevaluation;

  public static CDHEADINGvalues parseCDHEADINGvalues(String _x) {
    if ("assessment".equals(_x)) { return CDHEADINGvalues.assessment; }
    if ("clinical".equals(_x)) { return CDHEADINGvalues.clinical; }
    if ("clinicalplan".equals(_x)) { return CDHEADINGvalues.clinicalplan; }
    if ("subjective".equals(_x)) { return CDHEADINGvalues.subjective; }
    if ("technical".equals(_x)) { return CDHEADINGvalues.technical; }
    if ("technicalplan".equals(_x)) { return CDHEADINGvalues.technicalplan; }
    if ("treatment".equals(_x)) { return CDHEADINGvalues.treatment; }
    if ("userdefined".equals(_x)) { return CDHEADINGvalues.userdefined; }
    if ("history".equals(_x)) { return CDHEADINGvalues.history; }
    if ("familyhistory".equals(_x)) { return CDHEADINGvalues.familyhistory; }
    if ("prescription".equals(_x)) { return CDHEADINGvalues.prescription; }
    if ("medication".equals(_x)) { return CDHEADINGvalues.medication; }
    if ("anamnesis".equals(_x)) { return CDHEADINGvalues.anamnesis; }
    if ("examination".equals(_x)) { return CDHEADINGvalues.examination; }
    if ("plan".equals(_x)) { return CDHEADINGvalues.plan; }
    if ("outcomeevaluation".equals(_x)) { return CDHEADINGvalues.outcomeevaluation; }
    return null;
  }
}


enum CDIMPLANTATIONDEVICEvalues { spacer, hipprosthesis, kneeprosthesis;

  public static CDIMPLANTATIONDEVICEvalues parseCDIMPLANTATIONDEVICEvalues(String _x) {
    if ("spacer".equals(_x)) { return CDIMPLANTATIONDEVICEvalues.spacer; }
    if ("hipprosthesis".equals(_x)) { return CDIMPLANTATIONDEVICEvalues.hipprosthesis; }
    if ("kneeprosthesis".equals(_x)) { return CDIMPLANTATIONDEVICEvalues.kneeprosthesis; }
    return null;
  }
}


enum CDIMPLANTATIONTYPEvalues { unimedial, unilateral, bicompartimental, femoropatellar, totalcr, totalps, totalcck, hinge, totaluc, other, totalprosthesis, totalprosthesisdualmobility, hemiprosthesismonoblock, hemiprosthesisbipolar, bicruciateretaining, hemiprosthesismodular, resurfacingfemhemi, resurfacingfemcup, resurfacingpartial, resurfacingpartialfemcondyle;

  public static CDIMPLANTATIONTYPEvalues parseCDIMPLANTATIONTYPEvalues(String _x) {
    if ("unimedial".equals(_x)) { return CDIMPLANTATIONTYPEvalues.unimedial; }
    if ("unilateral".equals(_x)) { return CDIMPLANTATIONTYPEvalues.unilateral; }
    if ("bicompartimental".equals(_x)) { return CDIMPLANTATIONTYPEvalues.bicompartimental; }
    if ("femoropatellar".equals(_x)) { return CDIMPLANTATIONTYPEvalues.femoropatellar; }
    if ("totalcr".equals(_x)) { return CDIMPLANTATIONTYPEvalues.totalcr; }
    if ("totalps".equals(_x)) { return CDIMPLANTATIONTYPEvalues.totalps; }
    if ("totalcck".equals(_x)) { return CDIMPLANTATIONTYPEvalues.totalcck; }
    if ("hinge".equals(_x)) { return CDIMPLANTATIONTYPEvalues.hinge; }
    if ("totaluc".equals(_x)) { return CDIMPLANTATIONTYPEvalues.totaluc; }
    if ("other".equals(_x)) { return CDIMPLANTATIONTYPEvalues.other; }
    if ("totalprosthesis".equals(_x)) { return CDIMPLANTATIONTYPEvalues.totalprosthesis; }
    if ("totalprosthesisdualmobility".equals(_x)) { return CDIMPLANTATIONTYPEvalues.totalprosthesisdualmobility; }
    if ("hemiprosthesismonoblock".equals(_x)) { return CDIMPLANTATIONTYPEvalues.hemiprosthesismonoblock; }
    if ("hemiprosthesisbipolar".equals(_x)) { return CDIMPLANTATIONTYPEvalues.hemiprosthesisbipolar; }
    if ("bicruciateretaining".equals(_x)) { return CDIMPLANTATIONTYPEvalues.bicruciateretaining; }
    if ("hemiprosthesismodular".equals(_x)) { return CDIMPLANTATIONTYPEvalues.hemiprosthesismodular; }
    if ("resurfacingfemhemi".equals(_x)) { return CDIMPLANTATIONTYPEvalues.resurfacingfemhemi; }
    if ("resurfacingfemcup".equals(_x)) { return CDIMPLANTATIONTYPEvalues.resurfacingfemcup; }
    if ("resurfacingpartial".equals(_x)) { return CDIMPLANTATIONTYPEvalues.resurfacingpartial; }
    if ("resurfacingpartialfemcondyle".equals(_x)) { return CDIMPLANTATIONTYPEvalues.resurfacingpartialfemcondyle; }
    return null;
  }
}


enum CDINCAPACITYREASONvalues { sickness, accident, family, other, careencounter, illness, hospitalisation, pregnancy, workaccident, occupationaldisease, traveltofromworkaccident;

  public static CDINCAPACITYREASONvalues parseCDINCAPACITYREASONvalues(String _x) {
    if ("sickness".equals(_x)) { return CDINCAPACITYREASONvalues.sickness; }
    if ("accident".equals(_x)) { return CDINCAPACITYREASONvalues.accident; }
    if ("family".equals(_x)) { return CDINCAPACITYREASONvalues.family; }
    if ("other".equals(_x)) { return CDINCAPACITYREASONvalues.other; }
    if ("careencounter".equals(_x)) { return CDINCAPACITYREASONvalues.careencounter; }
    if ("illness".equals(_x)) { return CDINCAPACITYREASONvalues.illness; }
    if ("hospitalisation".equals(_x)) { return CDINCAPACITYREASONvalues.hospitalisation; }
    if ("pregnancy".equals(_x)) { return CDINCAPACITYREASONvalues.pregnancy; }
    if ("workaccident".equals(_x)) { return CDINCAPACITYREASONvalues.workaccident; }
    if ("occupationaldisease".equals(_x)) { return CDINCAPACITYREASONvalues.occupationaldisease; }
    if ("traveltofromworkaccident".equals(_x)) { return CDINCAPACITYREASONvalues.traveltofromworkaccident; }
    return null;
  }
}


enum CDINCAPACITYvalues { work, swim, sport, school, schoolsports, travel, vote, heavyphysicalactivity;

  public static CDINCAPACITYvalues parseCDINCAPACITYvalues(String _x) {
    if ("work".equals(_x)) { return CDINCAPACITYvalues.work; }
    if ("swim".equals(_x)) { return CDINCAPACITYvalues.swim; }
    if ("sport".equals(_x)) { return CDINCAPACITYvalues.sport; }
    if ("school".equals(_x)) { return CDINCAPACITYvalues.school; }
    if ("schoolsports".equals(_x)) { return CDINCAPACITYvalues.schoolsports; }
    if ("travel".equals(_x)) { return CDINCAPACITYvalues.travel; }
    if ("vote".equals(_x)) { return CDINCAPACITYvalues.vote; }
    if ("heavyphysicalactivity".equals(_x)) { return CDINCAPACITYvalues.heavyphysicalactivity; }
    return null;
  }
}


enum CDINNCLUSTERschemes { CDINNCLUSTER, CDVMPGROUP;

  public static CDINNCLUSTERschemes parseCDINNCLUSTERschemes(String _x) {
    if ("CDINNCLUSTER".equals(_x)) { return CDINNCLUSTERschemes.CDINNCLUSTER; }
    if ("CDVMPGROUP".equals(_x)) { return CDINNCLUSTERschemes.CDVMPGROUP; }
    return null;
  }
}


enum CDITEMBVTvalues { referenceid, patientopposition, sample, biopsynumber, technicalremarks, lab, error, status;

  public static CDITEMBVTvalues parseCDITEMBVTvalues(String _x) {
    if ("referenceid".equals(_x)) { return CDITEMBVTvalues.referenceid; }
    if ("patientopposition".equals(_x)) { return CDITEMBVTvalues.patientopposition; }
    if ("sample".equals(_x)) { return CDITEMBVTvalues.sample; }
    if ("biopsynumber".equals(_x)) { return CDITEMBVTvalues.biopsynumber; }
    if ("technicalremarks".equals(_x)) { return CDITEMBVTvalues.technicalremarks; }
    if ("lab".equals(_x)) { return CDITEMBVTvalues.lab; }
    if ("error".equals(_x)) { return CDITEMBVTvalues.error; }
    if ("status".equals(_x)) { return CDITEMBVTvalues.status; }
    return null;
  }
}


enum CDITEMCARENETvalues { accidenttype, advisingphysician, agreement, authorisedextensionenddatetime, begindatetime, billingdestinationnumber, insurancydetails, insurancystatus, messagenumber, messagetype, missingdocument, mutationbegindatetime, mutationdestination, nationalinsurance, otheradmission, protectionmeasure, refusalreason, requestedextensiondatetime, requestedextensionenddatetime, siscardadjustment, siscarderror, socialcategory;

  public static CDITEMCARENETvalues parseCDITEMCARENETvalues(String _x) {
    if ("accidenttype".equals(_x)) { return CDITEMCARENETvalues.accidenttype; }
    if ("advisingphysician".equals(_x)) { return CDITEMCARENETvalues.advisingphysician; }
    if ("agreement".equals(_x)) { return CDITEMCARENETvalues.agreement; }
    if ("authorisedextensionenddatetime".equals(_x)) { return CDITEMCARENETvalues.authorisedextensionenddatetime; }
    if ("begindatetime".equals(_x)) { return CDITEMCARENETvalues.begindatetime; }
    if ("billingdestinationnumber".equals(_x)) { return CDITEMCARENETvalues.billingdestinationnumber; }
    if ("insurancydetails".equals(_x)) { return CDITEMCARENETvalues.insurancydetails; }
    if ("insurancystatus".equals(_x)) { return CDITEMCARENETvalues.insurancystatus; }
    if ("messagenumber".equals(_x)) { return CDITEMCARENETvalues.messagenumber; }
    if ("messagetype".equals(_x)) { return CDITEMCARENETvalues.messagetype; }
    if ("missingdocument".equals(_x)) { return CDITEMCARENETvalues.missingdocument; }
    if ("mutationbegindatetime".equals(_x)) { return CDITEMCARENETvalues.mutationbegindatetime; }
    if ("mutationdestination".equals(_x)) { return CDITEMCARENETvalues.mutationdestination; }
    if ("nationalinsurance".equals(_x)) { return CDITEMCARENETvalues.nationalinsurance; }
    if ("otheradmission".equals(_x)) { return CDITEMCARENETvalues.otheradmission; }
    if ("protectionmeasure".equals(_x)) { return CDITEMCARENETvalues.protectionmeasure; }
    if ("refusalreason".equals(_x)) { return CDITEMCARENETvalues.refusalreason; }
    if ("requestedextensiondatetime".equals(_x)) { return CDITEMCARENETvalues.requestedextensiondatetime; }
    if ("requestedextensionenddatetime".equals(_x)) { return CDITEMCARENETvalues.requestedextensionenddatetime; }
    if ("siscardadjustment".equals(_x)) { return CDITEMCARENETvalues.siscardadjustment; }
    if ("siscarderror".equals(_x)) { return CDITEMCARENETvalues.siscarderror; }
    if ("socialcategory".equals(_x)) { return CDITEMCARENETvalues.socialcategory; }
    return null;
  }
}


enum CDITEMEBIRTHvalues { multiparity, samesex, stillborn, birthplace, birthrank, partusnumber, beforepregnancyweight, atdeliveryweight, height, previouschildbirth, previousbornalive, lastbabybirthdate, intermediatestillborndelivery, previouscaesarean, parity, pregnancyorigin, hypertensiondiagnose, diabetesdiagnose, HIVdiagnose, pregnancyduration, childposition, inductiondelivery, epiduralanalgesia, rachianalagesia, foetalmonitoring, streptococcusbcolonization, intrapartalsbgprophylaxis, deliveryway, episiotomy, caesareanindication, breastfeeding, atbirthweight, apgarscore1, apgarscore5, artificialrespiration, neonataldept, congenitalmalformation, othermedicalrisk;

  public static CDITEMEBIRTHvalues parseCDITEMEBIRTHvalues(String _x) {
    if ("multiparity".equals(_x)) { return CDITEMEBIRTHvalues.multiparity; }
    if ("samesex".equals(_x)) { return CDITEMEBIRTHvalues.samesex; }
    if ("stillborn".equals(_x)) { return CDITEMEBIRTHvalues.stillborn; }
    if ("birthplace".equals(_x)) { return CDITEMEBIRTHvalues.birthplace; }
    if ("birthrank".equals(_x)) { return CDITEMEBIRTHvalues.birthrank; }
    if ("partusnumber".equals(_x)) { return CDITEMEBIRTHvalues.partusnumber; }
    if ("beforepregnancyweight".equals(_x)) { return CDITEMEBIRTHvalues.beforepregnancyweight; }
    if ("atdeliveryweight".equals(_x)) { return CDITEMEBIRTHvalues.atdeliveryweight; }
    if ("height".equals(_x)) { return CDITEMEBIRTHvalues.height; }
    if ("previouschildbirth".equals(_x)) { return CDITEMEBIRTHvalues.previouschildbirth; }
    if ("previousbornalive".equals(_x)) { return CDITEMEBIRTHvalues.previousbornalive; }
    if ("lastbabybirthdate".equals(_x)) { return CDITEMEBIRTHvalues.lastbabybirthdate; }
    if ("intermediatestillborndelivery".equals(_x)) { return CDITEMEBIRTHvalues.intermediatestillborndelivery; }
    if ("previouscaesarean".equals(_x)) { return CDITEMEBIRTHvalues.previouscaesarean; }
    if ("parity".equals(_x)) { return CDITEMEBIRTHvalues.parity; }
    if ("pregnancyorigin".equals(_x)) { return CDITEMEBIRTHvalues.pregnancyorigin; }
    if ("hypertensiondiagnose".equals(_x)) { return CDITEMEBIRTHvalues.hypertensiondiagnose; }
    if ("diabetesdiagnose".equals(_x)) { return CDITEMEBIRTHvalues.diabetesdiagnose; }
    if ("HIVdiagnose".equals(_x)) { return CDITEMEBIRTHvalues.HIVdiagnose; }
    if ("pregnancyduration".equals(_x)) { return CDITEMEBIRTHvalues.pregnancyduration; }
    if ("childposition".equals(_x)) { return CDITEMEBIRTHvalues.childposition; }
    if ("inductiondelivery".equals(_x)) { return CDITEMEBIRTHvalues.inductiondelivery; }
    if ("epiduralanalgesia".equals(_x)) { return CDITEMEBIRTHvalues.epiduralanalgesia; }
    if ("rachianalagesia".equals(_x)) { return CDITEMEBIRTHvalues.rachianalagesia; }
    if ("foetalmonitoring".equals(_x)) { return CDITEMEBIRTHvalues.foetalmonitoring; }
    if ("streptococcusbcolonization".equals(_x)) { return CDITEMEBIRTHvalues.streptococcusbcolonization; }
    if ("intrapartalsbgprophylaxis".equals(_x)) { return CDITEMEBIRTHvalues.intrapartalsbgprophylaxis; }
    if ("deliveryway".equals(_x)) { return CDITEMEBIRTHvalues.deliveryway; }
    if ("episiotomy".equals(_x)) { return CDITEMEBIRTHvalues.episiotomy; }
    if ("caesareanindication".equals(_x)) { return CDITEMEBIRTHvalues.caesareanindication; }
    if ("breastfeeding".equals(_x)) { return CDITEMEBIRTHvalues.breastfeeding; }
    if ("atbirthweight".equals(_x)) { return CDITEMEBIRTHvalues.atbirthweight; }
    if ("apgarscore1".equals(_x)) { return CDITEMEBIRTHvalues.apgarscore1; }
    if ("apgarscore5".equals(_x)) { return CDITEMEBIRTHvalues.apgarscore5; }
    if ("artificialrespiration".equals(_x)) { return CDITEMEBIRTHvalues.artificialrespiration; }
    if ("neonataldept".equals(_x)) { return CDITEMEBIRTHvalues.neonataldept; }
    if ("congenitalmalformation".equals(_x)) { return CDITEMEBIRTHvalues.congenitalmalformation; }
    if ("othermedicalrisk".equals(_x)) { return CDITEMEBIRTHvalues.othermedicalrisk; }
    return null;
  }
}


enum CDITEMMAAvalues { agreementtype, requesttype, responsetype, agreementstartdate, agreementenddate, consultationstartdate, consultationenddate, careproviderreference, iorequestreference, decisionreference, refusaljustification, chapter4reference, chapter4annexreference, unitnumber, strength, restunitnumber, reststrength, orphandrugdeliveryplace, orphandrugdeliveryid, coveragetype;

  public static CDITEMMAAvalues parseCDITEMMAAvalues(String _x) {
    if ("agreementtype".equals(_x)) { return CDITEMMAAvalues.agreementtype; }
    if ("requesttype".equals(_x)) { return CDITEMMAAvalues.requesttype; }
    if ("responsetype".equals(_x)) { return CDITEMMAAvalues.responsetype; }
    if ("agreementstartdate".equals(_x)) { return CDITEMMAAvalues.agreementstartdate; }
    if ("agreementenddate".equals(_x)) { return CDITEMMAAvalues.agreementenddate; }
    if ("consultationstartdate".equals(_x)) { return CDITEMMAAvalues.consultationstartdate; }
    if ("consultationenddate".equals(_x)) { return CDITEMMAAvalues.consultationenddate; }
    if ("careproviderreference".equals(_x)) { return CDITEMMAAvalues.careproviderreference; }
    if ("iorequestreference".equals(_x)) { return CDITEMMAAvalues.iorequestreference; }
    if ("decisionreference".equals(_x)) { return CDITEMMAAvalues.decisionreference; }
    if ("refusaljustification".equals(_x)) { return CDITEMMAAvalues.refusaljustification; }
    if ("chapter4reference".equals(_x)) { return CDITEMMAAvalues.chapter4reference; }
    if ("chapter4annexreference".equals(_x)) { return CDITEMMAAvalues.chapter4annexreference; }
    if ("unitnumber".equals(_x)) { return CDITEMMAAvalues.unitnumber; }
    if ("strength".equals(_x)) { return CDITEMMAAvalues.strength; }
    if ("restunitnumber".equals(_x)) { return CDITEMMAAvalues.restunitnumber; }
    if ("reststrength".equals(_x)) { return CDITEMMAAvalues.reststrength; }
    if ("orphandrugdeliveryplace".equals(_x)) { return CDITEMMAAvalues.orphandrugdeliveryplace; }
    if ("orphandrugdeliveryid".equals(_x)) { return CDITEMMAAvalues.orphandrugdeliveryid; }
    if ("coveragetype".equals(_x)) { return CDITEMMAAvalues.coveragetype; }
    return null;
  }
}


enum CDITEMMSvalues { origin, adaptationflag, medicationuse, medicationtype, begincondition, endcondition;

  public static CDITEMMSvalues parseCDITEMMSvalues(String _x) {
    if ("origin".equals(_x)) { return CDITEMMSvalues.origin; }
    if ("adaptationflag".equals(_x)) { return CDITEMMSvalues.adaptationflag; }
    if ("medicationuse".equals(_x)) { return CDITEMMSvalues.medicationuse; }
    if ("medicationtype".equals(_x)) { return CDITEMMSvalues.medicationtype; }
    if ("begincondition".equals(_x)) { return CDITEMMSvalues.begincondition; }
    if ("endcondition".equals(_x)) { return CDITEMMSvalues.endcondition; }
    return null;
  }
}


enum CDITEMMYCARENETvalues { fee, financialcontract, patientfee, payment, reimbursement, refusal, patientpaid, supplement, paymentreceivingparty, internship, documentidentity, invoicingnumber, reimbursementFpssi, reimbursementPswc, umc, mediprimanumber, pswc, treatmentreason, agreementenddate, agreementstartdate, agreementtype, consultationenddate, consultationstartdate, authorisationtype, decisionreference, orphandrugdeliveryplace, refusaljustification, reststrength, restunitnumber, legalbasis, legalunitnumber, legalstrength, istrialperiod, closurejustification;

  public static CDITEMMYCARENETvalues parseCDITEMMYCARENETvalues(String _x) {
    if ("fee".equals(_x)) { return CDITEMMYCARENETvalues.fee; }
    if ("financialcontract".equals(_x)) { return CDITEMMYCARENETvalues.financialcontract; }
    if ("patientfee".equals(_x)) { return CDITEMMYCARENETvalues.patientfee; }
    if ("payment".equals(_x)) { return CDITEMMYCARENETvalues.payment; }
    if ("reimbursement".equals(_x)) { return CDITEMMYCARENETvalues.reimbursement; }
    if ("refusal".equals(_x)) { return CDITEMMYCARENETvalues.refusal; }
    if ("patientpaid".equals(_x)) { return CDITEMMYCARENETvalues.patientpaid; }
    if ("supplement".equals(_x)) { return CDITEMMYCARENETvalues.supplement; }
    if ("paymentreceivingparty".equals(_x)) { return CDITEMMYCARENETvalues.paymentreceivingparty; }
    if ("internship".equals(_x)) { return CDITEMMYCARENETvalues.internship; }
    if ("documentidentity".equals(_x)) { return CDITEMMYCARENETvalues.documentidentity; }
    if ("invoicingnumber".equals(_x)) { return CDITEMMYCARENETvalues.invoicingnumber; }
    if ("reimbursementFpssi".equals(_x)) { return CDITEMMYCARENETvalues.reimbursementFpssi; }
    if ("reimbursementPswc".equals(_x)) { return CDITEMMYCARENETvalues.reimbursementPswc; }
    if ("umc".equals(_x)) { return CDITEMMYCARENETvalues.umc; }
    if ("mediprimanumber".equals(_x)) { return CDITEMMYCARENETvalues.mediprimanumber; }
    if ("pswc".equals(_x)) { return CDITEMMYCARENETvalues.pswc; }
    if ("treatmentreason".equals(_x)) { return CDITEMMYCARENETvalues.treatmentreason; }
    if ("agreementenddate".equals(_x)) { return CDITEMMYCARENETvalues.agreementenddate; }
    if ("agreementstartdate".equals(_x)) { return CDITEMMYCARENETvalues.agreementstartdate; }
    if ("agreementtype".equals(_x)) { return CDITEMMYCARENETvalues.agreementtype; }
    if ("consultationenddate".equals(_x)) { return CDITEMMYCARENETvalues.consultationenddate; }
    if ("consultationstartdate".equals(_x)) { return CDITEMMYCARENETvalues.consultationstartdate; }
    if ("authorisationtype".equals(_x)) { return CDITEMMYCARENETvalues.authorisationtype; }
    if ("decisionreference".equals(_x)) { return CDITEMMYCARENETvalues.decisionreference; }
    if ("orphandrugdeliveryplace".equals(_x)) { return CDITEMMYCARENETvalues.orphandrugdeliveryplace; }
    if ("refusaljustification".equals(_x)) { return CDITEMMYCARENETvalues.refusaljustification; }
    if ("reststrength".equals(_x)) { return CDITEMMYCARENETvalues.reststrength; }
    if ("restunitnumber".equals(_x)) { return CDITEMMYCARENETvalues.restunitnumber; }
    if ("legalbasis".equals(_x)) { return CDITEMMYCARENETvalues.legalbasis; }
    if ("legalunitnumber".equals(_x)) { return CDITEMMYCARENETvalues.legalunitnumber; }
    if ("legalstrength".equals(_x)) { return CDITEMMYCARENETvalues.legalstrength; }
    if ("istrialperiod".equals(_x)) { return CDITEMMYCARENETvalues.istrialperiod; }
    if ("closurejustification".equals(_x)) { return CDITEMMYCARENETvalues.closurejustification; }
    return null;
  }
}


enum CDITEMREGvalues { isinitialintervention, dominance, existingbridge, observedlesion, segment, totaltreatedlength, bloodvesseldiameter, procedureDevice, contrastproductused, reimbursementnomenclaturetype, interventionType, interventionSite, approach, navigationcomputer, interventionDevice, bearingsurface, graftused, acetabularinterface, femoralinterface, stem, cup, head, neck, insert, prosthesisOther, brand, producer, size, revisiontechnic, kneeimplanttype, kneeinsert, tibialinterface, patellarinterface, patella, femur, tibia, tickness, kneeprosthesis, revisioncomponent, doctorsremark, resynchronisation, pacingindication, issecondoperator, postpcitimi, poststenosis, infiltration, operationType, alignment, custominstrumentation, substitute, modularneck, materialsremark, orthoDevice, devicename, distributor, manufacturer, femoralreplacement, acetabularreplacement, revisedcomponent, cardioversion, motivation, criteriacomments, comorbiditiescomments, informationprimo, lvef, qrs, diameter, cardiacasynchrony, indication, registrationType, declarationdas28, declarationhaq, declarationinfiltration, declarationmedication, substance, medicationstopinfo, chapter4, dosis, frequency, route;

  public static CDITEMREGvalues parseCDITEMREGvalues(String _x) {
    if ("isinitialintervention".equals(_x)) { return CDITEMREGvalues.isinitialintervention; }
    if ("dominance".equals(_x)) { return CDITEMREGvalues.dominance; }
    if ("existingbridge".equals(_x)) { return CDITEMREGvalues.existingbridge; }
    if ("observedlesion".equals(_x)) { return CDITEMREGvalues.observedlesion; }
    if ("segment".equals(_x)) { return CDITEMREGvalues.segment; }
    if ("totaltreatedlength".equals(_x)) { return CDITEMREGvalues.totaltreatedlength; }
    if ("bloodvesseldiameter".equals(_x)) { return CDITEMREGvalues.bloodvesseldiameter; }
    if ("procedureDevice".equals(_x)) { return CDITEMREGvalues.procedureDevice; }
    if ("contrastproductused".equals(_x)) { return CDITEMREGvalues.contrastproductused; }
    if ("reimbursementnomenclaturetype".equals(_x)) { return CDITEMREGvalues.reimbursementnomenclaturetype; }
    if ("interventionType".equals(_x)) { return CDITEMREGvalues.interventionType; }
    if ("interventionSite".equals(_x)) { return CDITEMREGvalues.interventionSite; }
    if ("approach".equals(_x)) { return CDITEMREGvalues.approach; }
    if ("navigationcomputer".equals(_x)) { return CDITEMREGvalues.navigationcomputer; }
    if ("interventionDevice".equals(_x)) { return CDITEMREGvalues.interventionDevice; }
    if ("bearingsurface".equals(_x)) { return CDITEMREGvalues.bearingsurface; }
    if ("graftused".equals(_x)) { return CDITEMREGvalues.graftused; }
    if ("acetabularinterface".equals(_x)) { return CDITEMREGvalues.acetabularinterface; }
    if ("femoralinterface".equals(_x)) { return CDITEMREGvalues.femoralinterface; }
    if ("stem".equals(_x)) { return CDITEMREGvalues.stem; }
    if ("cup".equals(_x)) { return CDITEMREGvalues.cup; }
    if ("head".equals(_x)) { return CDITEMREGvalues.head; }
    if ("neck".equals(_x)) { return CDITEMREGvalues.neck; }
    if ("insert".equals(_x)) { return CDITEMREGvalues.insert; }
    if ("prosthesisOther".equals(_x)) { return CDITEMREGvalues.prosthesisOther; }
    if ("brand".equals(_x)) { return CDITEMREGvalues.brand; }
    if ("producer".equals(_x)) { return CDITEMREGvalues.producer; }
    if ("size".equals(_x)) { return CDITEMREGvalues.size; }
    if ("revisiontechnic".equals(_x)) { return CDITEMREGvalues.revisiontechnic; }
    if ("kneeimplanttype".equals(_x)) { return CDITEMREGvalues.kneeimplanttype; }
    if ("kneeinsert".equals(_x)) { return CDITEMREGvalues.kneeinsert; }
    if ("tibialinterface".equals(_x)) { return CDITEMREGvalues.tibialinterface; }
    if ("patellarinterface".equals(_x)) { return CDITEMREGvalues.patellarinterface; }
    if ("patella".equals(_x)) { return CDITEMREGvalues.patella; }
    if ("femur".equals(_x)) { return CDITEMREGvalues.femur; }
    if ("tibia".equals(_x)) { return CDITEMREGvalues.tibia; }
    if ("tickness".equals(_x)) { return CDITEMREGvalues.tickness; }
    if ("kneeprosthesis".equals(_x)) { return CDITEMREGvalues.kneeprosthesis; }
    if ("revisioncomponent".equals(_x)) { return CDITEMREGvalues.revisioncomponent; }
    if ("doctorsremark".equals(_x)) { return CDITEMREGvalues.doctorsremark; }
    if ("resynchronisation".equals(_x)) { return CDITEMREGvalues.resynchronisation; }
    if ("pacingindication".equals(_x)) { return CDITEMREGvalues.pacingindication; }
    if ("issecondoperator".equals(_x)) { return CDITEMREGvalues.issecondoperator; }
    if ("postpcitimi".equals(_x)) { return CDITEMREGvalues.postpcitimi; }
    if ("poststenosis".equals(_x)) { return CDITEMREGvalues.poststenosis; }
    if ("infiltration".equals(_x)) { return CDITEMREGvalues.infiltration; }
    if ("operationType".equals(_x)) { return CDITEMREGvalues.operationType; }
    if ("alignment".equals(_x)) { return CDITEMREGvalues.alignment; }
    if ("custominstrumentation".equals(_x)) { return CDITEMREGvalues.custominstrumentation; }
    if ("substitute".equals(_x)) { return CDITEMREGvalues.substitute; }
    if ("modularneck".equals(_x)) { return CDITEMREGvalues.modularneck; }
    if ("materialsremark".equals(_x)) { return CDITEMREGvalues.materialsremark; }
    if ("orthoDevice".equals(_x)) { return CDITEMREGvalues.orthoDevice; }
    if ("devicename".equals(_x)) { return CDITEMREGvalues.devicename; }
    if ("distributor".equals(_x)) { return CDITEMREGvalues.distributor; }
    if ("manufacturer".equals(_x)) { return CDITEMREGvalues.manufacturer; }
    if ("femoralreplacement".equals(_x)) { return CDITEMREGvalues.femoralreplacement; }
    if ("acetabularreplacement".equals(_x)) { return CDITEMREGvalues.acetabularreplacement; }
    if ("revisedcomponent".equals(_x)) { return CDITEMREGvalues.revisedcomponent; }
    if ("cardioversion".equals(_x)) { return CDITEMREGvalues.cardioversion; }
    if ("motivation".equals(_x)) { return CDITEMREGvalues.motivation; }
    if ("criteriacomments".equals(_x)) { return CDITEMREGvalues.criteriacomments; }
    if ("comorbiditiescomments".equals(_x)) { return CDITEMREGvalues.comorbiditiescomments; }
    if ("informationprimo".equals(_x)) { return CDITEMREGvalues.informationprimo; }
    if ("lvef".equals(_x)) { return CDITEMREGvalues.lvef; }
    if ("qrs".equals(_x)) { return CDITEMREGvalues.qrs; }
    if ("diameter".equals(_x)) { return CDITEMREGvalues.diameter; }
    if ("cardiacasynchrony".equals(_x)) { return CDITEMREGvalues.cardiacasynchrony; }
    if ("indication".equals(_x)) { return CDITEMREGvalues.indication; }
    if ("registrationType".equals(_x)) { return CDITEMREGvalues.registrationType; }
    if ("declarationdas28".equals(_x)) { return CDITEMREGvalues.declarationdas28; }
    if ("declarationhaq".equals(_x)) { return CDITEMREGvalues.declarationhaq; }
    if ("declarationinfiltration".equals(_x)) { return CDITEMREGvalues.declarationinfiltration; }
    if ("declarationmedication".equals(_x)) { return CDITEMREGvalues.declarationmedication; }
    if ("substance".equals(_x)) { return CDITEMREGvalues.substance; }
    if ("medicationstopinfo".equals(_x)) { return CDITEMREGvalues.medicationstopinfo; }
    if ("chapter4".equals(_x)) { return CDITEMREGvalues.chapter4; }
    if ("dosis".equals(_x)) { return CDITEMREGvalues.dosis; }
    if ("frequency".equals(_x)) { return CDITEMREGvalues.frequency; }
    if ("route".equals(_x)) { return CDITEMREGvalues.route; }
    return null;
  }
}


enum CDITEMschemes { CDITEM, CDITEMMAA, CDITEMCARENET, CDLAB, CDTECHNICAL, CDCONTACTPERSON, ICD, ICPC, LOCAL, CDVACCINE, CDECG, CDECARECLINICAL, CDECARELAB, CDECAREHAQ, CDITEMEBIRTH, CDPARAMETER, CDITEMBVT, CDBVTAVAILABLEMATERIALS, CDBVTCONSERVATIONDELAY, CDBVTCONSERVATIONMODE, CDBVTSAMPLETYPE, CDBCRDIFFERENTATIONDEGREE, CDBVTLATERALITY, CDBVTPATIENTOPPOSITION, CDBVTSTATUS, CDITEMREG, CDITEMMYCARENET, CDDEFIBDIAGNOSIS, CDACTSNURSING, CDQERMIDINTERVENTIONTYPE;

  public static CDITEMschemes parseCDITEMschemes(String _x) {
    if ("CDITEM".equals(_x)) { return CDITEMschemes.CDITEM; }
    if ("CDITEMMAA".equals(_x)) { return CDITEMschemes.CDITEMMAA; }
    if ("CDITEMCARENET".equals(_x)) { return CDITEMschemes.CDITEMCARENET; }
    if ("CDLAB".equals(_x)) { return CDITEMschemes.CDLAB; }
    if ("CDTECHNICAL".equals(_x)) { return CDITEMschemes.CDTECHNICAL; }
    if ("CDCONTACTPERSON".equals(_x)) { return CDITEMschemes.CDCONTACTPERSON; }
    if ("ICD".equals(_x)) { return CDITEMschemes.ICD; }
    if ("ICPC".equals(_x)) { return CDITEMschemes.ICPC; }
    if ("LOCAL".equals(_x)) { return CDITEMschemes.LOCAL; }
    if ("CDVACCINE".equals(_x)) { return CDITEMschemes.CDVACCINE; }
    if ("CDECG".equals(_x)) { return CDITEMschemes.CDECG; }
    if ("CDECARECLINICAL".equals(_x)) { return CDITEMschemes.CDECARECLINICAL; }
    if ("CDECARELAB".equals(_x)) { return CDITEMschemes.CDECARELAB; }
    if ("CDECAREHAQ".equals(_x)) { return CDITEMschemes.CDECAREHAQ; }
    if ("CDITEMEBIRTH".equals(_x)) { return CDITEMschemes.CDITEMEBIRTH; }
    if ("CDPARAMETER".equals(_x)) { return CDITEMschemes.CDPARAMETER; }
    if ("CDITEMBVT".equals(_x)) { return CDITEMschemes.CDITEMBVT; }
    if ("CDBVTAVAILABLEMATERIALS".equals(_x)) { return CDITEMschemes.CDBVTAVAILABLEMATERIALS; }
    if ("CDBVTCONSERVATIONDELAY".equals(_x)) { return CDITEMschemes.CDBVTCONSERVATIONDELAY; }
    if ("CDBVTCONSERVATIONMODE".equals(_x)) { return CDITEMschemes.CDBVTCONSERVATIONMODE; }
    if ("CDBVTSAMPLETYPE".equals(_x)) { return CDITEMschemes.CDBVTSAMPLETYPE; }
    if ("CDBCRDIFFERENTATIONDEGREE".equals(_x)) { return CDITEMschemes.CDBCRDIFFERENTATIONDEGREE; }
    if ("CDBVTLATERALITY".equals(_x)) { return CDITEMschemes.CDBVTLATERALITY; }
    if ("CDBVTPATIENTOPPOSITION".equals(_x)) { return CDITEMschemes.CDBVTPATIENTOPPOSITION; }
    if ("CDBVTSTATUS".equals(_x)) { return CDITEMschemes.CDBVTSTATUS; }
    if ("CDITEMREG".equals(_x)) { return CDITEMschemes.CDITEMREG; }
    if ("CDITEMMYCARENET".equals(_x)) { return CDITEMschemes.CDITEMMYCARENET; }
    if ("CDDEFIBDIAGNOSIS".equals(_x)) { return CDITEMschemes.CDDEFIBDIAGNOSIS; }
    if ("CDACTSNURSING".equals(_x)) { return CDITEMschemes.CDACTSNURSING; }
    if ("CDQERMIDINTERVENTIONTYPE".equals(_x)) { return CDITEMschemes.CDQERMIDINTERVENTIONTYPE; }
    return null;
  }
}


enum CDITEMvalues { admissiontype, adr, allergy, autonomy, bloodtransfusionrefusal, clinical, complaint, complementaryproduct, conclusion, contactperson, dischargedatetime, dischargedestination, dischargetype, emergencyevaluation, encounterdatetime, encounterlegalservice, encounterlocation, encounterresponsible, encountersafetyissue, encountertype, evolution, expirationdatetime, gmdmanager, habit, hcpartyavailability, healthcareelement, healthissue, incapacity, lab, medication, ntbr, referrer, referringtype, reimbursementcertificate, requestdatetime, requesteddecisionsharing, requesteddischargedestination, requestedencountertype, requestedrecipient, requestnumber, requestor, risk, socialrisk, specimendatetime, technical, transactionreason, transcriptionist, transferdatetime, treatment, vaccine, actionplan, acts, careplansubscription, contacthcparty, diagnosis, familyrisk, healthcareapproach, insurancystatus, memberinsurancystatus, parameter, patientwill, professionalrisk, encounternumber, claim, outcome, agreementwithpatient, patientcooperation, reimbursementclass, financialcontract, justification, _result, agreedtreatment, membership, problem;

  public static CDITEMvalues parseCDITEMvalues(String _x) {
    if ("admissiontype".equals(_x)) { return CDITEMvalues.admissiontype; }
    if ("adr".equals(_x)) { return CDITEMvalues.adr; }
    if ("allergy".equals(_x)) { return CDITEMvalues.allergy; }
    if ("autonomy".equals(_x)) { return CDITEMvalues.autonomy; }
    if ("bloodtransfusionrefusal".equals(_x)) { return CDITEMvalues.bloodtransfusionrefusal; }
    if ("clinical".equals(_x)) { return CDITEMvalues.clinical; }
    if ("complaint".equals(_x)) { return CDITEMvalues.complaint; }
    if ("complementaryproduct".equals(_x)) { return CDITEMvalues.complementaryproduct; }
    if ("conclusion".equals(_x)) { return CDITEMvalues.conclusion; }
    if ("contactperson".equals(_x)) { return CDITEMvalues.contactperson; }
    if ("dischargedatetime".equals(_x)) { return CDITEMvalues.dischargedatetime; }
    if ("dischargedestination".equals(_x)) { return CDITEMvalues.dischargedestination; }
    if ("dischargetype".equals(_x)) { return CDITEMvalues.dischargetype; }
    if ("emergencyevaluation".equals(_x)) { return CDITEMvalues.emergencyevaluation; }
    if ("encounterdatetime".equals(_x)) { return CDITEMvalues.encounterdatetime; }
    if ("encounterlegalservice".equals(_x)) { return CDITEMvalues.encounterlegalservice; }
    if ("encounterlocation".equals(_x)) { return CDITEMvalues.encounterlocation; }
    if ("encounterresponsible".equals(_x)) { return CDITEMvalues.encounterresponsible; }
    if ("encountersafetyissue".equals(_x)) { return CDITEMvalues.encountersafetyissue; }
    if ("encountertype".equals(_x)) { return CDITEMvalues.encountertype; }
    if ("evolution".equals(_x)) { return CDITEMvalues.evolution; }
    if ("expirationdatetime".equals(_x)) { return CDITEMvalues.expirationdatetime; }
    if ("gmdmanager".equals(_x)) { return CDITEMvalues.gmdmanager; }
    if ("habit".equals(_x)) { return CDITEMvalues.habit; }
    if ("hcpartyavailability".equals(_x)) { return CDITEMvalues.hcpartyavailability; }
    if ("healthcareelement".equals(_x)) { return CDITEMvalues.healthcareelement; }
    if ("healthissue".equals(_x)) { return CDITEMvalues.healthissue; }
    if ("incapacity".equals(_x)) { return CDITEMvalues.incapacity; }
    if ("lab".equals(_x)) { return CDITEMvalues.lab; }
    if ("medication".equals(_x)) { return CDITEMvalues.medication; }
    if ("ntbr".equals(_x)) { return CDITEMvalues.ntbr; }
    if ("referrer".equals(_x)) { return CDITEMvalues.referrer; }
    if ("referringtype".equals(_x)) { return CDITEMvalues.referringtype; }
    if ("reimbursementcertificate".equals(_x)) { return CDITEMvalues.reimbursementcertificate; }
    if ("requestdatetime".equals(_x)) { return CDITEMvalues.requestdatetime; }
    if ("requesteddecisionsharing".equals(_x)) { return CDITEMvalues.requesteddecisionsharing; }
    if ("requesteddischargedestination".equals(_x)) { return CDITEMvalues.requesteddischargedestination; }
    if ("requestedencountertype".equals(_x)) { return CDITEMvalues.requestedencountertype; }
    if ("requestedrecipient".equals(_x)) { return CDITEMvalues.requestedrecipient; }
    if ("requestnumber".equals(_x)) { return CDITEMvalues.requestnumber; }
    if ("requestor".equals(_x)) { return CDITEMvalues.requestor; }
    if ("risk".equals(_x)) { return CDITEMvalues.risk; }
    if ("socialrisk".equals(_x)) { return CDITEMvalues.socialrisk; }
    if ("specimendatetime".equals(_x)) { return CDITEMvalues.specimendatetime; }
    if ("technical".equals(_x)) { return CDITEMvalues.technical; }
    if ("transactionreason".equals(_x)) { return CDITEMvalues.transactionreason; }
    if ("transcriptionist".equals(_x)) { return CDITEMvalues.transcriptionist; }
    if ("transferdatetime".equals(_x)) { return CDITEMvalues.transferdatetime; }
    if ("treatment".equals(_x)) { return CDITEMvalues.treatment; }
    if ("vaccine".equals(_x)) { return CDITEMvalues.vaccine; }
    if ("actionplan".equals(_x)) { return CDITEMvalues.actionplan; }
    if ("acts".equals(_x)) { return CDITEMvalues.acts; }
    if ("careplansubscription".equals(_x)) { return CDITEMvalues.careplansubscription; }
    if ("contacthcparty".equals(_x)) { return CDITEMvalues.contacthcparty; }
    if ("diagnosis".equals(_x)) { return CDITEMvalues.diagnosis; }
    if ("familyrisk".equals(_x)) { return CDITEMvalues.familyrisk; }
    if ("healthcareapproach".equals(_x)) { return CDITEMvalues.healthcareapproach; }
    if ("insurancystatus".equals(_x)) { return CDITEMvalues.insurancystatus; }
    if ("memberinsurancystatus".equals(_x)) { return CDITEMvalues.memberinsurancystatus; }
    if ("parameter".equals(_x)) { return CDITEMvalues.parameter; }
    if ("patientwill".equals(_x)) { return CDITEMvalues.patientwill; }
    if ("professionalrisk".equals(_x)) { return CDITEMvalues.professionalrisk; }
    if ("encounternumber".equals(_x)) { return CDITEMvalues.encounternumber; }
    if ("claim".equals(_x)) { return CDITEMvalues.claim; }
    if ("outcome".equals(_x)) { return CDITEMvalues.outcome; }
    if ("agreementwithpatient".equals(_x)) { return CDITEMvalues.agreementwithpatient; }
    if ("patientcooperation".equals(_x)) { return CDITEMvalues.patientcooperation; }
    if ("reimbursementclass".equals(_x)) { return CDITEMvalues.reimbursementclass; }
    if ("financialcontract".equals(_x)) { return CDITEMvalues.financialcontract; }
    if ("justification".equals(_x)) { return CDITEMvalues.justification; }
    if ("_result".equals(_x)) { return CDITEMvalues._result; }
    if ("agreedtreatment".equals(_x)) { return CDITEMvalues.agreedtreatment; }
    if ("membership".equals(_x)) { return CDITEMvalues.membership; }
    if ("problem".equals(_x)) { return CDITEMvalues.problem; }
    return null;
  }
}


enum CDLEGALSERVICEvalues { _190, _200, _210, _220, _230, _240, _250, _260, _270, _280, _290, _300, _320, _340, _350, _360, _370, _380, _390, _400, _410, _420, _430, _440, _450, _460, _470, _480, _490;

  public static CDLEGALSERVICEvalues parseCDLEGALSERVICEvalues(String _x) {
    if ("_190".equals(_x)) { return CDLEGALSERVICEvalues._190; }
    if ("_200".equals(_x)) { return CDLEGALSERVICEvalues._200; }
    if ("_210".equals(_x)) { return CDLEGALSERVICEvalues._210; }
    if ("_220".equals(_x)) { return CDLEGALSERVICEvalues._220; }
    if ("_230".equals(_x)) { return CDLEGALSERVICEvalues._230; }
    if ("_240".equals(_x)) { return CDLEGALSERVICEvalues._240; }
    if ("_250".equals(_x)) { return CDLEGALSERVICEvalues._250; }
    if ("_260".equals(_x)) { return CDLEGALSERVICEvalues._260; }
    if ("_270".equals(_x)) { return CDLEGALSERVICEvalues._270; }
    if ("_280".equals(_x)) { return CDLEGALSERVICEvalues._280; }
    if ("_290".equals(_x)) { return CDLEGALSERVICEvalues._290; }
    if ("_300".equals(_x)) { return CDLEGALSERVICEvalues._300; }
    if ("_320".equals(_x)) { return CDLEGALSERVICEvalues._320; }
    if ("_340".equals(_x)) { return CDLEGALSERVICEvalues._340; }
    if ("_350".equals(_x)) { return CDLEGALSERVICEvalues._350; }
    if ("_360".equals(_x)) { return CDLEGALSERVICEvalues._360; }
    if ("_370".equals(_x)) { return CDLEGALSERVICEvalues._370; }
    if ("_380".equals(_x)) { return CDLEGALSERVICEvalues._380; }
    if ("_390".equals(_x)) { return CDLEGALSERVICEvalues._390; }
    if ("_400".equals(_x)) { return CDLEGALSERVICEvalues._400; }
    if ("_410".equals(_x)) { return CDLEGALSERVICEvalues._410; }
    if ("_420".equals(_x)) { return CDLEGALSERVICEvalues._420; }
    if ("_430".equals(_x)) { return CDLEGALSERVICEvalues._430; }
    if ("_440".equals(_x)) { return CDLEGALSERVICEvalues._440; }
    if ("_450".equals(_x)) { return CDLEGALSERVICEvalues._450; }
    if ("_460".equals(_x)) { return CDLEGALSERVICEvalues._460; }
    if ("_470".equals(_x)) { return CDLEGALSERVICEvalues._470; }
    if ("_480".equals(_x)) { return CDLEGALSERVICEvalues._480; }
    if ("_490".equals(_x)) { return CDLEGALSERVICEvalues._490; }
    return null;
  }
}


enum CDLIFECYCLEvalues { aborted, active, added, administrated, cancelled, completed, corrected, delivered, substituted, inactive, planned, prescribed, reported, refused, switched, suspended, stopped, excluded, notpresent, ordered, scheduled, todo, postponed, pending, expected, obtained, proposed, retracted;

  public static CDLIFECYCLEvalues parseCDLIFECYCLEvalues(String _x) {
    if ("aborted".equals(_x)) { return CDLIFECYCLEvalues.aborted; }
    if ("active".equals(_x)) { return CDLIFECYCLEvalues.active; }
    if ("added".equals(_x)) { return CDLIFECYCLEvalues.added; }
    if ("administrated".equals(_x)) { return CDLIFECYCLEvalues.administrated; }
    if ("cancelled".equals(_x)) { return CDLIFECYCLEvalues.cancelled; }
    if ("completed".equals(_x)) { return CDLIFECYCLEvalues.completed; }
    if ("corrected".equals(_x)) { return CDLIFECYCLEvalues.corrected; }
    if ("delivered".equals(_x)) { return CDLIFECYCLEvalues.delivered; }
    if ("substituted".equals(_x)) { return CDLIFECYCLEvalues.substituted; }
    if ("inactive".equals(_x)) { return CDLIFECYCLEvalues.inactive; }
    if ("planned".equals(_x)) { return CDLIFECYCLEvalues.planned; }
    if ("prescribed".equals(_x)) { return CDLIFECYCLEvalues.prescribed; }
    if ("reported".equals(_x)) { return CDLIFECYCLEvalues.reported; }
    if ("refused".equals(_x)) { return CDLIFECYCLEvalues.refused; }
    if ("switched".equals(_x)) { return CDLIFECYCLEvalues.switched; }
    if ("suspended".equals(_x)) { return CDLIFECYCLEvalues.suspended; }
    if ("stopped".equals(_x)) { return CDLIFECYCLEvalues.stopped; }
    if ("excluded".equals(_x)) { return CDLIFECYCLEvalues.excluded; }
    if ("notpresent".equals(_x)) { return CDLIFECYCLEvalues.notpresent; }
    if ("ordered".equals(_x)) { return CDLIFECYCLEvalues.ordered; }
    if ("scheduled".equals(_x)) { return CDLIFECYCLEvalues.scheduled; }
    if ("todo".equals(_x)) { return CDLIFECYCLEvalues.todo; }
    if ("postponed".equals(_x)) { return CDLIFECYCLEvalues.postponed; }
    if ("pending".equals(_x)) { return CDLIFECYCLEvalues.pending; }
    if ("expected".equals(_x)) { return CDLIFECYCLEvalues.expected; }
    if ("obtained".equals(_x)) { return CDLIFECYCLEvalues.obtained; }
    if ("proposed".equals(_x)) { return CDLIFECYCLEvalues.proposed; }
    if ("retracted".equals(_x)) { return CDLIFECYCLEvalues.retracted; }
    return null;
  }
}


enum CDLNKvalues { isachildof, isaconsequenceof, isanewversionof, isareplyto, multimedia, thumbnail, isanappendixof, isaservicefor, isrealisationof, isapproachfor, isplannedfor, isattestationof;

  public static CDLNKvalues parseCDLNKvalues(String _x) {
    if ("isachildof".equals(_x)) { return CDLNKvalues.isachildof; }
    if ("isaconsequenceof".equals(_x)) { return CDLNKvalues.isaconsequenceof; }
    if ("isanewversionof".equals(_x)) { return CDLNKvalues.isanewversionof; }
    if ("isareplyto".equals(_x)) { return CDLNKvalues.isareplyto; }
    if ("multimedia".equals(_x)) { return CDLNKvalues.multimedia; }
    if ("thumbnail".equals(_x)) { return CDLNKvalues.thumbnail; }
    if ("isanappendixof".equals(_x)) { return CDLNKvalues.isanappendixof; }
    if ("isaservicefor".equals(_x)) { return CDLNKvalues.isaservicefor; }
    if ("isrealisationof".equals(_x)) { return CDLNKvalues.isrealisationof; }
    if ("isapproachfor".equals(_x)) { return CDLNKvalues.isapproachfor; }
    if ("isplannedfor".equals(_x)) { return CDLNKvalues.isplannedfor; }
    if ("isattestationof".equals(_x)) { return CDLNKvalues.isattestationof; }
    return null;
  }
}


enum CDMAACOVERAGETYPEvalues { chapter4limited, chapter4unlimited;

  public static CDMAACOVERAGETYPEvalues parseCDMAACOVERAGETYPEvalues(String _x) {
    if ("chapter4limited".equals(_x)) { return CDMAACOVERAGETYPEvalues.chapter4limited; }
    if ("chapter4unlimited".equals(_x)) { return CDMAACOVERAGETYPEvalues.chapter4unlimited; }
    return null;
  }
}


enum CDMAAREFUSALJUSTIFICATIONvalues { _200, _401, _404, _406, _409, _413, _414, _415, _416, _502;

  public static CDMAAREFUSALJUSTIFICATIONvalues parseCDMAAREFUSALJUSTIFICATIONvalues(String _x) {
    if ("_200".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._200; }
    if ("_401".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._401; }
    if ("_404".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._404; }
    if ("_406".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._406; }
    if ("_409".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._409; }
    if ("_413".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._413; }
    if ("_414".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._414; }
    if ("_415".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._415; }
    if ("_416".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._416; }
    if ("_502".equals(_x)) { return CDMAAREFUSALJUSTIFICATIONvalues._502; }
    return null;
  }
}


enum CDMAAREQUESTTYPEvalues { newrequest, extension, noncontinuousextension, complimentaryannex, cancellation, closure;

  public static CDMAAREQUESTTYPEvalues parseCDMAAREQUESTTYPEvalues(String _x) {
    if ("newrequest".equals(_x)) { return CDMAAREQUESTTYPEvalues.newrequest; }
    if ("extension".equals(_x)) { return CDMAAREQUESTTYPEvalues.extension; }
    if ("noncontinuousextension".equals(_x)) { return CDMAAREQUESTTYPEvalues.noncontinuousextension; }
    if ("complimentaryannex".equals(_x)) { return CDMAAREQUESTTYPEvalues.complimentaryannex; }
    if ("cancellation".equals(_x)) { return CDMAAREQUESTTYPEvalues.cancellation; }
    if ("closure".equals(_x)) { return CDMAAREQUESTTYPEvalues.closure; }
    return null;
  }
}


enum CDMAARESPONSETYPEvalues { agreement, refusal, intreatment;

  public static CDMAARESPONSETYPEvalues parseCDMAARESPONSETYPEvalues(String _x) {
    if ("agreement".equals(_x)) { return CDMAARESPONSETYPEvalues.agreement; }
    if ("refusal".equals(_x)) { return CDMAARESPONSETYPEvalues.refusal; }
    if ("intreatment".equals(_x)) { return CDMAARESPONSETYPEvalues.intreatment; }
    return null;
  }
}


enum CDMAATYPEvalues { chapter4;

  public static CDMAATYPEvalues parseCDMAATYPEvalues(String _x) {
    if ("chapter4".equals(_x)) { return CDMAATYPEvalues.chapter4; }
    return null;
  }
}


enum CDMEDIATYPEvalues { applicationMsword, applicationPdf, audioBasic, audioK32adpcm, audioMp3, imageG3fax, imageGif, imageJpeg, imagePng, imageTiff, modelVrml, multipartXHl7CdaLevel1, textHtml, textPlain, textRtf, textSgml, textXHl7Ft, textXml, videoMpeg, videoXAvi, kmbTransaction, imageDicom, applicationHl7SdaXml, applicationRtf;

  public static CDMEDIATYPEvalues parseCDMEDIATYPEvalues(String _x) {
    if ("applicationMsword".equals(_x)) { return CDMEDIATYPEvalues.applicationMsword; }
    if ("applicationPdf".equals(_x)) { return CDMEDIATYPEvalues.applicationPdf; }
    if ("audioBasic".equals(_x)) { return CDMEDIATYPEvalues.audioBasic; }
    if ("audioK32adpcm".equals(_x)) { return CDMEDIATYPEvalues.audioK32adpcm; }
    if ("audioMp3".equals(_x)) { return CDMEDIATYPEvalues.audioMp3; }
    if ("imageG3fax".equals(_x)) { return CDMEDIATYPEvalues.imageG3fax; }
    if ("imageGif".equals(_x)) { return CDMEDIATYPEvalues.imageGif; }
    if ("imageJpeg".equals(_x)) { return CDMEDIATYPEvalues.imageJpeg; }
    if ("imagePng".equals(_x)) { return CDMEDIATYPEvalues.imagePng; }
    if ("imageTiff".equals(_x)) { return CDMEDIATYPEvalues.imageTiff; }
    if ("modelVrml".equals(_x)) { return CDMEDIATYPEvalues.modelVrml; }
    if ("multipartXHl7CdaLevel1".equals(_x)) { return CDMEDIATYPEvalues.multipartXHl7CdaLevel1; }
    if ("textHtml".equals(_x)) { return CDMEDIATYPEvalues.textHtml; }
    if ("textPlain".equals(_x)) { return CDMEDIATYPEvalues.textPlain; }
    if ("textRtf".equals(_x)) { return CDMEDIATYPEvalues.textRtf; }
    if ("textSgml".equals(_x)) { return CDMEDIATYPEvalues.textSgml; }
    if ("textXHl7Ft".equals(_x)) { return CDMEDIATYPEvalues.textXHl7Ft; }
    if ("textXml".equals(_x)) { return CDMEDIATYPEvalues.textXml; }
    if ("videoMpeg".equals(_x)) { return CDMEDIATYPEvalues.videoMpeg; }
    if ("videoXAvi".equals(_x)) { return CDMEDIATYPEvalues.videoXAvi; }
    if ("kmbTransaction".equals(_x)) { return CDMEDIATYPEvalues.kmbTransaction; }
    if ("imageDicom".equals(_x)) { return CDMEDIATYPEvalues.imageDicom; }
    if ("applicationHl7SdaXml".equals(_x)) { return CDMEDIATYPEvalues.applicationHl7SdaXml; }
    if ("applicationRtf".equals(_x)) { return CDMEDIATYPEvalues.applicationRtf; }
    return null;
  }
}


enum CDMEDICATIONschemes { CDDRUGCNK, CDVACCINE, LOCAL;

  public static CDMEDICATIONschemes parseCDMEDICATIONschemes(String _x) {
    if ("CDDRUGCNK".equals(_x)) { return CDMEDICATIONschemes.CDDRUGCNK; }
    if ("CDVACCINE".equals(_x)) { return CDMEDICATIONschemes.CDVACCINE; }
    if ("LOCAL".equals(_x)) { return CDMEDICATIONschemes.LOCAL; }
    return null;
  }
}


enum CDMESSAGEvalues { gpsoftwaremigration, gppatientmigration, ptsoftwaremigration, ptpatientmigration, nursingsoftwaremigration, nursingpatientmigration;

  public static CDMESSAGEvalues parseCDMESSAGEvalues(String _x) {
    if ("gpsoftwaremigration".equals(_x)) { return CDMESSAGEvalues.gpsoftwaremigration; }
    if ("gppatientmigration".equals(_x)) { return CDMESSAGEvalues.gppatientmigration; }
    if ("ptsoftwaremigration".equals(_x)) { return CDMESSAGEvalues.ptsoftwaremigration; }
    if ("ptpatientmigration".equals(_x)) { return CDMESSAGEvalues.ptpatientmigration; }
    if ("nursingsoftwaremigration".equals(_x)) { return CDMESSAGEvalues.nursingsoftwaremigration; }
    if ("nursingpatientmigration".equals(_x)) { return CDMESSAGEvalues.nursingpatientmigration; }
    return null;
  }
}


enum CDMICROORGANISMvalues { legionella, salmonella;

  public static CDMICROORGANISMvalues parseCDMICROORGANISMvalues(String _x) {
    if ("legionella".equals(_x)) { return CDMICROORGANISMvalues.legionella; }
    if ("salmonella".equals(_x)) { return CDMICROORGANISMvalues.salmonella; }
    return null;
  }
}


enum CDMKGADMISSIONvalues { _0, _1, _2, _3, _4, _5, _6, _8;

  public static CDMKGADMISSIONvalues parseCDMKGADMISSIONvalues(String _x) {
    if ("_0".equals(_x)) { return CDMKGADMISSIONvalues._0; }
    if ("_1".equals(_x)) { return CDMKGADMISSIONvalues._1; }
    if ("_2".equals(_x)) { return CDMKGADMISSIONvalues._2; }
    if ("_3".equals(_x)) { return CDMKGADMISSIONvalues._3; }
    if ("_4".equals(_x)) { return CDMKGADMISSIONvalues._4; }
    if ("_5".equals(_x)) { return CDMKGADMISSIONvalues._5; }
    if ("_6".equals(_x)) { return CDMKGADMISSIONvalues._6; }
    if ("_8".equals(_x)) { return CDMKGADMISSIONvalues._8; }
    return null;
  }
}


enum CDMKGDESTINATIONvalues { _0, _1, _2, _3, _4, _5, _6, _7, _8, _9;

  public static CDMKGDESTINATIONvalues parseCDMKGDESTINATIONvalues(String _x) {
    if ("_0".equals(_x)) { return CDMKGDESTINATIONvalues._0; }
    if ("_1".equals(_x)) { return CDMKGDESTINATIONvalues._1; }
    if ("_2".equals(_x)) { return CDMKGDESTINATIONvalues._2; }
    if ("_3".equals(_x)) { return CDMKGDESTINATIONvalues._3; }
    if ("_4".equals(_x)) { return CDMKGDESTINATIONvalues._4; }
    if ("_5".equals(_x)) { return CDMKGDESTINATIONvalues._5; }
    if ("_6".equals(_x)) { return CDMKGDESTINATIONvalues._6; }
    if ("_7".equals(_x)) { return CDMKGDESTINATIONvalues._7; }
    if ("_8".equals(_x)) { return CDMKGDESTINATIONvalues._8; }
    if ("_9".equals(_x)) { return CDMKGDESTINATIONvalues._9; }
    return null;
  }
}


enum CDMKGDISCHARGEvalues { _0, _1, _2, _3, _4, _5, _6, D;

  public static CDMKGDISCHARGEvalues parseCDMKGDISCHARGEvalues(String _x) {
    if ("_0".equals(_x)) { return CDMKGDISCHARGEvalues._0; }
    if ("_1".equals(_x)) { return CDMKGDISCHARGEvalues._1; }
    if ("_2".equals(_x)) { return CDMKGDISCHARGEvalues._2; }
    if ("_3".equals(_x)) { return CDMKGDISCHARGEvalues._3; }
    if ("_4".equals(_x)) { return CDMKGDISCHARGEvalues._4; }
    if ("_5".equals(_x)) { return CDMKGDISCHARGEvalues._5; }
    if ("_6".equals(_x)) { return CDMKGDISCHARGEvalues._6; }
    if ("D".equals(_x)) { return CDMKGDISCHARGEvalues.D; }
    return null;
  }
}


enum CDMKGORIGINvalues { _0, _1, _2, _3, _4, _5, _6, _7, _8, _9;

  public static CDMKGORIGINvalues parseCDMKGORIGINvalues(String _x) {
    if ("_0".equals(_x)) { return CDMKGORIGINvalues._0; }
    if ("_1".equals(_x)) { return CDMKGORIGINvalues._1; }
    if ("_2".equals(_x)) { return CDMKGORIGINvalues._2; }
    if ("_3".equals(_x)) { return CDMKGORIGINvalues._3; }
    if ("_4".equals(_x)) { return CDMKGORIGINvalues._4; }
    if ("_5".equals(_x)) { return CDMKGORIGINvalues._5; }
    if ("_6".equals(_x)) { return CDMKGORIGINvalues._6; }
    if ("_7".equals(_x)) { return CDMKGORIGINvalues._7; }
    if ("_8".equals(_x)) { return CDMKGORIGINvalues._8; }
    if ("_9".equals(_x)) { return CDMKGORIGINvalues._9; }
    return null;
  }
}


enum CDMKGREFERRERvalues { _0, _1, _2, _3, _4, _5, _6, _8;

  public static CDMKGREFERRERvalues parseCDMKGREFERRERvalues(String _x) {
    if ("_0".equals(_x)) { return CDMKGREFERRERvalues._0; }
    if ("_1".equals(_x)) { return CDMKGREFERRERvalues._1; }
    if ("_2".equals(_x)) { return CDMKGREFERRERvalues._2; }
    if ("_3".equals(_x)) { return CDMKGREFERRERvalues._3; }
    if ("_4".equals(_x)) { return CDMKGREFERRERvalues._4; }
    if ("_5".equals(_x)) { return CDMKGREFERRERvalues._5; }
    if ("_6".equals(_x)) { return CDMKGREFERRERvalues._6; }
    if ("_8".equals(_x)) { return CDMKGREFERRERvalues._8; }
    return null;
  }
}


enum CDMSADAPTATIONvalues { nochanges, medication, posology, treatmentsuspension;

  public static CDMSADAPTATIONvalues parseCDMSADAPTATIONvalues(String _x) {
    if ("nochanges".equals(_x)) { return CDMSADAPTATIONvalues.nochanges; }
    if ("medication".equals(_x)) { return CDMSADAPTATIONvalues.medication; }
    if ("posology".equals(_x)) { return CDMSADAPTATIONvalues.posology; }
    if ("treatmentsuspension".equals(_x)) { return CDMSADAPTATIONvalues.treatmentsuspension; }
    return null;
  }
}


enum CDMSMEDICATIONTYPEvalues { onprescription, otc, other;

  public static CDMSMEDICATIONTYPEvalues parseCDMSMEDICATIONTYPEvalues(String _x) {
    if ("onprescription".equals(_x)) { return CDMSMEDICATIONTYPEvalues.onprescription; }
    if ("otc".equals(_x)) { return CDMSMEDICATIONTYPEvalues.otc; }
    if ("other".equals(_x)) { return CDMSMEDICATIONTYPEvalues.other; }
    return null;
  }
}


enum CDMSORIGINvalues { regularprocess, recorded;

  public static CDMSORIGINvalues parseCDMSORIGINvalues(String _x) {
    if ("regularprocess".equals(_x)) { return CDMSORIGINvalues.regularprocess; }
    if ("recorded".equals(_x)) { return CDMSORIGINvalues.recorded; }
    return null;
  }
}


enum CDORTHOAPPROACHvalues { lateral, posterior, anterior, bytrochanterotomy, withfemoralosteotomy, other, subvastus, midvastus, parapatellarlateral, parapatellarmedial, tuberositasosteotomie, antelateral, postlateral;

  public static CDORTHOAPPROACHvalues parseCDORTHOAPPROACHvalues(String _x) {
    if ("lateral".equals(_x)) { return CDORTHOAPPROACHvalues.lateral; }
    if ("posterior".equals(_x)) { return CDORTHOAPPROACHvalues.posterior; }
    if ("anterior".equals(_x)) { return CDORTHOAPPROACHvalues.anterior; }
    if ("bytrochanterotomy".equals(_x)) { return CDORTHOAPPROACHvalues.bytrochanterotomy; }
    if ("withfemoralosteotomy".equals(_x)) { return CDORTHOAPPROACHvalues.withfemoralosteotomy; }
    if ("other".equals(_x)) { return CDORTHOAPPROACHvalues.other; }
    if ("subvastus".equals(_x)) { return CDORTHOAPPROACHvalues.subvastus; }
    if ("midvastus".equals(_x)) { return CDORTHOAPPROACHvalues.midvastus; }
    if ("parapatellarlateral".equals(_x)) { return CDORTHOAPPROACHvalues.parapatellarlateral; }
    if ("parapatellarmedial".equals(_x)) { return CDORTHOAPPROACHvalues.parapatellarmedial; }
    if ("tuberositasosteotomie".equals(_x)) { return CDORTHOAPPROACHvalues.tuberositasosteotomie; }
    if ("antelateral".equals(_x)) { return CDORTHOAPPROACHvalues.antelateral; }
    if ("postlateral".equals(_x)) { return CDORTHOAPPROACHvalues.postlateral; }
    return null;
  }
}


enum CDORTHODIAGNOSISvalues { primaryarthrosis, necrosisavascular, fracture, inflamatory, posttraumaticarthrosis, arthrosisafterinfection, secondaryarthrosis, rheumatoidarthritis, tumor, hipdysplasia, other, asepticloosening, infection, instability, periprostheticfracture, pain, wearpolyethylene, wrongalignment, fractureofimplant, progressionarthrosis, rigidity, wear, inflammatory;

  public static CDORTHODIAGNOSISvalues parseCDORTHODIAGNOSISvalues(String _x) {
    if ("primaryarthrosis".equals(_x)) { return CDORTHODIAGNOSISvalues.primaryarthrosis; }
    if ("necrosisavascular".equals(_x)) { return CDORTHODIAGNOSISvalues.necrosisavascular; }
    if ("fracture".equals(_x)) { return CDORTHODIAGNOSISvalues.fracture; }
    if ("inflamatory".equals(_x)) { return CDORTHODIAGNOSISvalues.inflamatory; }
    if ("posttraumaticarthrosis".equals(_x)) { return CDORTHODIAGNOSISvalues.posttraumaticarthrosis; }
    if ("arthrosisafterinfection".equals(_x)) { return CDORTHODIAGNOSISvalues.arthrosisafterinfection; }
    if ("secondaryarthrosis".equals(_x)) { return CDORTHODIAGNOSISvalues.secondaryarthrosis; }
    if ("rheumatoidarthritis".equals(_x)) { return CDORTHODIAGNOSISvalues.rheumatoidarthritis; }
    if ("tumor".equals(_x)) { return CDORTHODIAGNOSISvalues.tumor; }
    if ("hipdysplasia".equals(_x)) { return CDORTHODIAGNOSISvalues.hipdysplasia; }
    if ("other".equals(_x)) { return CDORTHODIAGNOSISvalues.other; }
    if ("asepticloosening".equals(_x)) { return CDORTHODIAGNOSISvalues.asepticloosening; }
    if ("infection".equals(_x)) { return CDORTHODIAGNOSISvalues.infection; }
    if ("instability".equals(_x)) { return CDORTHODIAGNOSISvalues.instability; }
    if ("periprostheticfracture".equals(_x)) { return CDORTHODIAGNOSISvalues.periprostheticfracture; }
    if ("pain".equals(_x)) { return CDORTHODIAGNOSISvalues.pain; }
    if ("wearpolyethylene".equals(_x)) { return CDORTHODIAGNOSISvalues.wearpolyethylene; }
    if ("wrongalignment".equals(_x)) { return CDORTHODIAGNOSISvalues.wrongalignment; }
    if ("fractureofimplant".equals(_x)) { return CDORTHODIAGNOSISvalues.fractureofimplant; }
    if ("progressionarthrosis".equals(_x)) { return CDORTHODIAGNOSISvalues.progressionarthrosis; }
    if ("rigidity".equals(_x)) { return CDORTHODIAGNOSISvalues.rigidity; }
    if ("wear".equals(_x)) { return CDORTHODIAGNOSISvalues.wear; }
    if ("inflammatory".equals(_x)) { return CDORTHODIAGNOSISvalues.inflammatory; }
    return null;
  }
}


enum CDORTHOGRAFTvalues { allograft, homograft, autograft, alloandautograft, none;

  public static CDORTHOGRAFTvalues parseCDORTHOGRAFTvalues(String _x) {
    if ("allograft".equals(_x)) { return CDORTHOGRAFTvalues.allograft; }
    if ("homograft".equals(_x)) { return CDORTHOGRAFTvalues.homograft; }
    if ("autograft".equals(_x)) { return CDORTHOGRAFTvalues.autograft; }
    if ("alloandautograft".equals(_x)) { return CDORTHOGRAFTvalues.alloandautograft; }
    if ("none".equals(_x)) { return CDORTHOGRAFTvalues.none; }
    return null;
  }
}


enum CDORTHOINTERFACEvalues { hacoated, porous, smouth, cementwithab, cementwithoutab, allpoly, none, other, metalbacked;

  public static CDORTHOINTERFACEvalues parseCDORTHOINTERFACEvalues(String _x) {
    if ("hacoated".equals(_x)) { return CDORTHOINTERFACEvalues.hacoated; }
    if ("porous".equals(_x)) { return CDORTHOINTERFACEvalues.porous; }
    if ("smouth".equals(_x)) { return CDORTHOINTERFACEvalues.smouth; }
    if ("cementwithab".equals(_x)) { return CDORTHOINTERFACEvalues.cementwithab; }
    if ("cementwithoutab".equals(_x)) { return CDORTHOINTERFACEvalues.cementwithoutab; }
    if ("allpoly".equals(_x)) { return CDORTHOINTERFACEvalues.allpoly; }
    if ("none".equals(_x)) { return CDORTHOINTERFACEvalues.none; }
    if ("other".equals(_x)) { return CDORTHOINTERFACEvalues.other; }
    if ("metalbacked".equals(_x)) { return CDORTHOINTERFACEvalues.metalbacked; }
    return null;
  }
}


enum CDORTHOKNEEINSERTvalues { fixed, mobile, none;

  public static CDORTHOKNEEINSERTvalues parseCDORTHOKNEEINSERTvalues(String _x) {
    if ("fixed".equals(_x)) { return CDORTHOKNEEINSERTvalues.fixed; }
    if ("mobile".equals(_x)) { return CDORTHOKNEEINSERTvalues.mobile; }
    if ("none".equals(_x)) { return CDORTHOKNEEINSERTvalues.none; }
    return null;
  }
}


enum CDORTHONAVCOMvalues { navigationcomputerglobal, navigationcomputerstem, navigationcomputercup, none;

  public static CDORTHONAVCOMvalues parseCDORTHONAVCOMvalues(String _x) {
    if ("navigationcomputerglobal".equals(_x)) { return CDORTHONAVCOMvalues.navigationcomputerglobal; }
    if ("navigationcomputerstem".equals(_x)) { return CDORTHONAVCOMvalues.navigationcomputerstem; }
    if ("navigationcomputercup".equals(_x)) { return CDORTHONAVCOMvalues.navigationcomputercup; }
    if ("none".equals(_x)) { return CDORTHONAVCOMvalues.none; }
    return null;
  }
}


enum CDORTHOTECHREVISIONvalues { femoralheadneck, femoralcomplete, acetabularinsert, acetabularcomplete;

  public static CDORTHOTECHREVISIONvalues parseCDORTHOTECHREVISIONvalues(String _x) {
    if ("femoralheadneck".equals(_x)) { return CDORTHOTECHREVISIONvalues.femoralheadneck; }
    if ("femoralcomplete".equals(_x)) { return CDORTHOTECHREVISIONvalues.femoralcomplete; }
    if ("acetabularinsert".equals(_x)) { return CDORTHOTECHREVISIONvalues.acetabularinsert; }
    if ("acetabularcomplete".equals(_x)) { return CDORTHOTECHREVISIONvalues.acetabularcomplete; }
    return null;
  }
}


enum CDORTHOTYPEvalues { primaryprocedure, revisionwithprosthesis, osteosynthesis, resection, arthrodesis, amputation;

  public static CDORTHOTYPEvalues parseCDORTHOTYPEvalues(String _x) {
    if ("primaryprocedure".equals(_x)) { return CDORTHOTYPEvalues.primaryprocedure; }
    if ("revisionwithprosthesis".equals(_x)) { return CDORTHOTYPEvalues.revisionwithprosthesis; }
    if ("osteosynthesis".equals(_x)) { return CDORTHOTYPEvalues.osteosynthesis; }
    if ("resection".equals(_x)) { return CDORTHOTYPEvalues.resection; }
    if ("arthrodesis".equals(_x)) { return CDORTHOTYPEvalues.arthrodesis; }
    if ("amputation".equals(_x)) { return CDORTHOTYPEvalues.amputation; }
    return null;
  }
}


enum CDPARAMETERvalues { weight, height, bmi, sbp, dbp, pulsecharacter, heartrate, peakflow, gpa, headcircumference, hipcircumference, apgar, katz, belrai, bloodsugar;

  public static CDPARAMETERvalues parseCDPARAMETERvalues(String _x) {
    if ("weight".equals(_x)) { return CDPARAMETERvalues.weight; }
    if ("height".equals(_x)) { return CDPARAMETERvalues.height; }
    if ("bmi".equals(_x)) { return CDPARAMETERvalues.bmi; }
    if ("sbp".equals(_x)) { return CDPARAMETERvalues.sbp; }
    if ("dbp".equals(_x)) { return CDPARAMETERvalues.dbp; }
    if ("pulsecharacter".equals(_x)) { return CDPARAMETERvalues.pulsecharacter; }
    if ("heartrate".equals(_x)) { return CDPARAMETERvalues.heartrate; }
    if ("peakflow".equals(_x)) { return CDPARAMETERvalues.peakflow; }
    if ("gpa".equals(_x)) { return CDPARAMETERvalues.gpa; }
    if ("headcircumference".equals(_x)) { return CDPARAMETERvalues.headcircumference; }
    if ("hipcircumference".equals(_x)) { return CDPARAMETERvalues.hipcircumference; }
    if ("apgar".equals(_x)) { return CDPARAMETERvalues.apgar; }
    if ("katz".equals(_x)) { return CDPARAMETERvalues.katz; }
    if ("belrai".equals(_x)) { return CDPARAMETERvalues.belrai; }
    if ("bloodsugar".equals(_x)) { return CDPARAMETERvalues.bloodsugar; }
    return null;
  }
}


enum CDPATIENTWILLHOSPvalues { hos1, hos2;

  public static CDPATIENTWILLHOSPvalues parseCDPATIENTWILLHOSPvalues(String _x) {
    if ("hos1".equals(_x)) { return CDPATIENTWILLHOSPvalues.hos1; }
    if ("hos2".equals(_x)) { return CDPATIENTWILLHOSPvalues.hos2; }
    return null;
  }
}


enum CDPATIENTWILLRESvalues { dnr0, dnr1, dnr2, dnr3;

  public static CDPATIENTWILLRESvalues parseCDPATIENTWILLRESvalues(String _x) {
    if ("dnr0".equals(_x)) { return CDPATIENTWILLRESvalues.dnr0; }
    if ("dnr1".equals(_x)) { return CDPATIENTWILLRESvalues.dnr1; }
    if ("dnr2".equals(_x)) { return CDPATIENTWILLRESvalues.dnr2; }
    if ("dnr3".equals(_x)) { return CDPATIENTWILLRESvalues.dnr3; }
    return null;
  }
}


enum CDPATIENTWILLvalues { ntbr, bloodtransfusionrefusal, intubationrefusal, euthanasiarequest, vaccinationrefusal, organdonationconsent, datareuseforclinicalresearchconsent, datareuseforclinicaltrialsconsent, clinicaltrialparticipationconsent, omissionofmedicaldata;

  public static CDPATIENTWILLvalues parseCDPATIENTWILLvalues(String _x) {
    if ("ntbr".equals(_x)) { return CDPATIENTWILLvalues.ntbr; }
    if ("bloodtransfusionrefusal".equals(_x)) { return CDPATIENTWILLvalues.bloodtransfusionrefusal; }
    if ("intubationrefusal".equals(_x)) { return CDPATIENTWILLvalues.intubationrefusal; }
    if ("euthanasiarequest".equals(_x)) { return CDPATIENTWILLvalues.euthanasiarequest; }
    if ("vaccinationrefusal".equals(_x)) { return CDPATIENTWILLvalues.vaccinationrefusal; }
    if ("organdonationconsent".equals(_x)) { return CDPATIENTWILLvalues.organdonationconsent; }
    if ("datareuseforclinicalresearchconsent".equals(_x)) { return CDPATIENTWILLvalues.datareuseforclinicalresearchconsent; }
    if ("datareuseforclinicaltrialsconsent".equals(_x)) { return CDPATIENTWILLvalues.datareuseforclinicaltrialsconsent; }
    if ("clinicaltrialparticipationconsent".equals(_x)) { return CDPATIENTWILLvalues.clinicaltrialparticipationconsent; }
    if ("omissionofmedicaldata".equals(_x)) { return CDPATIENTWILLvalues.omissionofmedicaldata; }
    return null;
  }
}


enum CDPROOFschemes { CDPROOFTYPE, LOCAL;

  public static CDPROOFschemes parseCDPROOFschemes(String _x) {
    if ("CDPROOFTYPE".equals(_x)) { return CDPROOFschemes.CDPROOFTYPE; }
    if ("LOCAL".equals(_x)) { return CDPROOFschemes.LOCAL; }
    return null;
  }
}


enum CDQUANTITYPREFIXvalues { ana, anaad, ad, qs;

  public static CDQUANTITYPREFIXvalues parseCDQUANTITYPREFIXvalues(String _x) {
    if ("ana".equals(_x)) { return CDQUANTITYPREFIXvalues.ana; }
    if ("anaad".equals(_x)) { return CDQUANTITYPREFIXvalues.anaad; }
    if ("ad".equals(_x)) { return CDQUANTITYPREFIXvalues.ad; }
    if ("qs".equals(_x)) { return CDQUANTITYPREFIXvalues.qs; }
    return null;
  }
}


enum CDREFSCOPEvalues { age, sex, gestationnal;

  public static CDREFSCOPEvalues parseCDREFSCOPEvalues(String _x) {
    if ("age".equals(_x)) { return CDREFSCOPEvalues.age; }
    if ("sex".equals(_x)) { return CDREFSCOPEvalues.sex; }
    if ("gestationnal".equals(_x)) { return CDREFSCOPEvalues.gestationnal; }
    return null;
  }
}


enum CDREVCOMPONENTvalues { patella, femur, tibia, insert;

  public static CDREVCOMPONENTvalues parseCDREVCOMPONENTvalues(String _x) {
    if ("patella".equals(_x)) { return CDREVCOMPONENTvalues.patella; }
    if ("femur".equals(_x)) { return CDREVCOMPONENTvalues.femur; }
    if ("tibia".equals(_x)) { return CDREVCOMPONENTvalues.tibia; }
    if ("insert".equals(_x)) { return CDREVCOMPONENTvalues.insert; }
    return null;
  }
}


enum CDSEVERITYschemes { CDSEVERITY, CDNYHA;

  public static CDSEVERITYschemes parseCDSEVERITYschemes(String _x) {
    if ("CDSEVERITY".equals(_x)) { return CDSEVERITYschemes.CDSEVERITY; }
    if ("CDNYHA".equals(_x)) { return CDSEVERITYschemes.CDNYHA; }
    return null;
  }
}


enum CDSEVERITYvalues { abnormal, high, low, normal, resistent, susceptible, susceptibleintermediate, veryabnormal, veryhigh, verylow, extremelyhigh, extremelylow, verysusceptible;

  public static CDSEVERITYvalues parseCDSEVERITYvalues(String _x) {
    if ("abnormal".equals(_x)) { return CDSEVERITYvalues.abnormal; }
    if ("high".equals(_x)) { return CDSEVERITYvalues.high; }
    if ("low".equals(_x)) { return CDSEVERITYvalues.low; }
    if ("normal".equals(_x)) { return CDSEVERITYvalues.normal; }
    if ("resistent".equals(_x)) { return CDSEVERITYvalues.resistent; }
    if ("susceptible".equals(_x)) { return CDSEVERITYvalues.susceptible; }
    if ("susceptibleintermediate".equals(_x)) { return CDSEVERITYvalues.susceptibleintermediate; }
    if ("veryabnormal".equals(_x)) { return CDSEVERITYvalues.veryabnormal; }
    if ("veryhigh".equals(_x)) { return CDSEVERITYvalues.veryhigh; }
    if ("verylow".equals(_x)) { return CDSEVERITYvalues.verylow; }
    if ("extremelyhigh".equals(_x)) { return CDSEVERITYvalues.extremelyhigh; }
    if ("extremelylow".equals(_x)) { return CDSEVERITYvalues.extremelylow; }
    if ("verysusceptible".equals(_x)) { return CDSEVERITYvalues.verysusceptible; }
    return null;
  }
}


enum CDSEXvalues { changed, female, male, unknown, undefined;

  public static CDSEXvalues parseCDSEXvalues(String _x) {
    if ("changed".equals(_x)) { return CDSEXvalues.changed; }
    if ("female".equals(_x)) { return CDSEXvalues.female; }
    if ("male".equals(_x)) { return CDSEXvalues.male; }
    if ("unknown".equals(_x)) { return CDSEXvalues.unknown; }
    if ("undefined".equals(_x)) { return CDSEXvalues.undefined; }
    return null;
  }
}


enum CDSITEschemes { CDSITE, CDDEFIBSITE;

  public static CDSITEschemes parseCDSITEschemes(String _x) {
    if ("CDSITE".equals(_x)) { return CDSITEschemes.CDSITE; }
    if ("CDDEFIBSITE".equals(_x)) { return CDSITEschemes.CDDEFIBSITE; }
    return null;
  }
}


enum CDSITEvalues { BE, blood, BN, BU, CT, LA, LAC, LACF, LD, LE, LEJ, LF, LG, LH, LIJ, LLAQ, LLFA, LMFA, LN, LPC, LSC, LT, LUA, LUAQ, LUFA, LVG, LVL, NB, OD, OS, OU, PA, PERIN, RA, RAC, RACF, RD, RE, REJ, RF, RG, RH, RIJ, RLAQ, RLFA, RMFA, RN, RPC, RSC, RT, RUA, RUAQ, RUFA, RVG, RVL, lk, rk, lhip, rhip, lfem, rfem, ltib, rtib;

  public static CDSITEvalues parseCDSITEvalues(String _x) {
    if ("BE".equals(_x)) { return CDSITEvalues.BE; }
    if ("blood".equals(_x)) { return CDSITEvalues.blood; }
    if ("BN".equals(_x)) { return CDSITEvalues.BN; }
    if ("BU".equals(_x)) { return CDSITEvalues.BU; }
    if ("CT".equals(_x)) { return CDSITEvalues.CT; }
    if ("LA".equals(_x)) { return CDSITEvalues.LA; }
    if ("LAC".equals(_x)) { return CDSITEvalues.LAC; }
    if ("LACF".equals(_x)) { return CDSITEvalues.LACF; }
    if ("LD".equals(_x)) { return CDSITEvalues.LD; }
    if ("LE".equals(_x)) { return CDSITEvalues.LE; }
    if ("LEJ".equals(_x)) { return CDSITEvalues.LEJ; }
    if ("LF".equals(_x)) { return CDSITEvalues.LF; }
    if ("LG".equals(_x)) { return CDSITEvalues.LG; }
    if ("LH".equals(_x)) { return CDSITEvalues.LH; }
    if ("LIJ".equals(_x)) { return CDSITEvalues.LIJ; }
    if ("LLAQ".equals(_x)) { return CDSITEvalues.LLAQ; }
    if ("LLFA".equals(_x)) { return CDSITEvalues.LLFA; }
    if ("LMFA".equals(_x)) { return CDSITEvalues.LMFA; }
    if ("LN".equals(_x)) { return CDSITEvalues.LN; }
    if ("LPC".equals(_x)) { return CDSITEvalues.LPC; }
    if ("LSC".equals(_x)) { return CDSITEvalues.LSC; }
    if ("LT".equals(_x)) { return CDSITEvalues.LT; }
    if ("LUA".equals(_x)) { return CDSITEvalues.LUA; }
    if ("LUAQ".equals(_x)) { return CDSITEvalues.LUAQ; }
    if ("LUFA".equals(_x)) { return CDSITEvalues.LUFA; }
    if ("LVG".equals(_x)) { return CDSITEvalues.LVG; }
    if ("LVL".equals(_x)) { return CDSITEvalues.LVL; }
    if ("NB".equals(_x)) { return CDSITEvalues.NB; }
    if ("OD".equals(_x)) { return CDSITEvalues.OD; }
    if ("OS".equals(_x)) { return CDSITEvalues.OS; }
    if ("OU".equals(_x)) { return CDSITEvalues.OU; }
    if ("PA".equals(_x)) { return CDSITEvalues.PA; }
    if ("PERIN".equals(_x)) { return CDSITEvalues.PERIN; }
    if ("RA".equals(_x)) { return CDSITEvalues.RA; }
    if ("RAC".equals(_x)) { return CDSITEvalues.RAC; }
    if ("RACF".equals(_x)) { return CDSITEvalues.RACF; }
    if ("RD".equals(_x)) { return CDSITEvalues.RD; }
    if ("RE".equals(_x)) { return CDSITEvalues.RE; }
    if ("REJ".equals(_x)) { return CDSITEvalues.REJ; }
    if ("RF".equals(_x)) { return CDSITEvalues.RF; }
    if ("RG".equals(_x)) { return CDSITEvalues.RG; }
    if ("RH".equals(_x)) { return CDSITEvalues.RH; }
    if ("RIJ".equals(_x)) { return CDSITEvalues.RIJ; }
    if ("RLAQ".equals(_x)) { return CDSITEvalues.RLAQ; }
    if ("RLFA".equals(_x)) { return CDSITEvalues.RLFA; }
    if ("RMFA".equals(_x)) { return CDSITEvalues.RMFA; }
    if ("RN".equals(_x)) { return CDSITEvalues.RN; }
    if ("RPC".equals(_x)) { return CDSITEvalues.RPC; }
    if ("RSC".equals(_x)) { return CDSITEvalues.RSC; }
    if ("RT".equals(_x)) { return CDSITEvalues.RT; }
    if ("RUA".equals(_x)) { return CDSITEvalues.RUA; }
    if ("RUAQ".equals(_x)) { return CDSITEvalues.RUAQ; }
    if ("RUFA".equals(_x)) { return CDSITEvalues.RUFA; }
    if ("RVG".equals(_x)) { return CDSITEvalues.RVG; }
    if ("RVL".equals(_x)) { return CDSITEvalues.RVL; }
    if ("lk".equals(_x)) { return CDSITEvalues.lk; }
    if ("rk".equals(_x)) { return CDSITEvalues.rk; }
    if ("lhip".equals(_x)) { return CDSITEvalues.lhip; }
    if ("rhip".equals(_x)) { return CDSITEvalues.rhip; }
    if ("lfem".equals(_x)) { return CDSITEvalues.lfem; }
    if ("rfem".equals(_x)) { return CDSITEvalues.rfem; }
    if ("ltib".equals(_x)) { return CDSITEvalues.ltib; }
    if ("rtib".equals(_x)) { return CDSITEvalues.rtib; }
    return null;
  }
}


enum CDSTANDARDvalues { _20010424, _20021205, _20030909, _20090101, _20100601, _20100901, _20110701, _20120401, _20120701, _20121001, _20130701, _20131001, _20140401, _20140701, _20141001, _20141201, _20150301, _20150601, _20150901, _20151201, _20160301, _20160601, _20160901, _20161201, _20170301, _20170601, _20170901, _20171201, _20180301, _20180601, _20180901, _20181201, _20190301, _20190901, _20200301, _20200601, _20200901, _20201201, _20210120, _20220401, _20220701, _20221001, _20230401;

  public static CDSTANDARDvalues parseCDSTANDARDvalues(String _x) {
    if ("_20010424".equals(_x)) { return CDSTANDARDvalues._20010424; }
    if ("_20021205".equals(_x)) { return CDSTANDARDvalues._20021205; }
    if ("_20030909".equals(_x)) { return CDSTANDARDvalues._20030909; }
    if ("_20090101".equals(_x)) { return CDSTANDARDvalues._20090101; }
    if ("_20100601".equals(_x)) { return CDSTANDARDvalues._20100601; }
    if ("_20100901".equals(_x)) { return CDSTANDARDvalues._20100901; }
    if ("_20110701".equals(_x)) { return CDSTANDARDvalues._20110701; }
    if ("_20120401".equals(_x)) { return CDSTANDARDvalues._20120401; }
    if ("_20120701".equals(_x)) { return CDSTANDARDvalues._20120701; }
    if ("_20121001".equals(_x)) { return CDSTANDARDvalues._20121001; }
    if ("_20130701".equals(_x)) { return CDSTANDARDvalues._20130701; }
    if ("_20131001".equals(_x)) { return CDSTANDARDvalues._20131001; }
    if ("_20140401".equals(_x)) { return CDSTANDARDvalues._20140401; }
    if ("_20140701".equals(_x)) { return CDSTANDARDvalues._20140701; }
    if ("_20141001".equals(_x)) { return CDSTANDARDvalues._20141001; }
    if ("_20141201".equals(_x)) { return CDSTANDARDvalues._20141201; }
    if ("_20150301".equals(_x)) { return CDSTANDARDvalues._20150301; }
    if ("_20150601".equals(_x)) { return CDSTANDARDvalues._20150601; }
    if ("_20150901".equals(_x)) { return CDSTANDARDvalues._20150901; }
    if ("_20151201".equals(_x)) { return CDSTANDARDvalues._20151201; }
    if ("_20160301".equals(_x)) { return CDSTANDARDvalues._20160301; }
    if ("_20160601".equals(_x)) { return CDSTANDARDvalues._20160601; }
    if ("_20160901".equals(_x)) { return CDSTANDARDvalues._20160901; }
    if ("_20161201".equals(_x)) { return CDSTANDARDvalues._20161201; }
    if ("_20170301".equals(_x)) { return CDSTANDARDvalues._20170301; }
    if ("_20170601".equals(_x)) { return CDSTANDARDvalues._20170601; }
    if ("_20170901".equals(_x)) { return CDSTANDARDvalues._20170901; }
    if ("_20171201".equals(_x)) { return CDSTANDARDvalues._20171201; }
    if ("_20180301".equals(_x)) { return CDSTANDARDvalues._20180301; }
    if ("_20180601".equals(_x)) { return CDSTANDARDvalues._20180601; }
    if ("_20180901".equals(_x)) { return CDSTANDARDvalues._20180901; }
    if ("_20181201".equals(_x)) { return CDSTANDARDvalues._20181201; }
    if ("_20190301".equals(_x)) { return CDSTANDARDvalues._20190301; }
    if ("_20190901".equals(_x)) { return CDSTANDARDvalues._20190901; }
    if ("_20200301".equals(_x)) { return CDSTANDARDvalues._20200301; }
    if ("_20200601".equals(_x)) { return CDSTANDARDvalues._20200601; }
    if ("_20200901".equals(_x)) { return CDSTANDARDvalues._20200901; }
    if ("_20201201".equals(_x)) { return CDSTANDARDvalues._20201201; }
    if ("_20210120".equals(_x)) { return CDSTANDARDvalues._20210120; }
    if ("_20220401".equals(_x)) { return CDSTANDARDvalues._20220401; }
    if ("_20220701".equals(_x)) { return CDSTANDARDvalues._20220701; }
    if ("_20221001".equals(_x)) { return CDSTANDARDvalues._20221001; }
    if ("_20230401".equals(_x)) { return CDSTANDARDvalues._20230401; }
    return null;
  }
}


enum CDSTENTBRIDGETYPEvalues { saphena1, saphena2, saphena3, saphena4, saphena5, lima, rima, gepa, freeima, radialis;

  public static CDSTENTBRIDGETYPEvalues parseCDSTENTBRIDGETYPEvalues(String _x) {
    if ("saphena1".equals(_x)) { return CDSTENTBRIDGETYPEvalues.saphena1; }
    if ("saphena2".equals(_x)) { return CDSTENTBRIDGETYPEvalues.saphena2; }
    if ("saphena3".equals(_x)) { return CDSTENTBRIDGETYPEvalues.saphena3; }
    if ("saphena4".equals(_x)) { return CDSTENTBRIDGETYPEvalues.saphena4; }
    if ("saphena5".equals(_x)) { return CDSTENTBRIDGETYPEvalues.saphena5; }
    if ("lima".equals(_x)) { return CDSTENTBRIDGETYPEvalues.lima; }
    if ("rima".equals(_x)) { return CDSTENTBRIDGETYPEvalues.rima; }
    if ("gepa".equals(_x)) { return CDSTENTBRIDGETYPEvalues.gepa; }
    if ("freeima".equals(_x)) { return CDSTENTBRIDGETYPEvalues.freeima; }
    if ("radialis".equals(_x)) { return CDSTENTBRIDGETYPEvalues.radialis; }
    return null;
  }
}


enum CDSTENTDEVICEvalues { bms, des, bvs, other;

  public static CDSTENTDEVICEvalues parseCDSTENTDEVICEvalues(String _x) {
    if ("bms".equals(_x)) { return CDSTENTDEVICEvalues.bms; }
    if ("des".equals(_x)) { return CDSTENTDEVICEvalues.des; }
    if ("bvs".equals(_x)) { return CDSTENTDEVICEvalues.bvs; }
    if ("other".equals(_x)) { return CDSTENTDEVICEvalues.other; }
    return null;
  }
}


enum CDSTENTDOMINANCEvalues { left, right;

  public static CDSTENTDOMINANCEvalues parseCDSTENTDOMINANCEvalues(String _x) {
    if ("left".equals(_x)) { return CDSTENTDOMINANCEvalues.left; }
    if ("right".equals(_x)) { return CDSTENTDOMINANCEvalues.right; }
    return null;
  }
}


enum CDSTENTLESIONTYPEvalues { simple, multiSegment, aortoOstiale, bifurcation, occlusionchroniquetotplus3m;

  public static CDSTENTLESIONTYPEvalues parseCDSTENTLESIONTYPEvalues(String _x) {
    if ("simple".equals(_x)) { return CDSTENTLESIONTYPEvalues.simple; }
    if ("multiSegment".equals(_x)) { return CDSTENTLESIONTYPEvalues.multiSegment; }
    if ("aortoOstiale".equals(_x)) { return CDSTENTLESIONTYPEvalues.aortoOstiale; }
    if ("bifurcation".equals(_x)) { return CDSTENTLESIONTYPEvalues.bifurcation; }
    if ("occlusionchroniquetotplus3m".equals(_x)) { return CDSTENTLESIONTYPEvalues.occlusionchroniquetotplus3m; }
    return null;
  }
}


enum CDSTENTSEGMENTvalues { proxrca, midrca, distrca, rightposteriordescending, leftmain, proxlad, midlad, distlad, d1, d2, d3, proxcx, intermediatebissectrice, m1, m2, distcx, pl1, pl2, pl3, leftposteriordescending, rv, rightpl2, rightpl3, pl4;

  public static CDSTENTSEGMENTvalues parseCDSTENTSEGMENTvalues(String _x) {
    if ("proxrca".equals(_x)) { return CDSTENTSEGMENTvalues.proxrca; }
    if ("midrca".equals(_x)) { return CDSTENTSEGMENTvalues.midrca; }
    if ("distrca".equals(_x)) { return CDSTENTSEGMENTvalues.distrca; }
    if ("rightposteriordescending".equals(_x)) { return CDSTENTSEGMENTvalues.rightposteriordescending; }
    if ("leftmain".equals(_x)) { return CDSTENTSEGMENTvalues.leftmain; }
    if ("proxlad".equals(_x)) { return CDSTENTSEGMENTvalues.proxlad; }
    if ("midlad".equals(_x)) { return CDSTENTSEGMENTvalues.midlad; }
    if ("distlad".equals(_x)) { return CDSTENTSEGMENTvalues.distlad; }
    if ("d1".equals(_x)) { return CDSTENTSEGMENTvalues.d1; }
    if ("d2".equals(_x)) { return CDSTENTSEGMENTvalues.d2; }
    if ("d3".equals(_x)) { return CDSTENTSEGMENTvalues.d3; }
    if ("proxcx".equals(_x)) { return CDSTENTSEGMENTvalues.proxcx; }
    if ("intermediatebissectrice".equals(_x)) { return CDSTENTSEGMENTvalues.intermediatebissectrice; }
    if ("m1".equals(_x)) { return CDSTENTSEGMENTvalues.m1; }
    if ("m2".equals(_x)) { return CDSTENTSEGMENTvalues.m2; }
    if ("distcx".equals(_x)) { return CDSTENTSEGMENTvalues.distcx; }
    if ("pl1".equals(_x)) { return CDSTENTSEGMENTvalues.pl1; }
    if ("pl2".equals(_x)) { return CDSTENTSEGMENTvalues.pl2; }
    if ("pl3".equals(_x)) { return CDSTENTSEGMENTvalues.pl3; }
    if ("leftposteriordescending".equals(_x)) { return CDSTENTSEGMENTvalues.leftposteriordescending; }
    if ("rv".equals(_x)) { return CDSTENTSEGMENTvalues.rv; }
    if ("rightpl2".equals(_x)) { return CDSTENTSEGMENTvalues.rightpl2; }
    if ("rightpl3".equals(_x)) { return CDSTENTSEGMENTvalues.rightpl3; }
    if ("pl4".equals(_x)) { return CDSTENTSEGMENTvalues.pl4; }
    return null;
  }
}


enum CDSUBSTANCEschemes { CDINNCLUSTER, CDATC, CDEAN, CDSUBSTANCECNK;

  public static CDSUBSTANCEschemes parseCDSUBSTANCEschemes(String _x) {
    if ("CDINNCLUSTER".equals(_x)) { return CDSUBSTANCEschemes.CDINNCLUSTER; }
    if ("CDATC".equals(_x)) { return CDSUBSTANCEschemes.CDATC; }
    if ("CDEAN".equals(_x)) { return CDSUBSTANCEschemes.CDEAN; }
    if ("CDSUBSTANCECNK".equals(_x)) { return CDSUBSTANCEschemes.CDSUBSTANCECNK; }
    return null;
  }
}


enum CDTELECOMschemes { CDADDRESS, _CDTELECOM;

  public static CDTELECOMschemes parseCDTELECOMschemes(String _x) {
    if ("CDADDRESS".equals(_x)) { return CDTELECOMschemes.CDADDRESS; }
    if ("_CDTELECOM".equals(_x)) { return CDTELECOMschemes._CDTELECOM; }
    return null;
  }
}


enum CDTELECOMvalues { phone, mobile, fax, email, carenet;

  public static CDTELECOMvalues parseCDTELECOMvalues(String _x) {
    if ("phone".equals(_x)) { return CDTELECOMvalues.phone; }
    if ("mobile".equals(_x)) { return CDTELECOMvalues.mobile; }
    if ("fax".equals(_x)) { return CDTELECOMvalues.fax; }
    if ("email".equals(_x)) { return CDTELECOMvalues.email; }
    if ("carenet".equals(_x)) { return CDTELECOMvalues.carenet; }
    return null;
  }
}


enum CDTEMPORALITYvalues { oneshot, acute, chronic, reactivation, remission, subacute;

  public static CDTEMPORALITYvalues parseCDTEMPORALITYvalues(String _x) {
    if ("oneshot".equals(_x)) { return CDTEMPORALITYvalues.oneshot; }
    if ("acute".equals(_x)) { return CDTEMPORALITYvalues.acute; }
    if ("chronic".equals(_x)) { return CDTEMPORALITYvalues.chronic; }
    if ("reactivation".equals(_x)) { return CDTEMPORALITYvalues.reactivation; }
    if ("remission".equals(_x)) { return CDTEMPORALITYvalues.remission; }
    if ("subacute".equals(_x)) { return CDTEMPORALITYvalues.subacute; }
    return null;
  }
}


enum CDTHERAPEUTICLINKschemes { CDTHERAPEUTICLINKTYPE, LOCAL;

  public static CDTHERAPEUTICLINKschemes parseCDTHERAPEUTICLINKschemes(String _x) {
    if ("CDTHERAPEUTICLINKTYPE".equals(_x)) { return CDTHERAPEUTICLINKschemes.CDTHERAPEUTICLINKTYPE; }
    if ("LOCAL".equals(_x)) { return CDTHERAPEUTICLINKschemes.LOCAL; }
    return null;
  }
}


enum CDTIMEUNITschemes { CDTIMEUNIT, LOCAL;

  public static CDTIMEUNITschemes parseCDTIMEUNITschemes(String _x) {
    if ("CDTIMEUNIT".equals(_x)) { return CDTIMEUNITschemes.CDTIMEUNIT; }
    if ("LOCAL".equals(_x)) { return CDTIMEUNITschemes.LOCAL; }
    return null;
  }
}


enum CDTIMEUNITvalues { a, mo, wk, d, hr, min, s, ms, us, ns;

  public static CDTIMEUNITvalues parseCDTIMEUNITvalues(String _x) {
    if ("a".equals(_x)) { return CDTIMEUNITvalues.a; }
    if ("mo".equals(_x)) { return CDTIMEUNITvalues.mo; }
    if ("wk".equals(_x)) { return CDTIMEUNITvalues.wk; }
    if ("d".equals(_x)) { return CDTIMEUNITvalues.d; }
    if ("hr".equals(_x)) { return CDTIMEUNITvalues.hr; }
    if ("min".equals(_x)) { return CDTIMEUNITvalues.min; }
    if ("s".equals(_x)) { return CDTIMEUNITvalues.s; }
    if ("ms".equals(_x)) { return CDTIMEUNITvalues.ms; }
    if ("us".equals(_x)) { return CDTIMEUNITvalues.us; }
    if ("ns".equals(_x)) { return CDTIMEUNITvalues.ns; }
    return null;
  }
}


enum CDTRANSACTIONCARENETvalues { admission, _732, discharge, _725, _null;

  public static CDTRANSACTIONCARENETvalues parseCDTRANSACTIONCARENETvalues(String _x) {
    if ("admission".equals(_x)) { return CDTRANSACTIONCARENETvalues.admission; }
    if ("_732".equals(_x)) { return CDTRANSACTIONCARENETvalues._732; }
    if ("discharge".equals(_x)) { return CDTRANSACTIONCARENETvalues.discharge; }
    if ("_725".equals(_x)) { return CDTRANSACTIONCARENETvalues._725; }
    if ("_null".equals(_x)) { return CDTRANSACTIONCARENETvalues._null; }
    return null;
  }
}


enum CDTRANSACTIONMAAvalues { agreementrequest, agreementresponse, freeappendix, reglementaryappendix, consultationrequest, consultationresponse;

  public static CDTRANSACTIONMAAvalues parseCDTRANSACTIONMAAvalues(String _x) {
    if ("agreementrequest".equals(_x)) { return CDTRANSACTIONMAAvalues.agreementrequest; }
    if ("agreementresponse".equals(_x)) { return CDTRANSACTIONMAAvalues.agreementresponse; }
    if ("freeappendix".equals(_x)) { return CDTRANSACTIONMAAvalues.freeappendix; }
    if ("reglementaryappendix".equals(_x)) { return CDTRANSACTIONMAAvalues.reglementaryappendix; }
    if ("consultationrequest".equals(_x)) { return CDTRANSACTIONMAAvalues.consultationrequest; }
    if ("consultationresponse".equals(_x)) { return CDTRANSACTIONMAAvalues.consultationresponse; }
    return null;
  }
}


enum CDTRANSACTIONMYCARENETvalues { gmd, gmdclosure, gmdextension, tariff, tariffmediprima, cga, cgd, mea, cgacancellation, maa, maaextension, maaappendix, maacancellation, maaclosure, maaagreement, maarefusal, maaintreatment;

  public static CDTRANSACTIONMYCARENETvalues parseCDTRANSACTIONMYCARENETvalues(String _x) {
    if ("gmd".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.gmd; }
    if ("gmdclosure".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.gmdclosure; }
    if ("gmdextension".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.gmdextension; }
    if ("tariff".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.tariff; }
    if ("tariffmediprima".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.tariffmediprima; }
    if ("cga".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.cga; }
    if ("cgd".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.cgd; }
    if ("mea".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.mea; }
    if ("cgacancellation".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.cgacancellation; }
    if ("maa".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.maa; }
    if ("maaextension".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.maaextension; }
    if ("maaappendix".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.maaappendix; }
    if ("maacancellation".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.maacancellation; }
    if ("maaclosure".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.maaclosure; }
    if ("maaagreement".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.maaagreement; }
    if ("maarefusal".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.maarefusal; }
    if ("maaintreatment".equals(_x)) { return CDTRANSACTIONMYCARENETvalues.maaintreatment; }
    return null;
  }
}


enum CDTRANSACTIONREGvalues { qermidStentIntervention, orthoprideIntervention, defibIntervention, pacemakerIntervention, arthritisNotification;

  public static CDTRANSACTIONREGvalues parseCDTRANSACTIONREGvalues(String _x) {
    if ("qermidStentIntervention".equals(_x)) { return CDTRANSACTIONREGvalues.qermidStentIntervention; }
    if ("orthoprideIntervention".equals(_x)) { return CDTRANSACTIONREGvalues.orthoprideIntervention; }
    if ("defibIntervention".equals(_x)) { return CDTRANSACTIONREGvalues.defibIntervention; }
    if ("pacemakerIntervention".equals(_x)) { return CDTRANSACTIONREGvalues.pacemakerIntervention; }
    if ("arthritisNotification".equals(_x)) { return CDTRANSACTIONREGvalues.arthritisNotification; }
    return null;
  }
}


enum CDTRANSACTIONschemes { CDTRANSACTION, CDTRANSACTIONCARENET, CDTRANSACTIONMAA, CDCHAPTER4APPENDIX, CDTRANSACTIONREG, CDTRANSACTIONMYCARENET, CDTRANSACTIONTYPE, CDHUBSERVICE, CDDIARY, LOCAL, CDLABORESULTTYPE;

  public static CDTRANSACTIONschemes parseCDTRANSACTIONschemes(String _x) {
    if ("CDTRANSACTION".equals(_x)) { return CDTRANSACTIONschemes.CDTRANSACTION; }
    if ("CDTRANSACTIONCARENET".equals(_x)) { return CDTRANSACTIONschemes.CDTRANSACTIONCARENET; }
    if ("CDTRANSACTIONMAA".equals(_x)) { return CDTRANSACTIONschemes.CDTRANSACTIONMAA; }
    if ("CDCHAPTER4APPENDIX".equals(_x)) { return CDTRANSACTIONschemes.CDCHAPTER4APPENDIX; }
    if ("CDTRANSACTIONREG".equals(_x)) { return CDTRANSACTIONschemes.CDTRANSACTIONREG; }
    if ("CDTRANSACTIONMYCARENET".equals(_x)) { return CDTRANSACTIONschemes.CDTRANSACTIONMYCARENET; }
    if ("CDTRANSACTIONTYPE".equals(_x)) { return CDTRANSACTIONschemes.CDTRANSACTIONTYPE; }
    if ("CDHUBSERVICE".equals(_x)) { return CDTRANSACTIONschemes.CDHUBSERVICE; }
    if ("CDDIARY".equals(_x)) { return CDTRANSACTIONschemes.CDDIARY; }
    if ("LOCAL".equals(_x)) { return CDTRANSACTIONschemes.LOCAL; }
    if ("CDLABORESULTTYPE".equals(_x)) { return CDTRANSACTIONschemes.CDLABORESULTTYPE; }
    return null;
  }
}


enum CDTRANSACTIONTYPEvalues { incapacity, incapacityextension, incapacityrelapse, nursing, physiotherapy, intermediarynursing, intermediaryphysiotherapy, transferdocument, childrecord;

  public static CDTRANSACTIONTYPEvalues parseCDTRANSACTIONTYPEvalues(String _x) {
    if ("incapacity".equals(_x)) { return CDTRANSACTIONTYPEvalues.incapacity; }
    if ("incapacityextension".equals(_x)) { return CDTRANSACTIONTYPEvalues.incapacityextension; }
    if ("incapacityrelapse".equals(_x)) { return CDTRANSACTIONTYPEvalues.incapacityrelapse; }
    if ("nursing".equals(_x)) { return CDTRANSACTIONTYPEvalues.nursing; }
    if ("physiotherapy".equals(_x)) { return CDTRANSACTIONTYPEvalues.physiotherapy; }
    if ("intermediarynursing".equals(_x)) { return CDTRANSACTIONTYPEvalues.intermediarynursing; }
    if ("intermediaryphysiotherapy".equals(_x)) { return CDTRANSACTIONTYPEvalues.intermediaryphysiotherapy; }
    if ("transferdocument".equals(_x)) { return CDTRANSACTIONTYPEvalues.transferdocument; }
    if ("childrecord".equals(_x)) { return CDTRANSACTIONTYPEvalues.childrecord; }
    return null;
  }
}


enum CDTRANSACTIONvalues { admission, alert, contactreport, death, discharge, dischargereport, epidemiology, labrequest, labresult, note, hospitalpharmaceuticalprescription, pharmaceuticalprescription, productdelivery, quickdischargereport, referral, request, _result, vaccination, sumehr, ecareSafeConsultation, ebirthMotherNotification, ebirthBabyNotification, ebirthBabyMedicalform, ebirthMotherMedicalform, clinicalsummary, medicaladvisoragreement, bvtSample, clinicalpath, telemonitoring, radiationexposuremonitoring, intervention, medicationschemeelement, treatmentsuspension, prescription, notification, report, medicationscheme, vaccinationscheme, vaccinationschemeelement, ecareTardisConsultation, genericregistryentry, populationBasedScreening, childPrevention, careplan, applicationlink, diarynote, mea, perinatal, belraiReport, nursingsummaryreport, pharmaceuticalmedicationscheme;

  public static CDTRANSACTIONvalues parseCDTRANSACTIONvalues(String _x) {
    if ("admission".equals(_x)) { return CDTRANSACTIONvalues.admission; }
    if ("alert".equals(_x)) { return CDTRANSACTIONvalues.alert; }
    if ("contactreport".equals(_x)) { return CDTRANSACTIONvalues.contactreport; }
    if ("death".equals(_x)) { return CDTRANSACTIONvalues.death; }
    if ("discharge".equals(_x)) { return CDTRANSACTIONvalues.discharge; }
    if ("dischargereport".equals(_x)) { return CDTRANSACTIONvalues.dischargereport; }
    if ("epidemiology".equals(_x)) { return CDTRANSACTIONvalues.epidemiology; }
    if ("labrequest".equals(_x)) { return CDTRANSACTIONvalues.labrequest; }
    if ("labresult".equals(_x)) { return CDTRANSACTIONvalues.labresult; }
    if ("note".equals(_x)) { return CDTRANSACTIONvalues.note; }
    if ("hospitalpharmaceuticalprescription".equals(_x)) { return CDTRANSACTIONvalues.hospitalpharmaceuticalprescription; }
    if ("pharmaceuticalprescription".equals(_x)) { return CDTRANSACTIONvalues.pharmaceuticalprescription; }
    if ("productdelivery".equals(_x)) { return CDTRANSACTIONvalues.productdelivery; }
    if ("quickdischargereport".equals(_x)) { return CDTRANSACTIONvalues.quickdischargereport; }
    if ("referral".equals(_x)) { return CDTRANSACTIONvalues.referral; }
    if ("request".equals(_x)) { return CDTRANSACTIONvalues.request; }
    if ("_result".equals(_x)) { return CDTRANSACTIONvalues._result; }
    if ("vaccination".equals(_x)) { return CDTRANSACTIONvalues.vaccination; }
    if ("sumehr".equals(_x)) { return CDTRANSACTIONvalues.sumehr; }
    if ("ecareSafeConsultation".equals(_x)) { return CDTRANSACTIONvalues.ecareSafeConsultation; }
    if ("ebirthMotherNotification".equals(_x)) { return CDTRANSACTIONvalues.ebirthMotherNotification; }
    if ("ebirthBabyNotification".equals(_x)) { return CDTRANSACTIONvalues.ebirthBabyNotification; }
    if ("ebirthBabyMedicalform".equals(_x)) { return CDTRANSACTIONvalues.ebirthBabyMedicalform; }
    if ("ebirthMotherMedicalform".equals(_x)) { return CDTRANSACTIONvalues.ebirthMotherMedicalform; }
    if ("clinicalsummary".equals(_x)) { return CDTRANSACTIONvalues.clinicalsummary; }
    if ("medicaladvisoragreement".equals(_x)) { return CDTRANSACTIONvalues.medicaladvisoragreement; }
    if ("bvtSample".equals(_x)) { return CDTRANSACTIONvalues.bvtSample; }
    if ("clinicalpath".equals(_x)) { return CDTRANSACTIONvalues.clinicalpath; }
    if ("telemonitoring".equals(_x)) { return CDTRANSACTIONvalues.telemonitoring; }
    if ("radiationexposuremonitoring".equals(_x)) { return CDTRANSACTIONvalues.radiationexposuremonitoring; }
    if ("intervention".equals(_x)) { return CDTRANSACTIONvalues.intervention; }
    if ("medicationschemeelement".equals(_x)) { return CDTRANSACTIONvalues.medicationschemeelement; }
    if ("treatmentsuspension".equals(_x)) { return CDTRANSACTIONvalues.treatmentsuspension; }
    if ("prescription".equals(_x)) { return CDTRANSACTIONvalues.prescription; }
    if ("notification".equals(_x)) { return CDTRANSACTIONvalues.notification; }
    if ("report".equals(_x)) { return CDTRANSACTIONvalues.report; }
    if ("medicationscheme".equals(_x)) { return CDTRANSACTIONvalues.medicationscheme; }
    if ("vaccinationscheme".equals(_x)) { return CDTRANSACTIONvalues.vaccinationscheme; }
    if ("vaccinationschemeelement".equals(_x)) { return CDTRANSACTIONvalues.vaccinationschemeelement; }
    if ("ecareTardisConsultation".equals(_x)) { return CDTRANSACTIONvalues.ecareTardisConsultation; }
    if ("genericregistryentry".equals(_x)) { return CDTRANSACTIONvalues.genericregistryentry; }
    if ("populationBasedScreening".equals(_x)) { return CDTRANSACTIONvalues.populationBasedScreening; }
    if ("childPrevention".equals(_x)) { return CDTRANSACTIONvalues.childPrevention; }
    if ("careplan".equals(_x)) { return CDTRANSACTIONvalues.careplan; }
    if ("applicationlink".equals(_x)) { return CDTRANSACTIONvalues.applicationlink; }
    if ("diarynote".equals(_x)) { return CDTRANSACTIONvalues.diarynote; }
    if ("mea".equals(_x)) { return CDTRANSACTIONvalues.mea; }
    if ("perinatal".equals(_x)) { return CDTRANSACTIONvalues.perinatal; }
    if ("belraiReport".equals(_x)) { return CDTRANSACTIONvalues.belraiReport; }
    if ("nursingsummaryreport".equals(_x)) { return CDTRANSACTIONvalues.nursingsummaryreport; }
    if ("pharmaceuticalmedicationscheme".equals(_x)) { return CDTRANSACTIONvalues.pharmaceuticalmedicationscheme; }
    return null;
  }
}


enum CDTUCOPATHOLOGYTYPEvalues { diabetedietarycontrol, diabeteoralmedication, diabeteinsulin, diabetenewlydiagnosed, diabete, renalfailurelessthan30ml, instentrestenosis, cardioshockatstartpci, stroke, peripheralvasculardisease, stentthrombosis;

  public static CDTUCOPATHOLOGYTYPEvalues parseCDTUCOPATHOLOGYTYPEvalues(String _x) {
    if ("diabetedietarycontrol".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.diabetedietarycontrol; }
    if ("diabeteoralmedication".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.diabeteoralmedication; }
    if ("diabeteinsulin".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.diabeteinsulin; }
    if ("diabetenewlydiagnosed".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.diabetenewlydiagnosed; }
    if ("diabete".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.diabete; }
    if ("renalfailurelessthan30ml".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.renalfailurelessthan30ml; }
    if ("instentrestenosis".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.instentrestenosis; }
    if ("cardioshockatstartpci".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.cardioshockatstartpci; }
    if ("stroke".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.stroke; }
    if ("peripheralvasculardisease".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.peripheralvasculardisease; }
    if ("stentthrombosis".equals(_x)) { return CDTUCOPATHOLOGYTYPEvalues.stentthrombosis; }
    return null;
  }
}


enum CDTUCOSTEMITYPEvalues { stemipci, stemirescue, stemilate, nonstemiurgent, nonstemielective, nonstemilate, emergentpci, electivepci, outofhospitalarrest, stagedpci, complicationpriorpci, recurrendischaemia;

  public static CDTUCOSTEMITYPEvalues parseCDTUCOSTEMITYPEvalues(String _x) {
    if ("stemipci".equals(_x)) { return CDTUCOSTEMITYPEvalues.stemipci; }
    if ("stemirescue".equals(_x)) { return CDTUCOSTEMITYPEvalues.stemirescue; }
    if ("stemilate".equals(_x)) { return CDTUCOSTEMITYPEvalues.stemilate; }
    if ("nonstemiurgent".equals(_x)) { return CDTUCOSTEMITYPEvalues.nonstemiurgent; }
    if ("nonstemielective".equals(_x)) { return CDTUCOSTEMITYPEvalues.nonstemielective; }
    if ("nonstemilate".equals(_x)) { return CDTUCOSTEMITYPEvalues.nonstemilate; }
    if ("emergentpci".equals(_x)) { return CDTUCOSTEMITYPEvalues.emergentpci; }
    if ("electivepci".equals(_x)) { return CDTUCOSTEMITYPEvalues.electivepci; }
    if ("outofhospitalarrest".equals(_x)) { return CDTUCOSTEMITYPEvalues.outofhospitalarrest; }
    if ("stagedpci".equals(_x)) { return CDTUCOSTEMITYPEvalues.stagedpci; }
    if ("complicationpriorpci".equals(_x)) { return CDTUCOSTEMITYPEvalues.complicationpriorpci; }
    if ("recurrendischaemia".equals(_x)) { return CDTUCOSTEMITYPEvalues.recurrendischaemia; }
    return null;
  }
}


enum CDUNITschemes { CDUNIT, CDCURRENCY, UCUM, CDTIMEUNIT;

  public static CDUNITschemes parseCDUNITschemes(String _x) {
    if ("CDUNIT".equals(_x)) { return CDUNITschemes.CDUNIT; }
    if ("CDCURRENCY".equals(_x)) { return CDUNITschemes.CDCURRENCY; }
    if ("UCUM".equals(_x)) { return CDUNITschemes.UCUM; }
    if ("CDTIMEUNIT".equals(_x)) { return CDUNITschemes.CDTIMEUNIT; }
    return null;
  }
}


enum CDUNITvalues { _null, vv, wv, ww, _1000Mm3, mgDl, amp, bag, bitperminute, bol, bot, box, c, can, cap, cc, cm, cmm, cnt, ctr, daily, day, spoon, week, month, degree, dis, drm, fl, fld, flo, ftc, fts, gDl, mg, mgMl, mgL, mgM2, minute, mm, mmH, mmhg, second, millisecond, hour, goutte, ml, ctg, gal, gm, gr, in, inc, jar, kg, kgM2, kit, l, lb, lm, loz, mcg, mcl, mcm, mcn, meq, mic, mil, min, mis, mmo, mol, nl, nmg, nmo, ns, oz, pel, pg, pkg, pnu, ppm, pt, qs, qt, sat, spr, sqc, stp, sup, syr, tab, tbl, tes, ton, tpn, trc, tro, tsp, tub, umg, unt, vil, vpr, waf, x, ydl, yds, ondemand, mgper100ml, mlMin, shock, atptreatment, gyCm2, mlMin173m2;

  public static CDUNITvalues parseCDUNITvalues(String _x) {
    if ("_null".equals(_x)) { return CDUNITvalues._null; }
    if ("vv".equals(_x)) { return CDUNITvalues.vv; }
    if ("wv".equals(_x)) { return CDUNITvalues.wv; }
    if ("ww".equals(_x)) { return CDUNITvalues.ww; }
    if ("_1000Mm3".equals(_x)) { return CDUNITvalues._1000Mm3; }
    if ("mgDl".equals(_x)) { return CDUNITvalues.mgDl; }
    if ("amp".equals(_x)) { return CDUNITvalues.amp; }
    if ("bag".equals(_x)) { return CDUNITvalues.bag; }
    if ("bitperminute".equals(_x)) { return CDUNITvalues.bitperminute; }
    if ("bol".equals(_x)) { return CDUNITvalues.bol; }
    if ("bot".equals(_x)) { return CDUNITvalues.bot; }
    if ("box".equals(_x)) { return CDUNITvalues.box; }
    if ("c".equals(_x)) { return CDUNITvalues.c; }
    if ("can".equals(_x)) { return CDUNITvalues.can; }
    if ("cap".equals(_x)) { return CDUNITvalues.cap; }
    if ("cc".equals(_x)) { return CDUNITvalues.cc; }
    if ("cm".equals(_x)) { return CDUNITvalues.cm; }
    if ("cmm".equals(_x)) { return CDUNITvalues.cmm; }
    if ("cnt".equals(_x)) { return CDUNITvalues.cnt; }
    if ("ctr".equals(_x)) { return CDUNITvalues.ctr; }
    if ("daily".equals(_x)) { return CDUNITvalues.daily; }
    if ("day".equals(_x)) { return CDUNITvalues.day; }
    if ("spoon".equals(_x)) { return CDUNITvalues.spoon; }
    if ("week".equals(_x)) { return CDUNITvalues.week; }
    if ("month".equals(_x)) { return CDUNITvalues.month; }
    if ("degree".equals(_x)) { return CDUNITvalues.degree; }
    if ("dis".equals(_x)) { return CDUNITvalues.dis; }
    if ("drm".equals(_x)) { return CDUNITvalues.drm; }
    if ("fl".equals(_x)) { return CDUNITvalues.fl; }
    if ("fld".equals(_x)) { return CDUNITvalues.fld; }
    if ("flo".equals(_x)) { return CDUNITvalues.flo; }
    if ("ftc".equals(_x)) { return CDUNITvalues.ftc; }
    if ("fts".equals(_x)) { return CDUNITvalues.fts; }
    if ("gDl".equals(_x)) { return CDUNITvalues.gDl; }
    if ("mg".equals(_x)) { return CDUNITvalues.mg; }
    if ("mgMl".equals(_x)) { return CDUNITvalues.mgMl; }
    if ("mgL".equals(_x)) { return CDUNITvalues.mgL; }
    if ("mgM2".equals(_x)) { return CDUNITvalues.mgM2; }
    if ("minute".equals(_x)) { return CDUNITvalues.minute; }
    if ("mm".equals(_x)) { return CDUNITvalues.mm; }
    if ("mmH".equals(_x)) { return CDUNITvalues.mmH; }
    if ("mmhg".equals(_x)) { return CDUNITvalues.mmhg; }
    if ("second".equals(_x)) { return CDUNITvalues.second; }
    if ("millisecond".equals(_x)) { return CDUNITvalues.millisecond; }
    if ("hour".equals(_x)) { return CDUNITvalues.hour; }
    if ("goutte".equals(_x)) { return CDUNITvalues.goutte; }
    if ("ml".equals(_x)) { return CDUNITvalues.ml; }
    if ("ctg".equals(_x)) { return CDUNITvalues.ctg; }
    if ("gal".equals(_x)) { return CDUNITvalues.gal; }
    if ("gm".equals(_x)) { return CDUNITvalues.gm; }
    if ("gr".equals(_x)) { return CDUNITvalues.gr; }
    if ("in".equals(_x)) { return CDUNITvalues.in; }
    if ("inc".equals(_x)) { return CDUNITvalues.inc; }
    if ("jar".equals(_x)) { return CDUNITvalues.jar; }
    if ("kg".equals(_x)) { return CDUNITvalues.kg; }
    if ("kgM2".equals(_x)) { return CDUNITvalues.kgM2; }
    if ("kit".equals(_x)) { return CDUNITvalues.kit; }
    if ("l".equals(_x)) { return CDUNITvalues.l; }
    if ("lb".equals(_x)) { return CDUNITvalues.lb; }
    if ("lm".equals(_x)) { return CDUNITvalues.lm; }
    if ("loz".equals(_x)) { return CDUNITvalues.loz; }
    if ("mcg".equals(_x)) { return CDUNITvalues.mcg; }
    if ("mcl".equals(_x)) { return CDUNITvalues.mcl; }
    if ("mcm".equals(_x)) { return CDUNITvalues.mcm; }
    if ("mcn".equals(_x)) { return CDUNITvalues.mcn; }
    if ("meq".equals(_x)) { return CDUNITvalues.meq; }
    if ("mic".equals(_x)) { return CDUNITvalues.mic; }
    if ("mil".equals(_x)) { return CDUNITvalues.mil; }
    if ("min".equals(_x)) { return CDUNITvalues.min; }
    if ("mis".equals(_x)) { return CDUNITvalues.mis; }
    if ("mmo".equals(_x)) { return CDUNITvalues.mmo; }
    if ("mol".equals(_x)) { return CDUNITvalues.mol; }
    if ("nl".equals(_x)) { return CDUNITvalues.nl; }
    if ("nmg".equals(_x)) { return CDUNITvalues.nmg; }
    if ("nmo".equals(_x)) { return CDUNITvalues.nmo; }
    if ("ns".equals(_x)) { return CDUNITvalues.ns; }
    if ("oz".equals(_x)) { return CDUNITvalues.oz; }
    if ("pel".equals(_x)) { return CDUNITvalues.pel; }
    if ("pg".equals(_x)) { return CDUNITvalues.pg; }
    if ("pkg".equals(_x)) { return CDUNITvalues.pkg; }
    if ("pnu".equals(_x)) { return CDUNITvalues.pnu; }
    if ("ppm".equals(_x)) { return CDUNITvalues.ppm; }
    if ("pt".equals(_x)) { return CDUNITvalues.pt; }
    if ("qs".equals(_x)) { return CDUNITvalues.qs; }
    if ("qt".equals(_x)) { return CDUNITvalues.qt; }
    if ("sat".equals(_x)) { return CDUNITvalues.sat; }
    if ("spr".equals(_x)) { return CDUNITvalues.spr; }
    if ("sqc".equals(_x)) { return CDUNITvalues.sqc; }
    if ("stp".equals(_x)) { return CDUNITvalues.stp; }
    if ("sup".equals(_x)) { return CDUNITvalues.sup; }
    if ("syr".equals(_x)) { return CDUNITvalues.syr; }
    if ("tab".equals(_x)) { return CDUNITvalues.tab; }
    if ("tbl".equals(_x)) { return CDUNITvalues.tbl; }
    if ("tes".equals(_x)) { return CDUNITvalues.tes; }
    if ("ton".equals(_x)) { return CDUNITvalues.ton; }
    if ("tpn".equals(_x)) { return CDUNITvalues.tpn; }
    if ("trc".equals(_x)) { return CDUNITvalues.trc; }
    if ("tro".equals(_x)) { return CDUNITvalues.tro; }
    if ("tsp".equals(_x)) { return CDUNITvalues.tsp; }
    if ("tub".equals(_x)) { return CDUNITvalues.tub; }
    if ("umg".equals(_x)) { return CDUNITvalues.umg; }
    if ("unt".equals(_x)) { return CDUNITvalues.unt; }
    if ("vil".equals(_x)) { return CDUNITvalues.vil; }
    if ("vpr".equals(_x)) { return CDUNITvalues.vpr; }
    if ("waf".equals(_x)) { return CDUNITvalues.waf; }
    if ("x".equals(_x)) { return CDUNITvalues.x; }
    if ("ydl".equals(_x)) { return CDUNITvalues.ydl; }
    if ("yds".equals(_x)) { return CDUNITvalues.yds; }
    if ("ondemand".equals(_x)) { return CDUNITvalues.ondemand; }
    if ("mgper100ml".equals(_x)) { return CDUNITvalues.mgper100ml; }
    if ("mlMin".equals(_x)) { return CDUNITvalues.mlMin; }
    if ("shock".equals(_x)) { return CDUNITvalues.shock; }
    if ("atptreatment".equals(_x)) { return CDUNITvalues.atptreatment; }
    if ("gyCm2".equals(_x)) { return CDUNITvalues.gyCm2; }
    if ("mlMin173m2".equals(_x)) { return CDUNITvalues.mlMin173m2; }
    return null;
  }
}


enum CDURGENCYvalues { asap, hour, _4hours, _12hours, day, week, month;

  public static CDURGENCYvalues parseCDURGENCYvalues(String _x) {
    if ("asap".equals(_x)) { return CDURGENCYvalues.asap; }
    if ("hour".equals(_x)) { return CDURGENCYvalues.hour; }
    if ("_4hours".equals(_x)) { return CDURGENCYvalues._4hours; }
    if ("_12hours".equals(_x)) { return CDURGENCYvalues._12hours; }
    if ("day".equals(_x)) { return CDURGENCYvalues.day; }
    if ("week".equals(_x)) { return CDURGENCYvalues.week; }
    if ("month".equals(_x)) { return CDURGENCYvalues.month; }
    return null;
  }
}


enum CDVACCINEINDICATIONvalues { poliomyelitis, measles, rubella, mumps, seasonalinfluenza, hepatitisa, hepatitisb, rabies, varicella, rotavirus, papillomavirus, yellowfever, tickborneencephalitis, ej, diphteria, tetanus, pertussis, hib, meningitisc, meningitis, pneumonia23, pneumonia7, tuberculosis, typhoid, pandemics, herpeszoster, cholera, covid19, meningitisb, pneumonia15, pneumonia20;

  public static CDVACCINEINDICATIONvalues parseCDVACCINEINDICATIONvalues(String _x) {
    if ("poliomyelitis".equals(_x)) { return CDVACCINEINDICATIONvalues.poliomyelitis; }
    if ("measles".equals(_x)) { return CDVACCINEINDICATIONvalues.measles; }
    if ("rubella".equals(_x)) { return CDVACCINEINDICATIONvalues.rubella; }
    if ("mumps".equals(_x)) { return CDVACCINEINDICATIONvalues.mumps; }
    if ("seasonalinfluenza".equals(_x)) { return CDVACCINEINDICATIONvalues.seasonalinfluenza; }
    if ("hepatitisa".equals(_x)) { return CDVACCINEINDICATIONvalues.hepatitisa; }
    if ("hepatitisb".equals(_x)) { return CDVACCINEINDICATIONvalues.hepatitisb; }
    if ("rabies".equals(_x)) { return CDVACCINEINDICATIONvalues.rabies; }
    if ("varicella".equals(_x)) { return CDVACCINEINDICATIONvalues.varicella; }
    if ("rotavirus".equals(_x)) { return CDVACCINEINDICATIONvalues.rotavirus; }
    if ("papillomavirus".equals(_x)) { return CDVACCINEINDICATIONvalues.papillomavirus; }
    if ("yellowfever".equals(_x)) { return CDVACCINEINDICATIONvalues.yellowfever; }
    if ("tickborneencephalitis".equals(_x)) { return CDVACCINEINDICATIONvalues.tickborneencephalitis; }
    if ("ej".equals(_x)) { return CDVACCINEINDICATIONvalues.ej; }
    if ("diphteria".equals(_x)) { return CDVACCINEINDICATIONvalues.diphteria; }
    if ("tetanus".equals(_x)) { return CDVACCINEINDICATIONvalues.tetanus; }
    if ("pertussis".equals(_x)) { return CDVACCINEINDICATIONvalues.pertussis; }
    if ("hib".equals(_x)) { return CDVACCINEINDICATIONvalues.hib; }
    if ("meningitisc".equals(_x)) { return CDVACCINEINDICATIONvalues.meningitisc; }
    if ("meningitis".equals(_x)) { return CDVACCINEINDICATIONvalues.meningitis; }
    if ("pneumonia23".equals(_x)) { return CDVACCINEINDICATIONvalues.pneumonia23; }
    if ("pneumonia7".equals(_x)) { return CDVACCINEINDICATIONvalues.pneumonia7; }
    if ("tuberculosis".equals(_x)) { return CDVACCINEINDICATIONvalues.tuberculosis; }
    if ("typhoid".equals(_x)) { return CDVACCINEINDICATIONvalues.typhoid; }
    if ("pandemics".equals(_x)) { return CDVACCINEINDICATIONvalues.pandemics; }
    if ("herpeszoster".equals(_x)) { return CDVACCINEINDICATIONvalues.herpeszoster; }
    if ("cholera".equals(_x)) { return CDVACCINEINDICATIONvalues.cholera; }
    if ("covid19".equals(_x)) { return CDVACCINEINDICATIONvalues.covid19; }
    if ("meningitisb".equals(_x)) { return CDVACCINEINDICATIONvalues.meningitisb; }
    if ("pneumonia15".equals(_x)) { return CDVACCINEINDICATIONvalues.pneumonia15; }
    if ("pneumonia20".equals(_x)) { return CDVACCINEINDICATIONvalues.pneumonia20; }
    return null;
  }
}


enum CDVACCINEvalues { polio, diteper, haemo, mmr, hepatitiesb, mmr12, dite12, meningitisc, influenza, pneumonia, ditepro;

  public static CDVACCINEvalues parseCDVACCINEvalues(String _x) {
    if ("polio".equals(_x)) { return CDVACCINEvalues.polio; }
    if ("diteper".equals(_x)) { return CDVACCINEvalues.diteper; }
    if ("haemo".equals(_x)) { return CDVACCINEvalues.haemo; }
    if ("mmr".equals(_x)) { return CDVACCINEvalues.mmr; }
    if ("hepatitiesb".equals(_x)) { return CDVACCINEvalues.hepatitiesb; }
    if ("mmr12".equals(_x)) { return CDVACCINEvalues.mmr12; }
    if ("dite12".equals(_x)) { return CDVACCINEvalues.dite12; }
    if ("meningitisc".equals(_x)) { return CDVACCINEvalues.meningitisc; }
    if ("influenza".equals(_x)) { return CDVACCINEvalues.influenza; }
    if ("pneumonia".equals(_x)) { return CDVACCINEvalues.pneumonia; }
    if ("ditepro".equals(_x)) { return CDVACCINEvalues.ditepro; }
    return null;
  }
}


enum CDWEEKDAYvalues { sunday, monday, tuesday, wednesday, thursday, friday, saturday;

  public static CDWEEKDAYvalues parseCDWEEKDAYvalues(String _x) {
    if ("sunday".equals(_x)) { return CDWEEKDAYvalues.sunday; }
    if ("monday".equals(_x)) { return CDWEEKDAYvalues.monday; }
    if ("tuesday".equals(_x)) { return CDWEEKDAYvalues.tuesday; }
    if ("wednesday".equals(_x)) { return CDWEEKDAYvalues.wednesday; }
    if ("thursday".equals(_x)) { return CDWEEKDAYvalues.thursday; }
    if ("friday".equals(_x)) { return CDWEEKDAYvalues.friday; }
    if ("saturday".equals(_x)) { return CDWEEKDAYvalues.saturday; }
    return null;
  }
}


enum AdministrativeGenderEnum { male, female, other, unknown;

  public static AdministrativeGenderEnum parseAdministrativeGenderEnum(String _x) {
    if ("male".equals(_x)) { return AdministrativeGenderEnum.male; }
    if ("female".equals(_x)) { return AdministrativeGenderEnum.female; }
    if ("other".equals(_x)) { return AdministrativeGenderEnum.other; }
    if ("unknown".equals(_x)) { return AdministrativeGenderEnum.unknown; }
    return null;
  }
}


public interface SystemTypes
{
  public class Set
  { 


  public static ArrayList copySequence(ArrayList s)
  { ArrayList result = new ArrayList();
    result.addAll(s);
    return result;
  }

  public static HashMap copyMap(Map s)
  { HashMap result = new HashMap();
    result.putAll(s);
    return result;
  }

  public static ArrayList sequenceRange(Object[] arr, int n)
  { ArrayList res = new ArrayList();
    for (int i = 0; i < n; i++) 
    { res.add(arr[i]); } 
    return res; 
  }

  public static int sequenceCompare(List sq1, List sq2)
  { int res = 0;
    for (int i = 0; i < sq1.size() && i < sq2.size(); i++)
    { Object elem1 = sq1.get(i);
      if (((Comparable) elem1).compareTo(sq2.get(i)) < 0)
      { return -1; }
      else if (((Comparable) elem1).compareTo(sq2.get(i)) > 0)
      { return 1; }
    }

    if (sq1.size() > sq2.size())
    { return 1; }
    if (sq2.size() > sq1.size())
    { return -1; }
    return res;
  }


    public static long getTime()
    { java.util.Date d = new java.util.Date();
      return d.getTime();
    }

    public static double roundN(double x, int n)
    { if (n == 0) 
      { return Math.round(x); }
      double y = x*Math.pow(10,n); 
      return Math.round(y)/Math.pow(10,n);
    }

    public static double truncateN(double x, int n)
    { if (n < 0) 
      { return (int) x; }
      double y = x*Math.pow(10,n); 
      return ((int) y)/Math.pow(10,n);
    }


  public static ArrayList select_0(ArrayList _l)
  { // Implements: self.cd->select(cdx | cdx.s = "CD-TELECOM")
    ArrayList _results_0 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { CDTELECOM cdx = (CDTELECOM) _l.get(_i);
      if (((String) cdx.gets()).equals("CD-TELECOM"))
      { _results_0.add(cdx); }
    }
    return _results_0;
  }

  public static HashSet select_0(HashSet _l)
  { HashSet _results_0 = new HashSet();
    for (Object _i : _l)
    { CDTELECOM cdx = (CDTELECOM) _i;
      if (((String) cdx.gets()).equals("CD-TELECOM"))
      { _results_0.add(cdx); }
    }
    return _results_0;
  }

  public static ArrayList select_6(ArrayList _l)
  { // Implements: self.intendedcd->select(cdx | cdx.s = "CD-DRUG-CNK")
    ArrayList _results_6 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { CDDRUGCNK cdx = (CDDRUGCNK) _l.get(_i);
      if (((String) cdx.gets()).equals("CD-DRUG-CNK"))
      { _results_6.add(cdx); }
    }
    return _results_6;
  }

  public static HashSet select_6(HashSet _l)
  { HashSet _results_6 = new HashSet();
    for (Object _i : _l)
    { CDDRUGCNK cdx = (CDDRUGCNK) _i;
      if (((String) cdx.gets()).equals("CD-DRUG-CNK"))
      { _results_6.add(cdx); }
    }
    return _results_6;
  }

  public static ArrayList select_8(ArrayList _l)
  { // Implements: self.kmehrmessage.folder->select(fx | fx.patient /= null)
    ArrayList _results_8 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { FolderType fx = (FolderType) _l.get(_i);
      if (fx.getpatient() != null)
      { _results_8.add(fx); }
    }
    return _results_8;
  }

  public static HashSet select_8(HashSet _l)
  { HashSet _results_8 = new HashSet();
    for (Object _i : _l)
    { FolderType fx = (FolderType) _i;
      if (fx.getpatient() != null)
      { _results_8.add(fx); }
    }
    return _results_8;
  }

  public static ArrayList select_11(ArrayList _l)
  { // Implements: content->select(contx | contx /= null & contx.hcparty->size() > 0)
    ArrayList _results_11 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ContentType contx = (ContentType) _l.get(_i);
      if (contx != null && contx.gethcparty().size() > 0)
      { _results_11.add(contx); }
    }
    return _results_11;
  }

  public static HashSet select_11(HashSet _l)
  { HashSet _results_11 = new HashSet();
    for (Object _i : _l)
    { ContentType contx = (ContentType) _i;
      if (contx != null && contx.gethcparty().size() > 0)
      { _results_11.add(contx); }
    }
    return _results_11;
  }

  public static ArrayList select_14(ArrayList _l)
  { // Implements: cd->select(cditemx | cditemx.s = "CD-CONTACT-PERSON")
    ArrayList _results_14 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { CDITEM cditemx = (CDITEM) _l.get(_i);
      if (((String) cditemx.gets()).equals("CD-CONTACT-PERSON"))
      { _results_14.add(cditemx); }
    }
    return _results_14;
  }

  public static HashSet select_14(HashSet _l)
  { HashSet _results_14 = new HashSet();
    for (Object _i : _l)
    { CDITEM cditemx = (CDITEM) _i;
      if (((String) cditemx.gets()).equals("CD-CONTACT-PERSON"))
      { _results_14.add(cditemx); }
    }
    return _results_14;
  }

  public static ArrayList select_20(ArrayList _l)
  { // Implements: conx.cd->select(cdx | cdx.hasCodingSystem())
    ArrayList _results_20 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { CDCONTENT cdx = (CDCONTENT) _l.get(_i);
      if (cdx.hasCodingSystem())
      { _results_20.add(cdx); }
    }
    return _results_20;
  }

  public static HashSet select_20(HashSet _l)
  { HashSet _results_20 = new HashSet();
    for (Object _i : _l)
    { CDCONTENT cdx = (CDCONTENT) _i;
      if (cdx.hasCodingSystem())
      { _results_20.add(cdx); }
    }
    return _results_20;
  }

  public static ArrayList select_21(ArrayList _l)
  { // Implements: conx.cd->select(cdx | cdx.s = "CD-VACCINEINDICATION")
    ArrayList _results_21 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { CDCONTENT cdx = (CDCONTENT) _l.get(_i);
      if (((String) cdx.gets()).equals("CD-VACCINEINDICATION"))
      { _results_21.add(cdx); }
    }
    return _results_21;
  }

  public static HashSet select_21(HashSet _l)
  { HashSet _results_21 = new HashSet();
    for (Object _i : _l)
    { CDCONTENT cdx = (CDCONTENT) _i;
      if (((String) cdx.gets()).equals("CD-VACCINEINDICATION"))
      { _results_21.add(cdx); }
    }
    return _results_21;
  }

  public static ArrayList select_23(ArrayList _l)
  { // Implements: self.item->select(itemx | itemx.hcpartyContent() /= null)
    ArrayList _results_23 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType itemx = (ItemType) _l.get(_i);
      if (itemx.hcpartyContent() != null)
      { _results_23.add(itemx); }
    }
    return _results_23;
  }

  public static HashSet select_23(HashSet _l)
  { HashSet _results_23 = new HashSet();
    for (Object _i : _l)
    { ItemType itemx = (ItemType) _i;
      if (itemx.hcpartyContent() != null)
      { _results_23.add(itemx); }
    }
    return _results_23;
  }

  public static ArrayList select_28(ArrayList _l)
  { // Implements: txs->select(tx | tx.isSumehr())
    ArrayList _results_28 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { TransactionType tx = (TransactionType) _l.get(_i);
      if (tx.isSumehr())
      { _results_28.add(tx); }
    }
    return _results_28;
  }

  public static HashSet select_28(HashSet _l)
  { HashSet _results_28 = new HashSet();
    for (Object _i : _l)
    { TransactionType tx = (TransactionType) _i;
      if (tx.isSumehr())
      { _results_28.add(tx); }
    }
    return _results_28;
  }

  public static ArrayList select_30(ArrayList _l)
  { // Implements: txs->select(tx | tx.txAuthor() /= null)
    ArrayList _results_30 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { TransactionType tx = (TransactionType) _l.get(_i);
      if (tx.txAuthor() != null)
      { _results_30.add(tx); }
    }
    return _results_30;
  }

  public static HashSet select_30(HashSet _l)
  { HashSet _results_30 = new HashSet();
    for (Object _i : _l)
    { TransactionType tx = (TransactionType) _i;
      if (tx.txAuthor() != null)
      { _results_30.add(tx); }
    }
    return _results_30;
  }

  public static ArrayList select_32(ArrayList _l)
  { // Implements: txs.item->select(ix | ix.isMedication())
    ArrayList _results_32 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType ix = (ItemType) _l.get(_i);
      if (ix.isMedication())
      { _results_32.add(ix); }
    }
    return _results_32;
  }

  public static HashSet select_32(HashSet _l)
  { HashSet _results_32 = new HashSet();
    for (Object _i : _l)
    { ItemType ix = (ItemType) _i;
      if (ix.isMedication())
      { _results_32.add(ix); }
    }
    return _results_32;
  }

  public static ArrayList select_34(ArrayList _l)
  { // Implements: txs.item->select(ix | ix.isMedication() & ix.posology->size() > 0)
    ArrayList _results_34 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType ix = (ItemType) _l.get(_i);
      if (ix.isMedication() && ix.getposology().size() > 0)
      { _results_34.add(ix); }
    }
    return _results_34;
  }

  public static HashSet select_34(HashSet _l)
  { HashSet _results_34 = new HashSet();
    for (Object _i : _l)
    { ItemType ix = (ItemType) _i;
      if (ix.isMedication() && ix.getposology().size() > 0)
      { _results_34.add(ix); }
    }
    return _results_34;
  }

  public static ArrayList select_36(ArrayList _l)
  { // Implements: txs.item->select(ix | ix.isAllergy() or ix.isIntolerance())
    ArrayList _results_36 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType ix = (ItemType) _l.get(_i);
      if (ix.isAllergy() || ix.isIntolerance())
      { _results_36.add(ix); }
    }
    return _results_36;
  }

  public static HashSet select_36(HashSet _l)
  { HashSet _results_36 = new HashSet();
    for (Object _i : _l)
    { ItemType ix = (ItemType) _i;
      if (ix.isAllergy() || ix.isIntolerance())
      { _results_36.add(ix); }
    }
    return _results_36;
  }

  public static ArrayList select_38(ArrayList _l)
  { // Implements: txs.item->select(ix | ix.isProblem())
    ArrayList _results_38 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType ix = (ItemType) _l.get(_i);
      if (ix.isProblem())
      { _results_38.add(ix); }
    }
    return _results_38;
  }

  public static HashSet select_38(HashSet _l)
  { HashSet _results_38 = new HashSet();
    for (Object _i : _l)
    { ItemType ix = (ItemType) _i;
      if (ix.isProblem())
      { _results_38.add(ix); }
    }
    return _results_38;
  }

  public static ArrayList select_40(ArrayList _l)
  { // Implements: txs.item->select(ix | ix.isVaccine())
    ArrayList _results_40 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType ix = (ItemType) _l.get(_i);
      if (ix.isVaccine())
      { _results_40.add(ix); }
    }
    return _results_40;
  }

  public static HashSet select_40(HashSet _l)
  { HashSet _results_40 = new HashSet();
    for (Object _i : _l)
    { ItemType ix = (ItemType) _i;
      if (ix.isVaccine())
      { _results_40.add(ix); }
    }
    return _results_40;
  }

  public static ArrayList select_42(ArrayList _l)
  { // Implements: transx.item->select(itemx | itemx.isMedication())
    ArrayList _results_42 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType itemx = (ItemType) _l.get(_i);
      if (itemx.isMedication())
      { _results_42.add(itemx); }
    }
    return _results_42;
  }

  public static HashSet select_42(HashSet _l)
  { HashSet _results_42 = new HashSet();
    for (Object _i : _l)
    { ItemType itemx = (ItemType) _i;
      if (itemx.isMedication())
      { _results_42.add(itemx); }
    }
    return _results_42;
  }

  public static ArrayList select_44(ArrayList _l)
  { // Implements: transx.item->select(itemx | itemx.isAllergy() or itemx.isIntolerance())
    ArrayList _results_44 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType itemx = (ItemType) _l.get(_i);
      if (itemx.isAllergy() || itemx.isIntolerance())
      { _results_44.add(itemx); }
    }
    return _results_44;
  }

  public static HashSet select_44(HashSet _l)
  { HashSet _results_44 = new HashSet();
    for (Object _i : _l)
    { ItemType itemx = (ItemType) _i;
      if (itemx.isAllergy() || itemx.isIntolerance())
      { _results_44.add(itemx); }
    }
    return _results_44;
  }

  public static ArrayList select_45(ArrayList _l)
  { // Implements: transx.item->select(itemx | itemx.isActiveProblem())
    ArrayList _results_45 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType itemx = (ItemType) _l.get(_i);
      if (itemx.isActiveProblem())
      { _results_45.add(itemx); }
    }
    return _results_45;
  }

  public static HashSet select_45(HashSet _l)
  { HashSet _results_45 = new HashSet();
    for (Object _i : _l)
    { ItemType itemx = (ItemType) _i;
      if (itemx.isActiveProblem())
      { _results_45.add(itemx); }
    }
    return _results_45;
  }

  public static ArrayList select_46(ArrayList _l)
  { // Implements: transx.item->select(itemx | itemx.isVaccine())
    ArrayList _results_46 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType itemx = (ItemType) _l.get(_i);
      if (itemx.isVaccine())
      { _results_46.add(itemx); }
    }
    return _results_46;
  }

  public static HashSet select_46(HashSet _l)
  { HashSet _results_46 = new HashSet();
    for (Object _i : _l)
    { ItemType itemx = (ItemType) _i;
      if (itemx.isVaccine())
      { _results_46.add(itemx); }
    }
    return _results_46;
  }

  public static ArrayList select_47(ArrayList _l)
  { // Implements: transx.item->select(itemx | itemx.isInactiveProblem())
    ArrayList _results_47 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ItemType itemx = (ItemType) _l.get(_i);
      if (itemx.isInactiveProblem())
      { _results_47.add(itemx); }
    }
    return _results_47;
  }

  public static HashSet select_47(HashSet _l)
  { HashSet _results_47 = new HashSet();
    for (Object _i : _l)
    { ItemType itemx = (ItemType) _i;
      if (itemx.isInactiveProblem())
      { _results_47.add(itemx); }
    }
    return _results_47;
  }

  public static ArrayList select_49(ArrayList _l)
  { // Implements: itemx.content->select(contx | contx.medicinalproduct->notEmpty())
    ArrayList _results_49 = new ArrayList();
    for (int _i = 0; _i < _l.size(); _i++)
    { ContentType contx = (ContentType) _l.get(_i);
      if ((contx.getmedicinalproduct().size() != 0))
      { _results_49.add(contx); }
    }
    return _results_49;
  }

  public static HashSet select_49(HashSet _l)
  { HashSet _results_49 = new HashSet();
    for (Object _i : _l)
    { ContentType contx = (ContentType) _i;
      if ((contx.getmedicinalproduct().size() != 0))
      { _results_49.add(contx); }
    }
    return _results_49;
  }



  public static boolean exists_1(Collection _l)
  { // Implements: cd->exists(cdx|cdx.value = "phone")
    for (Object _i : _l)
    { CDTELECOM cdx = (CDTELECOM) _i;
      if (((String) cdx.getvalue()).equals("phone")) { return true; }
    }
    return false;
  }

  public static boolean exists_2(Collection _l,TelecomType telecomtypex,TelecomType self)
  { // Implements: PersonType->exists(personx|self : personx.telecom)
    for (Object _i : _l)
    { PersonType personx = (PersonType) _i;
      if (personx.gettelecom().contains(self)) { return true; }
    }
    return false;
  }

  public static boolean exists_3(Collection _l)
  { // Implements: cd->exists(cdx|cdx.value = "mobile")
    for (Object _i : _l)
    { CDTELECOM cdx = (CDTELECOM) _i;
      if (((String) cdx.getvalue()).equals("mobile")) { return true; }
    }
    return false;
  }

  public static boolean exists_4(Collection _l)
  { // Implements: cd->exists(cdx|cdx.isOrganization())
    for (Object _i : _l)
    { CDHCPARTY cdx = (CDHCPARTY) _i;
      if (cdx.isOrganization()) { return true; }
    }
    return false;
  }

  public static boolean exists_5(Collection _l)
  { // Implements: cd->exists(cdx|cdx.isPractitioner())
    for (Object _i : _l)
    { CDHCPARTY cdx = (CDHCPARTY) _i;
      if (cdx.isPractitioner()) { return true; }
    }
    return false;
  }

  public static boolean exists_10(Collection _l)
  { // Implements: itemx.cd->exists(cdxx|cdxx.value = "gmdmanager")
    for (Object _i : _l)
    { CDITEM cdxx = (CDITEM) _i;
      if (((String) cdxx.getvalue()).equals("gmdmanager")) { return true; }
    }
    return false;
  }

  public static boolean exists_13(Collection _l)
  { // Implements: cd->exists(cditemx|cditemx.s = "CD-ITEM" & cditemx.value = "contactperson")
    for (Object _i : _l)
    { CDITEM cditemx = (CDITEM) _i;
      if (((String) cditemx.gets()).equals("CD-ITEM") && ((String) cditemx.getvalue()).equals("contactperson")) { return true; }
    }
    return false;
  }

  public static boolean exists_15(Collection _l)
  { // Implements: cd->exists(cditemx|cditemx.s = "CD-ITEM" & cditemx.value = "medication")
    for (Object _i : _l)
    { CDITEM cditemx = (CDITEM) _i;
      if (((String) cditemx.gets()).equals("CD-ITEM") && ((String) cditemx.getvalue()).equals("medication")) { return true; }
    }
    return false;
  }

  public static boolean exists_16(Collection _l)
  { // Implements: cd->exists(cditemx|cditemx.s = "CD-ITEM" & cditemx.value = "allergy")
    for (Object _i : _l)
    { CDITEM cditemx = (CDITEM) _i;
      if (((String) cditemx.gets()).equals("CD-ITEM") && ((String) cditemx.getvalue()).equals("allergy")) { return true; }
    }
    return false;
  }

  public static boolean exists_17(Collection _l)
  { // Implements: cd->exists(cditemx|cditemx.s = "CD-ITEM" & cditemx.value = "adr")
    for (Object _i : _l)
    { CDITEM cditemx = (CDITEM) _i;
      if (((String) cditemx.gets()).equals("CD-ITEM") && ((String) cditemx.getvalue()).equals("adr")) { return true; }
    }
    return false;
  }

  public static boolean exists_18(Collection _l)
  { // Implements: cd->exists(cditemx|cditemx.s = "CD-ITEM" & cditemx.value = "problem")
    for (Object _i : _l)
    { CDITEM cditemx = (CDITEM) _i;
      if (((String) cditemx.gets()).equals("CD-ITEM") && ((String) cditemx.getvalue()).equals("problem")) { return true; }
    }
    return false;
  }

  public static boolean exists_19(Collection _l)
  { // Implements: cd->exists(cditemx|cditemx.s = "CD-ITEM" & cditemx.value = "vaccine")
    for (Object _i : _l)
    { CDITEM cditemx = (CDITEM) _i;
      if (((String) cditemx.gets()).equals("CD-ITEM") && ((String) cditemx.getvalue()).equals("vaccine")) { return true; }
    }
    return false;
  }

  public static boolean exists_22(Collection _l)
  { // Implements: self.cd->exists(cdx|cdx.value = "sumehr")
    for (Object _i : _l)
    { CDTRANSACTION cdx = (CDTRANSACTION) _i;
      if (((String) cdx.getvalue()).equals("sumehr")) { return true; }
    }
    return false;
  }




  public static ArrayList collect_7(Collection _l)
  { // implements: self.intendedcd->select( cdx | cdx.s = "CD-DRUG-CNK" )->collect( cdx | cdx.value )
    ArrayList _results_7 = new ArrayList();
    for (Object _i : _l)
    { CDDRUGCNK cdx = (CDDRUGCNK) _i;
     _results_7.add(cdx.getvalue());
    }
    return _results_7;
  }

  public static ArrayList collect_9(Collection _l)
  { // implements: self.kmehrmessage.folder->select( fx | fx.patient /= null )->collect( foldertype_9_xx | $id )
    ArrayList _results_9 = new ArrayList();
    for (Object _i : _l)
    { FolderType foldertype_9_xx = (FolderType) _i;
     _results_9.add(foldertype_9_xx.get$id());
    }
    return _results_9;
  }

  public static ArrayList collect_12(Collection _l)
  { // implements: content->select( contx | contx /= null & contx.hcparty->size() > 0 )->collect( cntx | cntx.hcparty->any() )
    ArrayList _results_12 = new ArrayList();
    for (Object _i : _l)
    { ContentType cntx = (ContentType) _i;
     _results_12.add(((HcpartyType) Set.any(cntx.gethcparty())));
    }
    return _results_12;
  }

  public static ArrayList collect_24(Collection _l)
  { // implements: self.item->select( itemx | itemx.hcpartyContent() /= null )->collect( itemxx | itemxx.hcpartyContent() )
    ArrayList _results_24 = new ArrayList();
    for (Object _i : _l)
    { ItemType itemxx = (ItemType) _i;
     _results_24.add(itemxx.hcpartyContent());
    }
    return _results_24;
  }

  public static ArrayList collect_25(Collection _l)
  { // implements: itemx.dayperiod->collect( dpx | EventTiming.newEventTiming(AuxOps.toEventTiming(dpx.cd)) )
    ArrayList _results_25 = new ArrayList();
    for (Object _i : _l)
    { DayperiodType dpx = (DayperiodType) _i;
     _results_25.add(EventTiming.newEventTiming(AuxOps.toEventTiming(dpx.getcd())));
    }
    return _results_25;
  }

  public static ArrayList collect_26(Collection _l)
  { // implements: itemx.codedContent()->collect( ccx | AuxOps.CDContent2Coding(ccx) )
    ArrayList _results_26 = new ArrayList();
    for (Object _i : _l)
    { CDCONTENT ccx = (CDCONTENT) _i;
     _results_26.add(AuxOps.CDContent2Coding(ccx));
    }
    return _results_26;
  }

  public static ArrayList collect_27(Collection _l)
  { // implements: itemx.contactPersonRelationships()->collect( cditemx | AuxOps.getPatientContactRelationship(cditemx) )
    ArrayList _results_27 = new ArrayList();
    for (Object _i : _l)
    { CDITEM cditemx = (CDITEM) _i;
     _results_27.add(AuxOps.getPatientContactRelationship(cditemx));
    }
    return _results_27;
  }

  public static ArrayList collect_29(Collection _l)
  { // implements: txs->select( tx | tx.isSumehr() )->collect( txx | AuxOps.CompositionBundleEntry(txx) )
    ArrayList _results_29 = new ArrayList();
    for (Object _i : _l)
    { TransactionType txx = (TransactionType) _i;
     _results_29.add(AuxOps.CompositionBundleEntry(txx));
    }
    return _results_29;
  }

  public static ArrayList collect_31(Collection _l)
  { // implements: txs->select( tx | tx.txAuthor() /= null )->collect( txx | AuxOps.PractitionerBundleEntry(txx.txAuthor()) )
    ArrayList _results_31 = new ArrayList();
    for (Object _i : _l)
    { TransactionType txx = (TransactionType) _i;
     _results_31.add(AuxOps.PractitionerBundleEntry(txx.txAuthor()));
    }
    return _results_31;
  }

  public static ArrayList collect_33(Collection _l)
  { // implements: txs.item->select( ix | ix.isMedication() )->collect( ixx | AuxOps.MedicationBundleEntry(ixx) )
    ArrayList _results_33 = new ArrayList();
    for (Object _i : _l)
    { ItemType ixx = (ItemType) _i;
     _results_33.add(AuxOps.MedicationBundleEntry(ixx));
    }
    return _results_33;
  }

  public static ArrayList collect_35(Collection _l)
  { // implements: txs.item->select( ix | ix.isMedication() & ix.posology->size() > 0 )->collect( ixx | AuxOps.PosologyBundleEntry(ixx.posology->any()) )
    ArrayList _results_35 = new ArrayList();
    for (Object _i : _l)
    { ItemType ixx = (ItemType) _i;
     _results_35.add(AuxOps.PosologyBundleEntry(((PosologyType) Set.any(ixx.getposology()))));
    }
    return _results_35;
  }

  public static ArrayList collect_37(Collection _l)
  { // implements: txs.item->select( ix | ix.isAllergy() or ix.isIntolerance() )->collect( ixx | AuxOps.AllergyIntoleranceBundleEntry(ixx) )
    ArrayList _results_37 = new ArrayList();
    for (Object _i : _l)
    { ItemType ixx = (ItemType) _i;
     _results_37.add(AuxOps.AllergyIntoleranceBundleEntry(ixx));
    }
    return _results_37;
  }

  public static ArrayList collect_39(Collection _l)
  { // implements: txs.item->select( ix | ix.isProblem() )->collect( ixx | AuxOps.ConditionBundleEntry(ixx) )
    ArrayList _results_39 = new ArrayList();
    for (Object _i : _l)
    { ItemType ixx = (ItemType) _i;
     _results_39.add(AuxOps.ConditionBundleEntry(ixx));
    }
    return _results_39;
  }

  public static ArrayList collect_41(Collection _l)
  { // implements: txs.item->select( ix | ix.isVaccine() )->collect( ixx | AuxOps.ImmunizationBundleEntry(ixx) )
    ArrayList _results_41 = new ArrayList();
    for (Object _i : _l)
    { ItemType ixx = (ItemType) _i;
     _results_41.add(AuxOps.ImmunizationBundleEntry(ixx));
    }
    return _results_41;
  }

  public static ArrayList collect_43(Collection _l)
  { // implements: transx.item->select( itemx | itemx.isMedication() )->collect( itemx | AuxOps.CompositionSectionEntry(itemx) )
    ArrayList _results_43 = new ArrayList();
    for (Object _i : _l)
    { ItemType itemx = (ItemType) _i;
     _results_43.add(AuxOps.CompositionSectionEntry(itemx));
    }
    return _results_43;
  }

  public static ArrayList collect_48(Collection _l)
  { // implements: hcx.id->collect( idx | idx.value )
    ArrayList _results_48 = new ArrayList();
    for (Object _i : _l)
    { IDHCPARTY idx = (IDHCPARTY) _i;
     _results_48.add(idx.getvalue());
    }
    return _results_48;
  }

  public static ArrayList collect_50(Collection _l)
  { // implements: itemx.content->select( contx | contx.medicinalproduct->notEmpty() )->collect( contx | AuxOps.CNKCode(contx.medicinalproduct->any()) )
    ArrayList _results_50 = new ArrayList();
    for (Object _i : _l)
    { ContentType contx = (ContentType) _i;
     _results_50.add(AuxOps.CNKCode(((MedicinalProductType) Set.any(contx.getmedicinalproduct()))));
    }
    return _results_50;
  }



    public static HashSet addSet(HashSet s, Object x)
    { if (x != null) { s.add(x); }
      return s; }

    public static HashSet addSet(HashSet s, int x)
    { s.add(new Integer(x));
      return s; }

    public static HashSet addSet(HashSet s, long x)
    { s.add(new Long(x));
      return s; }

    public static HashSet addSet(HashSet s, double x)
    { s.add(new Double(x));
      return s; }

    public static HashSet addSet(HashSet s, boolean x)
    { s.add(new Boolean(x));
      return s; }

    public static ArrayList addSequence(ArrayList s, Object x)
    { if (x != null) { s.add(x); }
      return s; }

    public static ArrayList addSequence(ArrayList s, int x)
    { s.add(new Integer(x));
      return s; }

    public static ArrayList addSequence(ArrayList s, long x)
    { s.add(new Long(x));
      return s; }

    public static ArrayList addSequence(ArrayList s, double x)
    { s.add(new Double(x));
      return s; }

    public static ArrayList addSequence(ArrayList s, boolean x)
    { s.add(new Boolean(x));
      return s; }


    public static ArrayList asSequence(Collection c)
    { ArrayList res = new ArrayList();
      res.addAll(c);
      return res;
    }

    public static ArrayList asBag(Collection c)
    { ArrayList res = new ArrayList(); 
      res.addAll(c); 
      Collections.sort(res);
      return res;
    }



    public static HashSet asSet(Collection c)
    { HashSet res = new HashSet();
      res.addAll(c);
      return res;
    }

    public static ArrayList asOrderedSet(Collection c)
    { ArrayList res = new ArrayList();
      for (Object x : c)
      { if (res.contains(x)) { }
        else 
        { res.add(x); }
      } 
      return res; 
    }



  public static Comparable max(Collection l)
  { Comparable res = null; 
    if (l.size() == 0) { return res; }
    res = (Comparable) Set.any(l); 
    for (Object _o : l)
    { Comparable e = (Comparable) _o;
      if (res.compareTo(e) < 0) { res = e; } }
    return res; }


  public static Comparable min(Collection l)
  { Comparable res = null; 
    if (l.size() == 0) { return res; }
    res = (Comparable) Set.any(l); 
    for (Object _o : l)
    { Comparable e = (Comparable) _o;
      if (res.compareTo(e) > 0) { res = e; } }
    return res; }


  public static HashSet union(HashSet a, Collection b)
  { HashSet res = new HashSet(); 
    res.addAll(a); res.addAll(b);
    return res; }

  public static ArrayList union(ArrayList a, Collection b)
  { ArrayList res = new ArrayList(); 
    res.addAll(a); res.addAll(b);
    return res; }



  public static HashSet subtract(HashSet a, Collection b)
  { HashSet res = new HashSet(); 
    res.addAll(a);
    res.removeAll(b);
    return res;
  }

  public static ArrayList subtract(ArrayList a, Collection b)
  { ArrayList res = new ArrayList(); 
    res.addAll(a);
    res.removeAll(b);
    return res;
  }

  public static String subtract(String a, String b)
  { String res = ""; 
    for (int i = 0; i < a.length(); i++)
    { if (b.indexOf(a.charAt(i)) < 0) { res = res + a.charAt(i); } }
    return res; }



  public static HashSet intersection(HashSet a, Collection b)
  { HashSet res = new HashSet(); 
    res.addAll(a);
    res.retainAll(b);
    return res; }

  public static ArrayList intersection(ArrayList a, Collection b)
  { ArrayList res = new ArrayList(); 
    res.addAll(a);
    res.retainAll(b);
    return res; }



  public static HashSet symmetricDifference(Collection a, Collection b)
  { HashSet res = new HashSet();
    for (Object _a : a)
    { if (b.contains(_a)) { }
      else { res.add(_a); }
    }
    for (Object _b : b)
    { if (a.contains(_b)) { }
      else { res.add(_b); }
    }
    return res;
  }



  public static boolean isUnique(Collection evals)
  { HashSet vals = new HashSet(); 
    for (Object ob : evals)
    { if (vals.contains(ob)) { return false; }
      vals.add(ob);
    }
    return true;
  }


  public static long gcd(long xx, long yy)
  { long x = Math.abs(xx);
    long y = Math.abs(yy);
    while (x != 0 && y != 0)
    { long z = y; 
      y = x % y; 
      x = z;
    } 
    if (y == 0)
    { return x; }
    if (x == 0)
    { return y; }
    return 0;
  } 


  public static int sumint(Collection a)
  { int sum = 0; 
    for (Object _o : a)
    { Integer x = (Integer) _o; 
      if (x != null) { sum += x.intValue(); }
    } 
    return sum; }

  public static double sumdouble(Collection a)
  { double sum = 0.0; 
    for (Object _o : a)
    { Double x = (Double) _o; 
      if (x != null) { sum += x.doubleValue(); }
    } 
    return sum; }

  public static long sumlong(Collection a)
  { long sum = 0; 
    for (Object _o : a)
    { Long x = (Long) _o; 
      if (x != null) { sum += x.longValue(); }
    } 
    return sum; }

  public static String sumString(Collection a)
  { String sum = ""; 
    for (Object x : a)
    { sum = sum + x; }
    return sum;  }



  public static int prdint(Collection a)
  { int prd = 1; 
    for (Object _o : a)
    { Integer x = (Integer) _o; 
      if (x != null) { prd *= x.intValue(); }
    } 
    return prd; }

  public static double prddouble(Collection a)
  { double prd = 1; 
    for (Object _o : a)
    { Double x = (Double) _o; 
      if (x != null) { prd *= x.doubleValue(); }
    } 
    return prd; }

  public static long prdlong(Collection a)
  { long prd = 1; 
    for (Object _o : a)
    { Long x = (Long) _o; 
      if (x != null) { prd *= x.longValue(); }
    } 
    return prd; }



  public static ArrayList concatenate(Collection a, Collection b)
  { ArrayList res = new ArrayList(); 
    res.addAll(a); 
    res.addAll(b); 
    return res;
  }


  public static HashSet closureHeadingTypeheading(Collection _r)
  { HashSet _path = new HashSet();
    for (Object _i : _r)
    { HeadingType headingtypex = (HeadingType) _i;
      closureHeadingTypeheading(headingtypex, _path);
    }
    return _path;
  }

  private static void closureHeadingTypeheading(HeadingType headingtypex, HashSet _path)
  { if (_path.contains(headingtypex)) { return; }
    _path.add(headingtypex);
    Collection headingx = headingtypex.getheading();
    for (Object _i : headingx)
    { if (_i instanceof HeadingType)
      { HeadingType headingtypexx = (HeadingType) _i;
        closureHeadingTypeheading(headingtypexx, _path);
      } else { _path.add(_i); }
    }
  }
  public static HashSet closureElementextension(Collection _r)
  { HashSet _path = new HashSet();
    for (Object _i : _r)
    { Element elementx = (Element) _i;
      closureElementextension(elementx, _path);
    }
    return _path;
  }

  private static void closureElementextension(Element elementx, HashSet _path)
  { if (_path.contains(elementx)) { return; }
    _path.add(elementx);
    Collection extensionx = elementx.getextension();
    for (Object _i : extensionx)
    { if (_i instanceof Element)
      { Element elementxx = (Element) _i;
        closureElementextension(elementxx, _path);
      } else { _path.add(_i); }
    }
  }
  public static HashSet closureCompositionSectionsection(Collection _r)
  { HashSet _path = new HashSet();
    for (Object _i : _r)
    { CompositionSection compositionsectionx = (CompositionSection) _i;
      closureCompositionSectionsection(compositionsectionx, _path);
    }
    return _path;
  }

  private static void closureCompositionSectionsection(CompositionSection compositionsectionx, HashSet _path)
  { if (_path.contains(compositionsectionx)) { return; }
    _path.add(compositionsectionx);
    Collection sectionx = compositionsectionx.getsection();
    for (Object _i : sectionx)
    { if (_i instanceof CompositionSection)
      { CompositionSection compositionsectionxx = (CompositionSection) _i;
        closureCompositionSectionsection(compositionsectionxx, _path);
      } else { _path.add(_i); }
    }
  }


  public static ArrayList reverse(Collection a)
  { ArrayList res = new ArrayList(); 
    res.addAll(a); 
    Collections.reverse(res); 
    return res;
  }

  public static String reverse(String a)
  { String res = ""; 
    for (int i = a.length() - 1; i >= 0; i--)
    { res = res + a.charAt(i); } 
    return res;
  }



  public static ArrayList front(ArrayList a)
  { ArrayList res = new ArrayList(); 
    for (int i = 0; i < a.size() - 1; i++)
    { res.add(a.get(i)); } 
    return res; }


  public static ArrayList tail(ArrayList a)
  { ArrayList res = new ArrayList(); 
    for (int i = 1; i < a.size(); i++)
    { res.add(a.get(i)); } 
    return res; }


  public static ArrayList sort(Collection a)
  { ArrayList res = new ArrayList();
    res.addAll(a);
    Collections.sort(res);
    return res;
  }



  public static ArrayList sortedBy(final ArrayList a, ArrayList f)
  { int i = a.size()-1;
    java.util.Map f_map = new java.util.HashMap();
    for (int j = 0; j < a.size(); j++)
    { f_map.put(a.get(j), f.get(j)); }
    return mergeSort(a,f_map,0,i);
  }

  static ArrayList mergeSort(final ArrayList a, java.util.Map f, int ind1, int ind2)
  { ArrayList res = new ArrayList();
    if (ind1 > ind2)
    { return res; }
    if (ind1 == ind2)
    { res.add(a.get(ind1));
      return res;
    }
    if (ind2 == ind1 + 1)
    { Comparable e1 = (Comparable) f.get(a.get(ind1)); 
      Comparable e2 = (Comparable) f.get(a.get(ind2));
      if (e1.compareTo(e2) < 0) // e1 < e2
      { res.add(a.get(ind1)); res.add(a.get(ind2)); return res; }
      else 
      { res.add(a.get(ind2)); res.add(a.get(ind1)); return res; }
    }
    int mid = (ind1 + ind2)/2;
    ArrayList a1;
    ArrayList a2;
    if (mid == ind1)
    { a1 = new ArrayList();
      a1.add(a.get(ind1));
      a2 = mergeSort(a,f,mid+1,ind2);
    }
    else
    { a1 = mergeSort(a,f,ind1,mid-1);
      a2 = mergeSort(a,f,mid,ind2);
    }
    int i = 0;
    int j = 0;
    while (i < a1.size() && j < a2.size())
    { Comparable e1 = (Comparable) f.get(a1.get(i)); 
      Comparable e2 = (Comparable) f.get(a2.get(j));
      if (e1.compareTo(e2) < 0) // e1 < e2
      { res.add(a1.get(i));
        i++; // get next e1
      } 
      else 
      { res.add(a2.get(j));
        j++; 
      } 
    } 
    if (i == a1.size())
    { for (int k = j; k < a2.size(); k++)
      { res.add(a2.get(k)); } 
    } 
    else 
    { for (int k = i; k < a1.size(); k++) 
      { res.add(a1.get(k)); } 
    } 
    return res;
  }


  public static ArrayList integerSubrange(int i, int j)
  { ArrayList tmp = new ArrayList(); 
    for (int k = i; k <= j; k++)
    { tmp.add(new Integer(k)); } 
    return tmp;
  }

  public static String subrange(String s, int i, int j)
  { int len = s.length();
    if (len == 0) { return s; }
    if (j > len) { j = len; }
    if (j < i) { return ""; }
    if (i > len) { return ""; }
    if (i < 1) { i = 1; }
    return s.substring(i-1,j);
  }

  public static ArrayList subrange(ArrayList l, int i, int j)
  { ArrayList tmp = new ArrayList(); 
    for (int k = i-1; k < j; k++)
    { tmp.add(l.get(k)); } 
    return tmp; 
  }



  public static ArrayList prepend(ArrayList l, Object ob)
  { ArrayList res = new ArrayList();
    res.add(ob);
    res.addAll(l);
    return res;
  }


  public static ArrayList append(ArrayList l, Object ob)
  { ArrayList res = new ArrayList();
    res.addAll(l);
    res.add(ob);
    return res;
  }


  public static int count(Collection l, Object obj)
  { int res = 0; 
    for (Object _o : l)
    { if (obj == _o) { res++; } 
      else if (obj != null && obj.equals(_o)) { res++; } 
    }
    return res; 
  }

  public static int count(String s, String x)
  { int res = 0; 
    if ("".equals(s)) { return res; }
    int ind = s.indexOf(x); 
    if (ind == -1) { return res; }
    String ss = s.substring(ind+1,s.length());
    res++; 
    while (ind >= 0)
    { ind = ss.indexOf(x); 
      if (ind == -1 || ss.equals("")) { return res; }
      res++; 
      ss = ss.substring(ind+1,ss.length());
    } 
    return res;
  }



  public static ArrayList characters(String str)
  { char[] _chars = str.toCharArray();
    ArrayList _res = new ArrayList();
    for (int i = 0; i < _chars.length; i++)
    { _res.add("" + _chars[i]); }
    return _res;
  }



    public static Object any(Collection v)
    { for (Object o : v) { return o; }
      return null;
    }


    public static Object first(Collection v)
    { for (Object o : v) { return o; }
      return null;
    }


    public static Object last(ArrayList v)
    { if (v.size() == 0) { return null; }
      return v.get(v.size() - 1);
    }



    public static ArrayList subcollections(ArrayList v)
    { ArrayList res = new ArrayList();
      if (v.size() == 0) { res.add(new ArrayList()); return res; }
      if (v.size() == 1) { res.add(new ArrayList()); res.add(v); return res;
       }
      ArrayList s = new ArrayList();
      Object x = v.get(0);
      s.addAll(v);
      s.remove(0);
      ArrayList scs = subcollections(s);
      res.addAll(scs);
      for (int i = 0; i < scs.size(); i++)
      { ArrayList sc = (ArrayList) scs.get(i);
        ArrayList scc = new ArrayList();
        scc.add(x); scc.addAll(sc); res.add(scc); 
      }
      return res;
    }

    public static HashSet subcollections(HashSet v)
    { HashSet res = new HashSet();
      if (v.size() == 0) { res.add(new HashSet()); return res; }
      if (v.size() == 1) { res.add(new HashSet()); res.add(v); return res;
       }
      HashSet s = new HashSet();
      Object x = null; int _i = 0;
      for (Object _o : v)
      { if (_i == 0) { x = _o; _i++; }
         else { s.add(_o); }
      }
      HashSet scs = subcollections(s);
      res.addAll(scs);
      for (Object _obj : scs)
      { HashSet sc = (HashSet) _obj;
        HashSet scc = new HashSet();
        scc.add(x); scc.addAll(sc); res.add(scc); 
      }
      return res;
    }


  public static ArrayList maximalElements(ArrayList s, ArrayList v)
  { ArrayList res = new ArrayList();
    if (s.size() == 0) { return res; }
    Comparable largest = (Comparable) v.get(0);
    res.add(s.get(0));
    
    for (int i = 1; i < s.size(); i++)
    { Comparable next = (Comparable) v.get(i);
      if (largest.compareTo(next) < 0)
      { largest = next;
        res.clear();
        res.add(s.get(i));
      }
      else if (largest.compareTo(next) == 0)
      { res.add(s.get(i)); }
    }
    return res;
  }

  public static ArrayList minimalElements(ArrayList s, ArrayList v)
  { ArrayList res = new ArrayList();
    if (s.size() == 0) { return res; }
    Comparable smallest = (Comparable) v.get(0);
    res.add(s.get(0));
    
    for (int i = 1; i < s.size(); i++)
    { Comparable next = (Comparable) v.get(i);
      if (next.compareTo(smallest) < 0)
      { smallest = next;
        res.clear();
        res.add(s.get(i));
      }
      else if (smallest.compareTo(next) == 0)
      { res.add(s.get(i)); }
    }
    return res;
  }


  public static HashSet intersectAll(Collection se)
  { HashSet res = new HashSet(); 
    if (se.size() == 0) { return res; }
    res.addAll((Collection) Set.any(se));
    for (Object _o : se)
    { res.retainAll((Collection) _o); }
    return res;
  }



  public static HashSet unionAll(Collection se)
  { HashSet res = new HashSet(); 
    for (Object _o : se)
    { Collection b = (Collection) _o; 
      res.addAll(b);
    }
    return res;
  }

  public static HashMap unionAllMap(Collection se)
  { HashMap res = new HashMap(); 
    for (Object _o : se)
    { res.putAll((Map) _o); }
    return res;
  }



    public static ArrayList concatenateAll(List a)
    { ArrayList res = new ArrayList();
      for (int i = 0; i < a.size(); i++)
      { Collection r = (Collection) a.get(i);
        res.addAll(r); 
      }
      return res;
    }



  public static ArrayList insertAt(ArrayList l, int ind, Object ob)
  { ArrayList res = new ArrayList();
    for (int i = 0; i < ind-1 && i < l.size(); i++)
    { res.add(l.get(i)); }
    if (ind <= l.size() + 1) { res.add(ob); }
    for (int i = ind-1; i < l.size(); i++)
    { res.add(l.get(i)); }
    return res;
  }
  public static String insertAt(String l, int ind, Object ob)
  { String res = "";
    for (int i = 0; i < ind-1 && i < l.length(); i++)
    { res = res + l.charAt(i); }
    if (ind <= l.length() + 1) { res = res + ob; }
    for (int i = ind-1; i < l.length(); i++)
    { res = res + l.charAt(i); }
    return res;
  }


  public static ArrayList removeAt(ArrayList l, int ind)
  { ArrayList res = new ArrayList();
    res.addAll(l); 
    if (ind <= res.size() && ind >= 1)
    { res.remove(ind - 1); } 
    return res;
  }

  public static String removeAt(String ss, int ind)
  { StringBuffer sb = new StringBuffer(ss); 
    if (ind <= ss.length() && ind >= 1)
    { sb.deleteCharAt(ind - 1); } 
    return sb.toString();
  }

  public static ArrayList removeFirst(ArrayList l, Object x)
  { ArrayList res = new ArrayList();
    res.addAll(l); 
    res.remove(x);
    return res;
  }

  public static ArrayList setAt(ArrayList l, int ind, Object val)
  { ArrayList res = new ArrayList();
    res.addAll(l); 
    if (ind <= res.size() && ind >= 1)
    { res.set(ind - 1,val); } 
    return res;
  }

  public static String setAt(String ss, int ind, Object val)
  { String res = ss;
    if (ind <= res.length() && ind >= 1)
    { res = ss.substring(0,ind-1); 
      res = res + val + ss.substring(ind);
    } 
    return res;
  }


 public static boolean isInteger(String str)
  { try { Integer.parseInt(str.trim()); return true; }
    catch (Exception _e) { return false; }
  }

 public static int toInt(String str)
  { try { int x = Integer.parseInt(str.trim());
          return x; }
    catch (Exception _e) { return 0; }
  }

  public static int toInteger(String str)
  { if (str == null || str.length() == 0)
    { return 0; }
    String trm = str.trim();
    while (trm.length() > 0 && trm.charAt(0) == '0')
    { trm = trm.substring(1); }
    try { int x = Integer.decode(trm).intValue();
      return x; 
    }
    catch (Exception _e) { return 0; }
  }



 public static boolean isReal(String str)
  { try { double d = Double.parseDouble(str.trim()); 
          if (Double.isNaN(d)) { return false; }
          return true; }
    catch (Exception _e) { return false; }
  }

 public static double toDouble(String str)
  { try { double x = Double.parseDouble(str.trim());
          return x; }
    catch (Exception _e) { return 0; }
  }


 public static boolean isLong(String str)
  { try { Long.parseLong(str.trim()); return true; }
    catch (Exception _e) { return false; }
  }

 public static long toLong(String str)
  { try { long x = Long.parseLong(str.trim());
          return x; }
    catch (Exception _e) { return 0; }
  }


 public static String byte2char(int b)
  { try { byte[] bb = {(byte) b}; 
      return new String(bb); }
    catch (Exception _e)
    { return ""; }
  }

  public static int char2byte(String s)
  { if (s == null || s.length() == 0)
    { return -1; } 
    return (int) s.charAt(0);
  }



  public static boolean oclIsTypeOf(Object x, String E)
  { try { 
    if (x.getClass() == Class.forName(E))
    { return true; } 
    else 
    { return false; }
    } 
    catch (Exception e) { return false; }
  } 


  public static String before(String s, String sep)
  { if (sep.length() == 0) { return s; }
    int ind = s.indexOf(sep);
    if (ind < 0) { return s; }
    return s.substring(0,ind); 
  }


  public static String after(String s, String sep)
  { int ind = s.indexOf(sep);
    int seplength = sep.length();
    if (ind < 0) { return ""; }
    if (seplength == 0) { return ""; }
    return s.substring(ind + seplength, s.length()); 
  }


  public static boolean hasMatch(String str, String regex)
  { java.util.regex.Pattern patt = java.util.regex.Pattern.compile(regex);
    java.util.regex.Matcher matcher = patt.matcher(str); 
    if (matcher.find())
    { return true; }
    return false;
  }



  public static ArrayList allMatches(String str, String regex)
  { java.util.regex.Pattern patt = java.util.regex.Pattern.compile(regex);
    java.util.regex.Matcher matcher = patt.matcher(str);
    ArrayList res = new ArrayList();
    while (matcher.find())
    { res.add(matcher.group() + ""); }
    return res; 
  }


  public static String firstMatch(String str, String regex)
  { java.util.regex.Pattern patt = java.util.regex.Pattern.compile(regex);
    java.util.regex.Matcher matcher = patt.matcher(str);
    String res = null;
    if (matcher.find())
    { res = matcher.group() + ""; }
    return res; 
  }


  public static ArrayList split(String str, String delim)
  { String[] splits = str.split(delim);
    ArrayList res = new ArrayList();
    for (int j = 0; j < splits.length; j++)
    { if (splits[j].length() > 0)
      { res.add(splits[j]); }
    }
    return res;
  }


  public static String replace(String str, String delim, String rep)
  { String result = "";
    String s = str + "";
    int i = (s.indexOf(delim) + 1);
    if (i == 0)
    { return s; }
    
    int sublength = delim.length();
    if (sublength == 0)
    { return s; }
    
    while (i > 0)
    { result = result + Set.subrange(s,1,i - 1) + rep;
      s = Set.subrange(s,i + delim.length(),s.length());
      i = (s.indexOf(delim) + 1);
    }
    result = result + s;
    return result;
  }


  public static String replaceAll(String str, String regex, String rep)
  { if (str == null) { return null; }
    java.util.regex.Pattern patt = java.util.regex.Pattern.compile(regex);
    java.util.regex.Matcher matcher = patt.matcher(str);
    return matcher.replaceAll(rep);
  }


  public static String replaceFirstMatch(String str, String regex, String rep)
  { if (str == null) { return null; }
    java.util.regex.Pattern patt = java.util.regex.Pattern.compile(regex);
    java.util.regex.Matcher matcher = patt.matcher(str);
    return matcher.replaceFirst(rep);
  }


  public static boolean includesAllMap(Map sup, Map sub)
  { Vector keys = new Vector();
    keys.addAll(sub.keySet());
  
    for (int x = 0; x < keys.size(); x++)
    { Object key = keys.get(x);
      if (sup.containsKey(key))
      { if (sub.get(key).equals(sup.get(key)))
        {}
        else
        { return false; }
      }
      else 
      { return false; }
    }    
    return true;
  }


  public static boolean excludesAllMap(Map sup, Map sub)
  { Vector keys = new Vector();
    keys.addAll(sub.keySet());
  
    for (int x = 0; x < keys.size(); x++)
    { Object key = keys.get(x);
      if (sup.containsKey(key))
      { if (sub.get(key).equals(sup.get(key)))
        { return false; }
      }
    }    
    return true;
  }


  public static HashMap includingMap(Map m, Object src, Object trg) 
  { HashMap copy = new HashMap();
    copy.putAll(m); 
    copy.put(src,trg);
    return copy;
  } 


  public static HashMap excludeAllMap(Map m1, Map m2)  
  { // m1 - m2 
    Vector keys = new Vector(); 
    keys.addAll(m1.keySet()); 
    HashMap res = new HashMap(); 
   
    for (int x = 0; x < keys.size(); x++) 
    { Object key = keys.get(x); 
      if (m2.containsKey(key)) 
      { } 
      else 
      { res.put(key,m1.get(key));  } 
    }     
    return res; 
  } 


  public static HashMap excludingMapKey(Map m, Object k)   
  { // m - { k |-> m(k) }   
    HashMap res = new HashMap();  
    res.putAll(m);  
    res.remove(k);  
    return res;  
  }  


  public static HashMap excludingMapValue(Map m, Object v) 
  { // m - { k |-> v } 
    Vector keys = new Vector();
    keys.addAll(m.keySet());
    HashMap res = new HashMap();
  
    for (int x = 0; x < keys.size(); x++)
    { Object key = keys.get(x);
      if (v.equals(m.get(key)))
      { }
      else
      { res.put(key,m.get(key));  }
    }    
    return res;
  }


  public static HashMap unionMap(Map m1, Map m2) 
  { HashMap res = new HashMap();
    res.putAll(m1);
    res.putAll(m2);    
    return res;
  }


  public static HashMap intersectionMap(Map m1, Map m2) 
  { Vector keys = new Vector();
    keys.addAll(m1.keySet());
    HashMap res = new HashMap();
  
    for (int x = 0; x < keys.size(); x++)
    { Object key = keys.get(x);
      if (m2.containsKey(key) && m1.get(key) != null && m1.get(key).equals(m2.get(key)))
      { res.put(key,m1.get(key));  }
    }    
    return res;
  }

  public static HashMap intersectAllMap(List col)
  { HashMap res = new HashMap();
    if (col.size() == 0) 
    { return res; } 

    Map m0 = (Map) col.get(0);
    res.putAll(m0); 

    for (int i = 1; i < col.size(); i++)
    { Map m = (Map) col.get(i);
      res = Set.intersectionMap(res,m);
    }
    return res; 
  } 

  public static HashMap restrictMap(Map m1, Vector ks) 
  { Vector keys = new Vector();
    keys.addAll(m1.keySet());
    HashMap res = new HashMap();
  
    for (int x = 0; x < keys.size(); x++)
    { Object key = keys.get(x);
      if (ks.contains(key))
      { res.put(key,m1.get(key)); }
    }    
    return res;
  }

  public static HashMap antirestrictMap(Map m1, Vector ks) 
  { Vector keys = new Vector();
    keys.addAll(m1.keySet());
    HashMap res = new HashMap();
  
    for (int x = 0; x < keys.size(); x++)
    { Object key = keys.get(x);
      if (ks.contains(key)) { }
      else { res.put(key,m1.get(key)); }
    }    
    return res;
  }

  public static boolean includesKey(Map m, Object key) 
  { Object val = m.get(key); 
    if (val == null) { return false; }
    return true;
  }

  public static boolean excludesKey(Map m, Object key) 
  { Object val = m.get(key); 
    if (val == null) { return true; }
    return false;
  }

  public static boolean includesValue(Map m, Object val) 
  { Vector keys = new Vector();
    keys.addAll(m.keySet());
    for (int x = 0; x < keys.size(); x++)
    { Object v = m.get(x);
      if (v != null && v.equals(val))
      { return true;  }
    }    
    return false;
  }

  public static boolean excludesValue(Map m, Object val) 
  { Vector keys = new Vector();
    keys.addAll(m.keySet());
    for (int x = 0; x < keys.size(); x++)
    { Object v = m.get(x);
      if (v != null && v.equals(val))
      { return false;  }
    }    
    return true;
  }



  public static <T> T[] asReference(ArrayList sq, T[] r)
  {
    for (int i = 0; i < sq.size() && i < r.length; i++)
    { r[i] = (T) sq.get(i); }
    return r;
  }

  public static int[] resizeTo(int[] arr, int n)
  { int[] tmp = new int[n];
    for (int i = 0; i < n; i++)
    { tmp[i] = arr[i]; }
    return tmp;
  }

  public static long[] resizeTo(long[] arr, int n)
  { long[] tmp = new long[n];
    for (int i = 0; i < n; i++)
    { tmp[i] = arr[i]; }
    return tmp;
  }

  public static double[] resizeTo(double[] arr, int n)
  { double[] tmp = new double[n];
    for (int i = 0; i < n; i++)
    { tmp[i] = arr[i]; }
    return tmp;
  }

  public static boolean[] resizeTo(boolean[] arr, int n)
  { boolean[] tmp = new boolean[n];
    for (int i = 0; i < n; i++)
    { tmp[i] = arr[i]; }
    return tmp;
  }

  public static Object[] resizeTo(Object[] arr, int n)
  { Object[] tmp = new Object[n];
    for (int i = 0; i < n; i++)
    { tmp[i] = arr[i]; }
    return tmp;
  }

  public static ArrayList sequenceRange(int[] arr, int n)
  { ArrayList res = new ArrayList();
    for (int i = 0; i < n && i < arr.length; i++)
    { res.add(new Integer(arr[i])); }
    return res; 
  }

  public static ArrayList sequenceRange(long[] arr, int n)
  { ArrayList res = new ArrayList();
    for (int i = 0; i < n && i < arr.length; i++)
    { res.add(new Long(arr[i])); }
    return res; 
  }

  public static ArrayList sequenceRange(double[] arr, int n)
  { ArrayList res = new ArrayList();
    for (int i = 0; i < n && i < arr.length; i++)
    { res.add(new Double(arr[i])); }
    return res; 
  }

  public static ArrayList sequenceRange(boolean[] arr, int n)
  { ArrayList res = new ArrayList();
    for (int i = 0; i < n && i < arr.length; i++)
    { res.add(new Boolean(arr[i])); }
    return res; 
  }

  public static <T> ArrayList asSequence(T[] r)
  { ArrayList res = new ArrayList(); 
    for (int i = 0; i < r.length; i++)
    { res.add(r[i]); }
    return res;
  }


  }
}
