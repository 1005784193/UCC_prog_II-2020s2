Proceso entrenamiento_4
	Definir resp1,resp2,resp3,resp4 Como Entero;
	Definir k Como Logico;
	Escribir "�Benjamin Franklin invento el pararrayos[0]falso[1]verdadero";
	leer resp1;
	Escribir "�Samuel Morse invento el tel�grafo[0]falso[1]verdadero";
	leer resp2;
	Escribir "�Per� es un pa�s suramericano[0]falso[1]verdadero";
	leer resp3;
	Escribir "5 es un n�mero primo[0]falso[1]verdadero";
	leer resp4;
	k <- (resp1>=resp2) y (resp3=resp4);
	Escribir "El valor final vale", k;
FinProceso
