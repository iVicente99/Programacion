import java.util.Scanner;

/**Leer una cadena de hasta 80 caracteres y que te devuelva la frase
 * en mayuscula o minuscula.
 * 
 */

/**
 * @author alu
 *
 */
public class Cadenas4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce una frase de de menos de 80 caracteres");
		Scanner teclado=new Scanner (System.in);
		String s=teclado.nextLine();
		int x=0;
		x=teclado.nextInt();
		//La siguiente linea controla que la longitud de la cadena no sea mayor de 80 caracteres//
		if (s.length() <=80) {
			switch (x) {
			case 1:
				System.out.println(s.toUpperCase());break;
			case 2:
				System.out.println(s.toLowerCase());break;
			default:
				System.out.println("No es una opcion valida tontito");
				teclado.close();
			}
		}

	}

}
