package ro.digitalNation.fm.shopManagementProject.config;

import javax.security.auth.login.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
@ComponentScan("ro.digitalNation.*")        
public class ProjectConfig {          
    
    public  SimpleJaxWsServiceExporter  wsExporter()    {
        
        SimpleJaxWsServiceExporter  exporter;
        exporter = new    SimpleJaxWsServiceExporter();
        SimpleJaxWsServiceExporter.setBaseAddress("http://localhost:8080/services/");
        
        return  exporter;
    }
    
}
