package br.com.instashop;

public class Calculadora {
	  private float numero1;
	  private float numero2;
	  private String operacao;
	  private float resultado;
	  
	  
	public float getNumero1() {
		return numero1;
	}
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	public float getNumero2() {
		return numero2;
	}
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	public String apresenta() {
		return ("O resultado de "+getNumero1()+" "+operacao+" "+getNumero2()+" e = "+ getResultado());
	}
	  

}
