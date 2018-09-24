package lojas;

import fabricas.FabricaPizza;
import fabricas.FabricaPizzaSP;
import pizzas.Pizza;
import pizzas.PizzaAtum;
import pizzas.PizzaPepperoni;
import pizzas.PizzaQueijo;

public class LojaPizzaSP extends LojaPizza {

	@Override
	public Pizza criarPizza(String tipo) {
		FabricaPizza fabricaPizza = new FabricaPizzaSP();
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
