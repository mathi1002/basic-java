package files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Hfileread {
    public static void main(String[]args){
        try{
            File fileobj=new File("newfile.txt");
            Scanner myread=new Scanner(fileobj);
            while (myread.hasNextLine()){
                String data=myread.nextLine();
                System.out.println(data);
            }myread.close();
        }catch (FileNotFoundException e){
            System.out.println("an error accored");
            e.printStackTrace();
        }
    }
}
