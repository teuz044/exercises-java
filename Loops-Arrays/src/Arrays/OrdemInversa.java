package Arrays;

public class OrdemInversa {

	// Crie um vetor de 6 numeros inteiros e mostre na ordem inversa

	public static void main(String[] args) {

		int[] vetor = { -5, -6, 15, 50, 8, 4 };

		System.out.println("VETOR CRESCENTE");
		System.out.println(vetor.length - 1);

		int count = 0;

		while (count < (vetor.length)) {

			System.out.println(vetor[count]);
			count++;
		}

		System.out.println("VETOR DECRESCENTE");

		for (int countDois = (vetor.length - 1); countDois >= 0; countDois--) {

			System.out.println(" Vetor " + vetor[countDois]);
		}

	}
}