package exercicios_poo;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int valor;
		System.out.println("Digite um valor qualquer:");
		valor = ler.nextInt();
		
		while(valor<=0){
		System.out.println("Valor inválido, digite um valor positivo");
		valor = ler.nextInt();
		break;
		
		};
		for(int i=1;i<=10;i++) {
			System.out.printf("\n%d X %d = %d", i,valor, (i*valor));
		}
	}

}
