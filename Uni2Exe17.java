import java.util.Scanner;

public class Uni2Exe17 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

System.out.println("Informe o nome do Funcionário: ");
String nome = teclado.nextLine();

System.out.println("Informe o número de horas trabalhadas durante o mês: ");
int horas = teclado.nextInt();

System.out.println("Informe o número de dependentes: ");
int dependentes = teclado.nextInt();

float salarioHora = 10.00f;
float salariotrabalho = horas * salarioHora;


float salariodependentes = dependentes * 60.00f;

float descontosalariotrabalho = salariotrabalho * 0.135f; // 13.5% de desconto

float salariotrabalholiquido = salariotrabalho - descontosalariotrabalho;

float salarioliquido = salariotrabalholiquido + salariodependentes;

float salriobruto = salariotrabalho + salariodependentes;

System.out.println("O salário bruto do funcionário " + nome + " é: R$ " + salriobruto);
System.out.println("O salário líquido do funcionário " + nome + " é: R$ " + salarioliquido);

teclado.close();



}
    
}
