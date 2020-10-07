package cn.wangfan.single;
/**
 * 饿汉式单例（立即加载方式）
 * @author wangfan
 *
 */
public class HungrySingleton1 {
    //私有构造
	private HungrySingleton1(){}
	private static HungrySingleton1 hungrySingleton1=new HungrySingleton1();
	//静态工厂方法
	public static HungrySingleton1 getInstance(){
		return hungrySingleton1;
	}
}
