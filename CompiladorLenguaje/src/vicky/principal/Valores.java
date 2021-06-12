package vicky.principal;

public class Valores {
    public static Valores vacio = new Valores(new Object());

    //constante
    final Object valor;

    public Valores(Object valor) {
        this.valor = valor;
    }

    public Boolean valorBoolean() {
        return (Boolean) valor;
    }

    public Double valorDouble() {
        return (Double) valor;
    }

    public Integer valorInteger(){
        return (Integer) valor;
    }
    public String valorString() {
        return String.valueOf(valor);
    }

    public boolean esDouble() {
        return valor instanceof Double;
    }

    public boolean esInteger(){
        return valor instanceof Integer;
    }

    @Override
    public int hashCode() {

        if(valor == null) {
            return 0;
        }
        return this.valor.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(valor == o) {
            return true;
        }
        if(valor == null || o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Valores that = (Valores)o;
        return this.valor.equals(that.valor);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}