package lexico;

import sintactico.sym;

%%
%intwrap
%cup
%public
%class Scanner
%{
	private int numlinea = 1;	
%}
%eofval{
    return new java_cup.runtime.Symbol(sym.EOF);
%eofval}

digito		= [0-9]
num_entero	= {digito}+
num_flotante	= {digito}+ \. {digito}+
letra		= [a-zA-Z]
identificador	= {letra}({letra}|{digito})*
nuevalinea	= ( \n | \n\r | \r\n )+
espacio		= [ \t]+
cadena		= \"[^(\"|\n\r)]*\"
comentario	= "rem" | "REM" | "'"

%%

"procedure" |
"PROCEDURE"		{ 	return new java_cup.runtime.Symbol(sym.PROCEDURE);	}

"end procedure" |
"END PROCEDURE"	{ 	return new java_cup.runtime.Symbol(sym.ENDPROCEDURE);	}

"end" |
"END"			{	return new java_cup.runtime.Symbol(sym.END); }

"if" |
"IF"			{	return new java_cup.runtime.Symbol(sym.IF);	}

"then" |
"THEN"			{	return new java_cup.runtime.Symbol(sym.THEN); }

"else" |
"ELSE"			{	return new java_cup.runtime.Symbol(sym.ELSE); }

"endif" |
"ENDIF"			{	return new java_cup.runtime.Symbol(sym.ENDIF); }

"while" |
"WHILE"         {	return new java_cup.runtime.Symbol(sym.WHILE); }

"endwhile" |
"ENDWHILE"		{	return new java_cup.runtime.Symbol(sym.ENDWHILE); }

"do" |
"DO"			{	return new java_cup.runtime.Symbol(sym.DO);	}

"loop until" |
"LOOP UNTIL"	{	return new java_cup.runtime.Symbol(sym.LOOP_UNTIL);	}

"for" |
"FOR"			{	return new java_cup.runtime.Symbol(sym.FOR); }

"to" |
"TO"			{	return new java_cup.runtime.Symbol(sym.TO); }

"step" |
"STEP"			{	return new java_cup.runtime.Symbol(sym.STEP); }

"next" |
"NEXT"			{	return new java_cup.runtime.Symbol(sym.NEXT); }

"print" |
"PRINT"			{	return new java_cup.runtime.Symbol(sym.PRINT); }

"input"	|
"INPUT"			{	return new java_cup.runtime.Symbol(sym.INPUT); }

"integer" |
"INTEGER"		{	return new java_cup.runtime.Symbol(sym.INTEGER); }

"float"	|
"FLOAT"			{	return new java_cup.runtime.Symbol(sym.FLOAT); }

"string" |
"STRING"		{	return new java_cup.runtime.Symbol(sym.STRING);	}

"and" |
"AND"			{	return new java_cup.runtime.Symbol(sym.AND); }

"or" |
"OR"			{	return new java_cup.runtime.Symbol(sym.OR);	}

"not" |
"NOT"			{	return new java_cup.runtime.Symbol(sym.NOT); }
				
"<>"			{	return new java_cup.runtime.Symbol(sym.DIFFERENT);	}
				
"<="			{	return new java_cup.runtime.Symbol(sym.LESS_THAN_EQ);	}
				
"<"             {	return new java_cup.runtime.Symbol(sym.LESS_THAN);	}
				
">="			{	return new java_cup.runtime.Symbol(sym.GREATER_THAN_EQ); }
				
">"				{	return new java_cup.runtime.Symbol(sym.GREATER_THAN); }
				
"=="			{	return new java_cup.runtime.Symbol(sym.EQUAL); }
				
"="				{	return new java_cup.runtime.Symbol(sym.ASSIGN); }
				
"+"             {	return new java_cup.runtime.Symbol(sym.PLUS); }
				
"-"             {	return new java_cup.runtime.Symbol(sym.MINUS); }
				
"*"             {	return new java_cup.runtime.Symbol(sym.ASTERISK); }
				
"/"             {	return new java_cup.runtime.Symbol(sym.SLASH); }
				
"^"             {	return new java_cup.runtime.Symbol(sym.CIRCUMFLEX); }

"%"             {	return new java_cup.runtime.Symbol(sym.MODULE); }
				
"("             {	return new java_cup.runtime.Symbol(sym.LPAREN); }
				
")"             {	return new java_cup.runtime.Symbol(sym.RPAREN); }
				
"["             {	return new java_cup.runtime.Symbol(sym.LPOPPER); }
				
"]"             {	return new java_cup.runtime.Symbol(sym.RPOPPER); }
				
";"             {	return new java_cup.runtime.Symbol(sym.CONCAT); }
				
","             {	return new java_cup.runtime.Symbol(sym.COMMA); }
				
{identificador}	{	return new java_cup.runtime.Symbol(sym.ID, yytext()); }

{num_entero}	{	return new java_cup.runtime.Symbol(sym.NUM_ENTERO,new Integer(yytext())); }
				
{num_flotante}	{	return new java_cup.runtime.Symbol(sym.NUM_FLOTANTE,new Float(yytext())); }
				
{cadena}        {	return new java_cup.runtime.Symbol(sym.CADENA,yytext()); }
				
{nuevalinea}	{	numlinea++;
					return new java_cup.runtime.Symbol(sym.NEW_LINE); 
				}
				
{espacio}		{ /* No tomo en cuenta espacios en blanco*/	}

{comentario} {espacio}+ [^\n\r]* {nuevalinea} { /* No tomo en cuenta los comentarios	*/ }

.               {	System.err.println("Error léxico en la línea " + numlinea);	}