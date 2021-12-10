import java.util.Scanner;

/**Programa que cuenta cuántas minúsculas y mayúsculas hay en una frase de no mas de 80 carácteres.
 * 
 */

/**
 * @author Ivan Vicente
 *
 */
public class Cadenas2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce una frase de de menos de 80 caracteres");
		Scanner teclado=new Scanner (System.in);
		String s=teclado.nextLine();
		//Las siguientes variables nos van a servir de contador//
		int mayuscula=0;
		int minuscula=0;
		//La siguiente linea controla que la longitud de la cadena no sea mayor de 80 caracteres//
		if (s.length() <=80) {
			//La siguiente linea crea una variable que va a servir de contador//
			for (int x=0;x<s.length();x++) {
				//La siguiente linea va a comprobar cada caracter del string//
				char caracter=s.charAt(x);
				if(caracter>='A' && caracter<='Z') mayuscula++;
				else if(caracter>='a' && caracter<='z') minuscula++;
			}
		}else {
			System.out.println("Introdujiste una frase mas de 80 carcateres");
		}
		System.out.println(mayuscula);
		System.out.println(minuscula);
		teclado.close();
		
	}

}
