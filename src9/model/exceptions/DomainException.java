package model.exceptions;

//extends RuntimeException = não obriga tratar o erro
//extends Exception = obriga a tratar o erro
public class DomainException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public DomainException(String mensagem) {
	super(mensagem);
    }
    
    
}
