
public class Ex01 {

//	public static void main(String[] args) {
//		int x = 10;
//		int z = 15;
//		imprimir(x , z);
//	}
//
//	public static void imprimir(int x , int z) {
//		int resultado = x + z;
//		System.out.println(resultado);
//	}
	
	public static void main(String[] args) {
		int x = 10;
		int z = 15;
		int resultado = imprimir(x , z);
		System.out.println(resultado);
	}

	public static int imprimir(int x , int z) {
		int resultado = x + z;
		return resultado;
	}
}
