package br.com.fiap.ex5;

public class SaldoBancario {

	private String cliente;
	private double saldo;
	
	private int agencia = 1;
	
	private int conta;
	
	public SaldoBancario(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.conta = 938; //podemos melhorar depois
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void credito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void debito(double valor) {
		this.saldo = this.saldo - valor;
	}
}
