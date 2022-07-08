package modelsss;

import java.util.Locale;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        double cont = 50.0;
        if (minutes > 100) {
            cont += (minutes - 100) * 2.0;
        }
        System.out.printf("Valor da cont = R$ %.2f%n", cont);
        sc.close();
    }
}
