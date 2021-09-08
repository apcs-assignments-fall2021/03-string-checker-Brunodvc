import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c') {
                count += 1;
            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        for (int i = 0; i < str.length()-3; i++){
            if (str.substring(i,i+3).equals("The")||str.substring(i,i+3).equals("the")){
                return true;
            }
        }
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String result="";
        for(int i=str.length()-1; i>=0; i--) {
            result = result + str.charAt(i);

        if (result.equals(str)){
            return true;
        }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(containsThe("the athenian school"));

    }
}
