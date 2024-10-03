import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int cidade;

        System.out.println("Ordem da matriz: ");
        cidade = in.nextInt();

        int[][] tempo =  new int[cidade][cidade];

        for (int i = 0; i < cidade - 1; i++) {
            for (int j = 1 + i; j < cidade; j++) {

                tempo[i][j] = rd.nextInt(1, 20);
                tempo[j][i] = tempo[i][j];
            }

        }

        for (int i = 0; i < cidade; i++) {
            for (int j = 0; j < cidade; j++) {

                System.out.print(tempo[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("cidade de origem: ");
        int origem = in.nextInt();
        System.out.println("cidade de destino: ");
        int destino = in.nextInt();
        System.out.println("Tempo=  " + tempo[origem - 1][destino - 1]);

        System.out.println("cidade de origem: ");
        origem = in.nextInt();
        System.out.println("cidade de destino: ");
        destino = in.nextInt();
        System.out.println("cidade de parada: ");
        int parada = in.nextInt();

        int total = tempo[origem - 1][destino - 1] + tempo[parada - 1][destino - 1];
        System.out.println("Tempo=  " + tempo[origem - 1][destino - 1]);



    }
}
