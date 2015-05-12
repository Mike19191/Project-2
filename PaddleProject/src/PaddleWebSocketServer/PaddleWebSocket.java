package PaddleWebSocketServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.sun.security.ntlm.Server;

public class PaddleWebSocket {

		 
	    public static void main(String[] args) {
	        runServer();
	    }
	 
	    public static void runServer() {
	        
	       Server server = new Server("localhost", 8025, "/websockets", null, PaddleServerEndpoint.class);
	 
	        try {
	            server.start();
	            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	            System.out.print("Please press a key to stop the server.");
	            reader.readLine();
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        } finally {
	            server.stop();
	        }
	    }
	}
