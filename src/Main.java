import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        int a = 4;
        int b = 1;
        int c = 6;
        System.out.println("a + b = "+ (a+b));
        System.out.println("a + c = "+ (a+c));
        System.out.println("b + c = "+ (b+c));
        System.out.println("(b + c) * 416 = "+ (b+c)*416);
        if(a < b)
            System.out.println("a jest mniejsze od b");
        else
            System.out.println("a jest większe od b");
        if(a < c)
            System.out.println("a jest mniejsze od c");
        else
            System.out.println("a jest większe od c");
        if(b < c)
            System.out.println("b jest mniejsze od c");
        else
            System.out.println("b jest większe od c");
    }
}