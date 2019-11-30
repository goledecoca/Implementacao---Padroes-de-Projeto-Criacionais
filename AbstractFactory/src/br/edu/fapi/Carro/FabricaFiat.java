package br.edu.fapi.Carro;

public class FabricaFiat implements FabricaDeCarro {
	 
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }
 
    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
 
}
