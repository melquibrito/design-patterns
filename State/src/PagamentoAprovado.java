
public class PagamentoAprovado extends EstadoCompra {

	public PagamentoAprovado(Compra compra) {
		super(compra, "Pagamento Aprovado.");
	}
	
	@Override
	public void receber() {
		System.out.println("Você recebeu sua compra.");
		compra.setEstadoAtual(compra.getCompraEntregueAoCliente());
	}
	
	@Override
	public void cancelar() {
		System.out.println("Sua compra foi cancelada.");
		System.out.println("Seu dinheiro foi devolvido.");
		compra.setEstadoAtual(compra.getCompraCancelada());
	}

}
