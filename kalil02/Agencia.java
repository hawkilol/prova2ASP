package kalil02;

public class Agencia {

	private Integer numero;

	private String nome;

  public Agencia(){
    
  }
  public Agencia(Integer numero,String nome){
    this.numero = numero;
    this.nome = nome;
    
  }
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public Integer getNumero(){
    return numero;
  }
  public void setNumero(Integer numero){
    this.numero = numero;
  }

}
