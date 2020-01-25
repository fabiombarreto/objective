package view;

import javax.swing.JOptionPane;

public class Iniciar {

	public static boolean executar() {

		Integer retorno = JOptionPane.showConfirmDialog(null, "Pense em um prato que gosta", "Jogo Gourmet",
				JOptionPane.OK_CANCEL_OPTION);
		if (retorno.equals(0)) {
			return true;
		} else {
			return false;
		}

	}

}
