package object.useful;

public class Dog implements Comparable{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(!(obj instanceof Dog)) {
			return false;
		}
		if(((Dog)obj).getName().equals(this.getName())&&((Dog)obj).getId()==(this.getId())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return id;
	}
	
	@Override
	public int compareTo(Object o) {
		//使用什么字段排序
		if(((Dog)o).getId() > this.getId()) {
			return -1;
		}else if (((Dog)o).getId() == this.getId()) {
			return 0;
		}else {
			return 1;
		}
		
	}
	
	
}
