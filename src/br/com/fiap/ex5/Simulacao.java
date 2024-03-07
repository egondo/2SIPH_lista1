package br.com.fiap.ex5;

public class Simulacao {

	public static void main(String[] args) {
		SaldoBancario sb = new SaldoBancario("Edu", 1000);
		sb.credito(250);
		sb.debito(1340.76);
		sb.credito(654.98);
		System.out.println(sb.getSaldo());

	}

}
