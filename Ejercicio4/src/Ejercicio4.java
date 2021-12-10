import java.util.Scanner;

/**
 * Programa que lee un numero introducido por teclado y te dice si es primo o no.
 */

/**
 * @author Ivan Vicente
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un numero y te dire si es primo o no");
		int numero=0;
		int i=2;
		numero=teclado.nextInt();
		teclado.close();
		if (numero % i!= 0 || numero==2)
			System.out.println("El numero introducido es primo");
		else
			System.out.println("El numero introducido no es primo");
		primo= numero %2 !=0|| numero==2;
		divisor =3;
		while (primo && divisor < numero && numero!=2) {
			if (numero)
		}
	}

}