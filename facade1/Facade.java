package facade1;
/*
 * 定义外观对象
 * 定义子系统的多个模块对外的高层接口
 * 通常需要调用内部多个模块
 * 从而把客户的请求代理给适当的子系统对象
 */
public class Facade {
/*
 * 示意方法,满足客户端需要的功能
 */
	public void test(){
		AModuleApi a=new AmoduleImp1();
		a.testA();
		BModuleApi b=new BmoduleImp1();
		b.testB();
		CModuleApi c=new CmoduleImp1();
		c.testC();
	}
}
