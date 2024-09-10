import java.util.Random;

public class Exercicio02 {
	public static void main(String[] args) {

		Random rd = new Random();
		int[][] x = new int[10][10];
		int maior = 0;
		int rep = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = rd.nextInt(25);
				System.out.print(x[i][j] + "\t");
				if (x[i][j] > maior) {
					
					maior = x[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("maior = " + maior);
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				if (x[i][j] == maior) {
					rep ++;
					System.out.print("[" + i + "," + j + "]");
					
					
				}
			}
		}
		System.out.print("\nrepetiu " + rep + "vezes");

	}
}
