package ro.digitalNation.restuflWebService;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import ro.digitalNation.restuflWebService.Course;

@RestController
public class TrackController {
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    Track track = new Track();
    Course course = new Course();
    
    public TrackController() {
        
    }                                
    
    public Track track(@PathVariable(value = "name", defaultValue = "World") String name) {
        return new Track(counter.incrementAndGet(), String.format(template, name));
    } 
    
    @GetMapping("/")
    public void trackCourse() {
        getTrack().getCourse();
    }
    
        private Course courseOne = new Course();
        private Course courseTwo = new Course();
        private Course courseThree = new Course();
        private Course courseFour = new Course();
        private Course courseFive = new Course();
        
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
    
    @GetMapping("/")
    public ArrayList<Activ> getActivsCourse() {
        return course.activs;
        
    }
    
    @GetMapping("/")
    public HashMap<String, String> getCourseActivities() {
        return course.activities;        
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
