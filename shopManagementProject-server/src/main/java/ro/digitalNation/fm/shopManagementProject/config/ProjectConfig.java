package ro.digitalNation.fm.shopManagementProject.config;

import javax.security.auth.login.Configuration;

@Configuration
@ComponentScan("ro.digitalNation.*")        
public class ProjectConfig {
    
    @Bean
    @Autowired
    public  RmiServiceExporter  rmiExporter(IHelloService   service)   {
        RmiServiceExporter  exporter=new    RmiServiceExporter();
        exporter.setServiceName("HelloService");
        exporter.setService(service);
        exporter.setServiceInterface(IHelloService.class);
        exporter.setRegistryHost("localhost");
        exporter.setRegistryPort(4444);
        
        return  exporter;
    }
    
    @Bean
    public  SimpleJaxWsServiceExporter  wsExporter()    {
        
        SimpleJaxWsServiceExporter  exporter;
        exporter = new    SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:8888/services/");
        
        return  exporter;
    }

    private static class RmiServiceExporter {

        public RmiServiceExporter() {
            
        }

        private void setServiceName(String helloService) {
            
        }

        private void setService(IHelloService service) {
            
        }

        private void setServiceInterface(Class<IHelloService> aClass) {
            
        }

        private void setRegistryHost(String localhost) {
            
        }

        private void setRegistryPort(int i) {
            
        }
    }
}
