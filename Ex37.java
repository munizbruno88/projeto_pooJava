package exercicios_poo;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int a,b;
		for(a = 1; a <= 20; a++) {
			System.out.printf("\nTabuada do %d", a);
			for(b = 1; b <= 10; b++) {
				System.out.printf("\n%d X %d = %d", b, a, (b*a));
			}
		System.out.println("\n Continuar");
		ler.nextLine();

	}

}
	
}