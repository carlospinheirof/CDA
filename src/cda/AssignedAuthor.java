package cda;

public class AssignedAuthor {

	private String id_local, endere�o, telefone;
	
	private String assinador;
	
	private AssignedPerson assPerson = new AssignedPerson();
	
	public String createAsw(){
		
		assinador = "<assignedAutor>" + "\n";
		assinador = assinador + "<id extension=" + "\"" + this.getId_local() + "\"" + "root="+"\"2.16.840.1.113883.3.933\"/>";
		assinador = assinador + "<addr>" + this.getEndere�o() + "</addr>";
		assinador = assinador + "<telecom value=" + "\"" + this.getTelefone() + "\"/>";
		
		return assinador + assPerson.assignedPerson() + "</assignedPerson>";
	}

	public String getId_local() {
		return id_local;
	}

	public void setId_local(String id_local) {
		this.id_local = id_local;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
