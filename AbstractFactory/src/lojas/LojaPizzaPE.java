package lojas;

import fabricas.FabricaPizza;
import fabricas.FabricaPizzaPE;
import pizzas.Pizza;
import pizzas.PizzaAtum;
import pizzas.PizzaPepperoni;
import pizzas.PizzaQueijo;

public class LojaPizzaPE extends LojaPizza {

	@Override
	public Pizza criarPizza(String tipo) {
		FabricaPizza fabricaPizza = new FabricaPizzaPE();
		if(tipo.equals("Queijo")) {
			return new PizzaQueijo(fabricaPizza);
		}else if(tipo.equals("Atum")) {
			return new PizzaAtum(fabricaPizza);
		}else if(tipo.equals("Pepperoni")) {
			return new PizzaPepperoni(fabricaPizza);
		}
		return null;
	}

}
