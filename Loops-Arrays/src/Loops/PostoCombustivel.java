// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme

package Loops;

import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int tipoCombustivel;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Digite o tipo de combustível abastecido: ");
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
				
				System.out.println("Número inválido, digite um número entre 1 e 4: ");
				tipoCombustivel = ler.nextInt();
				
				
			}
			
			System.out.println("Digite 4 para encerrar a operação, ou continue escolhendo o combustível: ");
			tipoCombustivel = ler.nextInt();
		}
		
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Quantidade de clientes que abasteceram alcool: "+alcool);
		System.out.println("Quantidade de clientes que abasteceram gasolina: "+gasolina);
		System.out.println("Quantidade de clientes que abasteceram diesel: "+diesel);

	}

}
