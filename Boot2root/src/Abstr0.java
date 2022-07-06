abstract class Abstr0 {
    public String fname="mathi";
    public int age = 22;
    public abstract void study();
}
class Myself extends Abstr0{
     public int year=2018;
    @Override
    public void study() {
        System.out.println("this is my study life");
    }
}
