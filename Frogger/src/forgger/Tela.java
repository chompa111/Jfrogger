package forgger;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Tela extends JFrame  {
	KeyListener aux= new aux();
	boolean morteDoSapo=false;
	public Tela(){
		setSize(500,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		addKeyListener(aux);
	}
		Fila f4=new Fila(500+200);
		Fila f1=new Fila(450+200);
		Fila f2= new Fila(400+200);
		Fila f3= new Fila(350+200);
		
		Sapo s= new Sapo();
		
	public void paint(Graphics g){
		if(!morteDoSapo){
		g.setColor(Color.black);
		g.fillRect(0, 0, 500, 900);
		
		f1.mostraFila(g);
		f1.moveFila();
		
		f2.mostraFila(g);
		f2.moveFila();
		
		f3.mostraFila(g);
		f3.moveFila();
		
		f4.mostraFila(g);
		f4.moveFila();
		s.mostraSapo(g);
		((forgger.Tela.aux) aux).update();
		
		if(f1.atropelouFIla(s.x, s.y)||f2.atropelouFIla(s.x, s.y)||
				f3.atropelouFIla(s.x, s.y)||f4.atropelouFIla(s.x, s.y))morteDoSapo=true;
		}else{
			g.setColor(Color.RED);
			g.fillRect(0, 0, 500, 900);
			g.setColor(Color.BLACK);
			g.setFont(new Font("diafgdjhlog",Font.BOLD,18));
			g.drawString("MORTE DO SAPO POR ATROPELAMENTO!", 30, 450);
			g.drawString("UMA MORTE HORRIVEL POR SINAL", 30, 500);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public class aux implements KeyListener{
		int contblock=0;
		boolean block=false;
		
		void update(){
			
			if(contblock==0)block=false;
			else contblock--;
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
			if(block)return;
			
			if(e.getKeyCode()== KeyEvent.VK_LEFT){
				s.x-=30;
			}
			if(e.getKeyCode()== KeyEvent.VK_RIGHT){
				s.x+=30;
			}
			
			if(e.getKeyCode()== KeyEvent.VK_UP){
				s.y-=30;
			}
			if(e.getKeyCode()== KeyEvent.VK_DOWN){
				s.y+=30;
			}
			
			block=true;
			contblock =60;
			
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
	
}
