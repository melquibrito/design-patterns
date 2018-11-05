
public class Fornecedor implements Entidade {

	public long getId() {
		return 0;
	}

	@Override
	public long retornarIdentificador() {
		return getId();
	}
	
}
