
public class CompraEntregueAoCliente extends EstadoCompra {

	public CompraEntregueAoCliente(Compra compra) {
		super(compra, "Compra Entregue ao Cliente.");
	}

	@Override
	public void devolver() {
		System.out.println("Voc� devolveu a compra.");
		System.out.println("Seu dinheiro foi devolvido.");
		compra.setEstadoAtual(compra.getCompraDevolvida());
	}
	
}
