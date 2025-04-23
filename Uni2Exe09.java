import java.util.Scanner;

public class Uni2Exe09 { public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Olá! Tudo bem?");
    System.out.println("A cotação do dolar no moemto é de: R$5,37");
    System.out.println("Quantos dolares você quer converter para reais?");
    double dolares = teclado.nextDouble();

    double reais = dolares * 5.37;

    System.out.println("O valor de " + dolares + " dolares em reais é de R$" + reais);

    teclado.close();




}
    
}
