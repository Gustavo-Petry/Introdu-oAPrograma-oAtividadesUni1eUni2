import java.util.Scanner;

public class Uni2Exe04 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

System.out.println("Digite a nota 1!");
float n1 = teclado.nextFloat();

System.out.println("Digite a nota 2!");
float n2 = teclado.nextFloat();


float peson1 = (float) (n1*3.5);
float peson2 = (float) (n2*7.5);

float somapeso = (peson1+peson2);

float media = (somapeso/11);



System.out.println("A média ponderada das notas é: " + (media));

teclado.close();





}
    
}
