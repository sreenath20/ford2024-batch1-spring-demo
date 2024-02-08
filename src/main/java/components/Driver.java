package components;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[]a){

        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(BankAppConnfig.class);
    Controller controller = (Controller) appContext.getBean("controller");

    controller.getBankService().display();
    System.out.println(controller);
    System.out.println("Autowired service:"+controller.getBankService().hashCode());
    System.out.println(""+appContext.getBean("bankService").hashCode());

    }

}
