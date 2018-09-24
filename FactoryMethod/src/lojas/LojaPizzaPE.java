package lojas;

import pizzas.Pizza;
import pizzas.PizzaAtumPE;
import pizzas.PizzaPepperoniPE;
import pizzas.PizzaQueijoPE;

public class LojaPizzaPE extends LojaPizza {

	@Override
	public Pizza criarPizza(String tipo) {
		if(tipo.equals("Queijo")) {
			return new PizzaQueijoPE();
		}else if(tipo.equals("Atum")) {
			return new PizzaAtumPE();
		}else if(tipo.equals("Pepperoni")) {
			return new PizzaPepperoniPE();
		}
		return null;
	}

}
