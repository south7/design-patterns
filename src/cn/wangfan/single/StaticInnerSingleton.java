package cn.wangfan.single;
/**
 * ��̬�ڲ���
 * @author wangfan
 *
 */
public class StaticInnerSingleton {

	private StaticInnerSingleton(){}
	//��̬�ڲ���,�ⲿ�ࣨStaticInnerSingleton�������أ��ڲ���û�б����أ���������ʹ��
	private static class StaticInnerClass{
		private static StaticInnerSingleton staticInnerSingleton=new StaticInnerSingleton();
	}
	public static StaticInnerSingleton getInstance(){
		return StaticInnerClass.staticInnerSingleton;
	}
}
