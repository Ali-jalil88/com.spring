package Com.Text;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.Iterator;
import java.util.List;

public class Question {
    private int id;
    private String name;
    private List<String> answers;


    public Question() {}
    public Question(int id, String name, List<String> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }


    @Bean
    public String question (){
        return "Hello Question bean";
    }
    public void displayInfo(){
        System.out.println(id+" "+name);
        System.out.println("answers are:");
        Iterator<String> itr=answers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", answers=" + answers +
                '}';
    }
    public void print() {
        System.out.println("question name is " + name);
    }
}
