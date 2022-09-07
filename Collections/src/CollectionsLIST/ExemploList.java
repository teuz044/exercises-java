package CollectionsLIST;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {

	public static void main(String[] args) {

		System.out.println("Crie uma lista e adicione as sete notas: ");

		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(8.0);
		notas.add(7.3);
		notas.add(5.0);
		notas.add(5.3);
		notas.add(0.0);
		notas.add(4.5);

		System.out.println(notas.toString());

		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8d);
		System.out.println(notas);

		System.out.println("Substitua a nota 5.0 pela nota 6.0");
		notas.set(notas.indexOf(5.0), 6.0); // procura o numero 5.0 no array e substitui
		System.out.println(notas);

		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0)); // contains = boolean

		System.out.println("Exiba todas as notas nas ordens que foram informadas: ");
		System.out.println(notas);

		System.out.println("Exiba a menor nota: " + Collections.min(notas));

		System.out.println("Exiba a maior nota: " + Collections.max(notas));

		System.out.println("EXIBA A SOMA DOS VALORES: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}

		System.out.printf("%.2f", soma);

		System.out.printf("Média dos elementos: %.2f \n ", (soma / notas.size())); // size = qtd de elementos que tenho
																					// dentro do meu List/array

		System.out.println("Remova a nota 0");
		notas.remove(0d);
		System.out.println(notas);

		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7)
				iterator1.remove();

			System.out.println("Apague toda a lista: ");
			notas.clear();

			System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

		}

	}

}
