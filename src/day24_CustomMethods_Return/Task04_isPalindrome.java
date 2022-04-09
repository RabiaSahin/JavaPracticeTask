package day24_CustomMethods_Return;

import day13_String.Reverse;

public class Task04_isPalindrome {
    public static void main(String[] args) {

        String str = "Level";
        System.out.println(isPalindrome(str));

    }
    public static boolean isPalindrome(String str){

        return task03_Reverse.reverse(str).equalsIgnoreCase(str);
    }
}
/*4. By using the reverse method above to create another method named isPalindrome
that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

*/