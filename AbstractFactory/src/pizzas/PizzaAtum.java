package pizzas;

import fabricas.FabricaPizza;

public class PizzaAtum extends Pizza {

	private FabricaPizza fabricaPizza;
	
	public PizzaAtum(FabricaPizza fabricaPizza) {
		this.fabricaPizza = fabricaPizza;
	}
	
	@Override
	public void preparar() {
		massa = fabricaPizza.criarMassa();
		molho = fabricaPizza.criarMolho();
		queijo = fabricaPizza.criarQueijo();
		atum = fabricaPizza.criarAtum();
	}

}
