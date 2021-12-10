import java.util.Scanner;
/**Leer una frase por teclado y escribir a continuación cuantas mayúsculas, minúsculas y números
contiene.
 * 
 */

/**
 * @author joaquin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = teclado.nextLine();
		int mayusculas = 0;
		int minusculas = 0; 
		int numeros = 0;
		for (int i = 0; i< frase.length(); i++) {
			if (Character.isUpperCase(frase.charAt(i))) {
				mayusculas++;
			}else if (Character.isLowerCase(frase.charAt(i))) {
				minusculas++;
			}else if (Character.isDigit(frase.charAt(i))) {
				numeros++;
			}
		}
		System.out.println("mayusculas: "+mayusculas);
		System.out.println("minusculas: "+minusculas);
		System.out.println("numeros: "+numeros);
	}

}
