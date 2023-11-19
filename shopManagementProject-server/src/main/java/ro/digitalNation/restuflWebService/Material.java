package ro.digitalNation.restuflWebService;

@Bean
public class Material implements Activity {
    
    private String activOne;
    private String activTwo;

    public Material() {
        
    }    

    public Material(String activOne) {
        this.activOne = activOne;
    }

    public Material(String activOne, String activTwo) {
        this.activOne = activOne;
        this.activTwo = activTwo;
    }    
    
    @Override
    public String getDescribe() {        
        return null;        
    }

    @Override
    public String getDuration() {        
        return null;        
    }

    public String getActivOne() {
        return activOne;
    }

    public void setActivOne(String activOne) {
        this.activOne = activOne;
    }

    public String getActivTwo() {
        return activTwo;
    }

    public void setActivTwo(String activTwo) {
        this.activTwo = activTwo;
    }

    @Override
    public String toString() {
        return "Material{" + "activOne=" + activOne + ", activTwo=" + activTwo + '}';
    }        
    
}
