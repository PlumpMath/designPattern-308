package facade2;

/*
 * 加一个外观(Facade)
 * 在客户端Client2直接调用它
 */
public class Facade {
	public void generate() {
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}
