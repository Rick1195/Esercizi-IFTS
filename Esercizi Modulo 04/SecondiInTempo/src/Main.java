import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secDays = 86400;
        int secHours = 3600;
        int secMinutes = 60;

        System.out.println("Inserire il numero di secondi:");
        int seconds = input.nextInt();

        int days = seconds / secDays;
        seconds = seconds - (days * secDays);
        int hours = seconds / secHours;
        seconds = seconds - (hours * secHours);
        int minutes = seconds / secMinutes;
        seconds = seconds - (minutes * secMinutes);

        System.out.println("Il tempo è: " + days + " giorni, " + hours + " ore, " + minutes + " minuti e  " + seconds + " secondi");
    }
}