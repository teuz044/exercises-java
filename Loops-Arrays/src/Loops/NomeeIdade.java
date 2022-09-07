package Loops;

import java.util.Scanner;

public class NomeeIdade {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome;
		int idade;

		
		while(true) {
			
			System.out.println("Digite o nome do aluno: ");
			nome = ler.next();
			if (nome.equals("0")) break;
			
			System.out.println("Digite a idade do aluno: ");
			idade = ler.nextInt();
		}	

		System.out.println("CONTINUA AQUI...");
	}

}
