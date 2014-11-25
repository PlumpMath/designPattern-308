package adapter3;

import java.util.List;

import adapter1.LogModel;

public class Client {
	public static void main(String[] args) {
		LogModel log1 = new LogModel();
		log1.setLogId("018");
		log1.setOperateUser("zpc");
		log1.setOperateTime("2014-09-02 10:09:12");
		log1.setLogContent("这是一个测试日志对象");
		LogModel log2 = new LogModel();
		log2.setLogId("019");
		log2.setOperateUser("admin");
		log2.setOperateTime("2014-09-02 11:39:22");
		log2.setLogContent("这也是一个测试日志对象");
		
		ClassAdapter adapter=new ClassAdapter("");
		adapter.createLog(log1);
		adapter.createLog(log2);
		adapter.removeLog(log1);
		List<LogModel> logList=adapter.getAllLog();
		System.out.println("logList:"+logList);
	}
}
