package threads;

public class Mutithread extends Thread{
    private String threadname;
    Mutithread(String name){
        threadname=name;
        System.out.println("create "+threadname);
    }
    public void run(){
        System.out.println("running"+threadname);
        try {
            for (int i=10;i<100;i++){
                System.out.println("thread"+threadname+"  "+i);
                Thread.sleep(50);
            }
        }catch (Exception e){
            System.out.println("thread error"+ e);
        }
        System.out.println("thread "+ threadname+ "exit");
    }
}

