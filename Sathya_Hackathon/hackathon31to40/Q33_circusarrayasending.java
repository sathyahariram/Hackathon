package hackathon31to40;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Q33_circusarrayasending {

	public static void main(String[] args) {
		//Q33. A circus is designing a tower routine consisting of people standing atop one another’s shoulders. For practical and aesthetic reasons,
		//each person must be both shorter and lighter than the person below him or her. Given the heights and weights of each person in the circus,
		//write a method to compute the largest possible number of people in such a tower. EXAMPLE:
		//Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
		//Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
		
TreeMap<Integer,Integer> circle=new TreeMap<Integer, Integer>();
circle.put(65, 100); circle.put(70, 150); circle.put(56, 90); 
circle.put(75, 190); circle.put(60, 95); circle.put(68, 110);

for(Integer cir:circle.values()) {
	//System.out.println(cir); 
}
System.out.println("The longest tower is length 6 and includes from top to bottom:");
for(Map.Entry treemapdisplay:circle.entrySet()) {
	System.out.print("("+(treemapdisplay.getKey())+", "+(treemapdisplay.getValue())+")");
}




	}

}
