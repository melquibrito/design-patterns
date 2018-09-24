package pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	
	protected String nome;
	protected String massa;
	protected String molho;
	protected List<String> coberturas = new ArrayList<>();
	
	public void preparar() {
		System.out.println("Preparando " + nome);
		System.out.println("Montando a massa " + massa);
		System.out.println("Adicionando o molho " + molho);
		System.out.println("Adicionando coberturas: ");
		for(String cobertura : coberturas) {
			System.out.println(" " + cobertura);
		}
	}
	
	public void assar() {
		System.out.println("Assando por 25 minutos a 350º.");
	}
	
	public void cortar() {
		System.out.println("Cortando a pizza em pedaços diagonais.");
	}
	
	public void colocarNaCaixa() {
		System.out.println("Colocando a pizza na caixa oficial da loja.");
	}
	
	public String getNome() {
		return nome;
	}
}
