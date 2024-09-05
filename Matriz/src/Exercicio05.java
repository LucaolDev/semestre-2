import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		
		int linha, coluna;
		Random rd = new Random();
		Scanner in = new Scanner(System.in);

		
		System.out.println("Digite quantas linhas e colunas a matris tem");
		linha = in.nextInt();
		coluna = in.nextInt();
		int[][] c = new int[linha][coluna];
		int[][] ct = new int[coluna][linha];
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				c[i][j] = rd.nextInt(20);
				System.out.print(c[i][j] + "\t");
				ct[j][i] = c[i][j];
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < coluna; i++) {
			for (int j = 0; j < linha; j++) {
				System.out.print(ct[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
