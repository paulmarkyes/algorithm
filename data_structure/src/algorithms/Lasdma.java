package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Lasdma {
	   public static void main(String[] args){
		   List<String> stringArrayList = new ArrayList<String>();
		   List<Integer> integerArrayList = new ArrayList<Integer>();

		   Class classStringArrayList = stringArrayList.getClass();
		   Class classIntegerArrayList = integerArrayList.getClass();
		   System.out.println(classStringArrayList==classIntegerArrayList);
		   if(classStringArrayList.equals(classIntegerArrayList)){
		       System.out.println("111111111111");
		   }

	   
	    }
	

}
