package day23_CustomMethods_Void;

public class Task11_ConvertKgToLb {

    public static void main(String[] args) {

        kgToLb(25);

    }

        public static void kgToLb(double kg){

            double lb = kg * 2.205;
            System.out.println(kg+" kg equal to "+lb+" pounds");

        }

}
/*11. create a method that can convert kg to lb*/