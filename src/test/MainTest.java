package test;

import cda.ClinicalDocument;
import pessoas.Paciente;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClinicalDocument cda = new ClinicalDocument();
		Paciente paciente = new Paciente();
		System.out.println(cda.CreateCda(paciente));
	}

}
