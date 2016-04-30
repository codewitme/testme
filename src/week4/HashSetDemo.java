package week4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
 Set<String> al = new HashSet<String>();
 public void addItems(String[] inputs){
	 for(String input:inputs){
		 al.add(input);
	 }
 }
 
 public void displayItems(){
	 Iterator<String> a = al.iterator();
	 while(a.hasNext()){
		 System.out.println(a.next());
	 }
 }


}
