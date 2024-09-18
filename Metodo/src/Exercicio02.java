import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		double l1, l2, l3;
		Scanner in = new Scanner(System.in);

		System.out.println("Lado 1 ---> ");
		l1 = in.nextDouble();
		System.out.println("Lado 2 ---> ");
		l2 = in.nextDouble();
		System.out.println("Lado 3 ---> ");
		l3 = in.nextDouble();

		if (validar(l1, l2, l3)) {
			classificar(l1, l2, l3);

		} else {
			System.out.println("Os valores não formam um triangulo");
		}
	}

	public static boolean validar(double l1, double l2, double l3) {
		return (l1 < l2 + l3 && l1 < l3 + l2 && l2 < l3 + l1);
	}

	public static void classificar(double l1, double l2, double l3) {
		if (l1 == l2 && l2 == l3) {
			System.out.println("Triangulo equilatero");
		} else if (l1 == l2 || l1 == l3 || l2 == l3) {
			System.out.println("Triangulo isosceles");
		} else {
			System.out.println("Triangulo escaleno");
		}

	}
}
