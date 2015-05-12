import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class ObjectsInGame {
	// all the game objects
	// player and enemies in the game
	// inherits all the necessities of the objects in the game
	
		protected int x, y;
		protected IDOfObjects id;
		protected int speedX, speedY;
		
		public ObjectsInGame(int x, int y, IDOfObjects id){
			this.x = x;
			this.y = y;
			this.id = id;
		}
		// the constructor for the ObjectsInGame
		// when creating an instance of game object the object will need these three
		// values
	
		public abstract void tick(); // need to use within the player class
		public abstract void paint(Graphics g);
		public abstract Rectangle getBounds();
		
		public void setX(int x){
			this.x = x;
		}
		
		public void setY(int y){
			this.y = y;
		}
		
		public int getX(){
			return x;
		}
		
		public int getY(){
			return y;
		}
		
		public void setId(IDOfObjects id){
			this.id = id;
		}
		
		public IDOfObjects getId(){
			return id;
		}
		
		public void setSpeedX(int speedX){
			this.speedX = speedX;
		}
		
		public void setSpeedY(int speedY){
		this.speedY = speedY;
		}
		
		public int getSpeedX(){
		return speedX;
		}
		
		public int getSpeedY(){
		return speedY;
		}
		// setters and getters allowing change into x, y , and id, values
}


