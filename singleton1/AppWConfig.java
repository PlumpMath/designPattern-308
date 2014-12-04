package singleton1;

import java.io.*;
import java.util.Properties;
/*
 * 直接使用java来写入配置文件的实例代码
 */
public class AppWConfig {
	private String parameterA;
	private String parameterB;//用来存放配置文件中的参数
	public void setParameterA(String a){
		this.parameterA=a;
	}
	
	public void setParameterB(String b){
		this.parameterB=b;
	}

	public void writeConfig(){
		Properties p=new Properties();
		OutputStream out=null;
		try {
			out = new FileOutputStream("src/singleton1/AppConfig.properties");
			p.setProperty("paraA", this.parameterA);
			p.setProperty("paraB", this.parameterB);
			p.store(out, "写入参数");
			System.out.println("写入配置文件......成功！");
		} catch (Exception e) {
			System.out.println("装载配置文件出错了，信息如下：");
			e.printStackTrace();
		}finally{
				try {
					if(out!=null)
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
