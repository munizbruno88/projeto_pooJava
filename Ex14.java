package exercicios_poo;

import java.util.Scanner;

/*
 * 14. Entrar com o peso e a altura de uma determinada pessoa.
	Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².
 */
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite a sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.printf("%.1f\n", imc);
		
		if(imc<20) {
			System.out.printf("Voce esta abaixo do peso.");
		}else if(imc<25) {
			System.out.printf("Voce esta no peso ideal.");
		} else {
			System.out.printf("Voce esta acima do peso.");
		}
	}
	}


