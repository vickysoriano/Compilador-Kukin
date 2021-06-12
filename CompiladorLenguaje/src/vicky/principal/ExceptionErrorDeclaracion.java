package vicky.principal;

public class ExceptionErrorDeclaracion extends RuntimeException{

    public ExceptionErrorDeclaracion(String x){
        System.out.println("Error: ya declaraste " + x);
    }
}
