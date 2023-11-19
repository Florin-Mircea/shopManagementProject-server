package ro.digitalNation.restuflWebService;

import java.awt.event.ActionListener;

@Bean
public class Trainer extends Person {
    
    public String trainer;        

    public Trainer() {
        
    }

    public Trainer(String trainer) {
        this.trainer = trainer;
    }                
    
    @Override
    public String getResponsabilities() {        
        return null;        
    }
    
    public void addActionListener(ActionListener actionListener) {
        
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Trainer{" + "trainer=" + trainer + '}';
    }            
    
}
