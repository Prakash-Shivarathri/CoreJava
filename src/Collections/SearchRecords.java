package Collections;

import java.util.*;

public interface SearchRecords {

	public List<String> getSearchRecords();
	
	public void recordData(String str);

	default Map<String,keyword> getKeyWordWithFreq(){
		return null;
	}
	//why default means we cannot distrub the other classes with implementation of methods
	default List<String> getTopFiveRecords(){
		return null;
	}
}
