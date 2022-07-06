public class Array {
    public static void main(String[]args){
    String[] war={"russia","ukrain","hackerds"};
        System.out.println(war.length);
        for(int i=0;i<war.length;i++){
            System.out.println(war[i]);
        }
        for(String i:war){
            System.out.println(i);
        }
        //two array
        int[][] num={{1,2,3,4,5},{6,7,8,9}};
        for(int i:num[0]){
            System.out.println(i);
        }
        int n=0;
        while(n< war.length){
            System.out.println(war[n]);
            n++;

        }
    }
}
