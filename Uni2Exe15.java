import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe15 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
DecimalFormat df_2 = new DecimalFormat("0.00");


System.out.print("Digite um valor monetário com até duas casas decimais: ");

float valor = teclado.nextFloat();
float restante = valor;

float [] notas = {1f, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f};

System.out.println("Valor lido: " + df_2.format(valor));

    for (float nota : notas) {
    int qtdNotas = (int) (restante / nota);
    restante %= nota;
    System.out.println(qtdNotas + " nota(s) de R$ " + nota);

        }

        teclado.close();
    }

    }
