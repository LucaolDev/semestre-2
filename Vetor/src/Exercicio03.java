import java.util.Iterator;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] x = new int[6];
		double[] media = new double[x.length];
		double nota; 
		int medi = 0;

		for (int i = 0; i < x.length; i++) {
			System.out.println("Aluno " + (i + 1));

			for (int j = 0; j < 4; j++) {
				System.out.println("Nota ");
				nota = in.nextDouble();
				media[i] += nota;
				
			}
			media[i] /= 4;
			if (media[i] >= 6) {
				medi++;
			}
		}
		System.out.println("Total de alunos com média maior ou igual a 6.0 = " + medi);
	}
}