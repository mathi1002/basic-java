package files;
import java.io.FileWriter;
public class Hfilewrite {
    public static void main(String[]args){
        try{
            FileWriter obj=new FileWriter("newfile.txt");
            obj.write("this user name mathii");
            obj.close();
            System.out.println("succful wrote");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
