package Arrays;

/* Elabore um programa para receber 6 números inteiros em array.
Depois receber um número e pesquisar esse número no array.

- Sempre que o número pesquisado for encontrada no array,
  mostrar as posições em que foi encontrado;
- Se o número pesquisado não for encontrado,
  mostrar "Número não encontrado".
*/

import java.util.Scanner;

public class faculdade1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		final int TAMANHO = 6;
		int[] numero = new int[TAMANHO];
		int numeroPesquisado;

		for (int i = 0; i < TAMANHO; i++) {
			System.out.printf("Informe a %dº numero: ", (i + 1));
			numero[i] = ler.nextInt();

		}

		System.out.println("Digite o número para pesquisar: ");
		numeroPesquisado = ler.nextInt();

		boolean achou = false;
		for (int i = 0; i < TAMANHO; i++) {

			if (numeroPesquisado == numero[i]) {

				System.out.println("Número encontrado na posião: " + (i + 1));
				achou = true;

			}
		}

			if (achou == false) {
				System.out.println("Número não encontrado");

			}

			ler.close();
		}

	}


