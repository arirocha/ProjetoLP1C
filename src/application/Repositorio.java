package application;
	import java.util.Scanner;
	import java.util.ArrayList;

public class Repositorio {	
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Agencia> listaAgencia;
	
	public Repositorio() {
		listaAgencia = new ArrayList <Agencia>();
		
	}

	
	public void adicionar(Agencia agencia) {
		if ( agencia != null )
			listaAgencia.add(agencia);
	}
	
	public ArrayList<Agencia> getAgencias(){
		return listaAgencia;
	}
	
//	public void relatorio() {
//		for(Agencia agencia : listaAgencia) {
//			System.out.println(agencia);
//		}
//	}
	
	
	
}

// adicionar, remover, alterar, relatorio