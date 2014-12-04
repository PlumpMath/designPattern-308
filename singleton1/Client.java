package singleton1;

public class Client {
	public static void main(String[] args) throws InterruptedException {
//		AppWConfig w=new AppWConfig();
//		w.setParameterA("AAbA");
//		w.setParameterB("BBaB");
//		w.writeConfig();
		AppRConfig r=new AppRConfig();
		System.out.println("读取配置文件：");
		System.out.println(r.getParameterA());
		System.out.println(r.getParameterB());
	}
}
