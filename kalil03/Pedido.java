package kalil03;

import java.util.ArrayList;

public class Pedido {

	private PedidoState pedidoState;
	
	private Integer numeroPedido;
	
	private String nomeCliente;
	
	private ArrayList<Produto> carrinho = new ArrayList<Produto>();
	
	private double precoTotal;
	
	
	public Pedido(Integer numeroPedido, String nomeCliente, PedidoState pedidoState) {
		super();
		this.pedidoState = pedidoState;
		this.numeroPedido = numeroPedido;
		this.nomeCliente = nomeCliente;
	}
	
	public void atualizar() {
		pedidoState.atualizarState(this);
	}
	
	public void abrirCarrinho() {
		if(pedidoState == null) {
			this.pedidoState = CarrinhoVazio.instance();
		}
		
	}
//	public void addToCarrinho(Produto produto) {
//		if(pedidoState == null) {
//			this.carrinho.add(produto);
//			this.pedidoState = Carrinho.instance();
//			
//		}
//	}
	
	public void voltarState() {
		this.pedidoState.voltarState(this);
	}
	public void addToCarrinho(Produto produto) {
		this.pedidoState.addToCarrinho(this, produto);
	}
	
	public void removeFromCarrinho(Produto produto) {
		this.pedidoState.removeFromCarrinho(this, produto);
		
	}
	
	
	
	public PedidoState getPedidoState() {
		return pedidoState;
	}

	public void setState(PedidoState pedidoState) {
		this.pedidoState = pedidoState;
	}

	public Integer getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;	}

	public ArrayList<Produto> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

}
