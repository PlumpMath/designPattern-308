package simpleFactory;

public class Client {
	public static void main(String[] args) {
		Api api=ApiFactory.createApi();
		api.operation("看看我是哪个接口实现类！");
	}
}
