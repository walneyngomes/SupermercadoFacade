import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class CarrinhoMercado {
	ArrayList<Produto> setProdutos;

	public CarrinhoMercado() {
		this.setProdutos = new ArrayList<Produto>();

	}

	public void addCarrinho(Produto p) {
		setProdutos.add(p);
	}

	public void removerCarrinhoPelo(int id) {
		setProdutos.removeIf(x -> x.getId() == id);
	}

	public void remocerCarrinho(Produto produto) {
		setProdutos.removeIf(x -> x == produto);

	}

}
