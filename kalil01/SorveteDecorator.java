package kalil01;

public abstract class SorveteDecorator extends Sorvete {

	protected Sorvete sorvete;
	
	public SorveteDecorator() {}
	
	public SorveteDecorator(Sorvete sorveteDec) {
		this.sorvete = sorveteDec;
	}

	//@Override
	public Sorvete getSorvete() {
		return sorvete;
	}
	@Override
	public double getPreco() {
		return sorvete.getPreco() + preco;
	}

	public void setSorvete(Sorvete sorvete) {
		this.sorvete = sorvete;
	}
	
	@Override
	public String getNome() {
		return sorvete.getNome() +"+" + nome;
	}
	

}
