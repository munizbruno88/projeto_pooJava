package exercicios_poo;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		double P1, P2, media;
		
		System.out.printf("Digite a nota da P1: ");
		P1 = ler.nextDouble();
		
		System.out.printf("Digite a nota da P2: ");
		P2 = ler.nextDouble();
		
		media = (P1 + (2*P2))/3;
		
		if(media>=5) 
			System.out.printf("Sua media e de %.2f. Você foi APROVADO.", media);
		else 
			System.out.printf("Sua media e de %.2f. Você foi REPROVADO.", media);
		
		
	}

}