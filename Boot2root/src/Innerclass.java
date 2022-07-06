class Out{
    int x=10;
class In{
    int y=5;}}
public class Innerclass {
    public static void main(String[]args){
        Out myout=new Out();
        Out.In myin=myout.new In();
        System.out.println(myin.y+myout.x);
    }
}
