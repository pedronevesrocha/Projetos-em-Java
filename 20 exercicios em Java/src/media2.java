// Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

import java.io.IOException;
import java.util.Scanner;
 
 
public class Main {

public static void main(String[] args) throws IOException {

 Scanner input = new Scanner(System.in);
    
    double A, B, C;
    double Pa, Pb, Pc, Pt;
    double M;
    
    Pa = 2.0;
    Pb = 3.0;
    Pc = 5.0;
    Pt = Pa + Pb + Pc;
   
    A = input.nextDouble();
    B = input.nextDouble();
    C = input.nextDouble();
    
    M = (A*Pa + B*Pb + C*Pc) / Pt;
    
    
    System.out.printf("MEDIA = %.1f\n", M);
    input.close();
    

   

}
}