package basicjava;

import java.sql.DriverManager;

public class day4 {
    public static void main(String[] args) {

        String first_name="nilesh";

        //prog-1
        for(int i = 0 ; i < first_name.length() ; i++) {
          //  System.out.println(i);
           System.out.println(first_name.charAt(i));
        }

//        program2
        int a1 = 0;

        while(a1 < first_name.length()) {
            System.out.println(first_name.charAt(a1));
            a1++;
        }

       // program 3
    String city="mumbai";
        System.out.println(city.length());

        String a2 = city.toUpperCase();
        System.out.println(a2);


        // toLowerCase()
        String q3 = city.toLowerCase();
        System.out.println(q3);

    }
}
