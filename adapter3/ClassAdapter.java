package adapter3;

import java.util.List;

import adapter1.LogFileOperate;
import adapter1.LogModel;
import adapter2.LogDboperateApi;

/*
 * 适配器模式在在实现中，有两种：一种是对象适配器，一种是类适配器
 * 本例是类适配器对象
 * 与对象适配器实现同样的功能相比
 * 类适配器在实现上有如下改变：
 * 需要继承LogFileOperate的实现，然后再实现LogDBOperateApi接口
 * 而原先基于对象实现的适配器持有了一个基本版本的Api实现对象
 */
public class ClassAdapter extends LogFileOperate implements LogDboperateApi {

	public ClassAdapter(String logFilePathName) {
		super(logFilePathName);
	}

	@Override
	public void createLog(LogModel lm) {
		// TODO Auto-generated method stub
		List<LogModel> list=this.readLogFile();
		list.add(lm);
		//重新写入
		this.writeLogFile(list);
	}

	@Override
	public void updateLog(LogModel lm) {
		// TODO Auto-generated method stub
		List<LogModel> list=this.readLogFile();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getLogId().equals(lm.getLogId()))
				list.set(i, lm);
				break;
		}
		this.writeLogFile(list);
	}

	@Override
	public void removeLog(LogModel lm) {
		// TODO Auto-generated method stub
		List<LogModel> list=this.readLogFile();
		list.remove(lm);
		this.writeLogFile(list);
	}

	@Override
	public List<LogModel> getAllLog() {
		// TODO Auto-generated method stub
		return this.readLogFile();
	}
	
}
