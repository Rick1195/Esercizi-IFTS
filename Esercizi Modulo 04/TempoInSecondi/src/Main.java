import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci i giorni:");
        int days = input.nextInt();
        System.out.println("Inserisci le ore:");
        int hours = input.nextInt();
        System.out.println("Inserisci i minuti:");
        int minutes = input.nextInt();
        System.out.println("Inserisci i secondi:");
        int seconds = input.nextInt();

        double DaysInS = days * 86400;
        double HoursInS = hours * 3600;
        double MinutesInS = minutes * 60;
        double TotS = DaysInS + HoursInS + MinutesInS + seconds;
        input.close();

        System.out.println("Il tempo totale in secondi è: " + TotS);

    }
}