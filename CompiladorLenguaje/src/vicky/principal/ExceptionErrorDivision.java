package vicky.principal;

public class ExceptionErrorDivision extends RuntimeException{
    public ExceptionErrorDivision(){
        System.out.println("Error: no se puede dividir entre 0");
    }
}
