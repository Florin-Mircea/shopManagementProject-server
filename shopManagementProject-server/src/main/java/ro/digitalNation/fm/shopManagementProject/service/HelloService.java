package ro.digitalNation.fm.shopManagementProject.service;

@Service
public class HelloService {
    
    public  String  sayHello(String firstName)  {
        return  "Hello" + firstName + "!";
    }
}
