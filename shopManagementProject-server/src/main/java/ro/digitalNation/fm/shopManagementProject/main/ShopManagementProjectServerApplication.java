package ro.digitalNation.fm.shopManagementProject.main;

import java.util.Arrays;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SPRING_BOOT_APPLICATION
@SpringBootApplication
public class ShopManagementProjectServerApplication {

    //public static final SpringBootApplication SPRING_BOOT_APPLICATION = SpringBootApplication;
    //private static SpringBootApplication SpringBootApplication;

	public static void main(String[] args) {
            
            try {
                //AnnotationConfigApplicationContext context = null;
                //context = new AnnotationConfigApplicationContext(ProjectConfig.class);
                
		SpringApplication.run(ShopManagementProjectServerApplication.class, args);
                
                @Bean
                 CommandLineRunner commandLineRunner(ApplicationContext ctx) {
                    return args -> {
                        System.out.println("Let's inspect the beans provided by Spring Boot:");
                        
                        String[] beanNames = ctx.getBeanDefinitionNames();
                        Arrays.sort(beanNames);
                        for(String beanName : beanNames) {
                            System.out.println(beanName);
                        }
                    };
                }
                
            } catch(Exception ex) {
                System.out.println("Exception");
            }
        }
}
