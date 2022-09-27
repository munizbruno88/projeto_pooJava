package exercicios_poo;

import java.util.Scanner;

//8. Entrar via teclado, com dois valores distintos. Exibir o maior deles.
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Digite o primeiro valor:");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor:");
		n2 = ler.nextInt();
		
		if(n1>n2) {
			System.out.printf("O %d é maior",n1);
		}else {
			System.out.printf("O %d é maior",n2);
		}
	}

}
