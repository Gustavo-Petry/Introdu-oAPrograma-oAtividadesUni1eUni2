import java.util.Scanner;

public class Uni2Exe14 { public static void main(String[] args) {
    
            Scanner teclado = new Scanner(System.in);
    
            // Lendo o valor inteiro
            System.out.print("Digite um valor inteiro: ");
            int valor = teclado.nextInt();
            int restante = valor;
    
            // Definição das notas disponíveis
            int[] notas = {100, 50, 20, 10, 5, 2, 1};
    
            System.out.println("Valor lido: " + valor);
    
            // Cálculo das notas necessárias
            for (int nota : notas) {
                int qtdNotas = restante / nota;
                restante %= nota;
                System.out.println(qtdNotas + " nota(s) de R$ " + nota);
            }
    
            teclado.close();
        }
    }
    
