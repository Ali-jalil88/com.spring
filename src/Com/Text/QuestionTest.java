package Com.Text;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class QuestionTest {
    private int id;
    private String name;
    @Bean
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String questionTest (){
        return "Hello QuestionTest bean";
    }


}
