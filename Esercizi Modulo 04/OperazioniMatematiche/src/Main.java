import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il primo operatore:");
        double op1 = input.nextInt();
        System.out.println("Inserisci il secondo operatore:");
        double op2 = input.nextInt();
        double sum = op1 + op2;
        double dif = op1 - op2;
        double prd = op1 * op2;
        double div = op1 / op2;
        input.close();

        System.out.println("La somma è: " + sum);
        System.out.println("La differenza è: " + dif);
        System.out.println("Il prodotto è: " + prd);
        System.out.println("La divisione è: " + div);
    }
}