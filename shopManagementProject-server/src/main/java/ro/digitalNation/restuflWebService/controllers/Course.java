package ro.digitalNation.restuflWebService.controllers;

import ro.digitalNation.restuflWebService.dbbeans.*;
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

    public Course() {
        
    }

    public ro.digitalNation.restuflWebService.controllers.Explorer getExplorer() {
        return explorer;
    }

    public void setExplorer(ro.digitalNation.restuflWebService.controllers.Explorer explorer) {
        this.explorer = explorer;
    }

    public ro.digitalNation.restuflWebService.controllers.Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(ro.digitalNation.restuflWebService.controllers.Trainer trainer) {
        this.trainer = trainer;
    }

    public ArrayList<ro.digitalNation.restuflWebService.controllers.Explorer> getExplorers() {
        return explorers;
    }

    public void setExplorers(ArrayList<ro.digitalNation.restuflWebService.controllers.Explorer> explorers) {
        this.explorers = explorers;
    }

    public ArrayList<ro.digitalNation.restuflWebService.controllers.Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<ro.digitalNation.restuflWebService.controllers.Trainer> trainers) {
        this.trainers = trainers;
    }

    public ArrayList<Activ> getActivs() {
        return activs;
    }

    public void setActivs(ArrayList<Activ> activs) {
        this.activs = activs;
    }

    public HashMap<String, String> getActivities() {
        return activities;
    }

    public void setActivities(HashMap<String, String> activities) {
        this.activities = activities;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }        
    
    @Override
    public String getDescribe() {        
        return null;        
    }

    @Override
    public String getDuration() {        
        return null;        
    }

    void getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
