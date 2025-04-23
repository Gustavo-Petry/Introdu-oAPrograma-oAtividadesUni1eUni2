import java.text.DecimalFormat;
import java.util.Scanner;

public class UML {
    public static void main(String[] args) throws Exception {


         Scanner teclado = new Scanner (System.in);
         DecimalFormat df_4 = new DecimalFormat("0.0000");

         //entrada informado já!
         double pi = 3.14159;

         System.out.println("informe o valor do raio:");
         double raio = teclado.nextDouble();
        

         //processo double area = pi * raio * raio 
         double area = pi * Math.pow(raio,2);

         System.out.print("A=" + df_4.format(area));

         teclado.close();











    }
}