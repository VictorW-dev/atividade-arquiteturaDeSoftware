package vdev.br.edu.ifpe.atividade.application;

import vdev.br.edu.ifpe.atividade.decorators.*;

public class Main {
	
	public static void main(String[] args) {
		
		String salaryRecords = "Name,Salary\nVictor Santos,850000\nSteven Jobs,912000";
		
		DataSourceDecorator encoded = new CompressionDecorator(
				new EncryptionDecorator(new FileDataSource("D:\\Documentos\\Arquitetura de Software\\Out\\OutputDemo.txt")));
		encoded.writeData(salaryRecords);
		
		DataSource plain = new FileDataSource("D:\\Documentos\\Arquitetura de Software\\Out\\OutputDemo.txt");

		System.out.println("- Input ----------------");
		System.out.println(salaryRecords);
		System.out.println("- Encoded --------------");
		System.out.println(plain.readData());
		System.out.println("- Decoded --------------");
		System.out.println(encoded.readData());
	}
}
