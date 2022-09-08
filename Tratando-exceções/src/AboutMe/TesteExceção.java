package AboutMe;

import java.util.Locale;
import java.util.Scanner;

public class TesteExce��o {

	public static void main(String[] args) {
		try { // analisa se h� alguma excess�o no c�digo, como por exemplo utilizar trocar o .
				// dos n�meros fracionados por ,

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
			System.out.printf("Minha altura � %.2f \n ", altura, " cm");
			ler.close();
		} catch (java.util.InputMismatchException e) { // retorna alguma informa��o quando a excess�o acontece

			System.out.println("Os campos idade e altura devem ser numericos");
		}

	}

}
