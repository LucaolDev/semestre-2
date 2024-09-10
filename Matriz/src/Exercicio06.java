import java.util.Random;
import java.util.Scanner;


public class Exercicio06 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner in = new Scanner(System.in);

		System.out.println("Digite a quantidade de linhas e colunas");
		int linha = in.nextInt();
		int coluna = in.nextInt();
		int a[][] = new int[linha][coluna];
		int b[][] = new int[coluna][linha];

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				a[i][j] = rd.nextInt(21);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < coluna; i++) {
			for (int j = 0; j < linha; j++) {
				b[i][j] = rd.nextInt(21);
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				int c[][] = new int[linha][coluna];
				c[i][j] = a[i][j] * b[j][i];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
