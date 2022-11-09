package kalil01;
public class Napolitano extends Sabor {
	private double precoExtra = 1.50;
	public Napolitano(Sorvete sorveteSab){
		super(sorveteSab);
		setNome(nome +""+"Napolitano");
		setPreco(precoExtra);
	}
	
	public Napolitano(){
		
		setNome(nome +""+"Napolitano");
		setPreco(precoExtra);
	}

	public double getPrecoExtra() {
		return precoExtra;
	}

	public void setPrecoExtra(double precoExtra) {
		this.precoExtra = precoExtra;
	}

}
