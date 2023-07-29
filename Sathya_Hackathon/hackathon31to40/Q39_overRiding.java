package hackathon31to40;

class Q39_overRide{
	
	void banana() {
		System.out.println("banana fruit will be in yellow color");
	}}
	
class override1 extends Q39_overRide{
	/*
	 * void banana() { System.out.println("banana fruit tastes sweet"); }
	 */
}
class override2 extends override1{
	void banana() {
		System.out.println("banana fruit cake tastes good");
		}
	}

	
	
	
public class Q39_overRiding {
	public static void main(String[] args) {
		Q39_overRide b=new Q39_overRide();
		b.banana();
		
		b=new override1();
		b.banana();
		
		b=new override2();
		b.banana();
		

	}
}
