package application;

import java.util.Scanner;

import entities.Clientes;

public class Program {

	public static void main(String[] args) {
		String option
		Clientes Clientes = new Clientes();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Bem-vindx ao sistema de abertura de conta!\nComeçe digitando o número da conta: ");
		Clientes.setaNumber(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Nome Completo: ");
		Clientes.setName(sc.nextLine());
		
		do {
			System.out.print("Haverá depósito incial?(s/n)");
			option = sc.next();
		if (option.equals("s")) {
			System.out.println("Digite o valor do depósito inicial: ");
			Clientes.setBalance(sc.nextDouble());
			break;
		}else if (option.equals("n")) {
			break;
		}else {
			System.out.println("Digite um valor válido!");
		}}while(!option.equals("s") || !option.equals("n"));
		
		System.out.println("Account Data:\n" +Clientes +"\n");
		
		System.out.println("Digite o valor do depóstito: ");
		Clientes.depositar(sc.nextDouble());
		
		System.out.println("Updated Data:\n" +Clientes +"\n");
		
		System.out.println("Digite o valor de saque: ");
		Clientes.sacar(sc.nextDouble());
		
		System.out.println("Updated Data:\n" +Clientes);
		
		sc.close();
	}

}
