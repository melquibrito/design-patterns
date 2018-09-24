import lojas.LojaPizza;
import lojas.LojaPizzaPE;
import lojas.LojaPizzaSP;
import pizzas.Pizza;

public class PizzariaTeste {
	
	public static void main(String[] args) {
		LojaPizza loja = new LojaPizzaPE();
		Pizza pizza = loja.pedirPizza("Queijo");
		System.out.println(pizza.getNome());
		
		
		loja = new LojaPizzaSP();
		pizza = loja.pedirPizza("Queijo");
		System.out.println(pizza.getNome());
	}

}
