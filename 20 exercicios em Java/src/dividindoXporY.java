// Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    for (int i = 0; i < n; i++) {
        
      double x = input.nextDouble();
      double y = input.nextDouble();
     
      if (y == 0) {
        System.out.println("divisao impossivel");
      } 
      
      else {
        System.out.printf("%.1f\n", (double)(x/y));
      }
    }}}