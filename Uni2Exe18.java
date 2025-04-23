import java.util.Scanner;

public class Uni2Exe18 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

double azulejoestampado = 12.50;

System.out.println("Informe a largura da parede: ");
double largura = teclado.nextDouble();

System.out.println("Informe a altura da parede: ");
double altura = teclado.nextDouble();

double area = largura * altura;

double azulejos = area * 9;

double valorazulejos = azulejos * azulejoestampado;

System.out.println("A quantidade de azulejos necessária é: " + azulejos);
System.out.println("O valor total dos azulejos é: R$ " + valorazulejos);

teclado.close();

}
    
}
