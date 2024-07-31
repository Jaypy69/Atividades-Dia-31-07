package LPAlore;
import java.util.ArrayList;
import java.util.Scanner;
public class Lpaaula60 {

	public static void main(String[] args) {
		ArrayList<Integer> numero = new ArrayList<>();
	    
		Scanner ler = new Scanner(System.in);
		System.out.println("Coloque o valor de 0 para sair: ");
		
		int soma = 0, i=1;
		while(i!=0) {
		System.out.println("Coloque o valor para ser somado: ");
		i=ler.nextInt();
		numero.add(i);
		}
		for(int N: numero) {
		soma = soma + N;	
		if (N % 2 == 0) {
		System.out.println(N);
		}
		System.out.println("Lista é :" + numero);
		System.out.println("O resultado da soma é :" + soma);
		}
	}

	}


