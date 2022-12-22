import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserire base triangolo:");
        int triangleBase = sc.nextInt();
        System.out.println("Inserire altezza triangolo:");
        int triangleHeight = sc.nextInt();
        int Ptriangle = triangleBase * 3;
        int Atriangle = (triangleBase * triangleHeight) / 2;

        System.out.println("Inserire base rettangolo:");
        int rectBase = sc.nextInt();
        System.out.println("Inserire altezza rettangolo:");
        int rectHeight = sc.nextInt();
        int Prect = 2 * (rectBase + rectHeight);
        int Arect = rectBase * rectHeight;

        System.out.println("Inserire lato quadrato:");
        int squareSide = sc.nextInt();
        int Psquare = squareSide * 4;
        int Asquare = squareSide * squareSide;

        System.out.println("Inserire raggio cerchio");
        int CircleRadius = sc.nextInt();
        double Pcircle = CircleRadius * 3.14 * 2;
        double Acircle = CircleRadius * CircleRadius * 3.14;

        sc.close();

        System.out.println("Triangolo: perimetro " + Ptriangle + " e area " + Atriangle );
        System.out.println("Rettangolo: perimetro " + Prect + " e area " + Arect );
        System.out.println("Quadrato: perimetro " + Psquare + " e area " + Asquare );
        System.out.println("Cerchio: perimetro " + Pcircle + " e area " + Acircle );
    }
}