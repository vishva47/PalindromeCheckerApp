import java.util.*;
public class UC8LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> l = new LinkedList<>();
        for(char c:sc.nextLine().toCharArray()) l.add(c);
        boolean flag=true;
        while(l.size()>1){
            if(!l.removeFirst().equals(l.removeLast())){flag=false;break;}
        }
        System.out.println(flag?"Palindrome":"Not");
    }
}
