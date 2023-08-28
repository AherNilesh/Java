package controlstatements;

import java.util.Scanner;

public class forLoop {
    //to do for loop example
    // for loop - when no of iteration is fixed
    // print 1-10

    public static void main(String[] args) {
        // I - C - to do - Incr
        Scanner s  = new Scanner(System.in);
        int count = s.nextInt();
        for(int i =1; i <=count;  i++){
            System.out.println(i);
            //playSong(songName);
        }
    }


}
