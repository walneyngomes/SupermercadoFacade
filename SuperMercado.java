
public class SuperMercado {
	public Produto obterProduto(EnumProduto tipos) {
		Produto produto = null;
		if (EnumProduto.LEITE.equals(tipos)) {
			produto = new Leite();
			if (produto.quantidadeProduto() == 0) {
				produto = null;
			}
		} else if (EnumProduto.QUEIJO.equals(tipos)) {
			produto = new Quaijo();
			if (produto.quantidadeProduto() == 0) {
				produto = null;
			}
		}

		return produto;
	}

}
