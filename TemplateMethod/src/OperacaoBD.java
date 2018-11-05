
public abstract class OperacaoBD {
	private Entidade entidade;
	public final long realizarOperacao(Entidade entidade) {
		if(confirmarOperacao()) {			
			this.entidade = entidade;
			abrirConexao();
			executarOperacao();
			comitarOperacao();
			fecharConexao();
			return retornarIdentificador();
		}
		return 0;
	}
	public boolean confirmarOperacao() {
		return true;
	}
	public final void abrirConexao() {
		System.out.println("Abrindo conex�o...");
	}
	public final void comitarOperacao() {
		System.out.println("Comitando opera��o...");
	}
	public final void fecharConexao() {
		System.out.println("Fechando conex�o...");
	}
	public final long retornarIdentificador() {
		return entidade.retornarIdentificador();
	}
	public abstract void executarOperacao();
}

