package kalil01;
public abstract class Sabor extends SorveteDecorator {
	
	public Sabor(Sorvete sorvete){
		super(sorvete);
		setNome("Sabor:");
	}
	
	public Sabor() {
		super();
		setNome("Sabor:");
	}

}
