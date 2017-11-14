package jp.ac.uryukyu.ie.e175761;

public class Main {
    public static void main(String args[]){
        try {
            String str = "3．14";
            double value= Double.parseDouble(str);
        }catch (NullPointerException n){
            System.out.println("NullPoが発生");
            System.out.println(n.getMessage());
        }
    }
}
