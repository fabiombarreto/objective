package view;

import javax.swing.JOptionPane;

public class PerguntaNovaCaracteristica {

	public static String executar(String comidaSugerida, String novaComida) {
		return JOptionPane.showInputDialog(novaComida + " é ______ mas " + comidaSugerida + " não.");
	}

}
