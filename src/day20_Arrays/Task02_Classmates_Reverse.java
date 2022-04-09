package day20_Arrays;

public class Task02_Classmates_Reverse {
    public static void main(String[] args) {

        String [] classmates ={"Nadia", "Seda", "Nisa", "Ferdi", "Vasyl",
                "Ozer", "Zukhriddin", "Elif", "Daniel","Zeliha"};



        for (int i = 0; i < classmates.length; i++) {
                String names = classmates[i];
                String reverseName = "";

                System.out.print(names + " ");

                for (int j = names.length()-1; j >= 0 ; j--) {
                    reverseName += names.charAt(j);

                }
            System.out.println(reverseName);
            System.out.println();
        }


    }
}
/*create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c*/