package javapackage.Ejercicio5;

/**
@author isabel Calzadilla
File: Ejercicio 5 sobre sintáxis Java

**/
public class Ejercicio5App {

	public static void main(String[] args) {
		/*5
Programa java que declare cuatro variables enteras A, B, C y D y
asígnale un valor a cada una. A continuación realiza las instrucciones
necesarias para que:
•
B tome el valor de C
•
C tome el valor de A
•
A tome el valor de D
•
D tome el valor de B
EJERCICIOS*/
		
		int A = 7, B = 6, C = 5, D = 4;
		
		System.out.println("Los valores iniciales de las variables son: \nA = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
		
		System.out.println("Ahora B tiene el valor " + (B = C));
		System.out.println("Ahora C tiene el valor " + (C = A));
		System.out.println("Ahora A tiene el valor " + (A = D));
		System.out.println("Ahora D tiene el valor " + (D = B));
		
		System.out.println("Los valores actuales de las variables son: \nA = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
		
	}

}
