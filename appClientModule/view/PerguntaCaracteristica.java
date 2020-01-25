package view;

import javax.swing.JOptionPane;

public class PerguntaCaracteristica {

	public static Boolean executar(String caracteristica) {
			Object[] options = { "Sim", "Nao" };

			Integer retorno = JOptionPane.showOptionDialog(null, "O prato que você pensou é " + caracteristica + "?",
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
