package threads;

public class Testmulth {
    public static void main(String[]args){
        Mutithread obj=new Mutithread("math1");
        obj.start();
        Mutithread obj1=new Mutithread("mathi2");
        obj1.start();
        Mutithread obj3=new Mutithread("mathi3");
        obj3.start();
    }
}
