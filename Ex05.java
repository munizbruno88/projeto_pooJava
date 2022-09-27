package exercicios_poo;

import java.util.Scanner;

/*5. Entrar via teclado com o valor de uma temperatura em graus Celsius, 
calcular e exibir sua temperatura equivalente em Fahrenheit.*/

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double c,f;
		
		System.out.println("Digite a temperatura em Celsius");
		c = ler.nextDouble();
		
		f=(c*1.8)+32;
		
		System.out.println("A temperatura em Fahrenheit é: "+f);
	}

}
