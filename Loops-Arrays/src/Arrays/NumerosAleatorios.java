package Arrays;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {

		
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for( int count = 0; count < numerosAleatorios.length; count++ ) {
			
			int numero = random.nextInt(100);
			numerosAleatorios[count] = numero;
			
		}
		
		System.out.print("Numeros aleatorios: ");
		for (int numero : numerosAleatorios) {
			
			System.out.println(numero + " ");	
		}
		
		System.out.print("Sucessores dos Numeros aleatorios: ");
		for (int numero : numerosAleatorios) {
			
			System.out.println((numero+1) + " ");	
		}
	}

}
