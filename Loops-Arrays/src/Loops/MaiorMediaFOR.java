package Loops;

import java.util.Scanner;

public class MaiorMediaFOR {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		int maiorNumero = 0;
		int soma = 0;

		for (int count = 0; count < 5; count++) {

			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();

			soma = soma + numero;

			if (numero > maiorNumero)
				maiorNumero = numero;

		}

		System.out.println("A m�dia �: " + (soma / 5));
		System.out.println("O maior n�mero �: " + maiorNumero);
	}

}
