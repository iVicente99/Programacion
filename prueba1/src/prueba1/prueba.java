/**
 * 
 */
package prueba1;

import java.util.Scanner;

/**
 * @author alu
 *
 */
public class prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero entero: ");
		int tonto = teclado.nextInt();
		System.out.println("has metido el numero" +tonto);
		teclado.close();
	}

}
