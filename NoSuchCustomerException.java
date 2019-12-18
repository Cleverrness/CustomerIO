package customerio;

public class NoSuchCustomerException extends Exception{
    private int number;
    public NoSuchCustomerException(int number){
        super("The customer " + number + " does not exist.");
        this.number = number;
    }       
}
