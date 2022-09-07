package Loops;

import java.util.Scanner;

public class MostrarImparesFOR {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int x;

		System.out.println("Digite um número: ");
		x = ler.nextInt();

		for (int i = 1; i <= x; i++) {

			if (i % 2 != 0) { // RESTO 0 SÃO OS IMPARES, RESTO 1 SÃO OS PARES

				System.out.println(i);
			}

		}

	}

}
