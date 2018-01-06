import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ек╥Е
 * @date 2017/12/27 обнГ9:27
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan
public class SpringSecurityDemoApplication {
    public static void main(String[] args) {
            SpringApplication.run(SpringSecurityDemoApplication.class, args);
    }
}
