package kalil03;

public class CompraFeita implements PedidoState {
	
	
	
	private static CompraFeita instance = new CompraFeita();
	private CompraFeita() {
		
	}
	
	public static CompraFeita instance() {
		return instance;
	}

	public void atualizarState(Pedido pedido) {
		System.out.println("CompraFeita -> EmAnalise");
		pedido.setState(EmAnalise.instance());
		
	}

	public void voltarState(Pedido pedido) {
		pedido.setState(CarrinhoComItens.instance());
		System.out.println("CancelandoCompra: CompraFeita -> CarrinhoComItens");
		
	}

	public void addToCarrinho(Pedido pedido, Produto produto) {
		//
		
	}

	public void removeFromCarrinho(Pedido pedido, Produto produto) {
		//
		
	}

}
