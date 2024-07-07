package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
ID=[a-zA-Z_][a-zA-Z0-9_]*
D=[0-9]+
WS=[ \t\r]+
%{
    public String lex;
%}
%%
programa {lex=yytext(); return Programa;}
variables {lex=yytext(); return Variables;}
funcion {lex=yytext(); return Funcion;}
modulo {lex=yytext(); return Modulo;}
inicio {lex=yytext(); return Inicio;}
si {lex=yytext(); return Si;}
entonces {lex=yytext(); return Entonces;}
sino {lex=yytext(); return Sino;}
fin {lex=yytext(); return Fin;}
entero {lex=yytext(); return Entero;}
leer {lex=yytext(); return Leer;}
escribir {lex=yytext(); return Escribir;}
{WS} {/*Ignore*/}
"//".* {/*Ignore*/}
"\n"   { lex=yytext();return Linea; }
"("    { lex=yytext();return ParentesisApertura; }
")"    { lex=yytext();return ParentesisCierre; }
","    { lex=yytext();return Coma; }
";"    { lex=yytext();return PuntoYComa; }
":="   { lex=yytext();return Asignacion; }
":"    { lex=yytext();return DosPuntos; }
"="    { lex=yytext();return Equivalencia; }
{ID} {lex=yytext(); return Identificador;}
{D} {lex=yytext(); return Numero;}
 . {return ERROR;}


