package kalil01;
public class Copo extends Servidor {
	private double precoExtra = 0.2;
	public Copo(Sabor bola) {
		super(bola);
		setPreco(precoExtra + preco);
		setNome("Copo" +""+ nome);
	}
	

	

}
