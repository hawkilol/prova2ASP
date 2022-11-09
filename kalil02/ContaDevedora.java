package kalil02;

import java.util.Date;

public class ContaDevedora implements ContaState {
	
	
	private static ContaDevedora instance = new ContaDevedora();
	
	private ContaDevedora() {
		
	}
	
	public static ContaDevedora instance() {
		return instance;
		
	}
	
	//@Override
	public void atualizaState(ContaBancaria cntxt) {
		System.out.println("Conta Bancaria Devedora -> Conta Bancaria Disponivel");

		//cntxt.setState(this);
		cntxt.setState(ContaDisponivel.instance());
	}
	
	


	public String toString() {
		return "Conta Devedora";
	}

	public void realizarSaque(ContaBancaria contaBancaria, double quantia) {
		if(quantia <= contaBancaria.getSaldo() + contaBancaria.getLimite()) {
			contaBancaria.sacar(quantia);
		}
		contaBancaria.getState().toString();
		
	}

	public void realizarDeposito(ContaBancaria contaBancaria, double quantia) {
		contaBancaria.depositar(quantia);
		contaBancaria.getState().toString();
		
		//when
		if(contaBancaria.getSaldo() > 0) {
			contaBancaria.atualizar();
			
		}
	}
	
	//função after aplicar juros 

	public void contaFechada(ContaBancaria contaBancaria, Date data) {
		
		
	}

}
