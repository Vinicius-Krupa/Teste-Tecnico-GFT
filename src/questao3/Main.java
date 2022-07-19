package questao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int u,d;
        
        String extenso = "", conexao;
        String[] unidade,dezena,dezenaespecial;
        
        unidade = new String[10];
        dezena = new String[10];
        dezenaespecial = new String[10];
        
        unidade[0] = "";
        unidade[1] = "um";
        unidade[2] = "dois";
        unidade[3] = "três";
        unidade[4] = "quatro";
        unidade[5] = "cinco";
        unidade[6] = "seis";
        unidade[7] = "sete";
        unidade[8] = "oito";
        unidade[9] = "nove";
        
        dezena[0] = "";
        dezena[1] = "dez";
        dezena[2] = "vinte";
        dezena[3] = "trinta";
        dezena[4] = "quarenta";
        dezena[5] = "cinquenta";
        dezena[6] = "sessenta";
        dezena[7] = "setenta";
        dezena[8] = "oitenta";
        dezena[9] = "noventa";
        
        dezenaespecial[0] = "dez";
        dezenaespecial[1] = "onze";
        dezenaespecial[2] = "doze";
        dezenaespecial[3] = "treze";
        dezenaespecial[4] = "quatorze";
        dezenaespecial[5] = "quinze";
        dezenaespecial[6] = "dezesseis";
        dezenaespecial[7] = "dezessete";
        dezenaespecial[8] = "dezoito";
        dezenaespecial[9] = "dezenove";
        
        System.out.println("Informe um número: ");
        int num = scan.nextInt();
        
        if (num >= 1 && num <= 99) {
             d = num / 10;
             u = num % 10;
        
             conexao = "";
             if (d > 0 && u > 0) {
                  conexao = " e ";
             }
             
             if (num >= 10 && num <= 19) {
                  extenso = dezenaespecial[ u ];
             } else {
                  extenso = dezena[ d ] + conexao + unidade[ u ];
             }
        }
        System.out.println(extenso);
	}

}
