package vicky.principal;

import vicky.parser.LenguajesBaseVisitor;
import vicky.parser.LenguajesParser;

import java.util.*;

public class MyVisitor extends LenguajesBaseVisitor <Valores>{

    private final Stack <Integer> pila = new Stack<Integer>(); //Almacena el tamaño de memoria de cada bloque
    private final Map <Integer, LinkedHashMap <String, Valores>> memoria_bloque = new HashMap<>(); //Memoria de memorias, mapa que almacenala la memoria de cada bloque
    private final LinkedHashMap <String, Valores> memoria = new LinkedHashMap <String,Valores>(); //Memoria principal

    private int nivel = 0; //Nivel de profundidad de memoria

    public static final double valor_pequeno = 0.00000000001;

    /* ENTERO ID PYC */
    @Override public Valores visitDeclaracion(LenguajesParser.DeclaracionContext ctx) {
        String id = ctx.ID().getText();
        if(memoria.containsKey(id)){
            throw new ExceptionErrorDeclaracion(ctx.ID().getText());
        }else{
            memoria.put(id, null);
            return memoria.get(id);
        }
    }

    /* ID IGUAL expr PYC */
    @Override public Valores visitAsignacion(LenguajesParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        if (memoria.containsKey(ctx.ID().getText())){
            Valores valor = this.visit(ctx.expr());
            //memoriaDeTamanios.replace(id,valor);
            return memoria.replace(id,valor);
        }
        else {
            throw new ExceptionErrorAsignacion(ctx.ID().getText());
        }
    }

    /* ENTERO ID IGUAL expr PYC */
    @Override public Valores visitAsignacion2(LenguajesParser.Asignacion2Context ctx) {
        String id= ctx.ID().getText();
        if(memoria.containsKey(id)){
            throw new ExceptionErrorDeclaracion(ctx.ID().getText());
        }else{
            Valores valor = this.visit(ctx.expr());
            memoria.put(id,valor);
            return visitChildren(ctx);
        }
    }

    /* INT */
    @Override public Valores visitInt(LenguajesParser.IntContext ctx) {
        return new Valores(Integer.valueOf(ctx.INT().getText()));
    }

    /* FLOAT */
    @Override public Valores visitFloat(LenguajesParser.FloatContext ctx) {
        return new Valores(Double.valueOf(ctx.FLOAT().getText()));
    }

    /* ID */
    @Override public Valores visitId(LenguajesParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if(memoria.containsKey(id)){
            return memoria.get(id);
        }
        return null;
    }

    /* expr op = (POR|DIV) expr */
    @Override public Valores visitMulDiv(LenguajesParser.MulDivContext ctx) {
        Valores izq = this.visit(ctx.expr(0));
        Valores der = this.visit(ctx.expr(1));
        if (izq == null | der == null) {
            throw new ExceptionErrorValorNulo();
        }
        if (ctx.op.getType() == LenguajesParser.POR)
        {
            if (izq.esDouble() && der.esDouble()) {
                return new Valores(izq.valorDouble() * der.valorDouble());
            } else if (izq.esInteger() && der.esInteger()) {
                return new Valores(izq.valorInteger() * der.valorInteger());
            } else if (izq.esDouble() && der.esInteger()) {
                return new Valores(izq.valorDouble() * der.valorInteger().doubleValue());
            } else if (izq.esInteger() && der.esDouble()) {
                return new Valores(izq.valorInteger().doubleValue() * der.valorDouble());
            }
        }
        else if (ctx.op.getType() == LenguajesParser.DIV)
        {
            if (izq.esDouble() && der.esDouble()) {
                return new Valores(izq.valorDouble() / der.valorDouble());
            } else if (izq.esInteger() && der.esInteger()) {
                return new Valores(izq.valorInteger() / der.valorInteger());
            } else if (izq.esDouble() && der.esInteger()) {
                return new Valores(izq.valorDouble() / der.valorInteger().doubleValue());
            } else if (izq.esInteger() && der.esDouble()) {
                return new Valores(izq.valorInteger().doubleValue() / der.valorDouble());
            }
        }
        if (der.valorDouble() == 0) {
            throw new ExceptionErrorDivision();
        }
        if (der.valorInteger() == 0) {
            throw new ExceptionErrorDivision();
        }
        return null;
    }

    /* expr op = (MAS|MENOS) expr */
    @Override public Valores visitSumRes(LenguajesParser.SumResContext ctx) {
        Valores izq = this.visit(ctx.expr(0));
        Valores der = this.visit(ctx.expr(1));
        if (izq == null | der == null){
            throw new ExceptionErrorValorNulo();
        }
        if (ctx.op.getType() == LenguajesParser.MAS)
        {
            if (izq.esDouble() && der.esDouble()) {
                return new Valores(izq.valorDouble() + der.valorDouble());
            } else if (izq.esInteger() && der.esInteger()) {
                return new Valores(izq.valorInteger() + der.valorInteger());
            } else if (izq.esDouble() && der.esInteger()) {
                return new Valores(izq.valorDouble() + der.valorInteger().doubleValue());
            } else if (izq.esInteger() && der.esDouble()) {
                return new Valores(izq.valorInteger().doubleValue() + der.valorDouble());
            }
        }
        else {
            if (izq.esDouble() && der.esDouble()) {
                return new Valores(izq.valorDouble() - der.valorDouble());
            } else if (izq.esInteger() && der.esInteger()) {
                return new Valores(izq.valorInteger() - der.valorInteger());
            } else if (izq.esDouble() && der.esInteger()) {
                return new Valores(izq.valorDouble() - der.valorInteger().doubleValue());
            } else if (izq.esInteger() && der.esDouble()) {
                return new Valores(izq.valorInteger().doubleValue() - der.valorDouble());
            }
        }
        return null;
    }

    /* PAR_A expr PAR_C */
    @Override public Valores visitParentesis(LenguajesParser.ParentesisContext ctx) {
        return this.visit(ctx.expr());
    }

    /* PAR_A STRING PAR_C */
    @Override public Valores visitCorre(LenguajesParser.CorreContext ctx) {
        String texto = ctx.STRING().getText();
        /* quitar las comillas */
        texto = texto.substring(1, texto.length() - 1);
        System.out.println(texto);
        return null;
    }

    /* expr */
    @Override public Valores visitCorre2(LenguajesParser.Corre2Context ctx) {
        Valores valor = this.visit(ctx.expr());
        if (valor == null){
            throw new ExceptionErrorCorrer();
        }
        System.out.println(valor);

        return valor;
    }

    /* expr op = (MAYOR_QUE | MENOR_QUE | MAYOR_IGUAL_QUE | MENOR_IGUAL_QUE) expr */
    @Override public Valores visitRelacionales(LenguajesParser.RelacionalesContext ctx) {
        Valores izq = this.visit(ctx.expr(0));
        Valores der = this.visit(ctx.expr(1));
        switch(ctx.op.getType()){
            case LenguajesParser.MAYOR_QUE:
                if (izq.esDouble() && der.esDouble()) {
                    return new Valores(izq.valorDouble() > der.valorDouble());
                } else if (izq.esInteger() && der.esInteger()) {
                    return new Valores(izq.valorInteger() > der.valorInteger());
                }else if (izq.esDouble() && der.esInteger()) {
                    return new Valores(izq.valorDouble() > der.valorInteger().doubleValue());
                } else if (izq.esInteger() && der.esDouble()) {
                    return new Valores(izq.valorInteger().doubleValue() > der.valorDouble());
                }
            case LenguajesParser.MENOR_QUE:
                if (izq.esDouble() && der.esDouble()) {
                    return new Valores(izq.valorDouble() < der.valorDouble());
                } else if (izq.esInteger() && der.esInteger()) {
                    return new Valores(izq.valorInteger() < der.valorInteger());
                }else if (izq.esDouble() && der.esInteger()) {
                    return new Valores(izq.valorDouble() < der.valorInteger().doubleValue());
                } else if (izq.esInteger() && der.esDouble()) {
                    return new Valores(izq.valorInteger().doubleValue() < der.valorDouble());
                }
            case LenguajesParser.MAYOR_IGUAL_QUE:
                if (izq.esDouble() && der.esDouble()) {
                    return new Valores(izq.valorDouble() >= der.valorDouble());
                } else if (izq.esInteger() && der.esInteger()) {
                    return new Valores(izq.valorInteger() >= der.valorInteger());
                }else if (izq.esDouble() && der.esInteger()) {
                    return new Valores(izq.valorDouble() >= der.valorInteger().doubleValue());
                } else if (izq.esInteger() && der.esDouble()) {
                    return new Valores(izq.valorInteger().doubleValue() >= der.valorDouble());
                }
            case LenguajesParser.MENOR_IGUAL_QUE:
                if (izq.esDouble() && der.esDouble()) {
                    return new Valores(izq.valorDouble() <= der.valorDouble());
                } else if (izq.esInteger() && der.esInteger()) {
                    return new Valores(izq.valorInteger() <= der.valorInteger());
                }else if (izq.esDouble() && der.esInteger()) {
                    return new Valores(izq.valorDouble() <= der.valorInteger().doubleValue());
                } else if (izq.esInteger() && der.esDouble()) {
                    return new Valores(izq.valorInteger().doubleValue() <= der.valorDouble());
                }
            default:
                throw new ExceptionErrorSimbolo();
        }
        //return null;
    }

    /* expr op = (IGUAL_QUE | DIFERENTE_QUE) expr */
    @Override public Valores visitRelacionales2(LenguajesParser.Relacionales2Context ctx) {
        Valores izq = this.visit(ctx.expr(0));
        Valores der = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LenguajesParser.IGUAL_QUE:
                if (izq.esDouble() && der.esDouble()){
                        return izq.esDouble() && der.esDouble() ?
                                new Valores(Math.abs(izq.valorDouble() - der.valorDouble()) < valor_pequeno) :
                                new Valores(izq.equals(der));
                    }else if (izq.esInteger() && der.esInteger()){
                        return izq.esInteger() && der.esInteger() ?
                                new Valores(Math.abs(izq.valorInteger() - der.valorInteger()) < valor_pequeno) :
                                new Valores(izq.equals(der));
                    }else if (izq.esDouble() && der.esInteger()){
                        return izq.esDouble() && der.esDouble() ?
                                new Valores(Math.abs(izq.valorDouble() - der.valorInteger().doubleValue()) < valor_pequeno) :
                                new Valores(izq.equals(der));
                    }else if (izq.esInteger() && der.esDouble()){
                        return izq.esDouble() && der.esDouble() ?
                                new Valores(Math.abs(izq.valorInteger().doubleValue() - der.valorDouble()) < valor_pequeno) :
                                new Valores(izq.equals(der));
                    }

            case LenguajesParser.DIFERENTE_QUE:
                    if (izq.esDouble() && der.esDouble()){
                        return izq.esDouble() && der.esDouble() ?
                                new Valores(Math.abs(izq.valorDouble() - der.valorDouble()) >= valor_pequeno) :
                                new Valores(!izq.equals(der));
                    }else if (izq.esInteger() && der.esInteger()){
                        return izq.esInteger() && der.esInteger() ?
                                new Valores(Math.abs(izq.valorInteger() - der.valorInteger()) >= valor_pequeno) :
                                new Valores(!izq.equals(der));
                    }else if (izq.esDouble() && der.esInteger()){
                        return izq.esDouble() && der.esDouble() ?
                                new Valores(Math.abs(izq.valorDouble() - der.valorInteger().doubleValue()) >= valor_pequeno) :
                                new Valores(!izq.equals(der));
                    }else if (izq.esInteger() && der.esDouble()){
                        return izq.esDouble() && der.esDouble() ?
                                new Valores(Math.abs(izq.valorInteger().doubleValue() - der.valorDouble()) >= valor_pequeno) :
                                new Valores(!izq.equals(der));
                    }
            default:
                throw new ExceptionErrorSimbolo();
        }
        //return null;
    }

    /* NOT expr */
    @Override public Valores visitLogicoNot(LenguajesParser.LogicoNotContext ctx) {
        Valores valor = this.visit(ctx.expr());
        return new Valores(!valor.valorBoolean());
    }

    /* expr AND expr */
    @Override public Valores visitLogicoAnd(LenguajesParser.LogicoAndContext ctx) {
        Valores izq = this.visit(ctx.expr(0));
        Valores der = this.visit(ctx.expr(1));
        return new Valores(izq.valorBoolean() && der.valorBoolean());
    }

    /* expr OR expr */
    @Override public Valores visitLogicoOr(LenguajesParser.LogicoOrContext ctx) {
        Valores izq = this.visit(ctx.expr(0));
        Valores der = this.visit(ctx.expr(1));
        return new Valores(izq.valorBoolean() || der.valorBoolean());
    }

    /* IF condicion (ELSE IF condicion)* (ELSE bloque_condicion)? */
    @Override public Valores visitCondicion_if(LenguajesParser.Condicion_ifContext ctx) {
        //try {
        List<LenguajesParser.CondicionContext> condiciones = ctx.condicion();

        boolean bandera = false;

        for (LenguajesParser.CondicionContext condicion : condiciones) {
            Valores evaluar = this.visit(condicion.expr());
            if (evaluar.valorBoolean()) {
                bandera = true;
                this.visit(condicion.bloque_condicion());
                break;
            }
        }
        if (!bandera && ctx.bloque_condicion() != null) {
            this.visit(ctx.bloque_condicion());
        }
        //}catch (Exception e) {
        //throw new ExceptionErrorIf();
        //}
        return Valores.vacio;
    }

    /* WHILE PAR_A expr PAR_C bloque_condicion */
    @Override public Valores visitCondicion_while(LenguajesParser.Condicion_whileContext ctx) {
        Valores valor = this.visit(ctx.expr());
        while(valor.valorBoolean()) {
            this.visit(ctx.bloque_condicion());
            valor = this.visit(ctx.expr());
        }
        return Valores.vacio;
    }

    /* TRUE */
    @Override public Valores visitVerdadero(LenguajesParser.VerdaderoContext ctx) {
        return new Valores(true);
    }

    /* FALSE */
    @Override public Valores visitFalso(LenguajesParser.FalsoContext ctx) {
        return new Valores(false);
    }

    /* LL_A */
    @Override public Valores visitLlave_abierta(LenguajesParser.Llave_abiertaContext ctx) {
        //Mapa para saber cuantas variables tiene cada memoria
        LinkedHashMap<String, Valores> memoriaDeTamanios = clonar(memoria);
        int tamanio_bloque = memoriaDeTamanios.size();
        pila.push(tamanio_bloque);

        memoria_bloque.put(nivel, memoria);

        nivel ++;
        return Valores.vacio;
    }

    /* LL_C */
    @Override public Valores visitLlave_cerrada(LenguajesParser.Llave_cerradaContext ctx) {
        int actual = memoria.size();
        int tamanio = actual - pila.pop();

        Set<Map.Entry<String, Valores>> entradas = memoria.entrySet();
        Iterator<Map.Entry<String, Valores>> iterador = entradas.iterator();
        Map.Entry<String, Valores> entrada = null, ultima_entrada = null;

        for (int i = 0; i < tamanio; i++){
            while(iterador.hasNext()){
                entrada = iterador.next();
                ultima_entrada = entrada;
            }
            memoria.remove(ultima_entrada.getKey());
        }
        nivel --;
        return Valores.vacio;
    }

    public static <K, V> LinkedHashMap <String, Valores> clonar(Map <String, Valores> original){
        return new LinkedHashMap<String, Valores> (original);
    }
}