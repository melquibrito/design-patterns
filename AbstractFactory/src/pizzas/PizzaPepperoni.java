package pizzas;

import fabricas.FabricaPizza;

public class PizzaPepperoni extends Pizza {

	private FabricaPizza fabricaPizza;
	
	public PizzaPepperoni(FabricaPizza fabricaPizza) {
		this.fabricaPizza = fabricaPizza;
	}
	
	@Override
	public void preparar() {
		massa = fabricaPizza.criarMassa();
		molho = fabricaPizza.criarMolho();
		queijo = fabricaPizza.criarQueijo();
		pepperoni = fabricaPizza.criarPepperoni();
	}

}
