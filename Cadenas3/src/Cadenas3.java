import java.util.Scanner;

/**Programa que lee una frase y una palabra 
 * y que nos diga la posicion de dicha palabra en la frase
 * si no la encuentra devuelve un 0.
 * 
 */

/**
 * @author alu
 *
 */
public class Cadenas3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce una frase");
		Scanner teclado=new Scanner (System.in);
		String s=teclado.nextLine();
		System.out.println("Introduce una palabra de la frase");
		String s2=teclado.nextLine();
		System.out.println("La posición de la palabra es: "+(s.indexOf(s2)+1));
		teclado.close();
	}
	
}
