import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe07 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
DecimalFormat df_2 = new DecimalFormat("0.00");

System.out.println("Informe o seu nome");
String nome = teclado.nextLine();

System.out.println("Informe o seu salario fixo");
double salarioFixo = teclado.nextDouble();

System.out.println("Informe o valor total em dinheiro realizado em vendas durante o mês");
double totalVendas = teclado.nextDouble();

double salarioFinal = salarioFixo + (totalVendas * 0.15);

System.out.println("O salário final do funcionário " + nome + " é de R$" + df_2.format (salarioFinal));


teclado.close();


}
    
}
