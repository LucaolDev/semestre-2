import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

import javax.naming.ldap.Rdn;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[][] x = new int[4][4];
		Random rd =  new Random();
		int soma = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = rd.nextInt();

			}
		}
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
				
			}
			System.out.println();
		}
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				if (i == j) {
					soma = x[i][j];
				}
			}
		}
		System.out.println("DP: " + soma);
		soma = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				
			}
		}

	}
}
