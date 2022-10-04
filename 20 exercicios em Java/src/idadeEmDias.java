// Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

// Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

import java.io.IOException;
 
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int v, a, m, d;

		v = input.nextInt();

		a = v / 365;
		m = (v % 365) / 30;
		d = (v % 365) % 30;
	
		System.out.println(a + " ano(s)");
		System.out.println(m + " mes(es)");
		System.out.println(d + " dia(s)");

    }
}