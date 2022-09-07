package br.com.contabancaria;

public class ContasBancarias {

	private double numeroConta;
	private String tipoConta;
	private double saldo = 0.0;

	public ContasBancarias() {

	}

	public ContasBancarias(double numeroConta, String tipoConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
	} 

	public double getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(double numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantia) {
		this.saldo += this.saldo + quantia;

	}

	public void saque(double quantia) {
		if (quantia <= saldo) {
			this.saldo = this.saldo - quantia;
		}
	}

}
