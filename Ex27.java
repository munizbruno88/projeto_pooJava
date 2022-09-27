package exercicios_poo;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int valor, resultado;
		
		System.out.printf("Digite um valor: ");
		valor = ler.nextInt();
		
		if(valor%2==0) {
			resultado = valor+5;
			System.out.printf("Resultado: %d", resultado);
		}else {
			resultado = valor+8;
			System.out.printf("Resultado: %d", resultado);
		}
	}

}