import java.util.Scanner;

/**Programa que lee un numero y muestra sus divisores propios 
 * en pantalla sin incluirse a si mismo.
 * 
 */

/**
 * @author Ivan Vicente y Joaquin Coma
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduce un numero para saber sus divisores propios");
	int numero=0;
	numero=teclado.nextInt();
	teclado.close();
	System.out.println("Los divisores de " +numero +" son: ");
	for (int i = 1 ; i < numero ; i++)
        if (numero % i == 0)
            System.out.println (i);
	}
	
}
