package forgger;

public class principal {
	
	public static void main(String agrs[]){
		System.out.println("ol� mundo");
		Tela t=new Tela();
		
		while(true){
			
			try {
				Thread.sleep(2 );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t.repaint();
		}
		
		
	}

}
