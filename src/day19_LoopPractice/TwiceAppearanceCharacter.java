package day19_LoopPractice;

public class TwiceAppearanceCharacter {
    public static void main(String[] args) {

        String str = "aabcddeffe";
        String result = "";


            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if(!(str.indexOf(ch) == str.lastIndexOf(ch))){

                    if(result.contains(ch + "")){
                        continue;
                    }

                    result += ch;
                }
            }

        System.out.println("Characters Appearing Twice : " + result);
    }
}
/*Write a program that can display all the characters that appeared twice in the string.*/