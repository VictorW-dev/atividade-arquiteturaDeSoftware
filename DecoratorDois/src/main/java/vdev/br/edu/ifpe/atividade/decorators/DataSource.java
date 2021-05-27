package vdev.br.edu.ifpe.atividade.decorators;

public interface DataSource {
	
	void writeData(String data);
	
	String readData();

}
