package files;
import java.io.File;
public class Hfiles {
    public static void main(String[]args){
        File obj=new File("newfile.txt");
        try {
            if (obj.createNewFile()){
                System.out.println("file create");
            }else {
                System.out.println("file not create");
            }
        }catch (Exception e){
            System.out.println("error"+e);
        }

    }
}
