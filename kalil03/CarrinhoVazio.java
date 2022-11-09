package kalil03;

public class CarrinhoVazio implements PedidoState{
	private static CarrinhoVazio instance = new CarrinhoVazio();
	private CarrinhoVazio() {
		
	}
	
	public static CarrinhoVazio instance() {
		return instance;
	}
	
	
	public void addToCarrinho(Pedido pedido, Produto produto) {
		pedido.getCarrinho().add(produto);
		pedido.setPrecoTotal(pedido.getPrecoTotal() + produto.getPreco());
		this.atualizarState(pedido);
		
		
	}
	public void atualizarState(Pedido pedido) {
		System.out.println("CarrinhoVazio -> CarrinhoComItens");
		pedido.setState(CarrinhoComItens.instance());
		
	}

	public void voltarState(Pedido pedido) {
		// a
		
	}

	

	public void removeFromCarrinho(Pedido pedido, Produto produto) {
		// a
		
	}
}
