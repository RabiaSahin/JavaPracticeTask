package day31_CustomClass_Cunstructor.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public String numberOfStars;
    public ArrayList<Server> serversList = new ArrayList<>();
    public ArrayList<Chef> chefsList = new ArrayList<>();

    public Restaurant(String owner, String location, String numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        serversList.add(server);
    }
    public void hireServers(Server [] servers){
        serversList.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        chefsList.add(chef);
    }
    public void hireChefs(Chef[] chefs){
        chefsList.addAll(Arrays.asList(chefs));
    }
    public void terminateChef(int employeeID){
        chefsList.removeIf(p -> p.employeeID == employeeID);
    }
    public void terminateServer(int employeeID){
        serversList.removeIf(p->p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars='" + numberOfStars + '\'' +
                ", number of servers=" + serversList.size() +
                ", number of chefs=" + chefsList.size() +
                '}';
    }
}
