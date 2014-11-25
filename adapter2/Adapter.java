package adapter2;

import java.util.List;

import adapter1.LogFileOperateApi;
import adapter1.LogModel;
/*
 * 适配器对象,将记录日志到文件的功能适配成第二版API需要的增删改查功能
 * 模式功能：
 * 适配器模式的主要功能是进行转换匹配，目的是复用已有的功能，而不是来实现新的接口。
 * 即，客户端需要的功能是已经实现好了的，不需要适配器模式来实现，
 * 适配器主要负责把不兼容的接口转换成客户端期望的样子
 */
public class Adapter implements LogDboperateApi{
	//适配器通常是一个Target类型而不是Adaptee类型
	//持有需要被适配的对象
	private LogFileOperateApi adaptee;
	public Adapter(LogFileOperateApi adaptee){
		this.adaptee=adaptee;
	}
	@Override
	public void createLog(LogModel lm) {
		// TODO Auto-generated method stub
		List<LogModel> list=adaptee.readLogFile();//先读取文件内容
		list.add(lm);//加入新的日志对象
		adaptee.writeLogFile(list);//重新写入文件
	}

	@Override
	public void updateLog(LogModel lm) {
		// TODO Auto-generated method stub
		List<LogModel> list=adaptee.readLogFile();//先读取文件内容
		for(int i=0;i<list.size();i++){
			if(list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i, lm);
				break;
			}
		}
		
		adaptee.writeLogFile(list);//重新写入文件
	}

	@Override
	public void removeLog(LogModel lm) {
		// TODO Auto-generated method stub
		List<LogModel> list=adaptee.readLogFile();//先读取文件内容
		list.remove(lm);
		adaptee.writeLogFile(list);//重新写入文件
	}

	@Override
	public List<LogModel> getAllLog() {
		// TODO Auto-generated method stub
		return adaptee.readLogFile();
	}
	
}
