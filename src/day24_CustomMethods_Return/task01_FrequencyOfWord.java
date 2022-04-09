package day24_CustomMethods_Return;

public class task01_FrequencyOfWord {
    public static void main(String[] args) {

        System.out.println(frequencyOfWord("java java java python python","java"));

        System.out.println("-------------------------------");

        String str = "Java Java Python java python";
        String word = "Python";
        frequencyOfWord1(str,word);

        System.out.println("-------------------------------");

        String sentence = "Java java java python python";
        String word1 = "java";
        frequency(sentence,word);
    }

    public static int frequencyOfWord(String sentence, String word){ // count donecegin icin int method gerekli
        int count = 0;

        while(sentence.contains(word)){ // true ise icine gir
            sentence = sentence.replaceFirst(word, ""); // cumlede word kelimesini gorunce "" ile degistir.
            count++; // kac kere degisiyorsa hesapla
        }

        return count;
    }
    public static int frequencyOfWord1(String str,String word){
        int frequency = 0;
        String str1 = str.toLowerCase();
        String word1 = word.toLowerCase();
        while (str1.contains(word1)){
            str1 = str1.replaceFirst(word1,"");
            frequency++;
        }
        System.out.println(frequency);
        return frequency;
    }
    public static void frequency(String sentence, String word1){
        String[] sentenceArray = sentence.split(" ");
        int countFrequency = 0;
        for (String eachArray : sentenceArray) {
            if (eachArray.equalsIgnoreCase(word1)){
                countFrequency++;
            }
        }
        System.out.println(countFrequency);
    }

}
/*1.  create a method named frequencyOfWord that passes two parameters:
string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3*/