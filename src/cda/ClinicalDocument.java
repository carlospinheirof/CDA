package cda;

import pessoas.Paciente;

public class ClinicalDocument {
	 private String cda = "<?xml version=" + "\"1.0\"" + " encoding="+ "\"UTF-8\"?>" + "\n" + 
						  "<ClinicalDocument classCode=\"DOCCLIN\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
						  + "xmlns=\"urn:hl7-org:v3\"" 
						  + "\n";
	 /*
	  * Fazer o resto do inicio.
	  * */
	private RecordTarget RecordTarget = new RecordTarget();
	private Custodian Custodian = new Custodian();
	private Author Author = new Author();
	private LegalAuthenticator LegalAuthenticator = new LegalAuthenticator();
	
	public String CreateCda(Paciente paciente){
		cda = cda + "\n";
		cda = cda + RecordTarget.createRecortTarget(paciente);
		cda = cda + Author.createAuthor(paciente); 
		cda = cda + Custodian.createCustodian(paciente);
		cda = cda + LegalAuthenticator.createLegalAuthenticator(paciente);
		cda = cda + "</ClinicalDocument>";
		return cda;
	}
}
