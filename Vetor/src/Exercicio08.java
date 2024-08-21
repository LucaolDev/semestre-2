import java.util.Random;

public class Exercicio08 {
	public static void main(String[] args) {

		Random rd = new Random();
		int[] x = new int[10];
		boolean status;

		for (int i = 0; i < x.length;) {
			x[i] = rd.nextInt(10);
			status = false;
			
			for (int j = 0; j < i; j++) {
				if(x[i] == x[j]) {
					status = true;
					break;
				}
			}
			if(!status) {
				System.out.println(x[i] + " ");
				i++;
			}
		}

	}
}
