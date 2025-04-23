import java.util.Scanner;

public class Uni2Exe20 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);


        // Lendo o número de dobras (sempre par)
        System.out.print("Digite o número de dobras: ");
        int N = teclado.nextInt();

        // Calcula o número de quadrados visíveis após desdobrar
        int quadrados = (int) Math.pow(4, N / 2);


        System.out.println("Número de quadrados visíveis: " + quadrados);

        teclado.close();
    }
}