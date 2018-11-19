
public class Compra {

	private float valorCompra;
	private EstadoCompra estadoAtual;
	private EstadoCompra aguardandoPagamento;
	private EstadoCompra pagamentoAprovado;
	private EstadoCompra pagamentoReprovado;
	private EstadoCompra compraCancelada;
	private EstadoCompra compraEntregueAoCliente;
	private EstadoCompra compraDevolvida;

	public Compra(float valorCompra) {
		this.valorCompra = valorCompra;
		aguardandoPagamento = new AguardandoPagamento(this);
		pagamentoAprovado = new PagamentoAprovado(this);
		pagamentoReprovado =  new PagamentoReprovado(this);
		compraCancelada = new CompraCancelada(this);
		compraEntregueAoCliente = new CompraEntregueAoCliente(this);
		compraDevolvida = new CompraDevolvida(this);
		estadoAtual = aguardandoPagamento;
	}

	public void efetuarPagamento(float valorPago) {
		estadoAtual.efetuarPagamento(valorPago);
	}
	
	public void cancelar() {
		estadoAtual.cancelar();
	}
	
	public void receber() {
		estadoAtual.receber();
	}
	
	public void devolver() {
		estadoAtual.devolver();
	}

	public EstadoCompra getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoCompra estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public EstadoCompra getAguardandoPagamento() {
		return aguardandoPagamento;
	}

	public EstadoCompra getPagamentoAprovado() {
		return pagamentoAprovado;
	}

	public EstadoCompra getPagamentoReprovado() {
		return pagamentoReprovado;
	}

	public EstadoCompra getCompraCancelada() {
		return compraCancelada;
	}

	public EstadoCompra getCompraEntregueAoCliente() {
		return compraEntregueAoCliente;
	}

	public EstadoCompra getCompraDevolvida() {
		return compraDevolvida;
	}

	public float getValorCompra() {
		return valorCompra;
	}
	
	public void imprimirEstadoAtual() {
		System.out.println(estadoAtual.getNome());
	}

}
