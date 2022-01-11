package javapackage.Ejercicio2;

public class Ejercicio2App {

	public static void main(String[] args) {
		/*
		 * 2
Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int ,
una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
A continuación muestra por pantalla:
•
El valor de cada variable.
•
La suma de N + A
•
La diferencia de A N
•
El valor numérico correspondiente al carácter que contiene la variable C.
Si por ejemplo le hemos dado a N el valor 5, a
A el valor 4.56 y a C el valor ‘a’, se debe
mostrar por pantalla
•
Variable N = 5
•
Variable A = 4.56
•
Variable C = a
•
5 + 4.56 = 9.559999999999999
•
4.56 5 = 0.4400000000000004
•
Valor numérico del carácter a = 97
EJERCICIOS*/
		

		int N = 5;
		double A = 4.56;
		char C = 'a';
		
		System.out.println("Variable N inicial es: " + N);
		System.out.println("Variable A inicial es: " + A);
		System.out.println("Variable C inicial es: " + C);
		
		System.out.println("La suma de N + A es: " + (N + A));
		System.out.println("La diferencia de A a N es: " + (A - N));
		
		int x = Character.getNumericValue(C); // MÉTOGO "GETCHARACTERVALUE" para castear un char a int
		System.out.println("El valor numerico de C, segun el ABECEDARIO es " + x);
		
		
		
		
		
	}

	
}
