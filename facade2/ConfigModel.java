package facade2;

/*
 * 模拟一个基于外观模式的代码生成工具
 * 分别生成表现层、逻辑层、DAO层
 * 这个类描述配置的数据Model
 */
public class ConfigModel {
	private boolean needGenPresentation = true;
	private boolean needGenBusiness = true;
	private boolean needGenDAO = true;

	public void setNeedGenPresentation(boolean needGenPresentation) {
		this.needGenPresentation = needGenPresentation;
	}

	public void setNeedGenBusiness(boolean needGenBusiness) {
		this.needGenBusiness = needGenBusiness;
	}

	public void setNeedGenDAO(boolean needGenDAO) {
		this.needGenDAO = needGenDAO;
	}
	
	public boolean isneedGenDAO (){
		return needGenPresentation;
	}
	public boolean isneedGenBusiness (){
		return needGenBusiness;
	}
	public boolean isneedGenPresentation (){
		return needGenDAO;
	}
}
