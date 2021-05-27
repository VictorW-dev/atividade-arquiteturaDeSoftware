package vdev.br.edu.ifpe.atividade.iterators;

import vdev.br.edu.ifpe.atividade.profile.Profile;

public interface ProfileIterator {

	boolean hasNext();
	
	Profile getNext();
	
	void reset();
	
}
