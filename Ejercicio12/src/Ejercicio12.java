import java.util.Scanner;

/**
 * Programa que despliega un menu y te permite elegir una figura
 * Una vez elegida la opcion quenos pida los datos necesarios
 * para calcular su area y la muestre
 */

/**
 * @author Ivan Vicente y Joaquin Coma
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int figura, base, altura;
		System.out.println("Elige una opcion:");
		System.out.print("Opcion 1: Cuadrado /");
		System.out.print(" Opcion 2: Rectangulo /");
		System.out.print(" Opcion 3: Triangulo /");
		figura=teclado.nextInt();
		switch (figura) {
		case 1:
			System.out.println("Has elegido cuadrado");
			System.out.println("Para calcular el area del cuadrado introduce la longitud de uno de sus lados");
			base=teclado.nextInt();
			int areacuadrado= base*base;
			System.out.println("El area del cuadrado es: "+ areacuadrado);
			break;
		case 2:
			System.out.println("Has elegido rectangulo");
			System.out.println("Para calcular el area del rectangulo introduce la longitud de su base y de su altura");
			System.out.println("Introduce la altura: ");
			altura=teclado.nextInt();
			System.out.println("Introduce la base: ");
			base=teclado.nextInt();
			int arearectangulo=altura*base;
			System.out.println("El area del rectangulo es: "+arearectangulo);
			break;
		case 3:
			System.out.println("Has elegido triangulo");
			System.out.println("Para calcular el area del triangulo introduce la longitud de su base y de su altura");
			System.out.println("Introduce la altura: ");
			altura=teclado.nextInt();
			System.out.println("Introduce la base: ");
			base=teclado.nextInt();
			int areatriangulo=altura*base /2;
			System.out.println("El area del rectangulo es: "+ areatriangulo);
			break;
		default:
			System.out.println(figura+" No es una opcion valida");
		teclado.close();
		}
	}

}
