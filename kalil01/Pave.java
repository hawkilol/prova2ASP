package kalil01;
public class Pave extends Sabor {
	private double precoExtra = 1.50;
	public Pave(Sorvete sorveteSab){
		super(sorveteSab);
		setNome(nome +""+"Pave");
		setPreco(precoExtra);
	}
	
	public Pave(){
		
		setNome(nome +""+"Pave");
		setPreco(precoExtra);
	}

	public double getPrecoExtra() {
		return precoExtra;
	}

	public void setPrecoExtra(double precoExtra) {
		this.precoExtra = precoExtra;
	} 

}
