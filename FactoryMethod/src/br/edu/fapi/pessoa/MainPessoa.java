package br.edu.fapi.pessoa;

public class MainPessoa {

	public static void main(String[] args) {
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Carlos";
		String sexo = "M";
		factory.getPessoa(nome, sexo);
		

	}

}
