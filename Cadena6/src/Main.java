import java.util.Scanner;
/**
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
		Scanner teclado=new Scanner(System.in); 
		System.out.println("Introduce una frase");
		String frase= teclado.nextLine();
		int vocales = 0;
		int consonantes = 0;
		int numeros = 0;
		if (frase.length()>80) {
			System.out.println("Mete frase de menos de 80 carácteres");
		}else {
			for (int i=0;i<frase.length(); i++) { //este for irá por cada letra de la frase
				char ww = frase.charAt(i); // aquí se almacena cada letra 
				if (ww == 'a' || ww == 'e' || ww == 'i' || ww == 'o' || ww == 'u') {
					vocales++;
					
				}else if((ww >='a' && ww <='z' )) { // compruebas que el carácter está dentro del rango entre la a y la z
					consonantes++;
					
				}else if(Character.isDigit(ww)) {
					numeros++;
				}else if(ww == 32); // no hace nada, pero no te cuenta los espacios.
			}
			
		}
		System.out.println("La frase tiene " + vocales + " vocales ");
		System.out.println("La frase tiene " + consonantes + " consonantes ");
		System.out.println("La frase tiene " + numeros + " numeros ");
	}

}
