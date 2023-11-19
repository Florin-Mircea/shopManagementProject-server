package ro.digitalNation.restuflWebService;

@Bean
public class Rush implements Activity {
    
    private String activOne;
    private String activTwo; 

    public Rush() {
        
    }

    public Rush(String activOne) {
        this.activOne = activOne;
    }

    public Rush(String activOne, String activTwo) {
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
        return "Rush{" + "activOne=" + activOne + ", activTwo=" + activTwo + '}';
    }            
}
