import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		FacadeCliente fachada = new FacadeCliente();
		SuperMercado sM = new SuperMercado();
		EnumProduto enu = null;
		Scanner teclado = new Scanner(System.in);

		boolean opcao = true;

		while (opcao) {
			System.out.println("Digite  seu produto");

			String tipo = teclado.nextLine();

			if ("QUEIJO".equals(tipo)) {
				enu = EnumProduto.QUEIJO;
				fachada.addCarrinho(sM.obterProduto(enu));
			} else if ("LEITE".equals(tipo)) {
				enu = EnumProduto.LEITE;
				fachada.addCarrinho(sM.obterProduto(enu));

			}
			System.out.print("DESEJA ADD MAIS? SIM- 1  NAO - 0;");
			String o = teclado.nextLine();

			if(o.equals("1")){
				 opcao=true;
			 }
			 else{
				 opcao=false;
			 }

		}
		System.out.print("Obter valor mercadoria " + fachada.valorTotal());

	}
}