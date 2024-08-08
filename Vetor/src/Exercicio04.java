import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
						"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
		double[] temp = new double[12];
		int media = 0;
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Temperatura média de " +mes[i] + " " );
			temp[i] = in.nextDouble();
			media += temp[i];
			
		}
		
		media /= temp.length;
		System.out.println("média anual = " + media);
		
		System.out.println();
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] > media) {
				System.out.println(temp[i] + " ---> " + mes[i]);
			}
		}
		
	}
}
