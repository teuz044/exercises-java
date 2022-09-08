package AboutMe;

import java.util.Locale;
import java.util.Scanner;

public class TesteExceção {

	public static void main(String[] args) {
		try { // analisa se há alguma excessão no código, como por exemplo utilizar trocar o .
				// dos números fracionados por ,

			Scanner ler = new Scanner(System.in).useLocale(Locale.US);

			System.out.println("Digite seu nome: ");
			String nome = ler.next();

			System.out.println("Digite o seu sobrenome: ");
			String sobrenome = ler.next();

			System.out.println("Digite sua idade: ");
			int idade = ler.nextInt();

			System.out.println("Digite sua altura: ");
			double altura = ler.nextDouble();

			// imprimindo os dados obtidos

			System.out.println("Ola, me chamo " + nome.toUpperCase());
			System.out.println("Ola, me chamo " + sobrenome.toUpperCase());
			System.out.println("Tenho " + idade + " anos");
			System.out.printf("Minha altura é %.2f \n ", altura, " cm");
			ler.close();
		} catch (java.util.InputMismatchException e) { // retorna alguma informação quando a excessão acontece

			System.out.println("Os campos idade e altura devem ser numericos");
		}

	}

}
