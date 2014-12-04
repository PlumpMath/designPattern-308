package singleton3;

import java.io.*;
import java.util.Properties;
/*
 * 同时实现延迟加载和线程安全的一种单例实现方法
 * 要想很简单地实现线程安全可以采用静态初始化块的方式,它可以由JVM来保证线程的安全性
 * 但是我们看到在"饿汉"式的实现方式中，会在类装载时就初始化对象，不管你需不需要(这导致空间效率低)
 * 若果使用静态内部类，且在这个类里创建对象实例，这样一来只要不使用这个类级的内部类
 * 那就不会创建对象实例，从而实现延迟加载和线程安全
 */
public class AppRConfig {
	/*
	 * 静态内部类，该内部类的实例与外部类的实例没有绑定关系
	 * 而且只有被调用时才会装载，从而实现延迟加载
	 */
	public static class AppRConfigHolder{
		//静态初始化器，由JVM来保证线程安全
		private static AppRConfig appRConfig=new AppRConfig();
	}
	
	public static AppRConfig getInstance(){
		System.out.println("执行getInstance方法");
		return AppRConfigHolder.appRConfig;
	}
	//----------------------------------------------
	private String parameterA;
	private String parameterB;//用来存放配置文件中的参数
	public String getParameterA(){
		return parameterA;
	}
	
	public String getParameterB(){
		return parameterB;
	}
	
	private AppRConfig(){
		System.out.println("执行AppRConfig的构造器");
		readConfig();
	}
	//-----------------------------------------------
	private void readConfig(){
		Properties p=new Properties();
		InputStream in=null;
		try {
			in=AppRConfig.class.getResourceAsStream("AppConfig.properties");
			p.load(in);
			this.parameterA=p.getProperty("paraA");
			this.parameterB=p.getProperty("paraB");
		} catch (Exception e) {
			System.out.println("装载配置文件出错了，信息如下：");
			e.printStackTrace();
		}finally{
				try {
					if(in!=null)
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
