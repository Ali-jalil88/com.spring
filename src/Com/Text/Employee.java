package Com.Text;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class Employee {
    private int id;
    private String name;
    public Employee() {System.out.println("def cons");}
    public Employee(int id) {this.id = id;}
    public Employee(String name) {  this.name = name;}
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void show(){
        System.out.println(id+" "+name);
    }

    public String employee (){
        return "Hello Employee bean";
    }
    @Bean
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void print() {
        System.out.println("employee name is " + name);
    }
}
