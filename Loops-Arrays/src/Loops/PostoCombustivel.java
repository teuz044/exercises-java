// Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
//um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
//que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme

package Loops;

import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int tipoCombustivel;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Digite o tipo de combust�vel abastecido: ");
		tipoCombustivel = ler.nextInt();

		while (tipoCombustivel != 4) {

			if (tipoCombustivel == 1) {
				
				alcool = alcool + 1;

			}
			
			else if (tipoCombustivel == 2) {
				
				gasolina = gasolina + 1;
				
			}
			
			else if (tipoCombustivel == 3) {
				
				diesel = diesel + 1;
				
				
			}
			
			else if (tipoCombustivel >4 || tipoCombustivel <1) {
				
				System.out.println("N�mero inv�lido, digite um n�mero entre 1 e 4: ");
				tipoCombustivel = ler.nextInt();
				
				
			}
			
			System.out.println("Digite 4 para encerrar a opera��o, ou continue escolhendo o combust�vel: ");
			tipoCombustivel = ler.nextInt();
		}
		
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Quantidade de clientes que abasteceram alcool: "+alcool);
		System.out.println("Quantidade de clientes que abasteceram gasolina: "+gasolina);
		System.out.println("Quantidade de clientes que abasteceram diesel: "+diesel);

	}

}
