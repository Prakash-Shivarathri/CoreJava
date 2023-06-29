package Collections;

import java.util.*;

public class CollectionMain {

	public static void main(String [] args) {
		SearchRecords search = new SearchRecordsWithFreqImpl();
		search.recordData("pen");
		search.recordData("Laptop");
		search.recordData("pen");
		search.recordData("pen");
		search.recordData("bag");
        search.recordData("pencil");
		search.recordData("bottle");
		search.recordData("bag");
		search.recordData("books");
		
		List<String> list = search.getSearchRecords();
		//List<String> list = new ArrayList<>();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		Map<String,keyword> dataStore = search.getKeyWordWithFreq();
		Iterator<Map.Entry<String, keyword>> iterator1 = dataStore.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, keyword> entrySet = iterator1.next();
			System.out.println(entrySet.getKey() +" with frequency "+entrySet.getValue().getCount());
		}
		List<String> list1 = search.getSearchRecords();
		System.out.println(list1);
      //System.out.println(search.getKeyWordWithFreq());// this line printing address of the keyword frequency

	}
	
	
}


// List -> maintain list of items....
// set -> store only the unique values..
// arraylist-> when it is filled with 75% of length  = 12 then
//it will create the same array with double size then 24

// Heap -> ds which keeps an order

// String , Integer -> compare // comparator -> asc order by default
// but we need do in the class by defining 
// class -> priority queue -> comparator / comparable

// diff btw comparable and  caom