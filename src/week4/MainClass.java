package week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass {
	public static void main(String[] args){

		/*ArrayListDemo ald = new ArrayListDemo();
		ald.addItems(new String[]{"a","a","b","c"});
		ald.displayItems();
		ald.displayItem(1);*/
		/*HashSetDemo hsd = new HashSetDemo();
		hsd.addItems(new String[]{"1","d","a","a","b","c","a","b","c","1"});
		hsd.displayItems();*/
		HashMapDemo hmd=new HashMapDemo();
		hmd.display();
		hmd.getValueByKey(7);
	}

}
