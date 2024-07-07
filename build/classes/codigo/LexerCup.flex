package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
ID=[a-zA-Z_][a-zA-Z0-9_]*
D=[0-9]+
WS=[ \t\r\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
programa {return new Symbol(sym.Programa, yychar, yyline, yytext());}
variables {return new Symbol(sym.Variables, yychar, yyline, yytext());}
funcion {return new Symbol(sym.Funcion, yychar, yyline, yytext());}
modulo {return new Symbol(sym.Modulo, yychar, yyline, yytext());}
leer {return new Symbol(sym.Leer, yychar, yyline, yytext());}
escribir {return new Symbol(sym.Escribir, yychar, yyline, yytext());}
inicio {return new Symbol(sym.Inicio, yychar, yyline, yytext());}
si {return new Symbol(sym.Si, yychar, yyline, yytext());}
entonces {return new Symbol(sym.Entonces, yychar, yyline, yytext());}
sino {return new Symbol(sym.Sino, yychar, yyline, yytext());}
fin {return new Symbol(sym.Fin, yychar, yyline, yytext());}
entero {return new Symbol(sym.Entero, yychar, yyline, yytext());}
{WS} {/*Ignore*/}
"//".* {/*Ignore*/}
"("    { return new Symbol(sym.ParentesisApertura, yychar, yyline, yytext());}
")"    { return new Symbol(sym.ParentesisCierre, yychar, yyline, yytext()); }
","    { return new Symbol(sym.Coma, yychar, yyline, yytext()); }
";"    { return new Symbol(sym.PuntoYComa, yychar, yyline, yytext()); }
":="   { return new Symbol(sym.Asignacion, yychar, yyline, yytext()); }
":"   { return new Symbol(sym.DosPuntos, yychar, yyline, yytext()); }
"="    { return new Symbol(sym.Equivalencia, yychar, yyline, yytext()); }
{ID} {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
{D} {return new Symbol(sym.Numero, yychar, yyline, yytext());}
 . {return new Symbol(sym.error, yychar, yyline, yytext());}


