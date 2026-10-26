package Aggregation;

public class Adderss {

    String city;
    String state;
    String country;

    public Address(String city, String state, String country) 
    {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    void show() {
        System.out.println("Address : [" + city + ", " + state + ", " + country + "]");
    }
}