
 import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Ler um valor N. Calcular e escrever seu respectivo fatorial.
		//Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		//Lembrando que, por definição, fatorial de 0 é 1
		
		Scanner sc = new Scanner(System.in);
       
		int n = sc.nextInt();
		int fatorial = 1;
		for (int i = 0; i < n; i++) {
			fatorial = fatorial * (n-i);
		}
		System.out.println(fat);
		sc.close();
	}
}
