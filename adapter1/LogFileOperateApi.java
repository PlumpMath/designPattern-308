package adapter1;

import java.util.List;

/*
 * 日志文件操作接口
 */
public interface LogFileOperateApi {
	public List<LogModel> readLogFile();//读取日志文件,从文件里获取存储的日志列表对象
	public void writeLogFile(List<LogModel> logList);//写日志文件,把日志列表写到文件中去
}
