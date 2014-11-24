package facade2;
/*
 * 客户端不需要调用子系统内部的多个模块
 * 直接使用外观对象就可以了
 */
public class Client2 {
public static void main(String[] args) {
	new Facade().generate();
}
}
