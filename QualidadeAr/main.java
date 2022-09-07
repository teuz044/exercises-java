package br.com.qualidadear;

import java.util.Random;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		MedicaoQualidadeAr medicao = new MedicaoQualidadeAr();

		Random gerador = new Random();

		medicao.setIdMedicao(gerador.nextInt(1000));

		System.out.println("Digite o indice da qualidade de ar: ");
		medicao.setIndice(ler.nextInt());

		System.out.println(medicao.definirClassificacao());

		ler.close();
	}

}
