import mypack.Myclass;
public class Encap1 {
    public static void main(String[]args){
        Encap0 obj=new Encap0();
        System.out.println(obj.getAmount());
        obj.setBank("canara bank");
        obj.setAcontno(12345);
        obj.setAmount(100000);
        System.out.println(obj.getAmount());
        Myclass objown=new Myclass();
        objown.setCash(10000);
        System.out.println(objown.getCash());

    }
}
