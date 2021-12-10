import java.util.Scanner;

/**
 * Programa que lee un numero y te dice los numeros primos hasta dicho numero
 */

/**
 * @author Ivan Vicente y Joaquin Coma
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=teclado.nextInt();
		int i;
		while (numero>0) {
			 i=2;		
			while (numero % i!=0) {
			i++;
					}
			if (numero==i) {
				System.out.println("La lista de numeros primos es: "+numero );
				
			}
			numero--;
			teclado.close();
	}
}
}
