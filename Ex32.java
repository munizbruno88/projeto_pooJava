package exercicios_poo;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Digite o primeiro valor");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor");
		n2 = ler.nextInt();
		
		while(n1>n2) {
		System.out.println("Digite o segundo valor novamente");
		n2 = ler.nextInt();
		}
		
		System.out.printf("O primeiro valor digitado: %d\nO segundo valor digitado: %d",n1,n2);
	}

}
