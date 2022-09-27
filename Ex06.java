package exercicios_poo;

import java.util.Scanner;

/*6. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. 
 * Calcular e exibir o valor correspondente em Reais (R$).*/
 
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double dolarAtual, seuDolar,calc;
		
		System.out.println("Digite a cotação atual do dólar: ");
		dolarAtual = ler.nextDouble();
		
		System.out.println("Digite o valor em dólar que deseja converter para o Real");
		seuDolar = ler.nextDouble();
		
		calc = dolarAtual*seuDolar;
		
		System.out.printf("Voce possui %.2f reais",calc);
		}

}
