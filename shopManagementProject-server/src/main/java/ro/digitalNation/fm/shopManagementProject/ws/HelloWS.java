package ro.digitalNation.fm.shopManagementProject.ws;

import ro.digitalNation.fm.shopManagementProject.service.HelloService;

public class HelloWS {
    
    @Autowired
    private HelloService    service;
    
    @WebMethod
    private String  sayHello(@WebParam(name="userName")    String userName)  {
        return  service.sayHello(userName);
        
    }
    
    @WebMethod(operationName = "sayHello_1")
    @RequestWrapper(className = "ro.sayHello_1")
    @ResponseWrapper(className = "ro.sayHello_1Response")
    public HelloWS sayHello() {
        //TODO write your implementation code here:
        return null;
    }
}
