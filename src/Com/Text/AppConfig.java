package Com.Text;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Com.Text")
public class AppConfig {
    @Bean
    public Student getStudent (){
        Student st = new Student();
        return st;
    }
}
