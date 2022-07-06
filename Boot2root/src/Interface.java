interface Mathivanan{
    void animalsount();

    void sleep();
}
public class Interface implements Mathivanan{
    public void animalsount(){
        System.out.println("this is sount ");
    }
    public void sleep(){
        System.out.println("this is my sleep time");
    }

}
class Inter{
    public static void main(String[]args){
        Interface obj=new Interface();
        obj.animalsount();
        obj.sleep();
    }
}