package entities;

public class Clientes {
	private int aNumber;
	private String name;
	private double iDeposit, balance, tax=5.00;
	
	
	
	public void setaNumber(int aNumber) {
		this.aNumber=aNumber;
	}
	
	public int getaNumber() {
		return aNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String nome) {
		this.name = nome;
	}
	
	public double getiDeposit() {
		return iDeposit;
	}
	public void setiDeposit(double iDeposit) {
		this.iDeposit = iDeposit;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void sacar(double value) {
		setBalance(this.balance-value-tax);
	}
	
	public void depositar(double value) {
		setBalance(this.balance+=value);
	}
	
	public String toString() {
		return "Número da Conta: "
				+getaNumber()
				+", Nome : "
				+getName()
				+", Saldo: R$ "
				+getBalance();				
	}
			
	
	
	
	
	
	
	
}
