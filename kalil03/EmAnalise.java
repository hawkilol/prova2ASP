package kalil03;

public class EmAnalise implements PedidoState {

	private static EmAnalise instance = new EmAnalise();
	private EmAnalise() {
		
	}
	
	public static EmAnalise instance() {
		return instance;
	}

	public void atualizarState(Pedido pedido) {
		System.out.println("Aprovado: EmAnalise -> Postado");
		pedido.setState(Postado.instance());
		
	}

	public void voltarState(Pedido pedido) {
		System.out.println("Não Aprovado: EmAnalise -> CarrinhoComItens");
		pedido.setState(CarrinhoComItens.instance());
	}

	public void addToCarrinho(Pedido pedido, Produto produto) {
		//
		
	}

	public void removeFromCarrinho(Pedido pedido, Produto produto) {
		//
		
	}

}
