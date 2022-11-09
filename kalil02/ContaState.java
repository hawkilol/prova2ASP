package kalil02;

import java.util.Date;

public interface ContaState {
	
	
	
	public void atualizaState(ContaBancaria cntxt);

	public void realizarSaque(ContaBancaria contaBancaria, double quantia);
	
	public void realizarDeposito(ContaBancaria contaBancaria, double quantia);
	
	public void contaFechada(ContaBancaria contaBancaria, Date data);
	
	
}
