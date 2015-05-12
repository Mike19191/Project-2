import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class KeyInput extends KeyAdapter{

	private Handler handler;
	
	public KeyInput(Handler handler){
		this.handler = handler;
	}
	//whatever is put in the parameters constructs the key with this
	public String key;
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		String p1, p2;
		
		for (int i = 0; i < handler.object.size(); i++){
			ObjectsInGame tempObject = handler.object.get(i);
			
			if (tempObject.getId() == IDOfObjects.Paddle1){
				// key events for the player
			
				if (key == KeyEvent.VK_LEFT) 
					tempObject.setSpeedX(-3);
					p1 = "Left";
				if (key == KeyEvent.VK_RIGHT)
					tempObject.setSpeedX(3);
					p1 = "Right";
			}
				
			if (tempObject.getId() == IDOfObjects.Paddle2){
				if (key == KeyEvent.VK_A) 
					tempObject.setSpeedX(-3);
					p2 = "Left";
				
				if (key == KeyEvent.VK_D)
				tempObject.setSpeedX(3);
				p2 = "Right";
			}
				
			
		}
	}
	//http://stackoverflow.com/questions/13042504/keypressed-event-in-java
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		String p1, p2;
		
		
		for (int i = 0; i < handler.object.size(); i++){
			ObjectsInGame tempObject = handler.object.get(i);
			
			if (tempObject.getId() == IDOfObjects.Paddle1){
			// key events for the player

				if (key == KeyEvent.VK_LEFT) 
					tempObject.setSpeedX(0);
					p1 = "Stop";
			
				if (key == KeyEvent.VK_RIGHT)
					tempObject.setSpeedX(0);
					p1 = "Stop";
			}
		
			if (tempObject.getId() == IDOfObjects.Paddle2){
			// key events for the player

				if (key == KeyEvent.VK_A) 
					tempObject.setSpeedX(0);
					p2 = "Stop";
			
				if (key == KeyEvent.VK_D)
					tempObject.setSpeedX(0);
					p2 = "Stop";
			}
		}
	}
	//http://stackoverflow.com/questions/13042504/keypressed-event-in-java
}
