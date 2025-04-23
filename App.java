import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //soma 2 valores

        int valor1 = 4;
        int valor2 = 3;
        int total = valor1+valor2;
        System.out.println("A soma dos valores é: " + (total));


        //média float

        float nota1 = 10;
        float nota2 = 8;
        float nota3 = 7.82f; //o  F no final do número foi colocado o f de float para identificar o número quebrado     

        float totalNotas = (nota1+nota2+nota3);

        System.out.println("A média do aluno é: "+(totalNotas/3));



        //teclado imput

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a nota 1");
        float n1 = teclado.nextFloat();

        System.out.println("digite a nota 2");
        float n2 = teclado.nextFloat();

        System.out.println("digite a nota 3");
        float n3 = teclado.nextFloat();

        float media = (n1+n2+n3) / 3;

        System.out.println("A média do aluno é:" + (media));

        

        // calculando a área


        System.out.println("Vamos calcular a área!");

        System.out.println("Informe a Largura!");
        float largura = teclado.nextFloat();

        System.out.println("Informe o comprimento!");
        float comprimento = teclado.nextFloat();

        float area = (largura*comprimento);
        System.out.println("A área é:" + (area));

        teclado.close();



    }
}
