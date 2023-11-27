package ro.digitalNation.restuflWebService.controllers;

import ch.qos.logback.core.model.Model;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import javax.sound.midi.Track;
import ro.digitalNation.fm.shopManagementProject.beans.User;
import ro.digitalNation.fm.shopManagementProject.controllers.MainController;
import ro.digitalNation.fm.shopManagementProject.controllers.Person;
import ro.digitalNation.fm.shopManagementProject.controllers.UserJpaController;

//import ro.digitalNation.restuflWebService.Course;

@Controller
//@RestController
public class TrackController {
    
    private static TrackController singleton;
    public static TrackController getInstance() {
        if(singleton == null) singleton = new TrackController();
        return singleton;
    }
    
    private EntityManagerFactory emf;
    private TrainerJpaController trainerController;    
    private ExplorerJpaController explorerController;
    
    private TrackController() {
        emf = Persistence.createEntityManagerFactory("trackdbPU");
        trainerController = new TrainerJpaController(emf);
        explorerController = new ExplorerJpaController(emf);
    }
    
    Trainer trainer = new Trainer();
    Person person = new Person() {
        @Override
        public String getResponsabilities() {
            return null;            
        }
    };
    
    public TrackController(EntityManagerFactory emf, TrainerJpaController trainerController) {
        this.emf = emf;
        this.trainerController = trainerController;
    }        
    
    ArrayList<Trainer> trainers = new ArrayList<Trainer>();
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    Track track = new Track();
    Course course = new Course();    
                                
    
    public Track track(@PathVariable(value = "name", defaultValue = "World") String name) {
        return new Track(counter.incrementAndGet(), String.format(template, name));
    } 
    
    @GetMapping("/")
    public void trackCourse() {
        getTrack().getCourse();
    }
    
        Course courseOne = new Course();
        Course courseTwo = new Course();
        Course courseThree = new Course();
        Course courseFour = new Course();
        Course courseFive = new Course();
        
        ArrayList<Course> courses = new ArrayList<Course>();  
        courses.add(courseOne);
        courses.add(courseTwo);
        courses.add(courseThree);
        courses.add(courseFour);
        courses.add(courseFive);
    
    @GetMapping("/")
    public ArrayList<Course> getTrackCourses()  {
            int numCourses = getTrack().courses.size();   
            for(int i = 0; i < numCourses; i++)    {                                  
                    System.out.println(courses.get(i).getDescribe() + "   " + courses.get(i).getDuration());                  
            }             
            
            return courses;
    }
    
    @GetMapping("/")
    public ArrayList<Trainer> getTrainers(@RequestParam(name="firstName", required=false)) {        
        ArrayList<Trainer> trainers = (ArrayList<Trainer>) trainerController.findTrainerEntities();
        //ArrayList<Trainer> trainers = new ArrayList<Trainer>();
        trainers.forEach(new Consumer<Trainer>() {
            @Override
            public void accept(Trainer t) {
                trainers.add(new Trainer(t.getId(), t.getFirstName(), t.getLastName(), t.getCity(), t.getAge(), t.isMarried(), t.getCost(), t.getExplorer(), t.getTrainer()));
            }
        });
        return trainers;
    }
    
    @GetMapping("/")
    public ArrayList<Explorer> getExplorers(@RequestParam(name="firstName", required=false)) {        
        ArrayList<Explorer> explorers = (ArrayList<Explorer>) explorerController.findExplorerEntities();
        //ArrayList<Explorer> explorers = new ArrayList<Explorer>();
        explorers.forEach(new Consumer<Explorer>() {
            @Override
            public void accept(Explorer e) {
                explorers.add(new Explorer(e.getId(), e.getFirstName(), e.getLastName(), e.getCity(), e.getAge(), e.isMarried(), e.getCost(), e.getExplorer(), e.getTrainer()));
            }
        });
        return explorers;
    }
    
    @GetMapping("/")
    public ArrayList<Explorer> getTrackCourseExplorers() {
        int numExplores = getTrack().explorers.size();   
        int numExplorers = 0;
            for(int i = 0; i < numExplorers; i++)    {                                  
                    System.out.println(getTrack().explorers.get(i));                  
            }             
        ArrayList<Explorer> explorers = null;
            
            return explorers;
    }
    
    public Track getTrack() {
        return track;
    }
    
    @GetMapping("/")
    public Trainer getTrackCourseTrainer() {
        return course.trainer;        
    }
    
    /**
     *
     * @return
     */
    @GetMapping("/")
    public ArrayList<Activ> getActivsCourse() {
        return course.activs;
        
    }
    
    @GetMapping("/")
    public HashMap<String, String> getCourseActivities() {
        return course.activities;        
    }
    
    /**
     *
     * @param t
     */
    @PostMapping("/addTrainer")
    public void addTrainer(@ModelAttribute Trainer t, Model model) {       
        //model.Attribute("t", t);
        trainerController.create(new Trainer(t.getId(), t.getFirstName(), t.getLastName(), t.getCity(), t.getAge(), t.isMarried(), t.getCost(), t.getExplorer(), t.getTrainer()));
    }
    
    /**
     *
     * @param e
     */
    @PostMapping("/addExplorer")
    public void addExplorer(@ModelAttribute Explorer e) {        
        explorerController.create(new Explorer(e.getId(), e.getFirstName(), e.getLastName(), e.getCity(), e.getAge(), e.isMarried(), e.getCost(), e.getExplorer(), e.getTrainer()));
    }
    
    public void setTrack(Track track) {
        ro.digitalNation.restuflWebService.Track oldTrack = this.track;
        this.track = track;
        propertyChangeSupport.firePropertyChange(PROP_TRACK, oldTrack, track);
    }

    public Course getCourseOne() {
        return courseOne;
    }

    public void setCourseOne(Course courseOne) {
        this.courseOne = courseOne;
    }

    public Course getCourseTwo() {
        return courseTwo;
    }

    public void setCourseTwo(Course courseTwo) {
        this.courseTwo = courseTwo;
    }

    public Course getCourseThree() {
        return courseThree;
    }

    public void setCourseThree(Course courseThree) {
        this.courseThree = courseThree;
    }

    public Course getCourseFour() {
        return courseFour;
    }

    public void setCourseFour(Course courseFour) {
        this.courseFour = courseFour;
    }

    public Course getCourseFive() {
        return courseFive;
    }

    public void setCourseFive(Course courseFive) {
        this.courseFive = courseFive;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }        
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_TRACK = "track";
    
}
