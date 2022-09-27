package exercicios_poo;

import java.util.Scanner;

//3. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double a, b, area;
		
		System.out.println("Digite o valor da base do triângulo:");
				a= ler.nextDouble();
		
		System.out.println("Digite o valor da altura do triângulo:");
				b= ler.nextDouble();
						
		area=(a*b)/2;
		
	System.out.println("A area do triângulo é: "+area);
		
	}

}
