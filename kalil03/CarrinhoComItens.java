package kalil03;

public class CarrinhoComItens implements PedidoState{
	private static CarrinhoComItens instance = new CarrinhoComItens();
	
	
	
	private CarrinhoComItens() {
		
	}
	
	public static CarrinhoComItens instance() {
		return instance;
	}
	
	public void addToCarrinho(Pedido pedido, Produto produto) {
		if(pedido.getCarrinho().contains(produto)) {
			produto.setCount(produto.getCount() + 1);
			pedido.setPrecoTotal(pedido.getPrecoTotal() + produto.getPreco() );
			System.out.println("+1:" + produto.getNome());
			
		}
		else {
			pedido.getCarrinho().add(produto);
			pedido.setPrecoTotal(pedido.getPrecoTotal() + produto.getPreco());
			System.out.println("Novo Produto Adicionado:" + produto.getNome());
			
		}
	}
	
	public void removeFromCarrinho(Pedido pedido, Produto produto) {
		pedido.getCarrinho().remove(produto);
		if(pedido.getCarrinho().isEmpty() == true) {
			pedido.setState(CarrinhoVazio.instance());
		}
	}
	
	
	public void atualizarState(Pedido pedido) {
		System.out.println("CarrinhoComItens -> CompraFeita");
		pedido.setState(CompraFeita.instance());
		
	}

	public void voltarState(Pedido pedido) {
		pedido.getCarrinho().removeAll(pedido.getCarrinho());
		System.out.println("Esvaziando o carrinho");
		 
		
	}

	

	

	
}
