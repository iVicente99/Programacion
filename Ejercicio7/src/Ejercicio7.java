import java.util.Scanner;

/**
 * Programa que lee numeros por teclado y te dice cual es el mayor, menor y media
 * de los numeros introducidos.
 */

/**
 * @author Ivan Vicente y Joaquin Coma
 *
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero= 0, suma= 0, contador=0, mayor=0, media=0;
		int menor= 10000000;
		do {
			System.out.print("Introduce un numero: ");
			numero = teclado.nextInt();
			if (numero > mayor) {
				mayor=numero;
			}
			else  {
				if (numero < menor && numero!=0)
				menor=numero;
			}
			suma=suma +numero;
			contador++;
		}while (numero != 0);
		media = suma /= contador;
		System.out.println("El mayor es: "+mayor);
		System.out.println("El menor es: "+menor);
		System.out.println("El total de numeros introducidos es: "+contador);
		System.out.println("La media de los numeros es: "+media);
		teclado.close();
	}

}