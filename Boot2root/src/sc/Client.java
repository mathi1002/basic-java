package sc;
import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[]args){
        try {
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("hello server iam mathi");
            dout.flush();
            dout.close();
            s.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
