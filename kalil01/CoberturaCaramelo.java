package kalil01;

public class CoberturaCaramelo extends Cobertura {
	private double precoExtra = 0.5;
	public CoberturaCaramelo(Sorvete sorvete) {
		super(sorvete);
		setNome(nome + ""+"Caramelo");
		setPreco(precoExtra);
	}
	
	public CoberturaCaramelo() {
		super();
		setNome(nome + ""+"Caramelo");
		setPreco(precoExtra);
	}

	public double getPrecoExtra() {
		return precoExtra;
	}

	public void setPrecoExtra(double precoExtra) {
		this.precoExtra = precoExtra;
	}
	
	
	
	

}
