package kalil01;

public class ChocolateDiet extends Sabor{
	private double precoExtra = 2.00;
	public ChocolateDiet(Sorvete sorveteSab){
		super(sorveteSab);
		setNome(nome +""+"ChocolateDiet");
		setPreco(precoExtra);
	}
	
	public ChocolateDiet(){
		
		setNome(nome +""+"ChocolateDiet");
		setPreco(precoExtra);
	}

}
