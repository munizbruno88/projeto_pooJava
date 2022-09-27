package exercicios_poo;

import java.util.Scanner;

/*10. Entrar com dois valores quaisquer. 
Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos
*/
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Digite o primeiro valor:");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor");
		n2 = ler.nextInt();
		
		if(n1>n2) {
				System.out.printf("O numero %d é maior",n1);
		}
		if(n2>n1) {
				System.out.printf("O numero %d é maior",n2);
		}
		if(n1==n2) {
				System.out.println("Os números são iguais");
		}
	}
	}


