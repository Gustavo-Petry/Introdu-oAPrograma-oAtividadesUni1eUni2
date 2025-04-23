import java.util.Scanner;

public class Uni2Exe08 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

System.out.println("Informe o código de barras do primeiro produto");
int codigo1 = teclado.nextInt();

System.out.println("Informe a quantidade");
int quantidade = teclado.nextInt();       

System.out.println("Informe o valor");
double valor = teclado.nextDouble();

System.out.println("Informe o código de barras do segundo produto");
int codigo2 = teclado.nextInt();

System.out.println("Informe a quantidade");
int quantidade2 = teclado.nextInt();

System.out.println("Informe o valor");
double valor2 = teclado.nextDouble();

double total = (quantidade * valor) + (quantidade2 * valor2);

System.out.println("O valor total da compra é de R$" + total);

teclado.close();






}
    
}
