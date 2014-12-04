package singleton2;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		AppRConfig r= AppRConfig.getInstance();
		System.out.println("--读取配置文件--：");
		System.out.println(r.getParameterA());
		System.out.println(r.getParameterB());
		AppRConfig r2= AppRConfig.getInstance();
		System.out.println("r==r2? "+(r==r2));
	}
}
