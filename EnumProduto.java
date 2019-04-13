
public enum EnumProduto {
	LEITE("Leite"), QUEIJO("Queijo");
	private String produto;

	EnumProduto(String p) {
		this.produto = p;
	}

	public String getProdutoTipo() {
		return this.produto;
	}

}
