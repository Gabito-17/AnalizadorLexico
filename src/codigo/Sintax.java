
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Jul 07 20:13:51 ART 2024
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Jul 07 20:13:51 ART 2024
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\002\004\000\002\002\013\000\002\012" +
    "\002\000\002\012\003\000\002\012\005\000\002\012\005" +
    "\000\002\012\007\000\002\003\007\000\002\004\003\000" +
    "\002\006\003\000\002\006\005\000\002\010\013\000\002" +
    "\017\006\000\002\005\005\000\002\021\003\000\002\021" +
    "\004\000\002\013\003\000\002\013\003\000\002\013\003" +
    "\000\002\013\007\000\002\013\011\000\002\016\005\000" +
    "\002\014\010\000\002\007\003\000\002\011\005\000\002" +
    "\011\005\000\002\011\003\000\002\015\003\000\002\015" +
    "\003\000\002\015\005\000\002\015\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\123\000\004\004\004\001\002\000\004\005\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\014\010\001\002\000\006\005\012\015\uffff\001" +
    "\002\000\004\015\022\001\002\000\010\015\ufffe\020\014" +
    "\021\013\001\002\000\006\005\012\015\uffff\001\002\000" +
    "\004\010\016\001\002\000\006\015\ufffc\021\017\001\002" +
    "\000\010\006\uffea\015\uffea\021\uffea\001\002\000\006\005" +
    "\012\015\uffff\001\002\000\004\015\ufffb\001\002\000\004" +
    "\015\ufffd\001\002\000\004\006\023\001\002\000\004\017" +
    "\025\001\002\000\004\022\037\001\002\000\004\005\027" +
    "\001\002\000\004\020\032\001\002\000\010\015\ufff8\020" +
    "\ufff8\021\030\001\002\000\004\005\027\001\002\000\006" +
    "\015\ufff7\020\ufff7\001\002\000\004\010\016\001\002\000" +
    "\004\006\034\001\002\000\004\022\ufffa\001\002\000\004" +
    "\023\ufff9\001\002\000\004\023\120\001\002\000\004\005" +
    "\040\001\002\000\004\014\041\001\002\000\006\005\012" +
    "\015\uffff\001\002\000\004\015\043\001\002\000\004\020" +
    "\044\001\002\000\004\010\016\001\002\000\004\006\046" +
    "\001\002\000\004\023\047\001\002\000\012\005\056\011" +
    "\054\027\055\030\057\001\002\000\004\023\ufff6\001\002" +
    "\000\016\005\ufff0\011\ufff0\012\ufff0\024\ufff0\027\ufff0\030" +
    "\ufff0\001\002\000\004\024\116\001\002\000\016\005\uffef" +
    "\011\uffef\012\uffef\024\uffef\027\uffef\030\uffef\001\002\000" +
    "\006\005\073\026\070\001\002\000\004\014\105\001\002" +
    "\000\004\016\067\001\002\000\004\014\061\001\002\000" +
    "\016\005\ufff1\011\ufff1\012\ufff1\024\ufff1\027\ufff1\030\ufff1" +
    "\001\002\000\004\005\062\001\002\000\004\014\063\001" +
    "\002\000\004\005\027\001\002\000\004\015\065\001\002" +
    "\000\004\015\066\001\002\000\016\005\uffed\011\uffed\012" +
    "\uffed\024\uffed\027\uffed\030\uffed\001\002\000\006\005\073" +
    "\026\070\001\002\000\026\005\uffe6\007\uffe6\011\uffe6\012" +
    "\uffe6\013\uffe6\015\uffe6\024\uffe6\025\uffe6\027\uffe6\030\uffe6" +
    "\001\002\000\026\005\uffe7\007\uffe7\011\uffe7\012\uffe7\013" +
    "\uffe7\015\uffe7\024\uffe7\025\uffe7\027\uffe7\030\uffe7\001\002" +
    "\000\022\005\uffec\011\uffec\012\uffec\013\100\024\uffec\025" +
    "\077\027\uffec\030\uffec\001\002\000\032\005\uffe5\007\uffe5" +
    "\011\uffe5\012\uffe5\013\uffe5\014\075\015\uffe5\021\074\024" +
    "\uffe5\025\uffe5\027\uffe5\030\uffe5\001\002\000\004\005\104" +
    "\001\002\000\006\005\073\026\070\001\002\000\010\013" +
    "\100\015\101\025\077\001\002\000\006\005\073\026\070" +
    "\001\002\000\006\005\073\026\070\001\002\000\026\005" +
    "\uffe3\007\uffe3\011\uffe3\012\uffe3\013\uffe3\015\uffe3\024\uffe3" +
    "\025\uffe3\027\uffe3\030\uffe3\001\002\000\026\005\uffe8\007" +
    "\uffe8\011\uffe8\012\uffe8\013\uffe8\015\uffe8\024\uffe8\025\uffe8" +
    "\027\uffe8\030\uffe8\001\002\000\026\005\uffe9\007\uffe9\011" +
    "\uffe9\012\uffe9\013\uffe9\015\uffe9\024\uffe9\025\uffe9\027\uffe9" +
    "\030\uffe9\001\002\000\026\005\uffe4\007\uffe4\011\uffe4\012" +
    "\uffe4\013\uffe4\015\uffe4\024\uffe4\025\uffe4\027\uffe4\030\uffe4" +
    "\001\002\000\004\005\027\001\002\000\004\015\107\001" +
    "\002\000\004\006\110\001\002\000\016\005\uffee\011\uffee" +
    "\012\uffee\024\uffee\027\uffee\030\uffee\001\002\000\010\007" +
    "\112\013\100\025\077\001\002\000\012\005\056\011\054" +
    "\027\055\030\057\001\002\000\004\012\114\001\002\000" +
    "\012\005\056\011\054\027\055\030\057\001\002\000\016" +
    "\005\uffeb\011\uffeb\012\uffeb\024\uffeb\027\uffeb\030\uffeb\001" +
    "\002\000\004\006\117\001\002\000\004\023\ufff5\001\002" +
    "\000\012\005\056\011\054\027\055\030\057\001\002\000" +
    "\004\002\000\001\002\000\004\024\125\001\002\000\014" +
    "\005\056\011\054\024\ufff3\027\055\030\057\001\002\000" +
    "\004\024\ufff2\001\002\000\004\002\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\123\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\010\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\020\001\001\000\004\007\014\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\023\001\001\000\006\004\035\010\034\001\001\000" +
    "\004\006\025\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\030\001\001\000\002\001\001\000\004\007" +
    "\032\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\005\120\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\012\041\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\044\001\001\000\002\001" +
    "\001\000\004\017\047\001\001\000\012\013\051\014\057" +
    "\016\050\020\052\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\011\110" +
    "\015\070\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\063\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\011\071\015\070" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\011\075" +
    "\015\070\001\001\000\002\001\001\000\004\015\102\001" +
    "\001\000\004\015\101\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\105\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\013\112\014\057\016" +
    "\050\020\052\001\001\000\002\001\001\000\012\013\114" +
    "\014\057\016\050\020\052\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\013\122\014\057" +
    "\016\050\020\052\021\121\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\013\122\014\057\016\050\020\052" +
    "\021\123\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // FACTOR ::= Identificador ParentesisApertura EXPRESION ParentesisCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FACTOR",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // FACTOR ::= Identificador Coma Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FACTOR",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // FACTOR ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FACTOR",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // FACTOR ::= Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FACTOR",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // EXPRESION ::= FACTOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // EXPRESION ::= EXPRESION Equivalencia FACTOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // EXPRESION ::= EXPRESION Modulo FACTOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // TIPO ::= Entero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TIPO",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // IF ::= Si EXPRESION Entonces SENTENCIA Sino SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ASIGNACION ::= Identificador Asignacion EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ASIGNACION",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SENTENCIA ::= Escribir ParentesisApertura Identificador ParentesisApertura DECLARACIONES ParentesisCierre ParentesisCierre 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SENTENCIA ::= Leer ParentesisApertura DECLARACIONES ParentesisCierre PuntoYComa 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SENTENCIA ::= LLAMADA_FUNCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SENTENCIA ::= ASIGNACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SENTENCIAS ::= SENTENCIA SENTENCIAS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIAS ::= SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // CUERPO ::= Inicio SENTENCIAS Fin 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CUERPO",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CUERPO_FUNCION ::= Inicio SENTENCIA Fin PuntoYComa 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CUERPO_FUNCION",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // FUNCION ::= Funcion Identificador ParentesisApertura PARAMETROS ParentesisCierre DosPuntos TIPO PuntoYComa CUERPO_FUNCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DECLARACIONES ::= Identificador Coma DECLARACIONES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACIONES",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DECLARACIONES ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACIONES",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECLARACIONES_FUNCIONES ::= FUNCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACIONES_FUNCIONES",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DECLARACIONES_VARIABLES ::= Variables DECLARACIONES DosPuntos TIPO PuntoYComa 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACIONES_VARIABLES",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // PARAMETROS ::= Identificador DosPuntos TIPO Coma PARAMETROS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETROS",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // PARAMETROS ::= Identificador DosPuntos TIPO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETROS",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // PARAMETROS ::= Identificador Coma PARAMETROS 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETROS",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // PARAMETROS ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETROS",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PARAMETROS ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETROS",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROGRAMA ::= Programa Identificador ParentesisApertura PARAMETROS ParentesisCierre PuntoYComa DECLARACIONES_VARIABLES DECLARACIONES_FUNCIONES CUERPO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROGRAMA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

