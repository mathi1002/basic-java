package files;
import java.io.File;
public class Filedel {
    public static void main(String[]args){
        File obj=new File("newfile.txt");
        if(obj.delete()){
            System.out.println("delete file is "+obj.getName());
        }else {
            System.out.println("file not delete");
        }
    }
}
