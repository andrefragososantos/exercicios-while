package exerciciosWhile;

import java.util.Scanner;

public class Quadrante {
	public static void main(String[] args) {
		
		/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
		 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando
		 * pelo menos uma das coordenadas for NULA(nesta situação sem escrever coisa alguma).
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor de X no plano cartesiano: ");
		int x = entrada.nextInt();
		System.out.print("Informe o valor de Y no plano cartesiano: ");
		int y = entrada.nextInt();
		
		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			
			System.out.print("Informe o valor de X no plano cartesiano: ");
			 x = entrada.nextInt();
			System.out.print("Informe o valor de Y no plano cartesiano: ");
			 y = entrada.nextInt();
			
		}
		entrada.close();
	}

}
