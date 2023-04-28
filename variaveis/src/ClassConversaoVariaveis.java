
public class ClassConversaoVariaveis {

	public static void main(String[] args) {
		// conversao implicita de tipo
		int a = 5;
		float b = 10.5f; // 'f' serve para considerar que é float e não double
		b = a;
		// conversao explicita de tipo
		int c = (int) b; // exemplo de cast
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}

}
