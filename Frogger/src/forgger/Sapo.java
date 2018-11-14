package forgger;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Sapo  {
	int x=(int)(500/2);
	int y=900-40;
	
	void mostraSapo(Graphics g){
		g.setColor(new Color(0,200,30));
		g.fillRect(x, y, 20, 20);
		g.setColor(new Color(0,144,36));
		g.fillOval(x+3, y+2,3 ,4);
		g.fillOval(x+6, y+15,7 ,4);
		g.fillOval(x+16, y+11,4 ,5);
		g.fillOval(x+17, y+1,3 ,4);
		g.fillOval(x+6, y+5,4 ,3);
		
		g.setColor(Color.black);
		g.fillOval(x+4, y+2, 3, 3);
		g.fillOval(x+13, y+2, 3, 3);
	}

	

}
