// Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

import java.io.IOException;

import java.util.Scanner;

import java.text.DecimalFormat;
public class Main {
    
    public static void main(String[] args) throws IOException {
        
DecimalFormat df = new DecimalFormat("0.00");
Scanner input = new Scanner(System.in);
		
		int cd1, p1;
		int cd2, p2;
		double v1, v2, v;

		cd1 = input.nextInt();
		p1 = input.nextInt();
		v1 = input.nextDouble();
		cd2 = input.nextInt();
		p2 = input.nextInt();
		v2 = input.nextDouble();

		v = p1 * v1 + p2 * v2;

	System.out.println("VALOR A PAGAR: R$ " + df.format(v));

    }
}