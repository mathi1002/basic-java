package nonadvance;

import static java.lang.Thread.*;

import java.lang.Thread;
public class Thr extends Thread{
    public static void main(String[]args) throws InterruptedException {
        Thr obj=new Thr();
        obj.start();
        try {
            sleep(1000);
        System.out.println("outside run");
    }catch (Exception e){
            System.out.println(e);
        }
    }
    public void run(){
        try {
        Thread.sleep(2);
        System.out.println("thread run");
    }catch (Exception e){
            System.out.println(e);
        }
    }
}
