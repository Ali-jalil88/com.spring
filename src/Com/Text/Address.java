package Com.Text;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;
@Component
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
    public String address (){
        return "Hello Address bean";
    }
    @Bean

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
