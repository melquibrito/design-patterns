package fabricas;

import ingredientes.AtumFresco;
import ingredientes.Atum;
import ingredientes.Massa;
import ingredientes.Molho;
import ingredientes.Pepperoni;
import ingredientes.Queijo;
import ingredientes.MassaFina;
import ingredientes.MolhoTomate;
import ingredientes.PepperoniExecelenteMarca;
import ingredientes.QueijoMussarela;

public class FabricaPizzaPE implements FabricaPizza {

	@Override
	public Massa criarMassa() {
		return new MassaFina();
	}

	@Override
	public Molho criarMolho() {
		return new MolhoTomate();
	}

	@Override
	public Pepperoni criarPepperoni() {
		return new PepperoniExecelenteMarca();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoMussarela();
	}

	@Override
	public Atum criarAtum() {
		return new AtumFresco();
	}

}
