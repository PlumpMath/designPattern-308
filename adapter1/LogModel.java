package adapter1;

import java.io.Serializable;

import sun.security.acl.OwnerImpl;

/*
 * 日志管理第一版
 * 日志数据对象
 */
public class LogModel implements Serializable{
	private String logId;
	private String operateUser;// 操作人员
	private String operateTime;// 操作时间
	private String logContent;

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getOperateUser() {
		return operateUser;
	}

	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getLogContent() {
		return logContent;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}
	
	public String toString(){
		return "logId="+logId+",operateUser="+operateUser+",operateTime="+operateTime+",logContent="+logContent;
	}

}
