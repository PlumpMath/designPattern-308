package facade2;
/*
 * 示意配置管理,就是负责读取配置文件
 * 并把配置文件的内容设置到配置Model中去,是个单例
 */
public class ConfigManager {
	private static ConfigManager manager=null;
	private static ConfigModel cm=null;
	private ConfigManager(){
		
	}
	
	public static ConfigManager getInstance(){
		if(manager==null){
			manager=new ConfigManager();
			cm=new ConfigModel();
		}
		return manager;
	}
	
	public ConfigModel getConfigData(){
		return cm;
	}
} 
