package kalil01;

public class Taca extends Servidor {
	private double precoExtra = 0.0;
	public Taca(Sabor bola) {
		super(bola);
		setPreco(precoExtra + preco);
		setNome("Taca" +""+ nome);
	}
	public double getPrecoExtra() {
		return precoExtra;
	}
	public void setPrecoExtra(double precoExtra) {
		this.precoExtra = precoExtra;
	}

}
