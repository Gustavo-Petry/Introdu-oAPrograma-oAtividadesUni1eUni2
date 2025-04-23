import java.util.Scanner;

public class Uni2Exe06 {public static void main(String[] args) {
    

Scanner teclado = new Scanner(System.in);

System.out.println("Informe o seu cadastro");
int cadastro = teclado.nextInt();

System.out.println("Quantas horas você trabalhou por dia?");
int horas = teclado.nextInt();

System.out.println("Quanto você ganha por hora?");
double valorHora = teclado.nextDouble();

System.err.println("Quantos dias você trabalhou no mês?");
int dias = teclado.nextInt();

double salario = (horas * dias) * valorHora;

System.out.println("O salário do funcionário com o cadastro " + cadastro + " é de R$" + (salario));


teclado.close();






}
    
}
