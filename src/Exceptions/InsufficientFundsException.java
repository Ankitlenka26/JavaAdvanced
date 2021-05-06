package Exceptions;
// checked -> exception class
// Unchecked -> runtimeexception class
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(){
        super("Insufficient Funds in your account");
    }
    public InsufficientFundsException(String message){
        super(message);
    }
}
