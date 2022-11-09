package kalil01;

public class Casquinha extends Servidor {
	private double precoExtra = 1.50;
	public Casquinha(Sabor bola) {
		super(bola);
		setPreco(precoExtra + preco);
		setNome("Casquinha" +""+ nome);
	}
	public double getPrecoExtra() {
		return precoExtra;
	}
	public void setPrecoExtra(double precoExtra) {
		this.precoExtra = precoExtra;
	}
	

	

}
