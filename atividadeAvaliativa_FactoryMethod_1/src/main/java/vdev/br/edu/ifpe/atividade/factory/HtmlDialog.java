package vdev.br.edu.ifpe.atividade.factory;

import vdev.br.edu.ifpe.atividade.buttons.Button;
import vdev.br.edu.ifpe.atividade.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
	
	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
