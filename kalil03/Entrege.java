package kalil03;

public class Entrege implements PedidoState {

	private static Entrege instance = new Entrege();
	private Entrege() {
		
	}
	
	public static Entrege instance() {
		return instance;
	}

	public void atualizarState(Pedido pedido) {
		System.out.println("Pedido já foi entrege!, MATAR PEDIDO? >:)");
		//pedido.setState(Entrege.instance());
		
	}

	public void voltarState(Pedido pedido) {
		// 
		
	}

	public void addToCarrinho(Pedido pedido, Produto produto) {
		// 
		
	}

	public void removeFromCarrinho(Pedido pedido, Produto produto) {
		//
		
	}

}
