package my.java.programs;

public class calculator {
    //a function to multiply given two numbers
    public static int multiplyNums(int a , int b){
        // logic to perform multiplication
        return a*b;
    }
    public static void main(String[] args) {
        int res = multiplyNums(38,23);
        System.out.println(res);

        System.out.println("this is my calculator class");
    }
}
