import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientDemo {

    public static void main(String[] args) {
        //Resource resource=new ClassPathResource("spring.xml");
        // BeanFactory ab=new XmlBeanFactory(resource);
        //OR

        ApplicationContext ab=new ClassPathXmlApplicationContext("spring.xml");

        Employee employee=(Employee)ab.getBean("t");
        System.out.println(employee);
    }
}
