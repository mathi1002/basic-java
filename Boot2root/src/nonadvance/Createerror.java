package nonadvance;

public class Createerror {
    static void checkage(int age){
        if(age<18){
            throw new ArithmeticException("access denied you are not 18+ year");
        }else {
            System.out.println("access granded");
        }
    }public static void main(String[]args){
        checkage(17);
    }
}
