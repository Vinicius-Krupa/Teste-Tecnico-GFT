package questao2;

public class Humano extends Raca {

	public Humano(int constituicao, int forca, int sabedoria, int destreza, int carisma, int inteligencia) {
		super(constituicao + 1, forca + 1, sabedoria + 1, destreza + 1, carisma + 1, inteligencia + 1);
	}

}
