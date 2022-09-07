package Loops;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int nota;

		System.out.println("Digite sua nota: ");
		nota = ler.nextInt();

		while (nota < 0 || nota > 10) {

			System.out.println("Nota invalida, digite novamente");
			nota = ler.nextInt();

		}

		System.out.println("Nota armazenada");

	}

}
