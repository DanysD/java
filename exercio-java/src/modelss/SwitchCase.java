//checker se o code é igual a 1, igual a 2 ou igual a 3. se não for = code invalid
package modelss;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner prohibited = new Scanner(System.in);
        int code;

        System.out.print("code checker\n\n");


        System.out.print("type the code:  ");
        code = prohibited.nextInt();



        switch(code){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("code invalid");
        }

    }
}
