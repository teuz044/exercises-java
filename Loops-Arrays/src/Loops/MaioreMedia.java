package Loops;

import java.util.Scanner;

public class MaioreMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero;
		int contador = 0;
		int maiorNumero = 0;
		int soma = 0;
;		
		do {

			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			contador++;
			
			soma = soma + numero;

			if (numero > maiorNumero)
				maiorNumero = numero;

		} while (contador < 5);

		System.out.println("A m�dia �: "+(soma/5));
		System.out.println("O maior n�mero �: " + maiorNumero);
	}
}