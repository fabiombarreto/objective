package controller;

import domain.Fase;
import view.Acerto;
import view.Encerrar;
import view.Iniciar;
import view.PerguntaCaracteristica;
import view.PerguntaNovaCaracteristica;
import view.PerguntaNovaComida;
import view.Resposta;

public class Jogo {

	Fase nodeAtual;
	Fase primeiroNode;

	public void Iniciar() {

		primeiroNode = new Fase();
		primeiroNode.setCaracteristica("Massa");
		Fase primeiraComida = new Fase();
		primeiraComida.setComida("Bolo de chocolate");
		Fase segundaComida = new Fase();
		segundaComida.setComida("Lasanha");
		primeiroNode.setSim(segundaComida);
		primeiroNode.setNao(primeiraComida);

		primeiraFase();
	}

	private void primeiraFase() {

		nodeAtual = primeiroNode;

		boolean resposta = Iniciar.executar();

		if (resposta) {
			executar();
		} else {
			encerrar();
		}
	}

	private void executar() {
		Boolean resposta = PerguntaCaracteristica.executar(nodeAtual.getCaracteristica());
		if (resposta == null) {
			encerrar();
			return;
		} else if (resposta) {
			nodeAtual = nodeAtual.getSim();
		} else {
			nodeAtual = nodeAtual.getNao();
		}
		if (nodeAtual == null) {
			encerrar();
		} else if (nodeAtual.getComida() == null) {
			executar();
		} else {
			responder();
		}

	}

	private void encerrar() {
		Encerrar.executar();
	}

	private void responder() {
		Boolean resposta = Resposta.executar(nodeAtual.getComida());
		if (resposta == null) {
			encerrar();
			return;
		}
		if (resposta) {
			if (Acerto.executar()) {
				primeiraFase();
			} else {
				encerrar();
			}
		} else {
			String novaComida = PerguntaNovaComida.executar();
			if (novaComida == null) {
				encerrar();
				return;
			}
			String novaCaracteristica = PerguntaNovaCaracteristica.executar(nodeAtual.getComida(), novaComida);
			if (novaCaracteristica == null) {
				encerrar();
				return;
			}
			Fase novaFaseSim = new Fase();
			novaFaseSim.setComida(novaComida);
			Fase novaFaseNao = new Fase();
			novaFaseNao.setComida(nodeAtual.getComida());
			nodeAtual.setComida(null);
			nodeAtual.setSim(novaFaseSim);
			nodeAtual.setNao(novaFaseNao);
			nodeAtual.setCaracteristica(novaCaracteristica);

			primeiraFase();
		}

	}
}
