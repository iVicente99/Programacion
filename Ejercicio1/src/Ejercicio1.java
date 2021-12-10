import java.util.Scanner;

/**
 * Realiza la suma de todos los numeros comprendidos entre dos numeros, sin incluirlos
 * 
 */

/**
 * @author Iván Vicente y Joaquín Coma
 *
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int a, b; //numeros de los extremos
		int suma; //acumulador de la suma de los numeros
		//Leo lo snumeros a y b, extemos de los que debo sumar
		System.out.println("Introduce el numero menor: ");
		a= teclado.nextInt();
		System.out.println("Introduce el numero mayor: ");
		b= teclado.nextInt();
		//sumo los numeros entre A y B sin incluirlos
		suma=0;
		for ( int contador =a+1; contador <b; contador++)
			suma += contador;
		System.out.println("La suma es "+suma);
		teclado.close();
	}

}
