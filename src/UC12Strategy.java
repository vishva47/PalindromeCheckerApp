interface Strategy{ boolean check(String s); }
class ReverseStrategy implements Strategy{
    public boolean check(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
public class UC12Strategy{
    public static void main(String[] args){
        Strategy s=new ReverseStrategy();
        System.out.println(s.check("madam"));
    }
}
