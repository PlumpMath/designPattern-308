package facade2;
/*
 * 客户端自行调用多个模块
 */
public class Client {
	public static void main(String[] args) {
		//客户端必须对这些模块都有了解才能使用它们
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}
