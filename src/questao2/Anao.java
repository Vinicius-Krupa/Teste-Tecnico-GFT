package questao2;

public class Anao extends Raca {

	public Anao(int constituicao, int forca, int sabedoria, int destreza, int carisma, int inteligencia) {
		super(constituicao + 2, forca + 2, sabedoria + 2, destreza, carisma, inteligencia);
	}

	@Override
	public String toString() {
		return "Anao [constituicao=" + constituicao + ", forca=" + forca + ", sabedoria=" + sabedoria + ", destreza="
				+ destreza + ", carisma=" + carisma + ", inteligencia=" + inteligencia + "]";
	}
	
}
