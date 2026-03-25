public class UC13Performance{
    public static void main(String[] args){
        String str="madam";
        long start=System.nanoTime();
        str.equals(new StringBuilder(str).reverse().toString());
        long end=System.nanoTime();
        System.out.println("Time: "+(end-start));
    }
}
