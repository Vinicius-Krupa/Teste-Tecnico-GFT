package questao2;

public abstract class Raca {
	protected int constituicao;
	protected int forca;
	protected int sabedoria;
	protected int destreza;
	protected int carisma;
	protected int inteligencia;
	
	public Raca(int constituicao, int forca, int sabedoria, int destreza, int carisma, int inteligencia) {
		this.constituicao = constituicao;
		this.forca = forca;
		this.sabedoria = sabedoria;
		this.destreza = destreza;
		this.carisma = carisma;
		this.inteligencia = inteligencia;
	}
	
	public int getConstituicao() {
		return constituicao;
	}
	public void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getSabedoria() {
		return sabedoria;
	}
	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getCarisma() {
		return carisma;
	}
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	@Override
	public String toString() {
		return "Raca [constituicao=" + constituicao + ", forca=" + forca + ", sabedoria=" + sabedoria + ", destreza="
				+ destreza + ", carisma=" + carisma + ", inteligencia=" + inteligencia + "]";
	}
	
}
