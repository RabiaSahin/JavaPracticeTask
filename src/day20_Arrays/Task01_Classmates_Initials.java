package day20_Arrays;

import java.util.Arrays;

public class Task01_Classmates_Initials {
    public static void main(String[] args) {

        String [] names ={"Nadia Nawaz", "Seda", "Nisa Saracoglu", "Ferdi Aktas", "Vasyl Maziar",
                "Ozer Kutuk", "Zukhriddin Abdumadzhidov", "Elif Ozdemir", "Daniel Sirbu","Zeliha"};

       System.out.println(Arrays.toString(names));

     /*   for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);
        }*/

        for (int i = 0; i < names.length; i++) {

            String initial = names[i].charAt(0) + "." + names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println(initial);

        }

    }
}
/*create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines*/