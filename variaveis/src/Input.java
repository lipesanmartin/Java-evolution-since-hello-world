import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String x;
		System.out.print("Qual o seu nome? ");
		x = sc.next();
		System.out.println("Seu nome é " + x);

		sc.close();
	}

}
