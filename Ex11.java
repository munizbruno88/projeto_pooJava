package exercicios_poo;

import java.util.Scanner;

/*11. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. 
Se a área for maior que 100, exibir a mensagem “Terreno grande”.
*/

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.println("Digite o valor da base:");
		a= ler.nextInt();
		
		System.out.println("Digite o valor da altura:");
		b= ler.nextInt();
						
		area=a*b;
		
	if(area>100)
		System.out.printf("área de: %d \nTerreno Grande.", area);
	
	else	  
	 System.out.printf("Área é de: %d m2 \n",area);

	}

	

}
