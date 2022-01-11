package javapackage.Ejercicio4;
/**
@author isabel Calzadilla
File: Ejercicio 4 sobre sintáxis Java

**/
public class Ejercicio4App {

	public static void main(String[] args) {
		/*
		 * 
		 * 4
Escribe un programa Java que declare una variable entera N y asígnale un valor. A
continuación escribe las instrucciones que realicen los siguientes
•
Incrementar N en 77.
•
Decrementarla en 3.
•
Duplicar su valor.
Si
por ejemplo N = 1 la salida del programa será
•
Valor inicial de N = 1
•
N + 77 = 78
•
N 3 = 75
•
N * 2 = 150
//EJERCICIOS*/
		
		int N = 1;

		System.out.println("El valor inicial de N = " + N);
		System.out.println("El valor  de N + incremento = " + (N += 77));
		System.out.println("El valor  de N - decremento = " + (N -= 3));
		System.out.println("El valor  de N duplicado = " + (N *= 2));

	}

}
