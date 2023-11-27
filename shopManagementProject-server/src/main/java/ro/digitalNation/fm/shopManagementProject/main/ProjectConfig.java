package ro.digitalNation.fm.shopManagementProject.main;

import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

class ProjectConfig {
    
    public  SimpleJaxWsServiceExporter  wsExporter()    {
        
        SimpleJaxWsServiceExporter  exporter;
        exporter = new    SimpleJaxWsServiceExporter();
        SimpleJaxWsServiceExporter.setBaseAddress("http://localhost:8080/services/");
        
        return  exporter;
    }
}
