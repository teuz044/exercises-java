package Arrays;

/* Elabore um programa para receber 6 n�meros inteiros em array.
Depois receber um n�mero e pesquisar esse n�mero no array.

- Sempre que o n�mero pesquisado for encontrada no array,
  mostrar as posi��es em que foi encontrado;
- Se o n�mero pesquisado n�o for encontrado,
  mostrar "N�mero n�o encontrado".
*/

import java.util.Scanner;

public class faculdade1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		final int TAMANHO = 6;
		int[] numero = new int[TAMANHO];
		int numeroPesquisado;

		for (int i = 0; i < TAMANHO; i++) {
			System.out.printf("Informe a %d� numero: ", (i + 1));
			numero[i] = ler.nextInt();

		}

		System.out.println("Digite o n�mero para pesquisar: ");
		numeroPesquisado = ler.nextInt();

		boolean achou = false;
		for (int i = 0; i < TAMANHO; i++) {

			if (numeroPesquisado == numero[i]) {

				System.out.println("N�mero encontrado na posi�o: " + (i + 1));
				achou = true;

			}
		}

			if (achou == false) {
				System.out.println("N�mero n�o encontrado");

			}

			ler.close();
		}

	}


