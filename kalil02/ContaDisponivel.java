package kalil02;

import java.util.Date;

public class ContaDisponivel implements ContaState {
	
	
	//singleton
	private static ContaDisponivel instance = new ContaDisponivel();
	
	
	private ContaDisponivel() {}
	
	public static ContaDisponivel instance() {
		return instance;
	}
	
	public void atualizaState(ContaBancaria cntxt) {
		System.out.println("Conta Bancaria Disponivel -> Conta Bancaria Devedora");
		//cntxt.setState(this);
		cntxt.setState(ContaDevedora.instance());
		
	}
	
	public void realizarSaque(ContaBancaria contaBancaria, double quantia) {
		if(contaBancaria.getLimite() + contaBancaria.getSaldo() >= quantia && quantia > contaBancaria.getSaldo()) {
			contaBancaria.sacar(quantia);
			contaBancaria.atualizar();
			contaBancaria.getState().toString();
		}
		else {
			contaBancaria.sacar(quantia);
			contaBancaria.getState().toString();
			
		}
	}
	
	public void realizarDeposito(ContaBancaria contaBancaria, double quantia) {
		contaBancaria.depositar(quantia);
		contaBancaria.getState().toString();
	}
	
	//Finaliza o state machine
	public void contaFechada(ContaBancaria contaBancaria,Date data) {
		if(contaBancaria.getSaldo() == 0.0){
			contaBancaria.setDataEncerramento(data);
			
		}
		contaBancaria.getState().toString();
	}
	
	public String toString() {
		return "Conta Disponivel";
	}

	
	

}
