package adapter1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {
	private String logFilePathName = "AdapterLogs.log";// 默认的日志文件路径

	public LogFileOperate(String logFilePathName) {
		// 如果传入了文件路径则重新设置路径
		if (logFilePathName != null && logFilePathName.trim().length() > 0) {
			this.logFilePathName = logFilePathName;
		}
	}

	// 读文件
	@Override
	public List<LogModel> readLogFile() {
		List<LogModel> list = null;
		ObjectInputStream ois = null;
		try {
			File f = new File(logFilePathName);
			if (f.exists()) {
				ois = new ObjectInputStream(new BufferedInputStream(
						new FileInputStream(f)));
				list = (List<LogModel>) ois.readObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	// 写文件
	@Override
	public void writeLogFile(List<LogModel> logList) {
		// TODO Auto-generated method stub
		File f = new File(logFilePathName);
		ObjectOutputStream oos = null;
		try {
			oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
			oos.writeObject(logList);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
