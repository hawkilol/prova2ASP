package kalil03;
public interface PedidoState {
	
	public void atualizarState(Pedido pedido);
	public void voltarState(Pedido pedido);
	
	public void addToCarrinho(Pedido pedido, Produto produto);
	public void removeFromCarrinho(Pedido pedido, Produto produto);
	
}
