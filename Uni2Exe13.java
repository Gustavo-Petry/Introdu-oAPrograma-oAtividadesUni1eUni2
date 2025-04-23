import java.util.Scanner;

public class Uni2Exe13 { public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe a distância percorrida em km");
    int distancia = teclado.nextInt();

    int tempo = distancia * 2;

    System.out.println(" O carro Y levará " + tempo + "minutos para alcançar a distancia desejada");

    teclado.close();
    

}
    
}
