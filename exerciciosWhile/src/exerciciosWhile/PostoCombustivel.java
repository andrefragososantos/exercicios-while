package exerciciosWhile;

import java.util.Scanner;

public class PostoCombustivel {
	public static void main(String[] args) {

		/*
		 * Um posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificando da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código até que seja válido. O programa
		 * será encerrado quando o código informado for o 4. Deve ser inscrita a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível.
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Os postos Ypiranga deseja saber qual o combustível você prefere? ");
		System.out.println("Digite de 1 à 4 para: ");
		System.out.printf("1. Álcool%n2. Gasolina%n3. Diesel%n4. Fim%n%n");
		System.out.print("Informe o tipo de combustível da sua preferência: ");
		int combustivel = entrada.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (combustivel != 4) {
			
			if (combustivel == 1) {
				alcool += 1;
			} else if (combustivel == 2) {
				gasolina += 1;
			} else if(combustivel == 3) {
				diesel += 1;
			} else {
				System.out.println("DÍGITO INVÁLIDO!");
			}
			System.out.print("Informe o tipo de combustível da sua preferência: ");
			combustivel = entrada.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		entrada.close();
	}

}
