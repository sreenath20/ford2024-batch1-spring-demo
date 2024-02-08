package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "controller")
@Scope("singleton")
public class Controller {

    @Value("Icici Bank")
    private String name;
    @Autowired // field injection
    private BankService bankService; // HAS-A relation
    //@Autowired // constructor  injection
    public Controller(BankService bankService) {
        this.bankService = bankService;
    }

    public Controller() {
    }

    public BankService getBankService() {
        return bankService;
    }
   // @Autowired // setter  injection[DI]
    public void setBankService(BankService bankService) {
        this.bankService = bankService;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "name='" + name + '\'' +
                ", bankService=" + bankService +
                '}';
    }
}
