import java.util.Scanner;

public class Uni2Exe19 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

System.out.println("Informe o valor de B:");
int B = teclado.nextInt();

System.out.println("Informe o valor de C:");
int C = teclado.nextInt();

int D = C;
System.out.println("O valor de D é quivalente a C: " + D);


int A = B;
System.out.println("O valor de A é: " + A);

teclado.close();



}
    
}
