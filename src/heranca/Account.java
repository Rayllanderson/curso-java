package heranca;

public class Account {
    
    private Integer numer;
    private String holder;
    protected Double balance;
    
    
    public Account() {
    }

    public Account(Integer numer, String holder, Double balance) {
	this.numer = numer;
	this.holder = holder;
	this.balance = balance;
    }

    public Integer getNumer() {
        return numer;
    }

    public void setNumer(Integer numer) {
        this.numer = numer;
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

    //--------
    public void withdraw (double amount) {
	this.balance -= amount + 5.0;
    }
    
    public void deposit (double amount) {
	this.balance += amount;
    }
    
    

}
