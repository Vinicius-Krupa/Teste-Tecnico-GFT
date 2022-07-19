package questao2;

public class Elfo extends Raca {

	public Elfo(int constituicao, int forca, int sabedoria, int destreza, int carisma, int inteligencia) {
		super(constituicao, forca, sabedoria, destreza + 2, carisma + 2, inteligencia + 2);
	}

	@Override
	public String toString() {
		return "Elfo [constituicao=" + constituicao + ", forca=" + forca + ", sabedoria=" + sabedoria + ", destreza="
				+ destreza + ", carisma=" + carisma + ", inteligencia=" + inteligencia + "]";
	}
	
}
