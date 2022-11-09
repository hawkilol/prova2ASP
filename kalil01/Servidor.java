package kalil01;

public abstract class Servidor extends Sorvete {
	protected Sabor bola;
	
	public Servidor(Sabor bola) {
		this.bola = bola;
		setPreco(bola.preco);
		setNome(bola.nome);
	}

}
