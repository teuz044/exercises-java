package CollectionsLIST;

import java.util.List;
import java.util.ArrayList;

public class OrdenaçãoDeElementosNumaColeção {

	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato(nome:"Jon", idade: 18, cor: "Amarela"));
			add(new Gato(nome:"Simba", idade: 7, cor: "Amarela"));
			add(new Gato(nome:"Zeu", idade: 10, cor: "Amarela"));
		}};
		
		System.out.println(meusGatos);
		
		
		}

}

}

class Gato {

	private String nome;
	private Integer idade;
	private String cor;

	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}