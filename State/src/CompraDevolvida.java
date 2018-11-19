
public class CompraDevolvida extends EstadoCompra {

	public CompraDevolvida(Compra compra) {
		super(compra, "Compra Devolvida.");
	}

	@Override
	public void cancelar() {
		System.out.println("Sua compra foi cancelada.");
		compra.setEstadoAtual(compra.getCompraCancelada());
	}
	
}
