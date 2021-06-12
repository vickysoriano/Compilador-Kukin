package vicky.principal;

public class ExceptionErrorAsignacion extends RuntimeException{
    public ExceptionErrorAsignacion(String x){
        System.out.println("Error: no declaraste " + x);
    }
}
