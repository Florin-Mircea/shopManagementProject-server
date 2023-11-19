package ro.digitalNation.restuflWebService;

import java.util.ArrayList;
import java.util.HashMap;

@Bean
public class Course implements Activity {
    
    Explorer explorer = new Explorer();
    Trainer trainer = new Trainer();
    
    ArrayList<Explorer> explorers = new ArrayList<Explorer>();
    ArrayList<Trainer> trainers = new ArrayList<Trainer>();
    ArrayList<Activ> activs = new ArrayList<Activ>();
    HashMap<String, String> activities = new HashMap<String, String>();
    
    Person p = new Person() {
        @Override
        public String getResponsabilities() {            
            return null;            
        }
    };
    
    
    @Override
    public String getDescribe() {
        
        return null;
        
    }

    @Override
    public String getDuration() {
        
        return null;
        
    }
    
}
