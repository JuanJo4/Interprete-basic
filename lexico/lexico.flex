
import java.io.FileInputStream;

%%
%intwrap
%class Scanner
%{
	private int lineanum=0;
	private boolean debug=true;
	static String fname ; //nombre archivo entrada

	public static void main(String argv[])throws java.io.IOException {
		int numparams = argv.length; //número argumentos pasados
		if ( numparams != 1) 
		{ 	//error: nr. Parámetros incorrecto
			System.out.println ("Número parámetros incorrecto!");
			System.out.println ( "\t Uso: java yylex code.bas");
			return; 
		}
		else 
		{ 	
			fname = argv[0];
			
			/*	Comprobando extensión .bas	*/
			if(fname.substring(fname.length()-3, fname.length()).equals("bas")){
				Scanner lexico = new Scanner(new FileInputStream(fname));
				while (lexico.yylex() != sym.END);
			}else{
				System.out.println ("Extensión de archivo incorrecto!");
				System.out.println ( "\tEj: code.bas");
			}
		}
	}
%}
%eofval{
    return sym.EOF;
%eofval}

digito		= [0-9]
numero		= {digito}+
letra		= [a-zA-Z]
identificador	= {letra}({letra}|{digito})+
nuevalinea	= \n | \n\r | \r\n
espacio		= [ \t]+
%%
"\""            {	if(debug) System.out.println("token QMARK");
			return sym.QMARK;
			}
"end"           {	if(debug) System.out.println("token END");
			return sym.END;
			}
"if"            {	if(debug) System.out.println("token IF");
			return sym.IF;
			}
"then"          { 	if(debug) System.out.println("token THEN");
			return sym.THEN;
			}
"else"          {	if(debug) System.out.println("token ELSE");
			return sym.ELSE;
			}
"endif"         {	if(debug) System.out.println("token ENDIF");
			return sym.ENDIF;
			}
"while"         {	if(debug) System.out.println("token WHILE");
			return sym.WHILE;
			}
"endwhile"	{	if(debug) System.out.println("token ENDWHILE");
			return sym.ENDWHILE;
			}
"do"		{	if(debug) System.out.println("token DO");
			return sym.DO;
			}
"loop until"	{	if(debug) System.out.println("token LOOP_UNTIL");
			return sym.LOOP_UNTIL;
			}
"for"		{	if(debug) System.out.println("token FOR");
			return sym.FOR;
			}
"to"		{	if(debug) System.out.println("token TO");
			return sym.TO;
			}
"step"		{	if(debug) System.out.println("token STEP");
			return sym.STEP;
			}
"next"		{	if(debug) System.out.println("token NEXT");
			return sym.NEXT;
			}
"print"         {	if(debug) System.out.println("token PRINT");
			return sym.PRINT;
			}
"input"		{	if(debug) System.out.println("token INPUT");
			return sym.INPUT;
			}
"integer"	{	if(debug) System.out.println("token INTEGER");
			return sym.INTEGER;
			}
"float"		{	if(debug) System.out.println("token FLOAT");
			return sym.FLOAT;
			}
"string"	{	if(debug) System.out.println("token STRING");
			return sym.STRING;
			}
"and"           {	if(debug) System.out.println("token AND");
			return sym.AND;
			}
"or"            {	if(debug) System.out.println("token OR");
			return sym.OR;
			}
"not"		{	if(debug) System.out.println("token NOT");
			return sym.NOT;
			}
"rem"           {	if(debug) System.out.println("token COMENTARIO"); /*No tomo en cuenta los comentarios*/
			}
"<>"		{	if(debug) System.out.println("token DIFFERENT");
			return sym.LESS_THAN_EQ;
			}
"<="		{	if(debug) System.out.println("token LESS_THAN_EQ");
			return sym.LESS_THAN_EQ;
			}
"<"             {	if(debug) System.out.println("token LESS_THAN");
			return sym.LESS_THAN;
			}
">="		{	if(debug) System.out.println("token GREATER_THAN_EQ");
			return sym.GREATER_THAN_EQ;
			}
">"		{	if(debug) System.out.println("token GREATER_THAN");
			return sym.GREATER_THAN;
			}
"=="		{	if(debug) System.out.println("token EQUAL");
			return sym.EQUAL;
			}
"="		{	if(debug) System.out.println("token ASSIGN");
			return sym.ASSIGN;
			}
"+"             {	if(debug) System.out.println("token PLUS");
			return sym.PLUS;
			}
"-"             {	if(debug) System.out.println("token MINUS");
			return sym.MINUS;
			}
"*"             {	if(debug) System.out.println("token ASTERISK");
			return sym.ASTERISK;
			}
"/"             {	if(debug) System.out.println("token SLASH");
			return sym.SLASH;
			}
"^"             {	if(debug) System.out.println("token CIRCUMFLEX");
			return sym.CIRCUMFLEX;
			}
"%"             {	if(debug) System.out.println("token SLASH");
			return sym.SLASH;
			}
"("             {	if(debug) System.out.println("token LPAREN");
			return sym.LPAREN;
			}
")"             {	if(debug) System.out.println("token RPAREN");
			return sym.RPAREN;
			}
"["             {	if(debug) System.out.println("token LPOPPER");
			return sym.LPOPPER;
			}
"]"             {	if(debug) System.out.println("token RPOPPER");
			return sym.RPOPPER;
			}
";"             {	if(debug) System.out.println("token CONCAT");
			return sym.CONCAT;
			}
{numero}        {	if(debug) System.out.println("token NUM");
			return sym.NUM;
			}
{identificador}	{	if(debug) System.out.println("token ID");
				return sym.ID;
			}
{nuevalinea}	{ lineanum++; }
{espacio}	{ /* saltos espacios en blanco*/}
.               {System.err.println("Caracter Ilegal encontrado en analisis lexico: " + yytext() + "\n");}







