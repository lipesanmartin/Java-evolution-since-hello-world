
public class TesteFor2 {

	public static void main(String[] args) {
		int numero = 1;
		if (10 < numero || numero < 1) {
			System.out.println("Número fora do intervalo permitido.");
		} else {
			for (int i = 1; i <= 10; i++) {
				int tabuada = numero * i;
				System.out.println(tabuada);
			}
		}

	}
}
