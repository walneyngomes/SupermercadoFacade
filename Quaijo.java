
public class Quaijo extends Produto {
	public static int id;
	public static final double VALOR_QUEIJO=32.00;


	public  int getId() {
		return id;
	}

	public static void setId(int id) {
		Quaijo.id = id;
	}

	private static int quantidade = 8;

	public Quaijo() {
		this.quantidade--;
		this.id++;
	}

	@Override
	public int quantidadeProduto() {
		// TODO Auto-generated method stub
		return this.quantidade;
	}

	@Override
	public double valor() {
		// TODO Auto-generated method stub
		return VALOR_QUEIJO;
	}

}
