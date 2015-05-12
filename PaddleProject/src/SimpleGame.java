import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;
//import javax.websocket.EncodeException;
//import javax.websocket.Session;

/**
 * A very simple example of how to use the Game base class.
 * 
 * Here, we provide a constructor for our game, override the JPanel
 * paintComponent() method, and write a simple main() method that creates and
 * starts the game.
 * 
 * @author sdexter72
 *
 */
public class SimpleGame extends Game implements KeyListener  {

	Handler handler;
	Score score;
	
	/**
	 * This constructor invokes the super constructor, then creates a ship
	 * object (which doesn't do very much)
	 * 
	 * @param name
	 * @param inWidth
	 * @param inHeight
	 */
	public SimpleGame(String name, int inWidth, int inHeight) {
		super(name, inWidth, inHeight);
		setBackground(Color.BLACK);
		
		handler = new Handler();
		score = new Score();
		
		this.addKeyListener(new KeyInput(handler));	
		
	
		handler.addObject(new Paddle(WIDTH/5-20, 440, IDOfObjects.Paddle1, handler));
		handler.addObject(new Paddle(WIDTH/2-32, 20, IDOfObjects.Paddle2, handler));
		handler.addObject(new Ball(5, 5, IDOfObjects.Ball, handler)); 

	
}
	public static int inBounds(int pos, int min, int max){
		if(pos >= max)
			pos = max;
		else if (pos <= min)
			pos = min;
		return pos;		
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		handler.tick();
		handler.paint(g);
		//score.paint(g);
	}

	/**
	 * In main, we create a new SimpleGame, make sure it has the keyboard focus
	 * (which it will need when we implement code to control game action with
	 * keyboard), and start the game.
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {
		SimpleGame game = new SimpleGame("Simple Game", 500, 500);
		game.requestFocus();
		game.startGame();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	
	
}



