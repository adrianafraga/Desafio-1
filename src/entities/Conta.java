package entities;

public class Conta {
	
	private int agencia;
	private int numeroConta;
	protected double saldo;

	public Conta() {
	}
	public Conta(int agencia, int numeroConta, double saldo) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	//sacar
	public void saque(double total) {
		saldo -= total;
	}
	// depositar
	public void deposito(double total) {
		saldo += total;
	}
}
