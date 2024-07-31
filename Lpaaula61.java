package LPAlore;
import java.util.Scanner;
public class Lpaaula61 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner leia = new Scanner (System.in);
		A = 10;
		System.out.print("Digite um número: ");
		B = leia.nextInt();
		try {
		C = A/ B;
		System.out.println("Valor de C: " + C);
		} catch (ArithmeticException erro) {
		System.out.println("Não existe divisão por zero");
		}
	}
}
	