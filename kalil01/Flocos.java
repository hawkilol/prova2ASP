package kalil01;
public class Flocos extends Sabor {
	private double precoExtra = 1.50;
	public Flocos(Sorvete sorveteSab){
		super(sorveteSab);
		setNome(nome +""+"Flocos");
		setPreco(precoExtra);
	}
	
	public Flocos(){
		
		setNome(nome +""+"Flocos");
		setPreco(precoExtra);
	}

	public double getPrecoExtra() {
		return precoExtra;
	}

	public void setPrecoExtra(double precoExtra) {
		this.precoExtra = precoExtra;
	}


	
	

}
