package singleton1;

import java.io.*;
import java.util.Properties;
/*
 * 直接使用java来读取配置文件的实例代码
 */
public class AppRConfig {
	private String parameterA;
	private String parameterB;//用来存放配置文件中的参数
	public String getParameterA(){
		return parameterA;
	}
	
	public String getParameterB(){
		return parameterB;
	}
	
	public AppRConfig(){
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
