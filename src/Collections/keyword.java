package Collections;

public class keyword implements Comparable{

	private String keyword;
	private int count;
	
	public keyword(String keyword, int count) {
		super();
		this.keyword = keyword;
		this.count = count;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	// it is like generic method
	@Override
	public int compareTo(Object o) {
		keyword keyword1 = (keyword) o;
		if(keyword1.getCount() > this.getCount()) {
			return 1;
		}else if(keyword1.getCount() < this.getCount()){
			return -1;
		}else {
			return 0;
		}
	}
	
	

}
