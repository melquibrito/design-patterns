
public abstract class EstadoCompra {

	protected String nome;
	protected Compra compra;

	public EstadoCompra(Compra compra, String nome) {
		this.compra = compra;
		this.nome = nome;
	}

	public void efetuarPagamento(float valorPago) {
		System.out.println("Ação inválida para o estado atual da compra: " + nome);
	}

	public void cancelar() {
		System.out.println("Ação inválida para o estado atual da compra: " + nome);
	}

	public void receber() {
		System.out.println("Ação inválida para o estado atual da compra: " + nome);
	}

	public void devolver() {
		System.out.println("Ação inválida para o estado atual da compra: " + nome);
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
