package week4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
 List<String> al = new ArrayList<String>();
 
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
 public void displayItem(int index){
	 System.out.println(al.get(index));
 }

}
