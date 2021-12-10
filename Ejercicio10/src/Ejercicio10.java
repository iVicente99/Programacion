import java.util.Scanner;

/**
 * Programa que lee un numero y te dice cual es el numero primo mas cercano a el.
 */

/**
 * @author Ivan Vicente y Joaquin Coma
 *
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=teclado.nextInt();
		int i=2;
		while (numero!=i) {
		while (numero % i!=0) {
			i++;
					}
			if (numero==i) {
				System.out.println("El numero primo mas cercano es: "+numero );
			}
			else 
				numero++;
	}
}
}
