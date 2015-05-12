import java.awt.Graphics;
import java.util.LinkedList;

// handles all objects in the game
//updates and renders all objects, such as enemies, player, etc

public class Handler {
	
	LinkedList<ObjectsInGame> object = new LinkedList<ObjectsInGame>();
	
	public void tick(){
		//loops through every single object in game
		
		for(int i = 0; i < object.size(); i++){
			ObjectsInGame tempObject = object.get(i);
			
		//getting the id of the object that the loop is at 
			
			tempObject.tick();
			// updates the game objects with speed
		}
	}
	public void paint(Graphics g){
		for(int i = 0; i < object.size(); i++){
			ObjectsInGame tempObject = object.get(i);
			tempObject.paint(g);
			//renders all game objects
			
		}
	}
	
	public void addObject(ObjectsInGame object){
		this.object.add(object);
	}
	//creates the game objects, adds them on call

	public void removeObject(ObjectsInGame object){
		this.object.remove(object);
	}
	// removes objects
}
//http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.birt.-
//doc%2Fbirt%2FScriptingWithJava.html
