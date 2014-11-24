package facade2;
/*
 * 各个代码生成模块
 * 它们获取配置文件内容
 * 然后按照配置文件来生成相应的代码
 */
public class DAO {
	public void generate(){
		ConfigModel cm=ConfigManager.getInstance().getConfigData();
		if(cm.isneedGenDAO()){
			System.out.println("正在生成DAO代码");
		}
	}
}
