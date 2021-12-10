import java.util.Scanner;

/**Programa que lee un numero y te dice si es perfecto o no.
 * 
 */

/**
 * @author Ivan Vicente y Joaquin Coma
 *
 */
public class Ejercicio9 {
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduce un numero para saber si es perfecto");
	int numero=0;
	int suma=0;
	numero=teclado.nextInt();
	teclado.close();
	//System.out.println("Los divisores de " +numero +" son: ");
	for (int i = 1 ; i < numero ; i++) {
        if (numero % i == 0)
             suma+=i;
	}
	if (suma==numero) {
		System.out.println("El numero " +numero+ " es perfecto");
	}else {
		System.out.println("El numero " +numero+ " no es perfecto");
	}
}
}
