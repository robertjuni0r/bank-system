package Construtores_This_Sobrecarga_Encapsulamento;

public class Conta {

	private int Numero;
	private boolean NaoMudar;
	private String Titular;
	private double DepositoInicial;
	private double Saque;
	private double Deposito;
	private double Saldo;

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		if (!NaoMudar) {
			this.Numero = numero;
			NaoMudar = true;
		}

	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		this.Titular = titular;
	}

	public double getDepositoInicial() {
		return DepositoInicial;
	}

	public void setDepositoInicial(double depositoInicial) {
		this.Saldo += depositoInicial;
	}

	public double getSaque() {
		return Saque;
	}

	public void setSaque(double saque) {
		this.Saldo -= (saque + 5);
	}

	public double getDeposito() {
		return Deposito;
	}

	public void setDeposito(double deposito) {
		this.Saldo += deposito;
	}

	public double getSaldo() {
		return Saldo;
	}

	public String toString() {
		return "Dados da conta: \nConta: " + getNumero() + ", Titular: " + getTitular() + ", Valor em conta: "
				+ getSaldo();
	}
}
