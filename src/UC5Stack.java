import java.util.*;
public class UC5Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> s = new Stack<>();
        for(char c: str.toCharArray()) s.push(c);
        String rev="";
        while(!s.isEmpty()) rev+=s.pop();
        System.out.println(str.equals(rev)?"Palindrome":"Not");
    }
}
