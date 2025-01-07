package exerciciosWhile;

import java.util.Scanner;

public class Senha {
	
	public static void main(String[] args) {
		
		/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		 * incorreta informada, escrever a mensagem "SENHA INVALIDA". Quando a senha for informada corretamente 
		 * deve ser impressa a palavra "ACESSO PERMITIDO" e o algoritmo encerrado. Considere que a senha correta é
		 * o valor 2002. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua senha de 4 dígitos: ");
		int senha = entrada.nextInt();
		
		while (senha != 2002) {
			System.out.println("SENHA INVÁLIDA");
			System.out.println();
			System.out.print("Digite sua senha de 4 dígitos: ");
			senha = entrada.nextInt();
		}
		
		System.out.println("ACESSO PERMITIDO!");
		
		
		
		entrada.close();
	}

}
