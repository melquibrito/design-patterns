package pizzas;

import fabricas.FabricaPizza;

public class PizzaQueijo extends Pizza {

	private FabricaPizza fabricaPizza;
	
	public PizzaQueijo(FabricaPizza fabricaPizza) {
		this.fabricaPizza = fabricaPizza;
	}
	
	@Override
	public void preparar() {
		massa = fabricaPizza.criarMassa();
		molho = fabricaPizza.criarMolho();
		queijo = fabricaPizza.criarQueijo();
	}

}
