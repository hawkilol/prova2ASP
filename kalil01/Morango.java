package kalil01;
public class Morango extends Sabor {
	private double precoExtra = 1.50;
	public Morango(Sorvete sorveteSab){
		super(sorveteSab);
		setNome(nome +""+"Morango");
		setPreco(precoExtra);
	}
	
	public Morango(){
		
		setNome(nome +""+"Morango");
		setPreco(precoExtra);
	}

	public double getPrecoExtra() {
		return precoExtra;
	}

	public void setPrecoExtra(double precoExtra) {
		this.precoExtra = precoExtra;
	}

}
