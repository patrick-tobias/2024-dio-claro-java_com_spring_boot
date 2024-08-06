package conta_bancaria_terminal;

import java.math.BigDecimal;
import java.util.Scanner;

import conta_bancaria_terminal.model.domain.Cliente;
import conta_bancaria_terminal.model.domain.Conta;

public class ContaTerminal {
	public static void main(String[] args) {
		System.out.println(
			"""
			Aplicação Conta Bancária - Terminal
			Está na hora de abrir a sua conta!
			"""
		);
		Scanner scanner = new Scanner(System.in);
		try {
			Conta conta = abrirConta(scanner);
			System.out.println(boasVindas(conta));
		} catch (Exception e) {
			System.out.println("Opa! Algo deu errado na sua solicitação... =(");
		} finally {
			scanner.close();
		}
	}
	
	private static Conta abrirConta(Scanner scanner){
		System.out.println("Informe o seu nome completo.");
		String nome = scanner.nextLine();
		
		Cliente cliente = new Cliente(nome);
		
		System.out.println("Informe o número da sua conta.");
		Integer numero = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Informe o número da agência.");
		String agencia = scanner.nextLine();
		
		System.out.println("Informe o saldo inicial desejado.");
		BigDecimal saldo = scanner.nextBigDecimal();
		
		Conta conta = new Conta(numero, agencia, saldo, cliente);
		return conta;
	}
	
	private static String boasVindas(Conta conta) {
		return String.format("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", conta.getCliente().getNome(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
	}
}
