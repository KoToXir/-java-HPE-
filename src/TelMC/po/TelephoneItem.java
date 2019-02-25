package TelMC.po;
/**
 * 单挑通讯录信息封装的实体类	
 * @author mygbo
 *
 */
public class TelephoneItem {
	private String name;	/*用户名*/
	
	private int sex;	/*1男0女*/
	
	private String tel;	/*电话号码*/
	
	private String addr;	/*通信地址*/
	
	private int age;	/*年龄*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 控制台演示项目，方便打印，所以重写toString方法
	 * @return 
	 */
	@Override
	public String toString() {
		
		return "姓名："+this.name+"\t年龄："+this.age+"\t性别："+this.sex+"\t地址："+this.addr+"\t电话:"+this.tel;
	}
}
