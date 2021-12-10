import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class EV1_Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m=0,d=0,a=0,semana;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un dia");
		m=teclado.nextInt();
		System.out.println("Introduce un mes");
		d=teclado.nextInt();
		System.out.println("Introduce un año");
		a=teclado.nextInt();
		if ( m <= 2 ) {
			m = m+12;
			a = a-1;
			}
			semana = ((d+2*m+3*(m+1)/5+a+a/4-a/100+a/400+2)%7);
			System.out.println(semana+" "+d+" "+m+" "+a);
	}

}
