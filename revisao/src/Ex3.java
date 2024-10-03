import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ordem;
        int cont = 1;

        System.out.println("Ordem da matriz: ");
        ordem = in.nextInt();

        int[][] x = new int[ordem][ordem];
        lerDados(x);
        imprimir(x);
        somar(x);


        System.out.println("'s' para soma ou 'm' para média ---> ");

    }

    public static void lerDados(int[][] x) {

    }
    public static void imprimir(int[][] x) {

    }

    private static int somar(int[][] x) {
        int total = 0;
        for (int i = 0; i < (x.length -1) / 2; i++) {
            for (int j = 1 + i; j < x.length - 1 - i; j++) {

            }
        }

        return total;
    }
}
