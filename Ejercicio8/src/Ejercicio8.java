import java.util.Scanner;
/**Programa que lee un numero por teclado y calcula su factorial.
 * @author Ivan Vicente y Joaquin Coma
 *
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		double factorial=1;
		int num;
		System.out.print("Introduce un numero para calcular su factorial");
		num=teclado.nextInt();
		for (int contador=num; contador>=1; contador--) {
			factorial = factorial * contador;
		}
		teclado.close();
		System.out.print("El factorial de " +num + " es: "+factorial );
	}

}
