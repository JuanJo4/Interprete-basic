import java_cup.runtime.Symbol;
import java.io.*;

%%
%intwrap
%cup
%class Scanner
%{
	private int numlinea = 0;	
%}
%eofval{
    return new java_cup.runtime.Symbol(sym.EOF);
%eofval}

digito		= [0-9]
num_entero	= {digito}+
num_flotante	= {digito}+ \. {digito}*
letra		= [a-zA-Z]
identificador	= {letra}({letra}|{digito})+
nuevalinea	= ( \n | \n\r | \r\n )+
espacio		= [ \t]+
cadena		= \"[^(\"|\n\r)]*\"

%%

"rem" |
"'"				{	System.out.println("token COMENTARIO"); /*No tomo en cuenta los comentarios*/ }
"procedure" |
"PROCEDURE"		{ 	System.out.println("token PROCEDURE");
					return new java_cup.runtime.Symbol(sym.PROCEDURE);
				}
"end procedure" |
"END PROCEDURE"	{ 	System.out.println("token ENDPROCEDURE");
					return new java_cup.runtime.Symbol(sym.ENDPROCEDURE);
				}
"end" |
"END"			{	System.out.println("token END");
					return new java_cup.runtime.Symbol(sym.END);
				}
"if" |
"IF"			{	System.out.println("token IF");
					return new java_cup.runtime.Symbol(sym.IF);
				}
"then" |
"THEN"			{	System.out.println("token THEN");
					return new java_cup.runtime.Symbol(sym.THEN);
				}
"else" |
"ELSE"			{	System.out.println("token ELSE");
					return new java_cup.runtime.Symbol(sym.ELSE);
				}
"endif" |
"ENDIF"			{	System.out.println("token ENDIF");
					return new java_cup.runtime.Symbol(sym.ENDIF);
				}
"while" |
"WHILE"         {	System.out.println("token WHILE");
					return new java_cup.runtime.Symbol(sym.WHILE);
				}
"endwhile" |
"ENDWHILE"		{	System.out.println("token ENDWHILE");
					return new java_cup.runtime.Symbol(sym.ENDWHILE);
				}
"do" |
"DO"			{	System.out.println("token DO");
					return new java_cup.runtime.Symbol(sym.DO);
				}
"loop until" |
"LOOP UNTIL"	{	System.out.println("token LOOP_UNTIL");
					return new java_cup.runtime.Symbol(sym.LOOP_UNTIL);
				}
"for" |
"FOR"			{	System.out.println("token FOR");
					return new java_cup.runtime.Symbol(sym.FOR);
				}
"to" |
"TO"			{	System.out.println("token TO");
					return new java_cup.runtime.Symbol(sym.TO);
				}
"step" |
"STEP"			{	System.out.println("token STEP");
					return new java_cup.runtime.Symbol(sym.STEP);
				}
"next" |
"NEXT"			{	System.out.println("token NEXT");
					return new java_cup.runtime.Symbol(sym.NEXT);
				}
"print" |
"PRINT"			{	System.out.println("token PRINT");
					return new java_cup.runtime.Symbol(sym.PRINT);
				}
"input"	|
"INPUT"			{	System.out.println("token INPUT");
					return new java_cup.runtime.Symbol(sym.INPUT);
				}
"integer" |
"INTEGER"		{	System.out.println("token INTEGER");
					return new java_cup.runtime.Symbol(sym.INTEGER);
				}
"float"	|
"FLOAT"			{	System.out.println("token FLOAT");
					return new java_cup.runtime.Symbol(sym.FLOAT);
				}
"string" |
"STRING"		{	System.out.println("token STRING");
					return new java_cup.runtime.Symbol(sym.STRING);
				}
"and" |
"AND"			{	System.out.println("token AND");
					return new java_cup.runtime.Symbol(sym.AND);
				}
"or" |
"OR"			{	System.out.println("token OR");
					return new java_cup.runtime.Symbol(sym.OR);
				}
"not" |
"NOT"			{	System.out.println("token NOT");
					return new java_cup.runtime.Symbol(sym.NOT);
				}
				
"<>"			{	System.out.println("token DIFFERENT");
					return new java_cup.runtime.Symbol(sym.DIFFERENT);
				}
				
"<="			{	System.out.println("token LESS_THAN_EQ");
					return new java_cup.runtime.Symbol(sym.LESS_THAN_EQ);
				}
				
"<"             {	System.out.println("token LESS_THAN");
					return new java_cup.runtime.Symbol(sym.LESS_THAN);
				}
				
">="			{	System.out.println("token GREATER_THAN_EQ");
					return new java_cup.runtime.Symbol(sym.GREATER_THAN_EQ);
				}
				
">"				{	System.out.println("token GREATER_THAN");
					return new java_cup.runtime.Symbol(sym.GREATER_THAN);
				}
				
"=="			{	System.out.println("token EQUAL");
					return new java_cup.runtime.Symbol(sym.EQUAL);
				}
				
"="				{	System.out.println("token ASSIGN");
					return new java_cup.runtime.Symbol(sym.ASSIGN);
				}
				
"+"             {	System.out.println("token PLUS");
					return new java_cup.runtime.Symbol(sym.PLUS);
				}
				
"-"             {	System.out.println("token MINUS");
					return new java_cup.runtime.Symbol(sym.MINUS);
				}
				
"*"             {	System.out.println("token ASTERISK");
					return new java_cup.runtime.Symbol(sym.ASTERISK);
				}
				
"/"             {	System.out.println("token SLASH");
					return new java_cup.runtime.Symbol(sym.SLASH);
				}
				
"^"             {	System.out.println("token CIRCUMFLEX");
					return new java_cup.runtime.Symbol(sym.CIRCUMFLEX);
				}
				
"%"             {	System.out.println("token MODULE");
					return new java_cup.runtime.Symbol(sym.MODULE);
				}
				
"("             {	System.out.println("token LPAREN");
					return new java_cup.runtime.Symbol(sym.LPAREN);
				}
				
")"             {	System.out.println("token RPAREN");
					return new java_cup.runtime.Symbol(sym.RPAREN);
				}
				
"["             {	System.out.println("token LPOPPER");
					return new java_cup.runtime.Symbol(sym.LPOPPER);
				}
				
"]"             {	System.out.println("token RPOPPER");
					return new java_cup.runtime.Symbol(sym.RPOPPER);
				}
				
";"             {	System.out.println("token CONCAT");
					return new java_cup.runtime.Symbol(sym.CONCAT);
				}
				
","             {	System.out.println("token COMMA");
					return new java_cup.runtime.Symbol(sym.COMMA);
				}
				
{identificador}	{	System.out.println("token ID");
					return new java_cup.runtime.Symbol(sym.ID);
				}
{num_entero}	{	System.out.println("token NUM_ENTERO");
					return new java_cup.runtime.Symbol(sym.NUM_ENTERO);
				}
				
{num_flotante}	{	System.out.println("token NUM_FLOTANTE");
					return new java_cup.runtime.Symbol(sym.NUM_FLOTANTE);
				}
				
{cadena}        {	System.out.println("token CADENA");
					return new java_cup.runtime.Symbol(sym.CADENA);
				}
				
{nuevalinea}	{	System.out.println("token NEW_LINE");
					numlinea++;
					return new java_cup.runtime.Symbol(sym.NEW_LINE); 
				}
{espacio}		{ /* No tomo en cuenta espacios en blanco*/	}

.               {	System.err.println("Error léxico en la línea " + numlinea);	}