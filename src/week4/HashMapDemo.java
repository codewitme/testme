package week4;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	Map<Integer,String> hm = new HashMap<Integer,String>();
	HashMapDemo(){
		hm.put(1, "Sunday");
		hm.put(2, "Monday");
		hm.put(3, "Tuesday");
		hm.put(4, "Wednesday");
		hm.put(5, "Thursday");
		hm.put(6, "Friday");
		hm.put(7, "Satday");
		hm.put(7, null);
	}
	
	public void display(){
		for(Map.Entry e:hm.entrySet()){
			System.out.println(e);
		}
	}
	public void getValueByKey(int key){
		System.out.println(hm.get(key));
	}

}
