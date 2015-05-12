import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball extends ObjectsInGame {

	Handler handler;

	public Ball(int x, int y, IDOfObjects id, Handler handler) {
		super(x, y, id);
		
		this.handler=handler;
		
		//set speed of ball
		speedX = 1;
		speedY = 1;
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x, y, 20, 20);
	}
	
	public void tick() {
		// TODO Auto-generated method stub
		x += speedX;
		y += speedY;
	//if velocity is going 5 units at first, the moment it hits the edge of the
	//screen it changes its velocity to negative 5 units which automatically 
	//makes the object go in the opposite direction
		
		if(y <= 0 || y >= Game.HEIGHT-50) 
			speedY *= -1;
		if(x <=0 || x >= Game.WIDTH-16)
			speedX *= -1;
		
		 if( y>449 || y < 1){
		 
			speedX = 0;
			speedY = 0;
		}
		
		 if (speedX == 0 && speedY == 0)
			 System.out.println("Game Over");
		 	
		collision();
}
	
	public void collision(){
		//cycle through all objects in the game
		for(int i = 0; i < handler.object.size(); i++){
			ObjectsInGame tempObject = handler.object.get(i);
			// get the id of the object that intersects with the Ball
			if (tempObject.getId() == IDOfObjects.Paddle1 || tempObject.getId() == IDOfObjects.Paddle2){
				if(getBounds().intersects(tempObject.getBounds())){
					speedY *= -1;
				}
			}	
		}
	}

	public void paint(Graphics g) {
		g.setColor(Color.magenta);
		g.fillOval(x, y, 20, 20);
		
		// TODO Auto-generated method stub
		
	}

}
