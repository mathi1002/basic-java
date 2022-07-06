package nonadvance;

public class Exceptions {
    public static void main(String[]args){
        int[] num={1,2,3,4,5,6,7};
        try {
            System.out.println(num[10]);}
        catch (Exception e) {
            System.out.println("something went wrong");}
        finally {
            System.out.println("finally is run"); } }}
