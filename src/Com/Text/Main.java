package Com.Text;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[]args){
        Resource resource = new ClassPathResource("demo.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Student student = (Student)beanFactory.getBean("student");
        student.print();
        Address address = (Address)beanFactory.getBean("address");
        address.print();
        Answer answer = (Answer)beanFactory.getBean("answer");
        answer.print();
        Employee employee = (Employee)beanFactory.getBean("employee");
        employee.print();
        Question question = (Question)beanFactory.getBean("question");
        question.print();
    }
}
