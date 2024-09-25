import java.util.Random;

public class Exercicio05 {
	public static void main(String[] args) {

		int x[] = new int[10];
		preencher(x);
		exibir(x);
		inverter(x);
		exibir(x); 
	}


	public static void preencher(int x[]) {
		Random rd = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = rd.nextInt(1, 100);
		}
	}

	public static void exibir(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
	}

	public static void inverter(int[] x) {
		for (int i = 0; i < x.length / 2; i++) {
			int aux = x[i];
			x[i] = x[x.length - i - 1];
			x[x.length - i - 1] = aux;
		}
	}


}
