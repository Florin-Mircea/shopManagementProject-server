package ro.digitalNation.fm.shopManagementProject.config;

public class ProjectConfig {
    
    @Bean
    public  SimpleJaxWsServiceExporter  wsExporter()    {
        
        SimpleJaxWsServiceExporter  exporter;
        exporter = new    SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:8888/services/");
        
        return  exporter;
    }
}
