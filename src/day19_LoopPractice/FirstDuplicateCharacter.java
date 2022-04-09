package day19_LoopPractice;

public class FirstDuplicateCharacter {
    public static void main(String[] args) {

        String str = "cghddklmgmmnl";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
    //        char ch = str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if(str.indexOf(each) == str.lastIndexOf(each)){
                    continue;
                }else{
                    result += each;
                }
            }
        }
    //    System.out.println(result);
        System.out.println("first dublicate chracter is: " + result.charAt(0));
    }
}
/*1. Write a program that can return the first duplicated character from a string*/