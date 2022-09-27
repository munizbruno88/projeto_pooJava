package exercicios_poo;

import java.util.Scanner;

public class Ex04 {
	//4. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double n1,n2,n3,n4,media;
		
		System.out.println("Digite o primeiro valor");
		n1 = ler.nextDouble();
		
		System.out.println("Digite o segundo valor");
		n2 = ler.nextDouble();
		
		System.out.println("Digite o terceiro valor");
		n3 = ler.nextDouble();
		
		System.out.println("Digite o quarto valor");
		n4 = ler.nextDouble();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("A média dos valores digitados é: "+media);
	}

}
