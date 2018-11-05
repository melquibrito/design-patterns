
public class Produto implements Entidade {
	
	public long getCodigo() {
		return 0;
	}

	@Override
	public long retornarIdentificador() {
		return getCodigo();
	}

}
