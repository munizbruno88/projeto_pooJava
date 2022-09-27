package exercicios_poo;

public class Ex39 {

		public static void main(String[] args) {
			int soma, n1 = 1, n2 = 0;
			System.out.printf("Sequência de Finonacci (Os 30 primeiros valores).\n ");
			for(int x = 0; x < 30; x++) {
				soma = n1 + n2;
				
				System.out.printf("\n%d", n1);
				n2 = n1;
				n1 = soma;

		}

	}
}
