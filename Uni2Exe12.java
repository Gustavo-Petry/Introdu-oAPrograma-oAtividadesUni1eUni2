import java.util.Scanner;

public class Uni2Exe12 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

System.out.println("Informe o valor do eixo x1 do ponto A");
double x1 = teclado.nextDouble();

System.out.println("Informe o valor do eixo y1 do ponto A");
double y1 = teclado.nextDouble();

System.out.println("Informe o valor do eixo x2 do ponto B");
double x2 = teclado.nextDouble();

System.out.println("Informe o valor do eixo y2 do ponto B");
double y2 = teclado.nextDouble();

double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


// O %.2f é um especificador de formato que indica que um número de ponto flutuante (float ou double)
// será inserido na string, formatado com duas casas decimais. O %n é um especificador de formato para uma nova linha.

System.out.printf("A distância entre os pontos A e B é de %.2f%n", distancia);


teclado.close();


}
    
}
