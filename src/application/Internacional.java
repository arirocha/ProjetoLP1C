package application;

public class Internacional extends Agencia{
	
	protected String pais;
	
	public Internacional(String nome_do_gerente, String CNPJ, String email, Endereco endereco) {
		super(nome_do_gerente, CNPJ, email, endereco);
	}
	
}
