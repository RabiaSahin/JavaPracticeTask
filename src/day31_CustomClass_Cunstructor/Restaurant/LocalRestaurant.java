package day31_CustomClass_Cunstructor.Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server[] servers = {    new Server("Ahmet", 10,8.5,true),
                                new Server("Yasin", 12, 8.5,true),
                                new Server("julia", 14,8,false),
                                new Server("Olga",16,8,false)

        };

        Chef[] chefs = {    new Chef("Oktay",20,25,true),
                            new Chef("Yasar",22,22.5,true),
                            new Chef("Mehdi",24,20,false)

        };

        Restaurant restaurant1 = new Restaurant("Ayhan", "Newcastle", "5");

        restaurant1.hireServers(servers);
        restaurant1.hireChefs(chefs);

        System.out.println(restaurant1);

    }
}
