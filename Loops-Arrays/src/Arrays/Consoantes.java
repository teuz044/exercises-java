package Arrays;

import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	

		String[] consoantes = new String[6];
		int qtdConsoantes = 0;
		
		int count = 0;
		
		do {
			
			System.out.println("Digite a letra: ");
			String letra = ler.next();
			
			if ((letra.equalsIgnoreCase("a") | 
			 letra.equalsIgnoreCase("e") |
			 letra.equalsIgnoreCase("i") |
			 letra.equalsIgnoreCase("o") |
			 letra.equalsIgnoreCase("u"))) {
				
				
				
			} 
				
				
		} while(count < consoantes.length);
		
		
		
		for ( String consoante : consoantes ) {
			
			System.out.println(consoante + " ");
		}
		
		
		
		
	}

}
