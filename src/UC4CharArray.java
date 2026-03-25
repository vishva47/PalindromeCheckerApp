import java.util.*;
public class UC4CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int l=0,r=arr.length-1;
        boolean flag=true;
        while(l<r){
            if(arr[l++]!=arr[r--]){ flag=false; break; }
        }
        System.out.println(flag?"Palindrome":"Not Palindrome");
    }
}
