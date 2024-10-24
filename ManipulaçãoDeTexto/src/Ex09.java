import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) throws IOException {
		
		String[] nome = {"Ofélia" , "Sophie", "Selmini", "Jolie"};
		
		FileWriter file;
		BufferedWriter buffer;
		
		file = new FileWriter("convidados.txt");
		buffer =  new BufferedWriter(file);
		for (String aux : nome) {
			buffer.write(aux);
			buffer.newLine();
		}
		
		buffer.close();
	}
}
