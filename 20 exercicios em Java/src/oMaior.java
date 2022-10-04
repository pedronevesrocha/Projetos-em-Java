import java.io.IOException;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        
        int v1 = input.nextInt();
        int v2 = input.nextInt();
        int v3 = input.nextInt();
        
        if (v1 > v2 && v1 > v3) {
        	System.out.println(v1 + " eh o maior");
        } 
        
        else if (v2 > v3) {
        	System.out.println(v2 + " eh o maior");
        } 
        
        else {
        	System.out.println(v3 + " eh o maior");
        	} 
        
    }}