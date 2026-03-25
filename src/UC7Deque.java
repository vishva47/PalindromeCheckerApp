import java.util.*;
public class UC7Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> d = new LinkedList<>();
        for(char c:sc.nextLine().toCharArray()) d.add(c);
        boolean flag=true;
        while(d.size()>1){
            if(!d.pollFirst().equals(d.pollLast())){flag=false;break;}
        }
        System.out.println(flag?"Palindrome":"Not");
    }
}
