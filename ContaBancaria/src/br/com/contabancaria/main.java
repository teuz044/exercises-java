/*O Banco Atual deseja um sistema de controle da contas bancárias e deseja iniciar um projeto piloto com apenas uma
conta. Deve ser considerado o requisito a seguir, expresso na forma de histórias do usuários (user story):

US1: Como gerente de contas eu desejo cadastrar as contas que gerencio.
Critérios de aceitação:
A conta tem um número, um tipo (“Corrente” ou “Poupança”) e saldo.
O número da conta deve se numérico.
Por ocasião do cadastro da conta o saldo deve ser registrado como 0 (zero).

US2: Como caixa do banco desejo informar a valor que está sendo depositado para que o saldo da conta seja
atualizado.

US3: Como caixa do banco desejo informar a valor que está sendo retirado para que o saldo da conta seja atualizado.
Critérios de aceitação:
Não pode haver saque com valor superior ao saldo da conta.

US4: Como cliente eu desejo consultar o saldo da conta. */

package br.com.contabancaria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ContasBancarias acc = new ContasBancarias();

		System.out.println("Digite o número da conta: ");
		acc.setNumeroConta(ler.nextDouble());

		System.out.println("Digite o tipo da conta: ");
		acc.setTipoConta(ler.next());

		System.out.println("Digite 1 para depositar, 2 para sacar e 3 para ver o saldo");
		int saldo = ler.nextInt();

		switch (saldo) {

		case 1:
			System.out.println("Digite o valor que vai ser depositado: ");
			acc.deposito(ler.nextDouble());
		case 2:
			System.out.println("Digite o valor que vai ser sacado:");
			acc.saque(ler.nextDouble());
		case 3:
			System.out.println("Seu saldo é de: " +acc.getSaldo());
			break;
			
		default:
			System.out.println("Número incorreto");
		}

		ler.close();
	}

}