Proceso entrenamiento_4
	Definir resp1,resp2,resp3,resp4 Como Entero;
	Definir k Como Logico;
	Escribir "¿Benjamin Franklin invento el pararrayos[0]falso[1]verdadero";
	leer resp1;
	Escribir "¿Samuel Morse invento el telégrafo[0]falso[1]verdadero";
	leer resp2;
	Escribir "¿Perú es un país suramericano[0]falso[1]verdadero";
	leer resp3;
	Escribir "5 es un número primo[0]falso[1]verdadero";
	leer resp4;
	k <- (resp1>=resp2) y (resp3=resp4);
	Escribir "El valor final vale", k;
FinProceso
