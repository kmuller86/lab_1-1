import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziell swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        if(21% 3 == 0)
            System.out.println("Podzielny przez trzy");
        else
            System.out.println("Niepodzielny przez trzy");

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int indeks = 57688;
        int wynik = (indeks % 2 == 0) ? 0 : 1;
        if(wynik == 0)
            System.out.println("jest parzysty");
        else
            System.out.println("jest nieparzysty");


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę zmiennoprzecinkową");
        double liczba = scan.nextDouble();
        if(liczba < 554)
            System.out.println("jest mniejsza od 554");
        else
            System.out.println("jest większa lub równa 554");

    }
}