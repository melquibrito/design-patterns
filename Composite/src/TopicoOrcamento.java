import java.util.ArrayList;
import java.util.List;

public class TopicoOrcamento extends OrcamentoComponente {

	private String nome;
	private List<OrcamentoComponente> itens = new ArrayList<>();
	
	public TopicoOrcamento(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public void adicionar(OrcamentoComponente orcamentoComponente) {
		itens.add(orcamentoComponente);
	}
	
	@Override
	public void remover(OrcamentoComponente orcamentoComponente) {
		itens.remove(orcamentoComponente);
	}
	
	@Override
	public void imprimir() {
		System.out.println(":: " + nome + " ::");
		for(OrcamentoComponente item : itens) {
			item.imprimir();
		}
	}
	
}
