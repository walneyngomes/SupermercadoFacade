
public class FacadeCliente {
	private CarrinhoMercado carrinho;
	private CaixaMercado caixaMercado;
	public FacadeCliente()
	{
		this.carrinho= new CarrinhoMercado();
		this.caixaMercado = new CaixaMercado();
	
	}
	public void addCarrinho(Produto p){
		this.carrinho.addCarrinho(p);
	}
	
	public void removerCarrinho(Produto p){
		this.carrinho.remocerCarrinho(p);
	}
	public double valorTotal(){
		caixaMercado.pegaCarrinho(this.carrinho);
		return caixaMercado.calculaValorProdutos();
	}
	

}
