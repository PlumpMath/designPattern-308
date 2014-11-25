package adapter2;

import java.util.List;
import adapter1.LogModel;

/*
 * 把日志文件保存到数据库的接口
 * 此接口将会与第一版的logFileOperateApi适配
 */
public interface LogDboperateApi {
	//新增日志
	public void createLog(LogModel lm);
	//修改日志
	public void updateLog(LogModel lm);
	//删除日志
	public void removeLog(LogModel lm);
	//获取所有日志
	public List<LogModel> getAllLog();
}
