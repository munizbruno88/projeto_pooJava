package exercicios_poo;

import java.util.Scanner;

//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

public class Ex02 {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			double a, area;
			
			System.out.println("Digite o valor da aresta do quadrado: ");
			a= ler.nextDouble();
										
			area=a*a;
			
		System.out.println("A área do quadrado é: "+area);

	}

}
