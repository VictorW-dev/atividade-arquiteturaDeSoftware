package vdev.br.edu.ifpe.atividade.factory;

import vdev.br.edu.ifpe.atividade.buttons.Button;

public abstract class Dialog {
	
	public void renderWindow() {
		
		Button okButton = createButton();
		okButton.render();
		
	}
	
	public abstract Button createButton();

}
