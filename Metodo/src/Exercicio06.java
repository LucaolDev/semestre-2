import java.util.Random;

public class Exercicio06 {
	public static void main(String[] args) {

		int x[][] = new int[3][3];
		int maior[];
		preencher(x);
		exibir(x);
		maior = maior(x);
		exibir(maior);
		
	}

	public static void preencher(int x[][]) {
		Random rd = new Random();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = rd.nextInt(1, 100);
			}
		}
	}
	public static void exibir(int x[][]) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	public static int[] maior(int x[][]) {
		int maior[] = new int [x.length];
		for (int i = 0; i < x.length; i++) {
			maior[i] = Integer.MIN_VALUE ;
			for (int j = 0; j < x.length; j++) {
				if (x[i][j] > maior[i]) {
					maior[i] = x[i][j];
				}

			}
		}
		return maior;
	}
	public static void exibir(int[] x) {
		System.out.println();
		for (int i : x) {
			System.out.print(i + "\t");

		}

	}
}