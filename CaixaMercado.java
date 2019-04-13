
public class CaixaMercado {
	CarrinhoMercado carrinho = null;

	public CaixaMercado() {

	}

	public void pegaCarrinho(CarrinhoMercado c) {
		this.carrinho = c;
	}

	public double calculaValorProdutos() {
		double valor = 0.0;

		for (Produto c : this.carrinho.setProdutos) {

			valor = c.valor();

		}
		return valor;
	}

}
