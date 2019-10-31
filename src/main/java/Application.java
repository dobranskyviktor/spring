import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springFundamentals.constants.SpringConstants;
import springFundamentals.service.CustomerService;

public class Application
{

    public static void main(String[] args)
    {
        // konfiguracia cez xml
        //        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"
        //                   "applicationContextAnnotations.xml");
        //        );

        // konfiguracia cez Javu
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = applicationContext.getBean(SpringConstants.CUSTOMER_SERVICE, CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());

    }
}
