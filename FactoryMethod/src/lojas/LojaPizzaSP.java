package lojas;

import pizzas.Pizza;
import pizzas.PizzaAtumSP;
import pizzas.PizzaPepperoniSP;
import pizzas.PizzaQueijoSP;

public class LojaPizzaSP extends LojaPizza {

	@Override
	public Pizza criarPizza(String tipo) {
		if(tipo.equals("Queijo")) {
			return new PizzaQueijoSP();
		}else if(tipo.equals("Atum")) {
			return new PizzaAtumSP();
		}else if(tipo.equals("Pepperoni")) {
			return new PizzaPepperoniSP();
		}
		return null;
	}

}
