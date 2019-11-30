package br.edu.fapi.Carro;

public class mainCarro {

	public static void main(String[] args) {
	    FabricaDeCarro fabrica = new FabricaFiat();
	    CarroSedan sedan = fabrica.criarCarroSedan();
	    CarroPopular popular = fabrica.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	    System.out.println();
	 
	    fabrica = new FabricaFiat();
	    sedan = fabrica.criarCarroSedan();
	    popular = fabrica.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	}

}



