package questao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor, n;
		int sobra = 0;
		String romanos = "";
		String[] r = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int[] i = {1,4,5,9,10,40,50,90,100,400,500,900,1000};

		System.out.print("Informe um numero entre 1 e 3999:");
		valor = scan.nextInt();

		n = valor; 

		if (valor < 4000) {
			for(int cont = 12; cont > -1; cont--){
				while (valor >= i[cont]){
					romanos += r[cont];
					valor -= i[cont];
				}

			}
			System.out.println("O Algarismo Romano correspondente a " + n + " é " + romanos);
		} else {
			System.out.print("Valor Inválido!");
		} 
	}
}
