package PaddleWebSocketServer;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.websocket.CloseReason;
import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;


public class PaddleServerEndpoint {
	
	 
	    @OnOpen
	    public void onOpen(Session peer) {
	        logger.info("Connected ... " + peer.getId());
	    }
	 
	    @OnMessage
	    public void onMessage(Session peer, Message msg) throws EncodeException {
	       
	        
	        for (Session other : peer.getOpenSessions()) {
	            try {
	                other.getBasicRemote().sendObject(msg);
	            } catch (IOException ex) {
	                Logger.getLogger(PaddleServerEndpoint.class.getName()).log(Level.SEVERE, null, ex);
	            }

	        }
	    }
	 
	    @OnClose
	    public void onClose(Session session, CloseReason closeReason) {
	        logger.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
	    }
	    
	 
	}
}
