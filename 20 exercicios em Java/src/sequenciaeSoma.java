// Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

import java.io.IOException;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner input= new Scanner(System.in);
    	
    	int M = input.nextInt();
    	int N = input.nextInt();
    	
    	int soma=0;
    	while (M > 0 && N > 0) {
    		
    		if (M > N) {
    		    
        		for (int i = N; i <= M; i++) {
        			soma += i;
        			System.out.print(i + " ");
        		}
    		} 
    		else {
        		for (int i = M; i <= N; i++) {
        			soma += i;
        			System.out.print(i + " ");
        		}
    		}

    		System.out.println("Sum=" + soma);
        	M = input.nextInt();
        	N = input.nextInt();
        	soma = 0;
    	}
    }
	
}