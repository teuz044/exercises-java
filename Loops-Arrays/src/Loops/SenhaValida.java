package Loops;

import java.util.Scanner;

public class SenhaValida {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int senha;

		System.out.println("Escreva sua senha: ");
		senha = ler.nextInt();

		while (senha != 2002) {

			System.out.println("Acesso negado");
			System.out.println("Digite uma nova senha: ");
			senha = ler.nextInt();
		}

		System.out.println("Acesso permitido");

	}

}
