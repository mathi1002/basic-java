package nonadvance;
import java.util.Scanner;
public class Userinput {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter name");
        String username=obj.nextLine();
        System.out.println("username is a "+username);
    }

}
