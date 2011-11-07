'	Suma de dos numeros

INTEGER edad[2]
STRING nombre[2],credito
FLOAT val,val2

INPUT "Cual es tu nombre" , nombre[0]
INPUT "Cuantos anos tienes",edad[0]

INPUT "Cual es tu nombre" , nombre[1]
INPUT "Cuantos anos tienes",edad[1]

PRINT "Mi nombre es " ; nombre[0] ; " y tengo " ; edad[0] ; " anos"
PRINT "Mi nombre es " ; nombre[1] ; " y tengo " ; edad[1] ; " anos"

credito = "JuanJo4"

PRINT "Ingrese un numero"
INPUT val2
val = 3%2 - val2/2 + 2*2^2 - 1.5

PRINT "Realizado por: " ; credito ; " Un calculo: " ; val

if edad[0] == 2 THEN
	PRINT "Holaif"
else
	PRINT "Holaelse"
endif

END