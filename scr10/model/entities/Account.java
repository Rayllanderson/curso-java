package model.entities;

import model.exceptions.BalanceException;

public class Account {
    
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    
    
    public Account() {
	
    }

    public Account(Integer number, String holder, Double balance, Double rendaMensal) {
	this.number = number;
	this.holder = holder;
	this.balance = balance;
	this.setWithdrawLimit(rendaMensal);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double rendaMensal) {
        if (rendaMensal <= 1000.00) {
            this.withdrawLimit = 800.00;
        }else if (rendaMensal <= 3000.00) {
            this.withdrawLimit = 2800.00;
        }else if (rendaMensal <= 5000.00) {
            this.withdrawLimit = 4800.00;
        }else
            this.withdrawLimit = 10000.00;
    }
    
    public void deposit(double amount) {
	this.balance += amount;
	this.newBalance();
    }
    
    public void withdraw(double amount) {
	if (amount > this.withdrawLimit) {
	    throw new BalanceException("o valor a sacar maior que o limite");
	}
	if (this.balance == 0) {
	    throw new BalanceException("a conta está sem saldo disponível");
	}
	
	this.balance -= amount;
	
	this.newBalance();
	
    }
    
    private void newBalance() {
	System.out.println("Novo saldo: " + this.balance);
    }

    @Override
    public String toString() {
	StringBuilder s = new StringBuilder();
	s.append("Número da conta: " + this.number);
	s.append("\n" + this.holder);
	s.append("\nSaldo: R$" + this.balance + "\nSeu limite de saque é de: R$" + this.withdrawLimit + "\n");
	
	return s.toString();
    }
    
    
    
    
    

}
