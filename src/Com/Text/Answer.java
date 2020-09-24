package Com.Text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Answer {
    private int id;
    private String name;
    private String by;
    private Student student;
    @Autowired
    public Answer (Student student){
        this.student=student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String answer (){
        return "Hello Answer Bean "+student.student();
    }

    public Answer() {}
    public Answer(int id, String name, String by) {
        super();
        this.id = id;
        this.name = name;
        this.by = by;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", by='" + by + '\'' +
                '}';
    }
    public void print() {
        System.out.println("answer name is " + name);
    }
}
