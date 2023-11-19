package ro.digitalNation.restuflWebService;

@Bean
public abstract class Person {
    
    private String firstName;
    private String lastName;
    private String city;
    private Integer age;
    private boolean married;
    private Integer cost;
    private String explorer;
    private String trainer;

    public Person() {
        
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person(boolean married) {
        this.married = married;
    }

    public Person(String firstName, String lastName, String city, Integer age, boolean married, Integer cost, String explorer, String trainer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
        this.married = married;
        this.cost = cost;
        this.explorer = explorer;
        this.trainer = trainer;
    }        
    
    public String getIdentifier() {
		return firstName.toLowerCase().replaceAll(" ", "").replaceAll("-", "") + "_" + lastName.toUpperCase().replaceAll(" ", "").replaceAll("-", "") ;
	}
    
    public String getIdentifier(String explorer, String florin, String mircea) {
            return explorer.toLowerCase().replaceAll(" ", "").replaceAll("-", "") + "_" + firstName.toLowerCase().replaceAll(" ", "").replaceAll("-", "") + "_" + lastName.toUpperCase().replaceAll(" ", "").replaceAll("-", "") ;
        }
	
    public abstract String getResponsabilities(); 

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", age=" + age + ", married=" + married + ", cost=" + cost + ", explorer=" + explorer + ", trainer=" + trainer + '}';
    }        
    
}
