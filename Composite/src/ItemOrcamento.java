
public class ItemOrcamento extends OrcamentoComponente {
	
	private String nome;
	private double preco;
	
	public ItemOrcamento(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public double getPreco() {
		return preco;
	}
	
	@Override
	public void imprimir() {
		System.out.println("- " + nome + " - R$ " + preco);
	}

}
