
public class Leite extends Produto {
	public static int id;
	private static int quantidadeEstoque = 200;
	public static final double VALOR_LEITE = 3.00;

	public int getId() {
		return id;
	}

	public static void setId(int id) {
		Quaijo.id = id;
	}

	public Leite() {
		this.quantidadeEstoque--;
		this.id++;
	}

	@Override
	public int quantidadeProduto() {
		// TODO Auto-generated method stub
		return quantidadeEstoque;
	}

	@Override
	public double valor() {
		// TODO Auto-generated method stub
		return this.VALOR_LEITE;
	}

}
