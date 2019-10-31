import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Konfiguracia pomocou Javy. Beany su ako keby singletony. Nacitaju sa iba raz. Autowire bude hladat v baliku "springFundamentals"
 */

@Configuration
@ComponentScan({ "springFundamentals" })
@PropertySource("app.properties")
public class AppConfig
{
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
