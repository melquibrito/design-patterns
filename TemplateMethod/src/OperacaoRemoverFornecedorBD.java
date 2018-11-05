import javax.swing.JOptionPane;

public class OperacaoRemoverFornecedorBD extends OperacaoBD {
	@Override
	public void executarOperacao() {
		System.out.println("Removendo fornecedor...");
	}
	@Override
	public boolean confirmarOperacao() {
		int opcao = JOptionPane
				.showConfirmDialog(
						null, 
						"Desejar remover Fornecedor?", 
						"Alerta", 
						JOptionPane.YES_NO_OPTION);
		if (opcao == 0) {
			return true;
		}
		return false;
	}
}

