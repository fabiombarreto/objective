package domain;

public class Fase {

	Fase sim;
	Fase nao;
	String caracteristica;
	String comida;
	
	public Fase getSim() {
		return sim;
	}
	public void setSim(Fase sim) {
		this.sim = sim;
	}
	public Fase getNao() {
		return nao;
	}
	public void setNao(Fase nao) {
		this.nao = nao;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String nome) {
		this.caracteristica = nome;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
}
