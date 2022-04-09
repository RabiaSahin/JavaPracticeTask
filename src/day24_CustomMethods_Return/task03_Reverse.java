package day24_CustomMethods_Return;

public class task03_Reverse {
    public static void main(String[] args) {

        String word = "Java is easy";
        System.out.println(reverse(word));

    }
    public static String reverse(String word){

        String result = "";

        for (int i = word.length()-1; i >= 0; i--) {
            result +=  word.charAt(i);
        }

        return result;
}

}
/*3. create a method named reverse that passes one string parameter,
the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ*/