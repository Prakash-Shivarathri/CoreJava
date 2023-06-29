package Collections;

import java.util.*;

public class SearchRecordsWithFreqImpl implements SearchRecords{

	Map<String ,keyword> dataSource;// -> (pen(pen,10)),(pencil,(pencil,20))
	Queue<keyword> keywordQueue;
	
	// Initialize the map
	//(pen(pen,10)) for this format i have create keyword class
	public SearchRecordsWithFreqImpl() {
		dataSource = new HashMap<>();
		keywordQueue = new PriorityQueue<>();
	}
	
	@Override
	public List<String> getSearchRecords() {
		List<String> list = new ArrayList<>();
		list.addAll(dataSource.keySet());
		return list;
	}

	@Override
	public void recordData(String key) {
		
		if(dataSource.containsKey(key)) {
			keyword keypair = dataSource.get(key);
			keyword tempkeyword = new keyword(key, keypair.getCount()+1);
			dataSource.put(key, tempkeyword);
		}else {
			dataSource.put(key, new keyword(key, 1));
		}
		keywordQueue.add(dataSource.get(key));//inserted the data
	}
	
	public Map<String,keyword> getKeyWordWithFreq() {
		
			return dataSource;
   }
	//priority 	Q is deal internally with the heap
      @Override
      public List<String> getTopFiveRecords(){
	   List<String> list = new ArrayList<>();
	  for(int i=0; i<5; i++) {
		  list.add(keywordQueue.poll().getKeyword());
	  }
	   return list;
    	  
      }

}
