package controlstatements;
import java.util.Scanner;

public class NestedifElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int i=sc.nextInt();

        // condition 1
        if (i == 10)
            System.out.println("i is 10\n");

            // condition 2
        else if (i == 15)
            System.out.println("i is 15\n");

            // condition 3
        else if (i == 20)
            System.out.println("i is 20\n");

        else
            System.out.println("i is not present\n");

        System.out.println("Outside if-else-if");


    }
}
