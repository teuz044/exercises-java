/*O Banco Atual deseja um sistema de controle da contas banc�rias e deseja iniciar um projeto piloto com apenas uma
conta. Deve ser considerado o requisito a seguir, expresso na forma de hist�rias do usu�rios (user story):

US1: Como gerente de contas eu desejo cadastrar as contas que gerencio.
Crit�rios de aceita��o:
A conta tem um n�mero, um tipo (�Corrente� ou �Poupan�a�) e saldo.
O n�mero da conta deve se num�rico.
Por ocasi�o do cadastro da conta o saldo deve ser registrado como 0 (zero).

US2: Como caixa do banco desejo informar a valor que est� sendo depositado para que o saldo da conta seja
atualizado.

US3: Como caixa do banco desejo informar a valor que est� sendo retirado para que o saldo da conta seja atualizado.
Crit�rios de aceita��o:
N�o pode haver saque com valor superior ao saldo da conta.

US4: Como cliente eu desejo consultar o saldo da conta. */

package br.com.contabancaria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ContasBancarias acc = new ContasBancarias();

		System.out.println("Digite o n�mero da conta: ");
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
			System.out.println("Seu saldo � de: " +acc.getSaldo());
			break;
			
		default:
			System.out.println("N�mero incorreto");
		}

		ler.close();
	}

}