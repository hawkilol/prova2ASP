package kalil03;

public class EmTransporte implements PedidoState {

	private static EmTransporte instance = new EmTransporte();
	private EmTransporte() {
		
	}
	
	public static EmTransporte instance() {
		return instance;
	}

	public void atualizarState(Pedido pedido) {
		System.out.println("EmTransporte -> Entrege");
		pedido.setState(Entrege.instance());
		
	}

	public void voltarState(Pedido pedido) {
		System.out.println("EmTransporte -> Postado");
		pedido.setState(Postado.instance());
	}

	public void addToCarrinho(Pedido pedido, Produto produto) {
		//
		
	}

	public void removeFromCarrinho(Pedido pedido, Produto produto) {
		//
		
	}

}
