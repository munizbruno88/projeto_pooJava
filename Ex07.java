package exercicios_poo;

import java.util.Scanner;

public class Ex07 {
/*
 * 7. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um 
 * valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5, soma, pgt, troco;
		
		System.out.println("Digite o valor do produro:");
		p1 = ler.nextDouble();
		
		System.out.println("Digite o valor do produro:");
		p2 = ler.nextDouble();
		
		System.out.println("Digite o valor do produro:");
		p3 = ler.nextDouble();
		
		System.out.println("Digite o valor do produro:");
		p4 = ler.nextDouble();
		
		System.out.println("Digite o valor do produro:");
		p5 = ler.nextDouble();
		
		soma = p1 + p2 + p3 + p4 + p5;
		
		System.out.printf("O Total da compra e de: %.2f.\n", soma);
		
		do {
			System.out.printf("Digite o valor do pagamento: ");
			pgt = ler.nextDouble();
			
			if(pgt<soma) {
				System.out.println("Saldo insuficiente, tente novamente!");
			}
		}while(pgt<soma);
		
		troco = pgt - soma;
		
		System.out.printf("O troco é de : %.2f.", troco);
	}

}
