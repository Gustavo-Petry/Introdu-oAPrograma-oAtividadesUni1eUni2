import java.util.Scanner;

public class Uni2Exe11 { public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o valor de A");
    double a = teclado.nextDouble();

    System.out.println("Informe o valor de B");
    double b = teclado.nextDouble();

    System.out.println("Informe o valor de C");
    double c = teclado.nextDouble();

    System.out.println("A área do traingulo retangulo é de: " + (a*c) / 2);

    System.out.println("A área do circulo é de: " + 3.14159 * Math.pow(c,2));

    System.out.println("A área do trapezio é de: " + ((a+b) * c) / 2);

    System.out.println("A área do quadrado é de: " + Math.pow(b,2));

    System.out.println("A área do retangulo é de: " + a * b);

    teclado.close();
}
    
}
