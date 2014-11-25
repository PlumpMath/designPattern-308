package adapter2;

import java.util.*;

import adapter1.LogFileOperate;
import adapter1.LogFileOperateApi;
import adapter1.LogModel;
/*
 * 写个客户端测试一下
 */
public class Client {
	public static void main(String[] args) {
		LogModel log1=new LogModel();
		log1.setLogId("008");
		log1.setOperateUser("zpc");
		log1.setOperateTime("2014-09-02 10:09:12");
		log1.setLogContent("这是一个测试日志对象");
		LogModel log2=new LogModel();
		log2.setLogId("009");
		log2.setOperateUser("admin");
		log2.setOperateTime("2014-09-02 11:39:22");
		log2.setLogContent("这也是一个测试日志对象");
		
		
		//创建操作日志文件的对象
		LogFileOperateApi lfo=new LogFileOperate("");
		//创建新版操作日志文件的接口对象
		LogDboperateApi ap=new Adapter(lfo);
		ap.createLog(log1);
		ap.createLog(log2);
		List<LogModel> readLog=ap.getAllLog();
		System.out.println("readLog:"+readLog);
	}
}
