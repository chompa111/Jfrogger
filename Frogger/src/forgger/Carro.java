package forgger;

import java.awt.Color;
import java.awt.Graphics;

public class Carro {
	double x=300;
	double y=400;
	double velocidade=1;
	int tamanho=2;
	Color cor;
	
	boolean atropelou (int xs,int ys){
		if((xs<=x+60 && xs>=x) && (ys<=y+30 && ys>=y) )return true;
		return false;
	}
	
	public Carro(double x,double y,double velocidade){
		cor= new Color((int)(Math.random()*200),(int)(Math.random()*200),(int)(Math.random()*200));
		this.x=x;
		this.y=y;
		this.velocidade=velocidade;
	}
	
	void moveCarro(){
		x+=velocidade;
		if(x>500+60 && velocidade>0){
			x=0-((int)(Math.random()*20))*60;
			cor= new Color((int)(Math.random()*200),(int)(Math.random()*200),(int)(Math.random()*200));
		}
		
		if(x<0-60 && velocidade <0){
			x=500+((int)(Math.random()*20))*60;
			cor= new Color((int)(Math.random()*200),(int)(Math.random()*200),(int)(Math.random()*200));
		}
	}
	
	void mostraCarro(Graphics g){
		g.setColor(cor);
		g.fillRect((int)x, (int)y, 30*tamanho, 30);
		
	}

}
