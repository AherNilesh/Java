package controlstatements;

public class DecisionStatements {
    public void checkEvenOdd(){
        int number=10;
        if(number%2==0){
            System.out.println(number+" is an even number");
        }else {
            System.out.println(number+"is an odd number");
        }
    }
    public static void main(String[] args){
        DecisionStatements ds=new DecisionStatements();
        ds.checkEvenOdd();
        int i=1;
        if(i==10){
            System.out.println("this condition is true");
        }
        else{
            System.out.println("this is false");
        }
    }
}
