

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=0;
		int acumulador=1;
		int conservador;
		System.out.println(n);
		System.out.println(acumulador);
		while (acumulador < 1600) {
			conservador= acumulador;
			acumulador+= n;
			System.out.println(acumulador);
			n=conservador;
	}
	}
}
