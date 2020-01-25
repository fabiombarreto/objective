package view;

import javax.swing.JOptionPane;

public class Resposta {

	public static Boolean executar(String comida) {
		Object[] options = { "Sim", "Nao" };

		Integer retorno = JOptionPane.showOptionDialog(null, "O prato que você pensou é " + comida + "?",
				"Jogo Gourmet", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		if (retorno.equals(0)) {
			return true;
		}
		if (retorno.equals(JOptionPane.CLOSED_OPTION)) {
			return null;
		}
		return false;
	}
}
