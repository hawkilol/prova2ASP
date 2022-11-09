package kalil03;

import java.util.ArrayList;

public class MercadoPreso {
	
	public static void main(String[] args) 
    {	
		Produto produto1 = new Produto(1337, "Beringela",100.0);
		Produto produto2 = new Produto(1338, "Laranja",25.0);
        Pedido pedido = new Pedido(1,"Kalil",null);
        
        
        System.out.println(pedido.getPedidoState());
        pedido.abrirCarrinho();
        pedido.addToCarrinho(produto1);
        System.out.println(pedido.getPedidoState());
        pedido.addToCarrinho(produto1);
        System.out.println(pedido.getPedidoState());
        
        pedido.addToCarrinho(produto2);
        System.out.println(pedido.getPedidoState());
        
        pedido.atualizar();
        pedido.atualizar();
        pedido.atualizar();
        pedido.atualizar();
        pedido.atualizar();
        pedido.atualizar();
        pedido.atualizar();
        
        Produto prod = new Produto();
        
        ArrayList<Produto> carrinho = pedido.getCarrinho();
        for(int i = 0; i<carrinho.size(); i++) {
        	prod = carrinho.get(i);
        	System.out.println(prod.getNome()+" Preco:"+prod.getPreco()+" Count:"+prod.getCount());
        	
        	
        }
        System.out.println("PrecoTotal:"+ pedido.getPrecoTotal());
    }
}
