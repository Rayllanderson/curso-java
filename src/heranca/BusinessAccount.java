package heranca;

public class BusinessAccount extends Account {
    
    private Double loanLimit;

    
    public BusinessAccount() {
	super();
    }
    

    public BusinessAccount(Integer numer, String holder, Double balance, Double loanLimit) {
	super(numer, holder, balance);
	this.loanLimit = loanLimit;
    }


    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(double amount) {
	if(amount <= this.loanLimit) {
	    deposit(amount - 10);
	}else 
	    System.out.println("Erro. Seu limite de emprestimo é R$" + this.loanLimit);
    }
    
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2;
        
    }
    
}
