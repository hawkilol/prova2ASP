package kalil01;
public class CoberturaMorango extends Cobertura {
	private double precoExtra = 0.5;
	public CoberturaMorango(Sorvete sorvete) {
		super(sorvete);
		setNome(nome + ""+"Morango");
		setPreco(precoExtra);

	}
	
	public CoberturaMorango() {
		super();
		setNome(nome + ""+"Morango");
		setPreco(precoExtra);

	}

	public double getPrecoExtra() {
		return precoExtra;
	}

	public void setPrecoExtra(double precoExtra) {
		this.precoExtra = precoExtra;
	}

}
