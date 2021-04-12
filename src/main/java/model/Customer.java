package model;

public class Customer {
    private String name;
    private String lastName;
    private String adress;
    private Trip trip;

    public Customer(String name, String lastName, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress='" + adress + '\'' +
                ", trip=" + trip +
                '}';
    }
}
