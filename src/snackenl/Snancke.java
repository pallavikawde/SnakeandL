package snackenl;



public class Snancke {
	
	
	static final int noPlay = 0;
	static final int ladder=1;
	static final int snake=2;

	
	public static void main (String[] args) {
		
		
		
		 System.out.println("welcome to Snack&adder");
		 
		 int position=0;
		 
		 
		 System.out.println("Start From -" +position);
		 
		int die;
		
		 
		int option;
		
			while(position<=100) {
				
			
			die=(int)Math.floor(Math.random() *10) %6+1;
			System.out.println("die is -" +die);
			
			if (position>=100) {
				
				System.out.println("winning position = "+ position);
				
				if (position!=100) {
				position=position-die;
				
				
				}
				else {
					System.out.println("winning position = "+ position);
				}
					
				
			}
			
			option=(int)Math.floor(Math.random() *10) %3;
		  
		switch(option) {
		case noPlay:
			System.out.println("player stay in same position = " +position );
		
			break;
		case ladder:
			position=position+die;
			if(position>=100) {
				System.out.println("winning position =100 ");
			}
		
			System.out.println("player moves ahead = "+position+" die = "+die);
			break;
		case snake:
			position =position-die;
			if(position<0) {
				position=0;
				
			}
			System.out.println("player moves behind = " +position+" die = "+die);
			break;
			default:
				break;
		}
		
		
	
			}
		}
}
			