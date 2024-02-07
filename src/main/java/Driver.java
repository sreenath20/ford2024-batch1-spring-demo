import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.config.java.context.JavaConfigApplicationContext;

public class Driver {
    public static void main(String[] arg){

//        System.out.println("Hello Spring bean creation using XML");
//        ApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml");
//        Employee empRef = (Employee) appContext.getBean("emp");
//        System.out.println(empRef.hashCode() +":"+empRef);
//
//        Employee empRef2 = (Employee) appContext.getBean("emp2");
//        System.out.println(empRef2);
//
//        Employee empRef3 = (Employee) appContext.getBean("emp3");
//        System.out.println(empRef3);
//
//         empRef = (Employee) appContext.getBean("emp");
//        System.out.println(empRef.hashCode() + ":"+empRef);
//        empRef = (Employee) appContext.getBean("emp");
//        System.out.println(empRef.hashCode() + ":"+empRef);
        // bean creation using java configuration
        //JavaConfigApplicationContext // depricated

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Employee emp1 = (Employee) appContext.getBean("employee");
        System.out.println(emp1);

        Address address = (Address) appContext.getBean("address");
        System.out.println(address);

        Employee emp2 = (Employee) appContext.getBean("employee2");
        System.out.println(emp2);

    }
}
