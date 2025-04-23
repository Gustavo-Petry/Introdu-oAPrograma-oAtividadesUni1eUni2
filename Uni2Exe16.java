import java.util.Scanner;

public class Uni2Exe16 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

System.out.print("Olá somos a Petry bebidas! Temos as seguintes opções de bebidas: \n");
System.out.print("1 - Refrigerante lata 350ml \n");
System.out.print("2 - Refrigerante garrafa 600ml \n");
System.out.print("3 - Refrigerante litrão 2L \n");

System.out.print("Digite a quantidade de Refrigerante lata 350ml: ");
int qtdLata = teclado.nextInt();


System.out.print("Digite a quantidade de Refrigerante garrafa 600ml: ");
int qtdGarrafa = teclado.nextInt();

System.out.print("Digite a quantidade de Refrigerante litrão 2L: ");
int qtdLitrao = teclado.nextInt();

float lataml = qtdLata * 0.350f;
float garrafa600ml = qtdGarrafa * 0.600f;
float litrao2L = qtdLitrao * 2;

float total = lataml + garrafa600ml + litrao2L;

System.out.println("O total de litros de refrigerante é: " + total + "L");

teclado.close();


}
    
}
