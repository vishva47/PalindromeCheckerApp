public class UC2HardcodedPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        if(str.equals(new StringBuilder(str).reverse().toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
