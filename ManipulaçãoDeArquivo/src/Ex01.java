
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		FileReader file;
		BufferedReader buffer;
		String linha;
		
		file = new FileReader("D:\\teste.txt");
		buffer = new BufferedReader(file);
		while((linha = buffer.readLine()) != null) {
			System.out.println(linha);
		}
		buffer.close();
	}
}
