package questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int constituicao;
		int forca;
		int sabedoria;
		int destreza;
		int carisma;
		int inteligencia;
		
		System.out.println("--- Informe o valor dos atributos com números ENTRE 3 e 18 ---");
		do {
			System.out.println("Constituição: ");
			constituicao = scan.nextInt();
		} while (constituicao < 3 || constituicao > 18);
		do {
			System.out.println("Força: ");
			forca = scan.nextInt();
		} while (forca < 3 || forca > 18);
		do {
			System.out.println("Sabedoria: ");
			sabedoria = scan.nextInt();
		} while (sabedoria < 3 || sabedoria > 18);
		do {
			System.out.println("Destreza: ");
			destreza = scan.nextInt();
		} while (destreza < 3 || destreza > 18);
		do {
			System.out.println("Carisma: ");
			carisma = scan.nextInt();
		} while (carisma < 3 || carisma > 18);
		do {
			System.out.println("Inteligência: ");
			inteligencia = scan.nextInt();
		} while (inteligencia < 3 || inteligencia > 18);
		
		System.out.println("--------------------------------------");
		System.out.println("ESCOLHA UMA CLASSE");
		System.out.println("1 - Anão \n2 - Elfo \n3 - Humano");
		int classe = scan.nextInt();
		
		switch (classe) {
		case 1:
			Anao anao = new Anao(constituicao, forca, sabedoria, destreza, carisma, inteligencia);
			System.out.println(anao.toString());
			break;
		case 2:
			Elfo elfo = new Elfo(constituicao, forca, sabedoria, destreza, carisma, inteligencia);
			System.out.println(elfo.toString());
			break;
		case 3:
			Humano humano = new Humano(constituicao, forca, sabedoria, destreza, carisma, inteligencia);
			System.out.println(humano.toString());
		}
		
	}

}
