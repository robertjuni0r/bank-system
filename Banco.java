package Construtores_This_Sobrecarga_Encapsulamento;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();

		System.out.print("Digite o numero da conta: ");
		int Numero = sc.nextInt();
		conta.setNumero(Numero);
		System.out.print("Digite o nome do titular da conta: ");
		String Titular = sc.next();
		conta.setTitular(Titular);
		System.out.print("Gostaria de realizar um deposito inicial? Se sim digite 1, se nao digite 0. ");
		int Pergunta = sc.nextInt();
		if (Pergunta == 1) {
			System.out.print("Qual valor gostaria de depositar? ");
			double DepositoInicial = sc.nextDouble();
			conta.setDepositoInicial(DepositoInicial);
		}
		System.out.println(conta.toString());
		System.out.println("Digite o valor do deposito: ");
		double Deposito = sc.nextDouble();
		conta.setDeposito(Deposito);
		System.out.println("Digite o valor do saque: ");
		double Saque = sc.nextDouble();
		conta.setSaque(Saque);
		System.out.println(conta.toString());
	}

}
