package kalil03;
public class Postado implements PedidoState {

	private static Postado instance = new Postado();
	private Postado() {
		
	}
	
	public static Postado instance() {
		return instance;
	}

	public void atualizarState(Pedido pedido) {
		System.out.println("Postado -> EmTransporte");
		pedido.setState(EmTransporte.instance());
		
	}

	public void voltarState(Pedido pedido) {
		System.out.println("Postado -> EmAnalise");
		pedido.setState(EmAnalise.instance());
	}

	public void addToCarrinho(Pedido pedido, Produto produto) {
		// 
		
	}

	public void removeFromCarrinho(Pedido pedido, Produto produto) {
		// 
		
	}

}
