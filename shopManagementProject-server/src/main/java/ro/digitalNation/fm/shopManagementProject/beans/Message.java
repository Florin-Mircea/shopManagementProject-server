package ro.digitalNation.fm.shopManagementProject.beans;

public class Message {
    
    private int code;

    public Message() {
        
    }

    public Message(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Message{" + "code=" + code + '}';
    }    
        
}
