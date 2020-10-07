package cn.wangfan.single;
/**
 * 饿汉式单例（立即加载方式）
 * @author wangfan
 *
 */
public class HungrySingleton2 {
    //私有构造
	private HungrySingleton2(){}
	
	private static HungrySingleton2 hungrySingleton2=null;
	//静态代码块
	static {
		 hungrySingleton2=new HungrySingleton2();
	}
	
	public static HungrySingleton2 getInstance(){
		return hungrySingleton2;
	}
}
