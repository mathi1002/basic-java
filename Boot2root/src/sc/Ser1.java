package sc;
import java.net.*;
import java.io.*;
public class Ser1 {

    public static void main(String[]args){
        try{
        ServerSocket ss=new ServerSocket(6666);
        Socket s= ss.accept();
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        DataInputStream din=new DataInputStream(s.getInputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while (!str.equals("stop")){
            str= din.readUTF();
            System.out.println("client says" + str);
            str2=br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();}catch(Exception e){
            System.out.println(e);
        }
    }}
