import java.util.Scanner;

public class Uni2Exe05 { 
public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

System.out.println("Digite o número A");
float nA = teclado.nextFloat();

System.out.println("Digite o número B");
float nB = teclado.nextFloat();

System.out.println("Digite o valor C");
float nC = teclado.nextFloat();

System.out.println("Digite o valor D");
float nD = teclado.nextFloat();

System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + ((nA*nB)-(nC*nD)));

teclado.close();



}
    
}
