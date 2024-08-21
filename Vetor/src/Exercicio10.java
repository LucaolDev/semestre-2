import java.util.Random;

public class Exercicio10 {
	public static void main(String[] args) {

		Random rd = new Random();
		int[] x = new int[rd.nextInt(5, 12)];
		int aux;

		System.out.println("antes da ordenaçâo");
		for (int i = 0; i < x.length; i++) {
			x[i] = rd.nextInt(15);
			System.out.print(x[i] + " ");
		}

		for (int j = 0; j < x.length; j++) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i + 1]) {
					aux = x[i];
					x[i] = x[i + 1];
					x[i + 1] = aux;
				}
			}
		}

		System.out.println("\ndepois da ordenaçâo");
		for (int i : x) {
			System.out.print(i + " ");
		}

	}
}
