import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il primo addendo:");
        int ad1 = input.nextInt();
        System.out.println("Inserisci il secondo addendo:");
        int ad2 = input.nextInt();

        int sum = ad1 + ad2;
        input.close();

        System.out.println("La somma è: " + sum);
    }
}