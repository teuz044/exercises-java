package Loops;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int fatorial;
		
		System.out.println("Digite o fatorial: ");
		fatorial = ler.nextInt();
		
		for(int count = fatorial; count >= 1; count--) {
	
			int multiplicacao = (fatorial * count);
		
			
			System.out.println("A resposta é: "+multiplicacao);
			
		}
		
		ler.close();
	}

}
