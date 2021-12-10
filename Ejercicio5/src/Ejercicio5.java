import java.util.Scanner;

/**
 * Programa que lee una serie de numeros por teclado 
 * Si el numero es 0 se acaba el programa
 * El programa calcula y escribe la suma de los numeros de la serie
 */

/**
 * @author Ivan Vicente
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int contador=0;
		int n;
		int suma=0;
		do {
			System.out.println("Introduce numeros para sumar");
			n =teclado.nextInt();
			contador ++;
			if (suma==0)
				suma = n;
			else
				suma +=n;
		}while(n!=0);
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("Has introducido: "+contador+" numeros");
		teclado.close();
		}
	}


