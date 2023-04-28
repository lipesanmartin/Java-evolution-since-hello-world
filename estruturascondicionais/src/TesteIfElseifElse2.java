
public class TesteIfElseifElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario_liquido;
		double imposto = 0;
		double salario = 27300.60;
		if (salario <= 2826.66) {
			System.out.println("Isento.");
		} else if (2826.66 < salario || salario <= 3751.05) {
			imposto = (salario * 0.15) - 354.80;
			System.out.println("Imposto = R$ " + imposto);
		} else if (3751.06 < salario || salario <= 4664.68) {
			imposto = (salario * 0.225) - 636.13;
			System.out.println("Imposto = R$ " + imposto);
		} else {
			imposto = (salario * 0.275) - 869.36;
			System.out.println("Imposto = R$ " + imposto);
		}
		salario_liquido = salario - imposto;
		System.out.println(salario);
		System.out.println(salario_liquido);
		System.out.println(salario_liquido>20000 ? "Salário de diretor" : "Salário de funcionário");
		
		
		
	}
	

}
