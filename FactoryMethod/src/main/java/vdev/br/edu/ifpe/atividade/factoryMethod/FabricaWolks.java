package vdev.br.edu.ifpe.atividade.factoryMethod;

public class FabricaWolks implements FabricaDeCarro {
	
	@Override
	public Carro criarCarro() {
		return new Gol();
	}

}
