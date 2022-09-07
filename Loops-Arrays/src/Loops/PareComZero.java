package Loops;

import java.util.Scanner;

public class PareComZero {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número");
		numero = ler.nextInt();

		while (numero != 0) {

			System.out.println("Digite um número");
			numero = ler.nextInt();

		}

		System.out.println("Finalizado");

		ler.close();
	}

}
