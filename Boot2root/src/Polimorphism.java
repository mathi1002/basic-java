public class Polimorphism {
    public void animalsound(){
        System.out.println("this is animal sound"); }}
class Pig extends Polimorphism{
    public void animalsound(){
        System.out.println("this is pig animal sound");}}
class Dog extends Polimorphism{
    public void animalsound(){
        System.out.println("this is dog animal sound");}}
class Print{
    public static void main(String[] args){
        Polimorphism animal=new Polimorphism();
        Polimorphism mypig=new Pig();
        Polimorphism mydog=new Dog();
        animal.animalsound();
        mydog.animalsound();
        mypig.animalsound();
    }
}