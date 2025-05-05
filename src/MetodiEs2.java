import java.util.Scanner;

public class MetodiEs2 {

    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci qui il tuo nome: ");
        String s1 = scanner.nextLine();
        System.out.println("Inserisci qui il tuo cognome: ");
        String s2 = scanner.nextLine();
        System.out.println("Inserisci qui il tuo paese di nascita: ");
        String s3 = scanner.nextLine();

        String concatenazioneNormale = s1 + s2 + s3;
        System.out.println("Concat Normal: "+ concatenazioneNormale);
        String concatenzioneInversa = s3 + s2 + s1;
        System.out.println("Concat Reverse:"+ concatenzioneInversa);
    }
}
