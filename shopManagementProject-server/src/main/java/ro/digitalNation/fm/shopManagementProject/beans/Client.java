package ro.digitalNation.fm.shopManagementProject.beans;

@Bean
public class Client {
    
    private String firstName;
    private String lastName;
    private String cnp;

    public Client() {
        
    }

    public Client(String firstName) {
        this.firstName = firstName;
    }

    public Client(String firstName, String lastName, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Client{" + "firstName=" + firstName + ", lastName=" + lastName + ", cnp=" + cnp + '}';
    }
        
}
