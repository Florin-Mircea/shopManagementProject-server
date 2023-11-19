package ro.digitalNation.fm.shopManagementProject.service;

import ro.digitalNation.fm.shopManagementProject.config.IHelloService;

@Service
public class HelloService implements IHelloService {
    public String sayHello(String userName) {
        return  "Salut, "+userName+"!";
        
    }
}
