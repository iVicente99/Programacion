import java.util.Scanner;

/**Leer una frase de maximo 80 caracteres y escribirla progresivamente.
 * 
 */

/**
 * @author Ivan Vicente
 *
 */
public class Cadenas1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce una frase de de menos de 80 caracteres");
		Scanner teclado=new Scanner (System.in);
		String s=teclado.nextLine();
		//La siguiente linea controla que la longitud de la cadena no sea mayor de 80 caracteres//
		if (s.length() <=80) {
			//La siguiente linea crea una variable que va a servir de contador//
			for (int x=0;x<=s.length();x++) {
				//La siguiente linea va a imprimir por pantalla los caracteres desde el primero hasta el ultimo, porque el contador"x",va aumentando//
				//s.substring te muestra los caracteres que tu indiques en el parentesis(caracer x, hasta caracter y)//
			   System.out.println(s.substring(0,x));
			}
		}else {
			System.out.println("Introdujiste una frase mas de 80 carcateres");
			teclado.close();
		}
		
	}

}

