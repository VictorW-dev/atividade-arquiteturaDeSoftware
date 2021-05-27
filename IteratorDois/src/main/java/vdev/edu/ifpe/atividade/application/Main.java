package vdev.edu.ifpe.atividade.application;

import vdev.edu.ifpe.atividade.iterator.CanaisEsportes;
import vdev.edu.ifpe.atividade.iterator.IteradorCanais;

public class Main {
	
	public static void main(String[] args) {
		
		CanaisEsportes meusCanais = new CanaisEsportes();
		System.out.println("Iterando com for:");
		for (IteradorCanais it = meusCanais.criarIterator(); !it.isDone(); it.proximoCanal()) {
			System.out.println(it.getNomeCanal());
		}

		System.out.println("\nIterando manualmente:");
		IteradorCanais it = meusCanais.criarIterator();
		System.out.println(it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNomeCanal());
		it.proximoCanal();
		System.out.println(it.getNomeCanal());

		System.out.println("\nIterando fora dos limites:");
		it.proximoCanal();
		System.out.println(it.getNomeCanal());
		it.first();
		it.voltarCanal();
		System.out.println(it.getNomeCanal());
	}
}