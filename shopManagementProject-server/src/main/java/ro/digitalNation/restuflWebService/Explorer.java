package ro.digitalNation.restuflWebService;

@Bean
public class Explorer extends Person {
    
    public String explorer;

    public Explorer() {
        
    }

    public Explorer(String explorer) {
        this.explorer = explorer;
    }        
    
    @Override
    public String getResponsabilities() {        
        return null;        
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }        
    
}
