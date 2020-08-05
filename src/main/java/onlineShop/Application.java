package onlineShop;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import onlineShop.log.PaymentAction;

public class Application {
    public static void main(String[] args) {
    	//create a container
        ApplicationContext context = new ClassPathXmlApplicationContext("payment.xml");
        PaymentAction paymentAction = (PaymentAction) context.getBean("paymentAction");
        paymentAction.pay(new BigDecimal(2)); 
     }
}
