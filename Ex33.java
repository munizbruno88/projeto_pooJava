package exercicios_poo;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		char sexo;
		sx:
		System.out.println("Informe o sexo do usuario cadastrado:");
		sexo = ler.next().charAt(0);
		
		while(sexo !='M' && sexo !='F') {
			System.out.printf("Informação inválida!\n\nDigite M para masculino, e F para feminino\n\n");
			System.out.println("Informe o sexo do usuario cadastrado:");
			sexo = ler.next().charAt(0);
			
			
		}
		
		System.out.println("Sexo do usuario cadastrado: ");
	}
}
