package cn.wangfan.single;
/**
 * 静态内部类
 * @author wangfan
 *
 */
public class StaticInnerSingleton {

	private StaticInnerSingleton(){}
	//静态内部类,外部类（StaticInnerSingleton）被加载，内部类没有被加载，除非主动使用
	private static class StaticInnerClass{
		private static StaticInnerSingleton staticInnerSingleton=new StaticInnerSingleton();
	}
	public static StaticInnerSingleton getInstance(){
		return StaticInnerClass.staticInnerSingleton;
	}
}
