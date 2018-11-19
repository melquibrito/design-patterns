
public class AguardandoPagamento extends EstadoCompra {

	public AguardandoPagamento(Compra compra) {
		super(compra, "Aguardando Pagamento.");
	}
	
	@Override
	public void efetuarPagamento(float valorPago) {
		if(valorPago == compra.getValorCompra()) {
			System.out.println("Seu pagamento foi aprovado.");
			compra.setEstadoAtual(compra.getPagamentoAprovado());
		}else if(valorPago < compra.getValorCompra()) {
			System.out.println("Seu pagamento foi reprovado.");
			compra.setEstadoAtual(compra.getPagamentoReprovado());
		}
	}
	
	@Override
	public void cancelar() {
		System.out.println("Sua compra foi cancelada.");
		compra.setEstadoAtual(compra.getCompraCancelada());
	}
	
	
}
