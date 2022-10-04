// Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int soma;
		
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		soma = a + b;
		
		System.out.println("SOMA = " + soma);

	}

}