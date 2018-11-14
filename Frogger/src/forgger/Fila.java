package forgger;

import java.awt.Graphics;
import java.util.ArrayList;

public class Fila {
	double velocidade;
	double y=0;
	int quantidade=3;
	
	ArrayList<Carro> carros= new ArrayList<Carro>();
	 Fila(double y){
		 this.y=y;
		 while(Math.abs(velocidade)<0.6){
		 velocidade= 1.5-Math.random()*3;
		 }
		for(int i=0; i<quantidade;i++){
			carros.add(new Carro((int)(Math.random()*15)*60,y,velocidade));
		}
	}
	 
	 void mostraFila(Graphics g){
		 for(Carro c: carros){
			 c.mostraCarro(g);
		 }
	 }
	 
	 void moveFila(){
		 for(Carro c:carros){
			 c.moveCarro();
		 }
	 }
	 
	 boolean atropelouFIla(int xs, int ys){
		 for(Carro c:carros){
			 if(c.atropelou(xs, ys))return true;
		 }
		 return false;
	 }

}
