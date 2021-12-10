import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ivan Vicente
 *
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1=0;
		int n2=0;
		int suma1=0;
		int suma2=0;
		do {
			System.out.println("Introduce numeros");
			Scanner teclado=new Scanner(System.in);
			n1=teclado.nextInt();
			n2=teclado.nextInt();
			if (n1>0 && n2>0);
			suma1+=n1;
			suma2+=n2;
			System.out.println("La suma de los numeros introducidos en primer lugar es: " +suma1);
			System.out.println("La suma de los numeros introducidos en segundo lugar es: " +suma2);
		}while (n1!=0 || n2!=0);
		System.out.println("Se acabo el programa");
		
			}		
}
