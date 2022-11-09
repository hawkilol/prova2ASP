package kalil01;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Sorvete ninja:");
		Sorvete sorvete1 = new Casquinha(new Morango());
		System.out.println(sorvete1.getNome()+"="+"Preco:" + sorvete1.getPreco());
		
		sorvete1 = new Chocolate(sorvete1);
		System.out.println(sorvete1.getNome()+"="+"Preco:" + sorvete1.getPreco());
		
		sorvete1 = new Flocos(sorvete1);
		System.out.println(sorvete1.getNome()+"="+"Preco:" + sorvete1.getPreco());

		sorvete1 = new CoberturaCaramelo(sorvete1);
		System.out.println(sorvete1.getNome()+"="+"Preco:" + sorvete1.getPreco());

	}
}
