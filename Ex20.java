package exercicios_poo;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		double P1, P2, media=5;
		
		System.out.println("Digite a nota da P1: ");
		P1 = ler.nextDouble();
		
		P2=((3*media) - P1)/2;
		System.out.printf("Você precisa de %.1f  na P2 para passar. ",P2);
		
	
	}

}