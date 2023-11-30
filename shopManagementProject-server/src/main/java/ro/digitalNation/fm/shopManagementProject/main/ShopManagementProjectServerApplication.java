package ro.digitalNation.fm.shopManagementProject.main;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.security.auth.Subject;
import static oracle.net.aso.b.i;
import static oracle.sql.NUMBER.e;
import org.apache.catalina.User;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;
import ro.digitalNation.fm.shopManagementProject.beans.Client;
import ro.digitalNation.fm.shopManagementProject.beans.InvoiceLine;
import ro.digitalNation.fm.shopManagementProject.controllers.Invoice;
import ro.digitalNation.fm.shopManagementProject.controllers.MainController;
import ro.digitalNation.fm.shopManagementProject.controllers.Product;
import ro.digitalNation.restuflWebService.controllers.Course;
import ro.digitalNation.restuflWebService.controllers.Explorer;
import ro.digitalNation.restuflWebService.controllers.TrackController;
import ro.digitalNation.restuflWebService.controllers.Trainer;
import ro.digitalNation.restuflWebService.dbbeans.Person;

//@SPRING_BOOT_APPLICATION
@SpringBootApplication
public class ShopManagementProjectServerApplication {

    private static ServerSocket ss;
    
    //public static final SpringBootApplication SPRING_BOOT_APPLICATION = SpringBootApplication;
    //private static SpringBootApplication SpringBootApplication;

	public static void main(String[] args) {
            
            try {
                //AnnotationConfigApplicationContext context = null;
                //context = new AnnotationConfigApplicationContext(ProjectConfig.class);
                
                ss = new ServerSocket(4321);
        
                while(true){
                    new ShopManagementProjectServerApplicationThread(ss.accept()).start();
                    }
                
		//SpringApplication.run(ShopManagementProjectServerApplication.class, args);
                
                /*
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
                */
                
            MainController mainController = new MainController();
            TrackController trackController = new TrackController();
            
            User u = new User() {
                    @Override
                    public String getName() {
                        return null;                        
                    }

                    @Override
                    public boolean implies(Subject subject) {
                        return User.super.implies(subject); //To change body of generated methods, choose Tools | Templates.
                    }
                };
            
            Person pers = new Person() {
                    @Override
                    public String getResponsabilities() {
                        return null;                        
                    }
                };
            Product p = new Product();
            Client c = new Client();
            Invoice i = new Invoice();
            InvoiceLine il = new InvoiceLine();
            
            Trainer t = new Trainer();
            Explorer e = new Explorer();
            Course course = new Course();
            
            mainController.getUsers(args);
            mainController.addUser((ro.digitalNation.fm.shopManagementProject.beans.User) u);
            mainController.updateUser((ro.digitalNation.fm.shopManagementProject.beans.User) u);
            mainController.deleteUser((ro.digitalNation.fm.shopManagementProject.beans.User) u);            
            mainController.getPersons(pers);
            mainController.addPerson(pers);                        
            mainController.getProducts(args);
            mainController.addProduct(p);            
            mainController.getInvoices(args);
            mainController.addInvoice(i);
            
            trackController.getTrainers(pers);
            trackController.addTrainer(t, model);
            trackController.getExplorers(pers);
            trackController.addExplorer(e, model);
            trackController.getCourses();
            trackController.getActivsCourse();
            trackController.getCourseActivities();
            trackController.getTrackCourseTrainer();
            trackController.getTrackCourseExplorers();
            trackController.getCourseOne();
            trackController.getCourseTwo();
            trackController.getCourseThree();
            trackController.getCourseFour();
            trackController.getCourseFive();
            trackController.getTrackCourses();            
            
            } catch(Exception ex) {
                System.out.println("Exception");
            }
        }
}
