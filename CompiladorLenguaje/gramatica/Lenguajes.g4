grammar Lenguajes;

inicio:
        LIBRERIA? CLASE ID PAR_A PAR_C bloque
        ;
bloque:
        llave_abierta instrucciones* llave_cerrada
        ;
llave_abierta:
        LL_A
        ;
llave_cerrada:
        LL_C
        ;
instrucciones:
        declarar | asignar | declarar_asignar | imprimir | condicion_if | condicion_while | bloque
        ;
condicion_if:
        IF condicion (ELSE IF condicion)* (ELSE bloque_condicion)?
        ;
condicion:
        PAR_A expr PAR_C bloque_condicion
        ;
bloque_condicion:
        bloque
        ;
declarar:
        ENTERO ID PYC                      #declaracion
        ;
asignar:
        ID IGUAL expr PYC                  #asignacion
        ;
declarar_asignar:
        ENTERO ID IGUAL expr PYC           #asignacion2
        ;
condicion_while:
        WHILE PAR_A expr PAR_C bloque_condicion
        ;
imprimir:
        PRINT (string | operacion) PYC
        ;
string:
        PAR_A STRING PAR_C                  #corre
        ;
operacion:
        expr                                #corre2
        ;
expr:
        NOT expr                                        #logicoNot
        |
        expr op = (POR|DIV) expr                        #MulDiv
        |
        expr op = (MAS|MENOS) expr                      #SumRes
        |
        expr op = (MAYOR_QUE | MENOR_QUE | MAYOR_IGUAL_QUE | MENOR_IGUAL_QUE) expr        #relacionales
        |
        expr op = (IGUAL_QUE | DIFERENTE_QUE) expr                                        #relacionales2
        |
        expr AND expr                                   #logicoAnd
        |
        expr OR expr                                    #logicoOr
        |
        INT      #int
        |
        FLOAT    #float
        |
        TRUE                                            #verdadero
        |
        FALSE                                           #falso
        |
        ID                                              #id
        |
        PAR_A expr PAR_C                                #parentesis
        ;

CLASE   : 'Kukin';
ENTERO  : 'bigote';
PRINT   : 'corre';
IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
LIBRERIA: 'libreria asies';

AND     :'&&';
OR      :'||';
NOT     : '!';

TRUE    : 'true';
FALSE   : 'false';

INCREMENTO: '++';
DECREMENTO: '--';

ID      :[a-zA-Z]+;

STRING : '"' ( ESC | . )*? '"' ;
fragment ESC : '\\' [btnr"\\] ;
LINE_COMMENT: '//' .*? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;

MAYOR_QUE : '>';
MENOR_QUE : '<';
MAYOR_IGUAL_QUE: '>=';
MENOR_IGUAL_QUE: '<=';
IGUAL_QUE: '==';
DIFERENTE_QUE: '!=';

IGUAL   : '=';
POR     : '*';
DIV     : '/';
MAS     : '+';
MENOS   : '-';

INT     : [0-9]+;
FLOAT   : [0-9]+ '.' [0-9]* | '.' [0-9]+;

LL_A    : '{';
LL_C    : '}';
PAR_A   : '(';
PAR_C   : ')';
PYC     : ';';

ESPACIOS: [ \n\t\r] -> skip;