package exercicios_poo;

import java.util.Scanner;

//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.println("Digite a base do retangulo:");
		base = ler.nextDouble();
		
		System.out.println("Digite a altura do triangulo");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		System.out.println("A area do triangulo é: "+area);
	
	}

}
