package exercicios_poo;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma = 0, ant = 0;
		for(int x = 1; x <= 100; x++) {
			soma = x + ant;
			System.out.printf("\n%d + %d = %d",x, ant, soma);
			ant = soma;
		}
		System.out.printf("\nA A Soma dos intervalos entre 1 e 100 é = %d", soma);
	}

}
