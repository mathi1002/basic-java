package nonadvance;
import java.util.ArrayList;
public class Arraylist{
    public static void main(String[]args){
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        for(int i:num){
            System.out.println(i);
        }
    }
}
