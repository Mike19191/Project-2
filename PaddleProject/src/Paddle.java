import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


/**
 * @author Michael
 *
 */
public class Paddle extends ObjectsInGame{
	
	Handler handler;

	public Paddle(int x, int y, IDOfObjects id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		// TODO Auto-generated constructor stub
		
	}

	public Rectangle getBounds(){
		return new Rectangle(x, y, 100, 15);
	}
	
	public void tick() {
		
		x += speedX;
		
		// keep both paddles in the bounds of the game window
		x = SimpleGame.inBounds(x, 0, SimpleGame.WIDTH-105);
	}
	


	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		for(int i = 0; i < handler.object.size(); i++){
			ObjectsInGame tempObject = handler.object.get(i);
			if(tempObject.getId() == IDOfObjects.Paddle1)
				g.setColor(Color.blue);
			else
			if(tempObject.getId() == IDOfObjects.Paddle2)
				g.setColor(Color.green);
		g.fillRect(x, y, 100, 15);
		
		}

	}
}

