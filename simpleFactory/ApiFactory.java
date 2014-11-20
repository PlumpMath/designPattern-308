package simpleFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * 利用反射根据配置文件参数来创建一个接口
 */
public class ApiFactory {
	public static Api createApi(){
		//直接读取配置文件来获取需要创建实例的类
		Properties p=new Properties();
		InputStream in=null;
		try {
			in=ApiFactory.class.getResourceAsStream("FactoryTest.properties");
			p.load(in);
		} catch (IOException e) {
			System.out.println("加载配置文件出错，出错信息如下：");
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//用反射去创建
		Api api=null;
		try {
			api=(Api) Class.forName(p.getProperty("ImplClass")).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return api;
	}
}
