package LPAlore;
import java.util.ArrayList;
import java.util.Scanner;
public class Lpaaula63 {

	public static void main(String[] args) {
	ArrayList<String> nomes = new ArrayList<>();
	try{
	nomes.add("Alice");
	nomes.add("Bob");
	nomes.add("Charlie");
	System.out.println("Nome: " + nomes.get(4));
	}
    catch (Exception erro) {
    System.out.println("Informe um valor adequado ou ");
    System.out.println("Indique o índice corretamente ");
    }
	}
}
