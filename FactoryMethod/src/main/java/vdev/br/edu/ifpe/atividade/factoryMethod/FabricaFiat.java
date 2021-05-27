package vdev.br.edu.ifpe.atividade.factoryMethod;

public class FabricaFiat implements FabricaDeCarro {
	
	@Override
	public Carro criarCarro() {
		return new Palio();
	}

}
