
'	Declaracion de variables

INTEGER num1,num2
FLOAT num3
STRING name

REM Asignacion de variables

name = "Juan Jose"
num2 = 12312
num3 = 131312.12

REM	Salida de datos

PRINT "Hello World!"
PRINT "Hello" ; " World!" 
PRINT "My name is " ; name
PRINT "I have " ; num1 ; " years old"
PRINT 4+2/5 ; " is expresion"

'	Entrada de datos

INPUT name

INPUT "Ingrese el precio: ", num3

'	Pruebas con IF

IF num2 == 123 AND 23<=234 OR NOT name <> "Kuadanm" THEN
PRINT "Etoy dentro del if"
var = 123.3
ENDIF

IF 2+2^3 == 10 THEN
PRINT "Muy bien"
var = 123.3
ELSE
PRINT "Oh no!"
var = 123.3
ENDIF

' Pruebas con sentencia FOR

FOR num2 = 1 TO 10
PRINT num2
NEXT

FOR num2 = num2+5 TO 10 STEP 2
PRINT "You are in a LOOP"
NEXT



END