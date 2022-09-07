package Loops;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int tabuada;

		System.out.println("Digite o número: ");
		tabuada = ler.nextInt();
		
		System.out.println("Tabuada de:"+tabuada);
		
		for(int count = 1; count <=10; count++ ) {
			System.out.println(tabuada + " X " + count + " = " + (tabuada*count));
			
			
		}
	}

}
