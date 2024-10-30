import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {

		FileReader file;
		BufferedReader buffer;
		String linha;
		String[] temp;
		double x, y, z;
		int equilatero = 0, escaleno = 0, isosceles = 0;
		int naoTrinagulo = 0;

		try {
			file = new FileReader("triangulo.txt");
			buffer = new BufferedReader(file);

			while ((linha = buffer.readLine()) != null) {
				temp = linha.split(";");
				x = Double.parseDouble(temp[0]);
				y = Double.parseDouble(temp[1]);
				z = Double.parseDouble(temp[2]);

				if (x < y + z && y < x + z && z < x + y) {
					if (x == y && y == z) {
						equilatero++;
					} else if (x == y || x == z || y == z) {
						isosceles++;
					} else {
						escaleno++;
					}
				} else {
					naoTrinagulo++;
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("erro ao abrir o arquivo");
		} catch (IOException e) {
			System.out.println("erro ao ler dados do arquivo");

		}
		System.out.println("Total de triangulos equilateros = " + equilatero);
		System.out.println("Total de triangulos isosceles = " + isosceles);
		System.out.println("Total de triangulos escalenos = " + escaleno);
		System.out.println("Total de não triangulos = " + naoTrinagulo);

	}
}
