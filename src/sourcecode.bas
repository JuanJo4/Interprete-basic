'	Declaracion de variables

INTEGER num1,num2[234]
FLOAT num3
STRING name[26]

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
NEXT num2

FOR num2 = num2+5 TO 10 STEP 2
PRINT "You are in a LOOP"
NEXT num2

'	Pruebas con sentencias DO y WHILE

INTEGER i
i = 0

DO
PRINT "Numero " ; i
i = i + 1
LOOP UNTIL i < 7 AND NOT 4 <> 4

WHILE clave <> "xjk5"
PRINT "ESCRIBE TU CLAVE DE ACCESO"
INPUT clave
ENDWHILE

'	Llamadas a funciones

nombre()

funcion(msj,numero)


END

'	Pruebas con definicion de funciones

PROCEDURE nombre()
STRING var
var = "Estamos dentro de un procedimiento"
END PROCEDURE

PROCEDURE funcion(STRING msj, INTEGER numero)
var = "Estamos dentro de un procedimiento"
PRINT msj ; " " ; numero
END PROCEDURE

