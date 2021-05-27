package vdev.br.edu.ifpe.atividade.social_networks;

import vdev.br.edu.ifpe.atividade.iterators.ProfileIterator;

public interface SocialNetwork {
	
	ProfileIterator createFriendsIterator(String profileEmail);

	ProfileIterator createCoworkersIterator(String profileEmail);
	
}