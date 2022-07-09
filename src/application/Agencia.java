package application;

public abstract class Agencia {
		
	protected String nome_do_gerente;
	protected String CNPJ;
	protected String email;
	protected Endereco endereco;
	
	
	public Agencia(String nome_do_gerente, String CNPJ, String email, Endereco endereco) {
		this.nome_do_gerente = (nome_do_gerente != null) ? nome_do_gerente: "";
		this.CNPJ = (CNPJ != null) ? CNPJ: "";
		this.email = (email != null) ? nome_do_gerente: "";
		this.endereco = endereco;
		
	}
	
	
	
	public void relarotio() {
		
	}



	/**
	 * @return the nome_do_gerente
	 */
	public String getNome_do_gerente() {
		return nome_do_gerente;
	}



	/**
	 * @param nome_do_gerente the nome_do_gerente to set
	 */
	public void setNome_do_gerente(String nome_do_gerente) {
		this.nome_do_gerente = nome_do_gerente;
	}



	/**
	 * @return the cNPJ
	 */
	public String getCNPJ() {
		return CNPJ;
	}



	/**
	 * @param cNPJ the cNPJ to set
	 */
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}



	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
