package ejercicio6;

import java.util.Scanner;

/**
* Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero, 
* que indicaráel fin de la entrada de datos. El programa debe calcular y escribir la 
* suma de los númerosintroducidos en lugar par y de los introducidos en lugar impar, 
* es decir los introducidos primero,tercero, quinto, etc. y la suma de los 
* introducidos segundo, cuarto, sexto, etc.public class ejercico6 {
*/
/**
 * 
 * @author Ivan Vicente y Joaquin Coma
 *
 */

public class ejercico6 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int p, i;
	int sumapares=0;
	int sumaimpares=0;
	do {
		System.out.println("Ingrese numero: ");
		i=teclado.nextInt();
		System.out.println("Ingrese numero: ");
		p=teclado.nextInt();
		sumapares +=p;
		sumaimpares +=i;
	} while(p!=0 && i!=0);
	System.out.println("la suma de los pares es: " + sumapares);
	System.out.println("la suma de los impares es: " + sumaimpares);
	
	
teclado.close();
	}

}
