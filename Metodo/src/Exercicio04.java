import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double a, b, c, delta;
		double[] raiz;

		System.out.println("a --> ");
		a = in.nextDouble();
		System.out.println("b --> ");
		b = in.nextDouble();
		System.out.println("c --> ");
		c = in.nextDouble();
		delta = calcularDelta(a, b, c);
		if (delta < 0) {
			System.out.println("A equação não tem raiz");
		} else {
			raiz = calcularRaiz(a, b, delta);
			System.out.println("X1 =  " + raiz[0]);
			System.out.println("X2 =  " + raiz[1]);
		}

	}

	public static double calcularDelta(double a, double b, double c) {
		double delta;
		delta = Math.pow(b, 2) - 4 * a * c;
		return delta;
	}

	public static double[] calcularRaiz(double a, double b, double delta) {
		double[] raiz = new double[2];
		raiz[0] = (-b + Math.sqrt(delta))/(2 * a);
		raiz[1] = (-b - Math.sqrt(delta))/(2 * a);
		return raiz;
	}
}