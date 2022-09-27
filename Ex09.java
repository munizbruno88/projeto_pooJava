package exercicios_poo;
//9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner ler = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Digite o primeiro valor:");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor:");
		n2 = ler.nextInt();
		
		if(n1<n2) {
			System.out.printf("O %d é menor",n1);
		}else {
			System.out.printf("O %d é menor",n2);
		}
	}

}
