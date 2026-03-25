class PalindromeService{
    boolean check(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
public class UC11OOP{
    public static void main(String[] args){
        PalindromeService p=new PalindromeService();
        System.out.println(p.check("madam"));
    }
}
