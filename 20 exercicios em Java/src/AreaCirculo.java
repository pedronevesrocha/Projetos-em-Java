// A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

//- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	double raio;
	double n = 3.14159;
	double area;
	
	Scanner input = new Scanner(System.in);
	raio = input.nextDouble();
	area = n * (raio * raio);
	
	System.out.println(String.format("A=%.4f", area));

	}

}