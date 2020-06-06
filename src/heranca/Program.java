package heranca;

public class Program {

    public static void main(String[] args) {
	
	Account acc = new Account(1002, "Joao", 0.0);
	BusinessAccount bAcc = new BusinessAccount(1003, "Joao Lucas", 0.0, 500.00);
	
	//UPCASTING
	
	Account acc1 = bAcc;
	Account acc2 = new BusinessAccount(1004, "Pedro", 0.0, 30.0);
	Account acc3 = new SavingsAccount(1004, "Carlos", 0.0, 80.0);
	
	//DOWNCASTING
	
	BusinessAccount acc4 = (BusinessAccount) acc2;
	acc4.loan(200);
	
	//BusinessAccount acc5 = (BusinessAccount) acc3;
	if (acc3 instanceof BusinessAccount) {
	    BusinessAccount acc5 = (BusinessAccount) acc3;
	    acc5.loan(200);
	    System.out.println("Loan!");
	}
	
	if (acc3 instanceof SavingsAccount) {
	    SavingsAccount acc5 = (SavingsAccount) acc3;
	    acc5.updateBalance();
	    System.out.println("Update!");
	}
	
    }

}
