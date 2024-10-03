import java.util.Random;
import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int ordem;
        int cont = 1;

        System.out.println("Ordem da matriz: ");
        ordem = in.nextInt();

        int[][] x = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
//                x[i][j] = rd.nextInt(1, 11);
                x[i][j] = cont;
                cont++;
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = ordem - 1; i >= 0 ; i--) {
            for (int j = ordem - 1; j >= 0 ; j--) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }


    }
}

