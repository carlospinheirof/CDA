package cda;

import pessoas.Paciente;

public class RecordTarget {
	String recordtarget;
	public String createRecortTarget(Paciente paciente){
		recordtarget = "<recordTarget>" + "\n";
			
		recordtarget =recordtarget + "</recordTarget>";
		return recordtarget;
	}
}
