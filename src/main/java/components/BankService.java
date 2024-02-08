package components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bankService")
@Scope("prototype")
public class BankService {
    @Value("SB Service")
    private String name;
    public void display(){
        System.out.println("Banking service !");
    }

    @Override
    public String toString() {
        return "BankService{" +
                "name='" + name + '\'' +
                '}';
    }
}
