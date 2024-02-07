import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Employee employee(){

        return new Employee(55,"Ford India",7899.0);
    }

    @Bean
    public Address address(){

        return new Address(55,"Chennai","5555");
    }
    @Bean
    public Employee employee2(){
        Employee emp = new
                Employee(1,"Ford",5000.0,address());// Constructor Injection[DI]
        //emp.setAddress(address());// setter Injection [DI]

        return emp;
    }


}
