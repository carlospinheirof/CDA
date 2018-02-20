package cda;

import pessoas.Paciente;

public class ClinicalDocument {
	String cda = "<?xml version=" + "\"1.0\"" + " encoding="+ "\"UTF-8\"?>" + "\n" + 
				"<ClinicalDocument classCode=\"DOCCLIN\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:hl7-org:v3\"" + "\n";
	
	
	//-<ClinicalDocument classCode="DOCCLIN" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="urn:hl7-org:v3">
	RecordTarget RecordTarget = new RecordTarget();
	
	public String CreateCda(Paciente paciente){
		cda = cda + "\n";
		cda = cda + RecordTarget.createRecortTarget(paciente);
		
		cda = cda + "</ClinicalDocument>";
		return cda;
	}
}
