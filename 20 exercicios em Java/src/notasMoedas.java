// Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

import java.io.IOException;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        double dinheiroTotal = input.nextDouble();
        
        int nota = (int) dinheiroTotal;
        int moeda = (int) ((dinheiroTotal - nota) * 100);
        
        int notas100 = nota / 100;
        nota -= notas100 * 100;
        
        int notas50 = nota / 50;
        nota -= notas50 * 50;
        
        int notas20 = nota / 20;
        nota -= notas20 * 20;
        
        int notas10 = nota / 10;
        nota -= notas10 * 10;
        
        int notas5 = nota / 5;
        nota -= notas5 * 5;
        
        int notas2 = nota / 2;
        nota -= notas2 * 2;
        
        int moedas1 = nota;
        nota -= moedas1 * 1;
        
        int moedas50 = moeda / 50;
        moeda -= moedas50 * 50;
        
        int moedas25 = moeda / 25;
        moeda -= moedas25 * 25;
        
        int moedas10 = moeda / 10;
        moeda -= moedas10 * 10;
        
        int moedas05 = moeda / 5;
        moeda -= moedas05 * 5;
        
        int moedas01 = moeda;
        
        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");
    }
	
}