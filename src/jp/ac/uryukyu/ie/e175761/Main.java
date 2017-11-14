package jp.ac.uryukyu.ie.e175761;

public class Main {
    public static void main(String args[]){
        try {
            String str = null;
            System.out.print(str.length());
        }catch (NullPointerException n){
            System.out.println("NullPoが発生");
            System.out.println(n.getMessage());
        }
    }
}
