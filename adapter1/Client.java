package adapter1;

import java.util.*;
/*
 * 写个客户端测试一下
 */
public class Client {
	public static void main(String[] args) {
		LogModel log1=new LogModel();
		log1.setLogId("001");
		log1.setOperateUser("zpc");
		log1.setOperateTime("2014-09-02 10:09:12");
		log1.setLogContent("这是一个测试日志对象");
		LogModel log2=new LogModel();
		log2.setLogId("003");
		log2.setOperateUser("admin");
		log2.setOperateTime("2014-09-02 11:39:22");
		log2.setLogContent("这也是一个测试日志对象");
		
		List<LogModel> logList=new ArrayList<LogModel>();
		logList.add(log1);
		logList.add(log2);
		//logList.remove(log1);
		LogFileOperate oper=new LogFileOperate("");
		oper.writeLogFile(logList);
		
		List<LogModel> readLog=oper.readLogFile();
		System.out.println("readLog:"+readLog);
		
	}
	
}
