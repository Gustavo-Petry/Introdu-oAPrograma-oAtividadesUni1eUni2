import java.util.Scanner;

public class Uni2Exe10 { public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);

System.out.println("Informe o tempo de duração do evento em segundos");
int tempo = teclado.nextInt();

int horas = tempo / 3600;
int minutos = (tempo % 3600) / 60;
int segundos = (tempo % 3600) % 60;



// ou pode ser     System.out.println("O evento durou " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");

System.out.printf("O evento durou %d:%02d:%02d%n", horas, minutos, segundos);


teclado.close();

}
    
}
