import java.util.Scanner;

/**Programa que lee una frase de no mas de 80 caracteres
 * y construye otras 2 cadenas, 1 contiene los caracteres en posicion par
 * y la otra cadena los caracteres en posicion impar.
 * 
 */

/**
 * @author alu
 *
 */
public class Cadenas5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce una frase de de menos de 80 caracteres");
		Scanner teclado=new Scanner (System.in);
		String s=teclado.nextLine();
		if (s.length() <=80) {
			for (int x=0;x<s.length();x++) {
				int y= x%2;
			if (y%2==0) {
				System.out.print(s.charAt(x));
			}else if(y%2!=0) {
				System.out.print(s.charAt(x));
			}
			}	
		}else {
			System.out.println("La frase es mayor de 80 caracteres");
		}
	}

}
