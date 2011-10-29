
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Oct 29 01:34:00 VET 2011
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Oct 29 01:34:00 VET 2011
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\072\000\002\002\005\000\002\002\004\000\002\002" +
    "\006\000\002\002\006\000\002\002\007\000\002\002\004" +
    "\000\002\002\005\000\002\002\003\000\002\002\004\000" +
    "\002\002\003\000\002\003\005\000\002\003\003\000\002" +
    "\004\003\000\002\004\003\000\002\004\003\000\002\004" +
    "\003\000\002\004\003\000\002\005\004\000\002\006\003" +
    "\000\002\006\003\000\002\006\003\000\002\007\005\000" +
    "\002\007\003\000\002\010\005\000\002\011\004\000\002" +
    "\012\005\000\002\012\003\000\002\013\004\000\002\013" +
    "\006\000\002\014\011\000\002\014\015\000\002\015\005" +
    "\000\002\015\003\000\002\016\003\000\002\016\003\000" +
    "\002\017\006\000\002\017\005\000\002\020\003\000\002" +
    "\020\003\000\002\020\003\000\002\020\003\000\002\020" +
    "\003\000\002\020\003\000\002\021\005\000\002\021\003" +
    "\000\002\022\003\000\002\022\003\000\002\023\005\000" +
    "\002\023\003\000\002\024\003\000\002\024\003\000\002" +
    "\024\003\000\002\024\003\000\002\025\005\000\002\025" +
    "\003\000\002\025\003\000\002\025\003\000\002\025\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\135\000\024\005\005\015\006\016\007\020\021\021" +
    "\012\037\024\040\017\041\015\053\014\001\002\000\004" +
    "\053\ufff4\001\002\000\006\021\134\062\135\001\002\000" +
    "\006\002\ufffa\053\133\001\002\000\016\017\036\021\033" +
    "\022\030\044\101\061\035\062\026\001\002\000\004\053" +
    "\073\001\002\000\004\021\067\001\002\000\004\025\065" +
    "\001\002\000\004\002\064\001\002\000\024\002\ufff8\005" +
    "\005\015\056\016\007\020\021\021\012\037\024\040\017" +
    "\041\015\001\002\000\004\021\uffed\001\002\000\004\053" +
    "\ufff6\001\002\000\004\021\uffee\001\002\000\004\053\ufff3" +
    "\001\002\000\014\017\036\021\033\022\030\061\035\062" +
    "\026\001\002\000\004\053\ufff1\001\002\000\004\053\ufff5" +
    "\001\002\000\004\021\uffef\001\002\000\004\053\ufff2\001" +
    "\002\000\046\004\uffc8\006\uffc8\007\uffc8\011\uffc8\012\uffc8" +
    "\013\uffc8\014\uffc8\023\uffc8\026\uffc8\042\uffc8\043\uffc8\045" +
    "\uffc8\046\uffc8\047\uffc8\050\uffc8\053\uffc8\054\uffc8\055\uffc8" +
    "\001\002\000\006\014\053\053\uffe9\001\002\000\046\004" +
    "\uffcb\006\uffcb\007\uffcb\011\uffcb\012\uffcb\013\uffcb\014\uffcb" +
    "\023\uffcb\026\uffcb\042\uffcb\043\uffcb\045\uffcb\046\uffcb\047" +
    "\uffcb\050\uffcb\053\uffcb\054\uffcb\055\uffcb\001\002\000\046" +
    "\004\050\006\047\007\uffd5\011\uffd5\012\uffd5\013\uffd5\014" +
    "\uffd5\023\uffd5\026\uffd5\042\uffd5\043\uffd5\045\uffd5\046\uffd5" +
    "\047\uffd5\050\051\053\uffd5\054\uffd5\055\046\001\002\000" +
    "\012\011\041\014\uffe7\023\043\053\uffe7\001\002\000\046" +
    "\004\uffc9\006\uffc9\007\uffc9\011\uffc9\012\uffc9\013\uffc9\014" +
    "\uffc9\023\uffc9\026\uffc9\042\uffc9\043\uffc9\045\uffc9\046\uffc9" +
    "\047\uffc9\050\uffc9\053\uffc9\054\uffc9\055\uffc9\001\002\000" +
    "\046\004\uffd1\006\uffd1\007\uffd1\011\uffd1\012\uffd1\013\uffd1" +
    "\014\uffd1\023\uffd1\026\uffd1\042\uffd1\043\uffd1\045\uffd1\046" +
    "\uffd1\047\uffd1\050\uffd1\053\uffd1\054\uffd1\055\uffd1\001\002" +
    "\000\046\004\uffca\006\uffca\007\uffca\011\uffca\012\uffca\013" +
    "\uffca\014\uffca\023\uffca\026\uffca\042\uffca\043\uffca\045\uffca" +
    "\046\uffca\047\uffca\050\uffca\053\uffca\054\uffca\055\uffca\001" +
    "\002\000\014\017\036\021\033\022\030\061\035\062\026" +
    "\001\002\000\010\011\041\012\040\023\043\001\002\000" +
    "\046\004\uffcc\006\uffcc\007\uffcc\011\uffcc\012\uffcc\013\uffcc" +
    "\014\uffcc\023\uffcc\026\uffcc\042\uffcc\043\uffcc\045\uffcc\046" +
    "\uffcc\047\uffcc\050\uffcc\053\uffcc\054\uffcc\055\uffcc\001\002" +
    "\000\014\017\uffd4\021\uffd4\022\uffd4\061\uffd4\062\uffd4\001" +
    "\002\000\014\017\036\021\033\022\030\061\035\062\026" +
    "\001\002\000\014\017\uffd3\021\uffd3\022\uffd3\061\uffd3\062" +
    "\uffd3\001\002\000\046\004\050\006\047\007\uffd6\011\uffd6" +
    "\012\uffd6\013\uffd6\014\uffd6\023\uffd6\026\uffd6\042\uffd6\043" +
    "\uffd6\045\uffd6\046\uffd6\047\uffd6\050\051\053\uffd6\054\uffd6" +
    "\055\046\001\002\000\014\017\036\021\033\022\030\061" +
    "\035\062\026\001\002\000\014\017\uffce\021\uffce\022\uffce" +
    "\061\uffce\062\uffce\001\002\000\014\017\uffcf\021\uffcf\022" +
    "\uffcf\061\uffcf\062\uffcf\001\002\000\014\017\uffd0\021\uffd0" +
    "\022\uffd0\061\uffd0\062\uffd0\001\002\000\014\017\uffcd\021" +
    "\uffcd\022\uffcd\061\uffcd\062\uffcd\001\002\000\046\004\uffd2" +
    "\006\uffd2\007\uffd2\011\uffd2\012\uffd2\013\uffd2\014\uffd2\023" +
    "\uffd2\026\uffd2\042\uffd2\043\uffd2\045\uffd2\046\uffd2\047\uffd2" +
    "\050\uffd2\053\uffd2\054\uffd2\055\uffd2\001\002\000\014\017" +
    "\036\021\033\022\030\061\035\062\026\001\002\000\012" +
    "\011\041\014\uffe8\023\043\053\uffe8\001\002\000\004\053" +
    "\060\001\002\000\006\002\ufffc\053\057\001\002\000\004" +
    "\002\ufffb\001\002\000\022\005\005\015\062\016\007\020" +
    "\021\021\012\037\024\040\017\041\015\001\002\000\004" +
    "\053\ufff7\001\002\000\006\002\ufffe\053\063\001\002\000" +
    "\004\002\ufffd\001\002\000\004\002\000\001\002\000\014" +
    "\017\036\021\033\022\030\061\035\062\026\001\002\000" +
    "\010\011\041\023\043\053\uffea\001\002\000\006\053\uffeb" +
    "\060\uffeb\001\002\000\006\053\ufff0\060\071\001\002\000" +
    "\004\021\072\001\002\000\006\053\uffec\060\uffec\001\002" +
    "\000\022\005\005\015\074\016\007\020\021\021\012\037" +
    "\024\040\017\041\015\001\002\000\006\002\001\053\075" +
    "\001\002\000\004\002\uffff\001\002\000\022\007\107\011" +
    "\041\023\043\026\106\045\111\046\110\047\103\054\105" +
    "\001\002\000\010\013\115\042\114\043\116\001\002\000" +
    "\010\013\uffe1\042\uffe1\043\uffe1\001\002\000\014\017\036" +
    "\021\033\022\030\061\035\062\026\001\002\000\022\007" +
    "\107\011\041\023\043\026\106\045\111\046\110\047\103" +
    "\054\105\001\002\000\014\017\uffd7\021\uffd7\022\uffd7\061" +
    "\uffd7\062\uffd7\001\002\000\014\017\036\021\033\022\030" +
    "\061\035\062\026\001\002\000\014\017\uffdb\021\uffdb\022" +
    "\uffdb\061\uffdb\062\uffdb\001\002\000\014\017\uffdc\021\uffdc" +
    "\022\uffdc\061\uffdc\062\uffdc\001\002\000\014\017\uffda\021" +
    "\uffda\022\uffda\061\uffda\062\uffda\001\002\000\014\017\uffd8" +
    "\021\uffd8\022\uffd8\061\uffd8\062\uffd8\001\002\000\014\017" +
    "\uffd9\021\uffd9\022\uffd9\061\uffd9\062\uffd9\001\002\000\014" +
    "\011\041\013\uffde\023\043\042\uffde\043\uffde\001\002\000" +
    "\016\017\036\021\033\022\030\044\101\061\035\062\026" +
    "\001\002\000\016\017\uffe0\021\uffe0\022\uffe0\044\uffe0\061" +
    "\uffe0\062\uffe0\001\002\000\004\053\117\001\002\000\016" +
    "\017\uffdf\021\uffdf\022\uffdf\044\uffdf\061\uffdf\062\uffdf\001" +
    "\002\000\020\005\005\016\007\020\021\021\012\037\024" +
    "\040\017\041\015\001\002\000\004\053\121\001\002\000" +
    "\024\005\005\010\122\016\007\020\021\021\012\027\123" +
    "\037\024\040\017\041\015\001\002\000\004\053\124\001" +
    "\002\000\004\053\uffe4\001\002\000\020\005\005\016\007" +
    "\020\021\021\012\037\024\040\017\041\015\001\002\000" +
    "\004\053\126\001\002\000\022\005\005\016\007\020\021" +
    "\021\012\027\127\037\024\040\017\041\015\001\002\000" +
    "\004\053\uffe3\001\002\000\010\013\uffe2\042\uffe2\043\uffe2" +
    "\001\002\000\014\017\036\021\033\022\030\061\035\062" +
    "\026\001\002\000\014\011\041\013\uffdd\023\043\042\uffdd" +
    "\043\uffdd\001\002\000\004\002\ufff9\001\002\000\004\053" +
    "\uffe6\001\002\000\004\060\136\001\002\000\004\021\137" +
    "\001\002\000\004\053\uffe5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\135\000\024\002\012\003\007\004\015\005\022\006" +
    "\010\010\003\011\017\013\024\014\021\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\015" +
    "\076\017\077\021\075\023\030\025\033\001\001\000\002" +
    "\001\001\000\004\007\067\001\001\000\002\001\001\000" +
    "\002\001\001\000\022\003\054\004\015\005\022\006\010" +
    "\010\003\011\017\013\024\014\021\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\012\026\021\031\023\030\025\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\024\044\001\001\000\004\022\041\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\021\036\023\030\025\033\001\001\000\004\022\041" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\023" +
    "\043\025\033\001\001\000\002\001\001\000\004\024\044" +
    "\001\001\000\004\025\051\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\021\053\023\030\025\033\001\001\000" +
    "\004\022\041\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\020\004\060\005\022\006\010\010" +
    "\003\011\017\013\024\014\021\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\021\065\023\030\025\033\001\001\000\004\022\041" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\004\060\005\022\006\010" +
    "\010\003\011\017\013\024\014\021\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\020\130\022\041\001\001" +
    "\000\004\016\112\001\001\000\002\001\001\000\010\021" +
    "\101\023\030\025\033\001\001\000\006\020\103\022\041" +
    "\001\001\000\002\001\001\000\010\021\111\023\030\025" +
    "\033\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\022" +
    "\041\001\001\000\012\017\127\021\075\023\030\025\033" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\022\003\117\004\015\005\022\006\010\010\003" +
    "\011\017\013\024\014\021\001\001\000\002\001\001\000" +
    "\020\004\060\005\022\006\010\010\003\011\017\013\024" +
    "\014\021\001\001\000\002\001\001\000\002\001\001\000" +
    "\022\003\124\004\015\005\022\006\010\010\003\011\017" +
    "\013\024\014\021\001\001\000\002\001\001\000\020\004" +
    "\060\005\022\006\010\010\003\011\017\013\024\014\021" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\021" +
    "\131\023\030\025\033\001\001\000\004\022\041\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




  public static void main(String args[]) throws Exception{
    parser sintactico;
	
	if(args.length>0){
		sintactico = new parser(new Scanner(new FileInputStream(args[0])));
		sintactico.parse();
	}else{
		System.out.println("No se encontr� el c�digo fuente (Par�metro incorrecto)");
	}
    
  }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // factor ::= CADENA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // factor ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // factor ::= NUM_FLOTANTE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // factor ::= NUM_ENTERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // factor ::= LPAREN expresion_simple RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // op_mult ::= CIRCUMFLEX 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_mult",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // op_mult ::= MODULE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_mult",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // op_mult ::= SLASH 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_mult",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // op_mult ::= ASTERISK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_mult",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // term ::= factor 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // term ::= term op_mult factor 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // op_suma ::= MINUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_suma",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // op_suma ::= PLUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_suma",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // expresion_simple ::= term 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_simple",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // expresion_simple ::= expresion_simple op_suma term 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_simple",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // op_comparacion ::= GREATER_THAN_EQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_comparacion",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // op_comparacion ::= GREATER_THAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_comparacion",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // op_comparacion ::= LESS_THAN_EQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_comparacion",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // op_comparacion ::= LESS_THAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_comparacion",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // op_comparacion ::= DIFFERENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_comparacion",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // op_comparacion ::= EQUAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_comparacion",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expresion_comparacion ::= expresion_simple op_comparacion expresion_simple 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_comparacion",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expresion_comparacion ::= NOT expresion_simple op_comparacion expresion_simple 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_comparacion",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // op_logico ::= OR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_logico",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // op_logico ::= AND 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_logico",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // expresion_compuesta ::= expresion_comparacion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_compuesta",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expresion_compuesta ::= expresion_compuesta op_logico expresion_comparacion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion_compuesta",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // sent_if ::= IF expresion_compuesta THEN NEW_LINE secuencia_sent NEW_LINE ELSE NEW_LINE secuencia_sent NEW_LINE ENDIF 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent_if",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // sent_if ::= IF expresion_compuesta THEN NEW_LINE secuencia_sent NEW_LINE ENDIF 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent_if",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // sent_leer ::= INPUT CADENA COMMA ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent_leer",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // sent_leer ::= INPUT ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent_leer",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // list_impresion ::= expresion_simple 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("list_impresion",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // list_impresion ::= list_impresion CONCAT expresion_simple 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("list_impresion",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // sent_escribir ::= PRINT list_impresion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent_escribir",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // sent_asignacion ::= ID ASSIGN expresion_simple 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent_asignacion",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // list_var ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("list_var",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // list_var ::= list_var COMMA ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("list_var",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // tipo_dato ::= STRING 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_dato",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // tipo_dato ::= FLOAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_dato",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // tipo_dato ::= INTEGER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo_dato",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // sent_declaracion ::= tipo_dato list_var 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent_declaracion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // sentencia ::= sent_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // sentencia ::= sent_leer 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // sentencia ::= sent_escribir 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // sentencia ::= sent_asignacion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // sentencia ::= sent_declaracion 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // secuencia_sent ::= sentencia 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("secuencia_sent",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // secuencia_sent ::= secuencia_sent NEW_LINE sentencia 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("secuencia_sent",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // programa ::= NEW_LINE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // programa ::= END NEW_LINE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // programa ::= END 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // programa ::= NEW_LINE END NEW_LINE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // programa ::= NEW_LINE END 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // programa ::= NEW_LINE secuencia_sent NEW_LINE END NEW_LINE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // programa ::= NEW_LINE secuencia_sent NEW_LINE END 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // programa ::= secuencia_sent NEW_LINE END NEW_LINE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // programa ::= secuencia_sent NEW_LINE END 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

