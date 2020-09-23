package Com.Text;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Student {
    private String name;

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
        return "Hello spring! Welcome java";
    }
    @Bean
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
