package fabricas;

import ingredientes.Atum;
import ingredientes.AtumCongelado;
import ingredientes.Massa;
import ingredientes.MassaGrossa;
import ingredientes.Molho;
import ingredientes.MolhoMarinara;
import ingredientes.Pepperoni;
import ingredientes.PepperoniExecelenteMarca;
import ingredientes.Queijo;
import ingredientes.QueijoParmesao;

public class FabricaPizzaSP implements FabricaPizza {

	@Override
	public Massa criarMassa() {
		return new MassaGrossa();
	}

	@Override
	public Molho criarMolho() {
		return new MolhoMarinara();
	}

	@Override
	public Pepperoni criarPepperoni() {
		return new PepperoniExecelenteMarca();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoParmesao();
	}

	@Override
	public Atum criarAtum() {
		return new AtumCongelado();
	}

}
