package pessoas;

public class Paciente {
	private String id;
	private String nome;
	private String sobrenome;
	private String endereco;
	private String ddd, numero;
	private String genero;
	private String n_ano, n_mes, n_dia;
	private String localnascimento;
	
	public String getLocalnascimento() {
		return localnascimento;
	}

	public void setLocalnascimento(String localnascimento) {
		this.localnascimento = localnascimento;
	}

	public String getN_ano() {
		return n_ano;
	}

	public void setN_ano(String n_ano) {
		this.n_ano = n_ano;
	}

	public String getN_mes() {
		return n_mes;
	}

	public void setN_mes(String n_mes) {
		this.n_mes = n_mes;
	}

	public String getN_dia() {
		return n_dia;
	}

	public void setN_dia(String n_dia) {
		this.n_dia = n_dia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
