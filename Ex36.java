package exercicios_poo;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int x,a,b;
		
		System.out.println("Digite um valor qualquer:");
		x = ler.nextInt();
		
		while(x<=0) {
			System.out.println("Valor inválido, digite um valor positivo:");
			x = ler.nextInt();
			break;
		}
		
		System.out.println("Digite o valor inicial da tabuada:");
		a = ler.nextInt();
		
		System.out.println("Digite o valor final da tabuada:");
		b = ler.nextInt();
		
		while(b<a) {
			System.out.println("Digite o valor final da tabuada:");
			b = ler.nextInt();
		}
		for(; b >= a; b--) {
			System.out.printf("\n%d X %d = %d", b, x, (b*x));
		}
		
	}

}
