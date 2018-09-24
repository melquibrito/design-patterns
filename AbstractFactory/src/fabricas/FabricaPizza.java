package fabricas;

import ingredientes.Atum;
import ingredientes.Massa;
import ingredientes.Molho;
import ingredientes.Pepperoni;
import ingredientes.Queijo;

public interface FabricaPizza {
	
	public Massa criarMassa();
	public Molho criarMolho();
	public Pepperoni criarPepperoni();
	public Queijo criarQueijo();
	public Atum criarAtum();

}
