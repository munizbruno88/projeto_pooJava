package exercicios_poo;
/*
 * 15. A partir de três valores que serão digitados, verificar se formam ou não um triângulo. 
 * Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. 
 * Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e 
 * o eqüilátero, todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados 
 * quaisquer seja maior que o outro, isto, para os três lados
 */
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner ler = new Scanner(System.in);
			
			int a, b, c;
			
			System.out.println("Digite o valor do primeiro lado do triângulo: ");
			a = ler.nextInt();
			
			System.out.println("Digite o valor do segundo lado do triângulo: ");
			b = ler.nextInt();
			
			System.out.println("Digite o valor do terceiro lado do triângulo: ");
			c = ler.nextInt();
			
			if(a+b>c || b+c>a || c+a>b) {
				if(a==b && b==c) {
					System.out.printf("Os tres valores digitados formam um triangulo equilatero.");
				}else if(a==b || b==c || c==a) {
					System.out.printf("Os tres valores digitados formam um triangulo isosceles.");
				}else {
					System.out.printf("Os tres  valores digitados formam um triangulo escaleno.");
				}
			}else {
				System.out.printf("Os tres valores digitados não formam um triangulo.");
			}
		}

	}