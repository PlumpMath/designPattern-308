package facade1;
/*
 * 客户端直接使用外观对象就行了
 */
public class Client {
	public static void main(String[] args) {
		Facade f=new Facade();
		f.test();
	}
}
