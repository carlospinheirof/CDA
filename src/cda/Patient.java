package cda;

import pessoas.Paciente;

public class Patient {
		
	private String patient;
	
	public String createPatient(Paciente pa){
		
		patient = "<patient>\n";
		patient = patient + "<name>" + "\n" + "<given>" + pa.getNome() + "</given>" + "\n" + "<family>" + pa.getSobrenome() + "</family>" + "\n" + "</name>" + "\n";
		patient = patient + "<administrativeGenderCode code=" + "\"" +pa.getGenero() +"\"" + " codeSystem= \"" + "2.16.840.1.113883.5.1" + "\"/>" + "\n";
		
		if(pa.getN_ano() != null){
			patient = patient + "<birthtime value=" + "\"" + pa.getN_ano() + pa.getN_mes() + pa.getN_dia() + "\"/>" + "\n";
		}
		else {
			patient = patient + "<birthtime value=" + "\"UNK\"/>" + "\n";
		}
		
		patient = patient + "<maritalStatusCode nullFlavor=" + "\"UNK\"/>" + "\n";
		patient = patient + "<religiousAffiliationCode nullFlavor=" + "\"UNK\"/>" + "\n";
		patient = patient + "<raceCode nullFlavor=" + "\"UNK\"/>" + "\n";
		patient = patient + "<ethnicGroupCode nullFlavor=" + "\"UNK\"/>" + "\n";
		
		if(pa.getLocalnascimento() != null){
			patient = patient + "<birthplace>" + "\n" + "<addr>" + pa.getLocalnascimento() + "</addr>" + "\n" + "</birthplace>" + "\n";
		}else{
			patient = patient + "<birthplace nullFlavor = \"UNK\">"+ "\n";
		}	
		return patient + "</patient>" + "\n";
	}
	
}
 