package view;

import javax.swing.JOptionPane;

public class Acerto {

	public static boolean executar() {
		Integer retorno = JOptionPane.showConfirmDialog(null, "Acertei de novo!", "Jogo Gourmet",
				JOptionPane.OK_CANCEL_OPTION);
		if (retorno.equals(0)) {
			return true;
		} else {
			return false;
		}
	}

}
