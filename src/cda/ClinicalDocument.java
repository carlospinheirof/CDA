package cda;

import pessoas.Paciente;

public class ClinicalDocument {
	String cda = "<?xml version=" + "\"1.0\"" + " encoding="+ "\"UTF-8\"?>" + "\n" + 
				"<ClinicalDocument classCode=\"DOCCLIN\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:hl7-org:v3\"" + "\n";
	
	
	//-<ClinicalDocument classCode="DOCCLIN" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="urn:hl7-org:v3">
	RecordTarget RecordTarget = new RecordTarget();
	Custodian Custodian = new Custodian();
	
	public String CreateCda(Paciente paciente){
		cda = cda + "\n";
		cda = cda + RecordTarget.createRecortTarget(paciente);
		//author
		cda = cda + Custodian.createCustodian(paciente);
		cda = cda + "</ClinicalDocument>";
		return cda;
	}
}
