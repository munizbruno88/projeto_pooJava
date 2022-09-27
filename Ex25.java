package exercicios_poo;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.printf("Digite um valor: ");
		valor = ler.nextInt();
		
		if(valor%2==0) {
			System.out.printf("O valor digitado e par! ");
		}else {
			System.out.printf("O valor digitado e ímpar! ");
		}
	}

}
