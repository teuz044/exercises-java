package Loops;

import java.util.Scanner;

public class PareImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int qtdeNumInteiros;
		int numero;
		int qtdNumPares = 0, qtdNumImp = 0;
		
		System.out.println("Digite um n�mero inteiro: ");
		qtdeNumInteiros = ler.nextInt();
		
		int count = 0;
		do {
			
			System.out.println("Numero:");
			numero = ler.nextInt();
			count++;
			
			if (numero % 2 == 0)
				qtdNumPares++; 
			else qtdNumImp++;
			
			
		} while (count < qtdeNumInteiros);
		
		System.out.println("Quantidade de n�meros pares: "+qtdNumPares);
		System.out.println("Quantidade de n�meros imp�res: "+qtdNumImp);
		
		
		
		
	}

}
