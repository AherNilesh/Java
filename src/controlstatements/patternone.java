package controlstatements;
import java.util.Scanner;

public class patternone {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
        for(int i =1; i<=num; i++){
        for(int j =1; j<=num; j++){
            //8,i,j, N-j +1
            System.out.print(num-j +1);
        }
        System.out.println();
    }
}

}
