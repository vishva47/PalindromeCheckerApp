import java.util.*;
public class UC6QueueStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();
        for(char c:str.toCharArray()){ q.add(c); s.push(c);}
        boolean flag=true;
        while(!q.isEmpty()){
            if(!q.poll().equals(s.pop())){ flag=false; break;}
        }
        System.out.println(flag?"Palindrome":"Not");
    }
}
