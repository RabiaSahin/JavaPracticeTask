package day31_CustomClass_Cunstructor;

public class Address {

    public int buildingNumber, zipCode;
    public String street, city, state;

    public Address(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber + " " + street + '\n' + city + " " + state + ", " + zipCode;

    }
}
