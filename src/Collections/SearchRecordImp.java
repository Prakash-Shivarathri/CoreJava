package Collections;
import java.io.*;
import java.util.*;
import java.util.List;

public class SearchRecordImp implements SearchRecords{
    List<String> dataStore;
    
    public SearchRecordImp() {
    	dataStore = new ArrayList<>();
    }
   
	@Override
	public List<String> getSearchRecords() {
		
		return dataStore;
	}
	@Override
	public void recordData(String key) {
		
		dataStore.add(key);
	}
}
