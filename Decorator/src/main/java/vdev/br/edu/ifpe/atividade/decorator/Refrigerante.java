package vdev.br.edu.ifpe.atividade.decorator;

public class Refrigerante extends CoquetelDecorator {

	public Refrigerante(Coquetel umCoquetel) {
		super(umCoquetel);
		
		nome = "Refrigerante";
		preco = 7.0;
		
	}

}
