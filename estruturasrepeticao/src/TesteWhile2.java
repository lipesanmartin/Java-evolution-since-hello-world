
public class TesteWhile2 {

	public static void main(String[] args) {
		int numero = 7;
		if (numero > 10 || numero < 1) {
			System.out.println("Número fora do intervalo permitido.");
		} else {
			int a = 1;
			while (a <= 10) {
				int tabuada = numero * a;
				System.out.println(tabuada);
				a++;
			}
		}
	}

}
