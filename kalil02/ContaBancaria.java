package kalil02;

import java.util.Date;

public class ContaBancaria {

	private Integer numero;

	private double saldo;

	private double limite;
	
	private ContaState state;
	
	private Date dataAbertura;
	
	private Date dataEncerramento;
	
	
	
	
	//Criar a conta e mudar de estado 

  public ContaBancaria(){
	  state = null;
    
  }

  public ContaBancaria(Integer numero, Double saldo, Double limite){
	  
	  this.numero = numero;
	  this.saldo = saldo;
	  this.limite = limite;
	 
  }
  //Inicia o state machine 
  public void contaCriada(Date data) {
	  this.setDataAbertura(data);
	  this.setState(ContaDisponivel.instance());
	  System.out.println(this.getState().toString());
	  
  }
  public void realizarSaque(double quantia) {
	  this.state.realizarSaque(this, quantia);
		  
	  
		 
	  //this.sacar(quantia);
  }
  public void realizarDeposito(double quantia) {
	  this.state.realizarDeposito(this, quantia);
		  
	  
		 
	  //this.sacar(quantia);
  }
  
  public void contaFechada(Date data) {
	  this.state.contaFechada(this, data);
		  
	  
		 
	  //this.sacar(quantia);
  }
  
//  public void realizarSaque(float quantia) {
//	  this.stateCheckSaque(quantia);
//  }
//  
  //regra de negocio
//  public void stateCheckSaque(float quantia) {
//	  if (limite + saldo >= quantia && quantia > saldo) {
//		  
//		  this.sacar(quantia);
//		  this.setState(ContaDevedora.instance());
//	  }
////	  else if(quantia <= saldo + limite) {
////		  this.sacar(quantia);
////		  this.setState(state);
////		  
////	  }
//	  else {
//		  this.sacar(quantia);
//	  }
//	  
//  }
//  
//  public void contaFechada(Date data){
//	  this.stateCheckFechaConta(data);  
//  }
  
//  public void stateCheckFechaConta(Date data) {
//	  if (this.saldo == 0) {
//		  this.dataEncerramento = data;
//		  this.state = null;
//	  }
//  }
//  
  
  
  public void atualizar() {
	  state.atualizaState(this);
	  
  }
  
  
  
  
//  public void realizarSaque(float quantia){
//	  
//	  if() {
//		  
//	  }
//  
//      if(limite + saldo >= quantia && quantia > saldo){
//    	  //muda o estado dependendo do estado atual
//    	  this.atualizar();
//    	  this.sacar(quantia);
//        
//  
//        
//      }
//      else:
//    	  this.sacar(quantia)
//        
//  }
  
  
  
  
  //na ContaBancaria de acordo com o estado fazer a regra de negocio
  //usar um atualizar state para mudar de  estado no estilo kalil2
  //conta quem vai chamar o contexto.atualiza e as funçoes de saque e saldo  para a atualizam vai ser uma 
  
  public void sacar(double quantia){
	    this.saldo = saldo - quantia;
	    System.out.println("Sacando:" + quantia);
	    System.out.println("Saldo Atual:" + saldo);
  }
  
  public void depositar(double quantia) {
	  this.saldo = saldo + quantia;
	  System.out.println("Depositando:" + quantia);
	  System.out.println("Saldo Atual:" + saldo);
  }
  
  

  public Integer getNumero(){
    return numero;
  }
  public void setNumero(Integer numero){
    this.numero = numero;
  }

  public Double getSaldo(){
    return saldo;
  }
  public void setSaldo(Double saldo){
    this.saldo = saldo;
  }

  public Double getLimite(){
    return limite;
  }
  public void setLimite(Double limite){
    this.limite = limite;
  }

public ContaState getState() {
	return state;
}

public void setState(ContaState state) {
	this.state = state;
}

public Date getDataAbertura() {
	return dataAbertura;
}

public void setDataAbertura(Date dataAbertura) {
	this.dataAbertura = dataAbertura;
}

public Date getDataEncerramento() {
	return dataEncerramento;
}

public void setDataEncerramento(Date dataEncerramento) {
	this.dataEncerramento = dataEncerramento;
}



  

}
