import java.util.Scanner;

public class MetodiEs3 {
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static int pariDispari(int numero) {
        return (numero % 2 == 0) ? 0 : 1;
    }

    public static double areaTriangolo(double lato1, double lato2, double lato3) {
        double s = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(s * (s - lato1) * (s - lato2) * (s - lato3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci il primo lato del rettangolo: ");
        double lato1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo lato del rettangolo: ");
        double lato2 = scanner.nextDouble();

        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Perimetro del rettangolo: " + perimetro);


        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        int risultato = pariDispari(numero);
        System.out.println("Risultato (0 = pari, 1 = dispari): " + risultato);


        System.out.print("Inserisci il primo lato del triangolo: ");
        double t1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo lato del triangolo: ");
        double t2 = scanner.nextDouble();

        System.out.print("Inserisci il terzo lato del triangolo: ");
        double t3 = scanner.nextDouble();

        double area = areaTriangolo(t1, t2, t3);
        System.out.println("Area del triangolo: " + area);
    }
}
