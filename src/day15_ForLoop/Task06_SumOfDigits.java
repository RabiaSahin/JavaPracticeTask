package day15_ForLoop;

public class Task06_SumOfDigits {
    public static void main(String[] args) {

            String word="A1B2C3";

            int total = 0;

            for (int i =0; i < word.length(); i++) {

                char ch = word.charAt(i);

                if (ch >= '0' && ch <= '9'){

                         total += ch -48;
                }

            }
            System.out.println(total);

        }
    }

/*6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3
                 output:    6
             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1 */