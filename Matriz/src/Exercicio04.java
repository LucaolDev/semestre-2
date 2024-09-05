import java.util.Random;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		String[] categoria = {"eletronicos", "roupas", "alimentos"};
		String[] mes = {"Jan", " Fev", "Mar"};
		int[][] venda = new int[categoria.length][mes.length];
		int total;
		
		for (int i = 0; i < venda.length; i++) {
			for (int j = 0; j < venda[i].length; j++) {
				venda[i][j] = rd.nextInt(20);
				System.out.print(venda[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < venda.length; i++) {
			total = 0;
			for (int j = 0; j < mes.length; j++) {
				total += venda[i][j];
			}
			System.out.println("categoria: " + categoria[i]);
			System.out.println("total = " + total);
		}
	}
}
