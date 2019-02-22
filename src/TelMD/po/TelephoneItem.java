package TelMD.po;

/**
 * 单条通讯录信息封装的 实体类
 * @version v3.0
 * @date 2019-01-18
 */
public class TelephoneItem {
	
	private int id;  /* 数据库中主键 */
	
	private String name; 	/* 用户名 */
	
	private int sex; 		/*性别： 1男 0 女 */
	
	private String tel;     /* 电话号码 */
	
	private String addr;    /* 通信地址 */
	
	private int age;        /* 年龄 */

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id ;
	}
	
	public String getName() {
		return name;
	}

	public int getSex() {
		return sex;
	}

	public String getTel() {
		return tel;
	}

	public String getAddr() {
		return addr;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 控制台演示项目，方便我们打印，所以我们重写override toString()方法。 com.cbb.tel.po.TelehoneItem@xx2342
	 */
	@Override
	public String toString() {
		return "\t姓名：" + this.name + "\t年龄:" + this.age + "\t地址:" + this.addr + "\t电话:" + this.tel;
	}
}
