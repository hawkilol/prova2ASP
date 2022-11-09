package kalil01;

public class Chocolate extends Sabor {
	private double precoExtra = 1.50;
	public Chocolate(Sorvete sorveteSab){
		super(sorveteSab);
		setNome(nome +""+"Chocolate");
		setPreco(precoExtra);
	}
	
	public Chocolate(){
		
		setNome(nome +""+"Chocolate");
		setPreco(precoExtra);
	}

	public double getPrecoExtra() {
		return precoExtra;
	}

	public void setPrecoExtra(double precoExtra) {
		this.precoExtra = precoExtra;
	}

}
