// Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.io.IOException;
 
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        int diferenca = a * b - c * d;
        
        System.out.println("DIFERENCA = " + diferenca);
    }}