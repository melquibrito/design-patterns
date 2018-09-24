package lojas;

import pizzas.Pizza;

public abstract class LojaPizza {
	
	public Pizza pedirPizza(String tipo) {
		Pizza pizza = criarPizza(tipo);
		
		if(pizza != null) {			
			pizza.preparar();
			pizza.assar();
			pizza.colocarNaCaixa();
			pizza.cortar();
		}
		
		return pizza;
	}
	
	protected abstract Pizza criarPizza(String tipo);

}
