public class Inheritance {
    protected String brand="mathi";
    public void honk(){
        System.out.println("honk method puplic");
    }
}
class Math extends Inheritance{
    private String modelname="bmw";
    public static void main(String[] args){
        Math obj=new Math();
        System.out.println(obj.brand);
        System.out.println(obj.brand);
    }
}