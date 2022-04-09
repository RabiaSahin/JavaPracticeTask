package day31_CustomClass_Cunstructor;

public class MovieObjects {

    public static void main(String[] args) {

        String Genre = "Adventure, Comedy, Thriller";
        String title = "Journey to SDET: Cydeo Batch 25";
        String[] castsList = {"Asiya", "Adam", "Muhtar", "Seda", "Daniel", "Zeliha", "Zak", "Nadia", "Ferdi"};

        Movie movie1 = new Movie("USA", title, Genre, "05/05/2022", "Kuzzat Altay");
        movie1.addCasts(castsList);

        System.out.println(movie1);
    }
}
