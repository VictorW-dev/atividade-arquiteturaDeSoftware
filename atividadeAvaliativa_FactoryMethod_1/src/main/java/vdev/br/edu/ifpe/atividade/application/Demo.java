package vdev.br.edu.ifpe.atividade.application;

import vdev.br.edu.ifpe.atividade.factory.Dialog;
import vdev.br.edu.ifpe.atividade.factory.HtmlDialog;
import vdev.br.edu.ifpe.atividade.factory.WindowsDialog;

public class Demo {
	
	private static Dialog dialog;
	
	public static void main(String[] args) {
		
		configure();
		runBusinessLogic();
		
	}
	
	static void configure() {
		if (System.getProperty("os.name").equals("Windows 10")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}
	
	static void runBusinessLogic() {
		dialog.renderWindow();
	}

}
