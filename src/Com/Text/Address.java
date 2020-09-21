package Com.Text;

public class Address {
    private String city;
    private String state;
    private String country;


    public Address(String city, String state, String country) {
        super();
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    public void print() {
        System.out.println("address name is " + country);
    }

}
