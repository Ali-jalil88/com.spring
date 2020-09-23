package Com.Text;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[]args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Student bean = ctx.getBean(Student.class);
        System.out.println("Message===>"+bean.student());
        Answer abean = ctx.getBean(Answer.class);
        System.out.println("Message===>"+abean.answer());
        Address Abean = ctx.getBean(Address.class);
        System.out.println("Message===>"+Abean.address());
        Employee Ebean = ctx.getBean(Employee.class);
        System.out.println("Message===>"+Ebean.employee());
        QuestionTest QTbean = ctx.getBean(QuestionTest.class);
        System.out.println("Message===>"+QTbean.questionTest());
    }
    
}
