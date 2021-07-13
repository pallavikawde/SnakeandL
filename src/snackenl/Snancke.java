package snackenl;



public class Snancke {
	
	
	static final int noPlay = 0;
	static final int ladder=1;
	static final int snake=2;

	
	public static void main (String[] args) {
		
		int count=0;
		int i=0;
		int p=1;
		 System.out.println("welcome to Snack&adder");
		 
		 int position1=0;
		 int position2=0;
		 
		 
		 
		 System.out.println("Start From -" +position1);
		 
		int die;
		
		 
		int option;
		
			while(i==0) {
		
			while(position1<=100 && i==0 && p==1) {
				
			
			die=(int)Math.floor(Math.random() *10) %6+1;
			System.out.println("die is -" +die);
			
			count ++;	
			
			
			option=(int)Math.floor(Math.random() *10) %3;
		  
		switch(option) {
		case noPlay:
			System.out.println("player stay in same position = " +position1 );
			p=2;
			
			break;
		case ladder:
			position1=position1+die;
			System.out.println("player moves ahead = "+position1+" die = "+die);
			
				if (position1>=100) {
				
				if (position1!=100) {
				position1=position1-die;
				}
				else {
					System.out.println(" PLAYER1 WON  ****** POSITION = "+ position1);
					i=1;
				}
				}
			break;
		case snake:
			position1 =position1-die;
			if(position1<0) {
				position1=0;
				p=2;
				
			}
			System.out.println("player moves behind = " +position1+" die = "+die);
			break;
			default:
				break;
		}
		
		
	
			}
			

			while(position2<=100 && i==0 && p==2) {
				
			
			die=(int)Math.floor(Math.random() *10) %6+1;
			System.out.println("die is -" +die);
			
			count ++;	
			
			
			option=(int)Math.floor(Math.random() *10) %3;
		  
		switch(option) {
		case noPlay:
			System.out.println("player stay in same position = " +position2 );
			p=1;
			
			break;
		case ladder:
			position2=position2+die;
			System.out.println("player moves ahead = "+position2+" die = "+die);
			
				if (position2>=100) {
				
				if (position2!=100) {
				position2=position2-die;
				}
				else {
					System.out.println("PLAYER2 WON ***** position = "+ position2);
					i=1;
				}
				}
			break;
		case snake:
			position2 =position2-die;
			if(position2<0) {
				position2=0;
				p=1;
				
			}
			System.out.println("player moves behind = " +position2+" die = "+die);
			break;
			default:
				break;
		}
		
		
	
			}
			
			 

			
			 
			
			
			
			}
			
				System.out.println("dice rolled = " + count+" times");
		}
}
			