package models;


import java.util.Locale;

public class JavaClass {
        public static void main(String[] args) {
            String dog1 = "Husky";
            String dog2 = "Yorkshire";
            byte ageDogs = 1;
            char genderDogs = 'F';
            double priceDog1 = 2200.0;
            double priceDog2 = 1900.0;
            System.out.println("for sale:");
            System.out.printf("%s, which price is $ %.2f%n", dog1, priceDog1);
            System.out.printf("%s, which price is $ %.2f%n", dog2, priceDog2);
            System.out.println();
            System.out.printf("Record: both are %d years old, and are gender: %c%n", ageDogs, genderDogs);
            System.out.println();
            Locale.setDefault(Locale.US);
        }
}
