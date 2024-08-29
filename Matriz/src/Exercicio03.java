import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio03 {
	public static void main(String[] args) {

		Random rd = new Random();
		DecimalFormat mascara = new DecimalFormat("#,##0.00");
		double[][] temperatura = new double[4][6];
		double[] mediaAnual = new double[temperatura.length];
		double media = 0;
		

		for (int i = 0; i < temperatura.length; i++) {
			for (int j = 0; j < temperatura[i].length; j++) {
				temperatura[i][j] = rd.nextDouble(5, 36);
				System.out.print(mascara.format(temperatura[i][j]) + "\t");
				media += temperatura[i][j];
				
			}
			mediaAnual[i] = media / temperatura[i].length;
			System.out.println();
		}
		System.out.println();
		for (double t : mediaAnual) {
			System.out.println(mascara.format(t));
		}
	}
}
