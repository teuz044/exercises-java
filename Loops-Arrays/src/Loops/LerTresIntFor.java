package Loops;

import java.util.Scanner;

public class LerTresIntFor {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num = 0;
		int soma = 0;

		for (int i = 0; i < 3; i++) {

			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();

			soma = num + soma;

		}

		System.out.println("A soma dos n�meros � igual a: " + soma);
		
		ler.close();
	}

}
