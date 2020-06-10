package model.services;

public interface OnlinePayment {
    
    public double interest (double value, int month);
    
    public double paymentFee (double valor);

}
