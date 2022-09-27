package exercicios_poo;

import java.util.Scanner;

//13. Entrar via teclado com três valores distintos. Exibir o maior deles.
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int vl1,vl2,vl3;
		
		System.out.println("Digite um valor:");
		vl1 = ler.nextInt();
		
		System.out.println("Digite um valor:");
		vl2 = ler.nextInt();
		
		System.out.println("Digite um valor:");
		vl3 = ler.nextInt();
		
		if(vl1>vl2) {
		if(vl1>vl3) {
				System.out.printf("O maior numero é: %d.", vl1);
			}else {
				System.out.printf("O maior numero é: %d.", vl3);
			}}
		
		else if(vl2>vl3) 
			System.out.printf("O maior numero é: %d.", vl2);
		else {
			System.out.printf("O maior numero é: %d.", vl3);
		}
	}

}
