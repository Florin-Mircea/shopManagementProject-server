package ro.digitalNation.fm.shopManagementProject.main;

import io.netty.channel.unix.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ServerThread extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    
    public ServerThread(Socket socket) throws Exception {
        this.socket=socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
    }
    
    public void run() {
        try{
            while(true){
                String line = in.readLine();
                for(ServerThread client : Main.clients) {
                    client.sendMessage(line);
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }    
    
    public void sendMessage(String message){
        out.println(message);
    }
}
