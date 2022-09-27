package exercicios_poo;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int vlPositivo;
		
		do{
			System.out.println("Digite um valor positivo:");
			vlPositivo = ler.nextInt();
			
		}while(vlPositivo < 0);
			
		System.out.println("O valor digitado é: "+vlPositivo);
	}

}
