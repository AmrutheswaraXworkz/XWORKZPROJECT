package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IBM {
	
	
	static int getPow(int point,int exponent) {
		if(exponent == 0)
			return 1;
		else if(exponent%2 == 0)
			return (getPow(point,exponent/2))*(getPow(point,exponent/2));
			
		return point*(getPow(point,exponent/2))*(getPow(point,exponent/2))*(getPow(point,exponent/2));

	}
	
	static List<Integer> getMode(List<List<Integer>> input){
		
		List<Integer> distances = new ArrayList<Integer>();
		List<Integer> mode = new ArrayList<Integer>();
		for(int i=0;i<input.size()-1; i++) {
			List<Integer> point1 = input.get(i);
			List<Integer> point2 = input.get(i+1);
			
			double distance = Math.sqrt(getPow(point2.get(1)-point1.get(1),2)+getPow(point2.get(0)-point1.get(0),2));
			
			distances.add((int)distance);
		}
		mode.add(Collections.max(distances));
		
		return mode;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> coordinates1 = new ArrayList<Integer>();
		coordinates1.add(-11);
		coordinates1.add(3);
		
		List<Integer> coordinates2 = new ArrayList<Integer>();
		coordinates2.add(8);
		coordinates2.add(5);
		
		List<Integer> coordinates3 = new ArrayList<Integer>();
		coordinates3.add(-3);
		coordinates3.add(2);
		List<Integer> coordinates4 = new ArrayList<Integer>();
		coordinates4.add(9);
		coordinates4.add(17);
		
		List<List<Integer>> point1 = new ArrayList<List<Integer>>();
		point1.add(coordinates1);
		point1.add(coordinates2);
		point1.add(coordinates1);
		point1.add(coordinates2);
		point1.add(coordinates3);
		point1.add(coordinates4);
		point1.add(coordinates3);
		point1.add(coordinates4);

		
		System.out.println(IBM.getMode(point1));
		
		
		

	}

}
