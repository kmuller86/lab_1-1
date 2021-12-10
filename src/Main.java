import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[] tablica = new double[5];
        tablica[0] = 6.8;
        tablica[1] = 1.1;
        tablica[2] = 7.1;
        tablica[3] = 77.3;
        tablica[4] = 12.7;

        for (int i = 0; i < 5; i++)
            System.out.println("następny numer to: " + tablica[i]);

    }
}