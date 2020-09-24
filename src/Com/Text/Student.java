package Com.Text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class Student {
    private String name;
    private Address address;
@Autowired
    public Student (Address address){
        this.address=address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Hello: " + name);
    }

    public String student () {
        return "Hello spring! Welcome java"+address.address();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    public void print() {
        System.out.println("student name is " + name);
    }
}
