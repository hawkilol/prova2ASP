package kalil02;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria(1337, 1200.0, 500.0);
	    Date data = new Date();
	    contaBancaria.contaCriada(data);
	    
	    contaBancaria.realizarSaque(250.00);
	    contaBancaria.realizarSaque(1450.00);
	    
	    contaBancaria.realizarDeposito(100.0);
	    
	    contaBancaria.realizarDeposito(500.0);
	      
	    contaBancaria.contaFechada(data);
	    
	    
	    System.out.println("Data Abertura: "+contaBancaria.getDataAbertura());
	    
	    System.out.println("Data Fechamento: "+contaBancaria.getDataEncerramento());
	    
	    contaBancaria.realizarSaque(100);
	    contaBancaria.contaFechada(data);
	    
	    System.out.println("Data Fechamento: "+contaBancaria.getDataEncerramento());
	   }
}
