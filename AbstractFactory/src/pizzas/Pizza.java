package pizzas;

import ingredientes.Atum;
import ingredientes.Massa;
import ingredientes.Molho;
import ingredientes.Pepperoni;
import ingredientes.Queijo;

public abstract class Pizza {
	
	protected String nome;
	protected Atum atum;
	protected Massa massa;
	protected Molho molho;
	protected Pepperoni pepperoni;
	protected Queijo queijo;
	
	public abstract void preparar();
	
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
