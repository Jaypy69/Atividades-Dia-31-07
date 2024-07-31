package LPAlore;
import java.util.Scanner;
public class Lpaaula62 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int A=0, B=0;
	try {
	System.out.print("Informe o primeiro valor: ");
	A = ler.nextInt();
	System.out.print("Informe o segundo valor: ");
	B = ler.nextInt();
	}
	catch (Exception erro) {
	System.out.println("Coloque um valor do tipo inteiro");
	System.exit(0);
	}
    System.out.println("Resultados");
	System.out.println("Soma: " +(A + B));
	System.out.println("Subtração: " +(A - B));
	System.out.println("Divisão: " + (A / B));
	System.out.println("Multiplicação: " +(A * B));
	System.out.println("Divisão inteira: " +(A % B));
	System.out.println("Divisão exato: " + ((double) A / B));
	ler.close();
	}
}