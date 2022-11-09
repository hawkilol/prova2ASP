package kalil01;
public class CoberturaChocolate extends Cobertura {
	private double precoExtra = 0.5;
	public CoberturaChocolate(Sorvete sorvete) {
		super(sorvete);
		setNome(nome + ""+"Chocolate");
		setPreco(precoExtra);
	}
	
	public CoberturaChocolate() {
		super();
		setNome(nome + ""+"Chocolate");
		setPreco(precoExtra);
	}
	
	

}
