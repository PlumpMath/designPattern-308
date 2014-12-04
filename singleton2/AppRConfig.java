package singleton2;

import java.io.*;
import java.util.Properties;
/*
 * 使用单例模式(饿汉式)来改写读取配置文件的实例代码
 */
public class AppRConfig {
	private static AppRConfig instance=new AppRConfig();
	public static AppRConfig getInstance(){
		return instance;
	}
	
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
