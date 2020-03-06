import java.util.Locale;
import java.util.Scanner;
public class Static {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo.//
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float horainicial = sc.nextFloat();
		float horafinal = sc.nextFloat();
		var horas = (24);
		float duracao;
		duracao = horafinal - horainicial;
		float duracao2 = horas - horainicial + horafinal;
		if (horainicial < horafinal) {
			System.out.printf("O jogo durou: %.2f horas%n", duracao);
		}
		else {
			System.out.printf("O jogo durou: %.2f horas%n", duracao2);
			
		}
		
		
		sc.close();

	}

}
