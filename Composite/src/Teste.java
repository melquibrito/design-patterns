
public class Teste {
	
	public static void main(String[] args) {
		
		OrcamentoComponente orcamento = new TopicoOrcamento("Orçamento");
		OrcamentoComponente itemA = new ItemOrcamento("Item A", 200);
		OrcamentoComponente itemB = new TopicoOrcamento("item B");
		OrcamentoComponente itemC = new ItemOrcamento("Item C", 50);
		OrcamentoComponente itemD = new TopicoOrcamento("item D");
		
		orcamento.adicionar(itemA);
		orcamento.adicionar(itemB);
		orcamento.adicionar(itemC);
		orcamento.adicionar(itemD);
		
		OrcamentoComponente itemB1 = new ItemOrcamento("Item B1", 40);
		OrcamentoComponente itemB2 = new ItemOrcamento("Item B2", 300);
		itemB.adicionar(itemB1);
		itemB.adicionar(itemB2);
		
		OrcamentoComponente itemD1 = new ItemOrcamento("Item D1", 300);
		OrcamentoComponente itemD2 = new TopicoOrcamento("item D2");
		OrcamentoComponente itemD3 = new ItemOrcamento("Item D3", 60);
		itemD.adicionar(itemD1);
		itemD.adicionar(itemD2);
		itemD.adicionar(itemD3);
		
		OrcamentoComponente itemD2_1 = new ItemOrcamento("Item D2.1", 20);
		OrcamentoComponente itemD2_2 = new ItemOrcamento("Item D2.2", 100);
		itemD2.adicionar(itemD2_1);
		itemD2.adicionar(itemD2_2);
		
		orcamento.imprimir();
	}

}
