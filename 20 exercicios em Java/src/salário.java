// Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.io.IOException;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	    
        Scanner input = new Scanner(System.in);
        
        int funcionarios = input.nextInt();
        int horas = input.nextInt();
        
        double valorHora = input.nextDouble();
        double salario = horas * valorHora;
        
        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
    }}
	