import java.util.Random;

public class Exercicio06 {
	public static void main(String[] args) {

		int x[][] = new int[3][3];
		preencher(x);
		exibir(x);
		maior(x);
		
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
	private Object Integer;
	public static int maior(int[][] x) {
		int maior = 
		
	}
}