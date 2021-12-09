import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą printlnn i printf
         */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */
//a

        System.out.println("Podaj Imie, nazwisko, wiek oraz nr. indeksu");
        String imie = scan.nextLine();
        String nazwisko = scan.nextLine();
        String wiek = scan.nextLine();
        String numerIndeksu = scan.nextLine();
//b
        System.out.println(imie+ " " + nazwisko + " " + wiek + " " + numerIndeksu);
        System.out.printf(imie+ " " + nazwisko + " " + wiek + " " + numerIndeksu);
        // zad.2
        int liczbaA = 6;
        int liczbaB = 2;
        System.out.println();
        System.out.println("A + B =: "+ (liczbaA+liczbaB));
        System.out.println("A - B =: "+ (liczbaA-liczbaB));
        System.out.println("A * B =: "+ (liczbaA*liczbaB));
        System.out.println("A / B =: "+ (liczbaA/liczbaB));
        System.out.println("A % B =: "+ (liczbaA%liczbaB));


    }
}