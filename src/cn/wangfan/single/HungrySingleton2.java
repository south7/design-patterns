package cn.wangfan.single;
/**
 * ����ʽ�������������ط�ʽ��
 * @author wangfan
 *
 */
public class HungrySingleton2 {
    //˽�й���
	private HungrySingleton2(){}
	
	private static HungrySingleton2 hungrySingleton2=null;
	//��̬�����
	static {
		 hungrySingleton2=new HungrySingleton2();
	}
	
	public static HungrySingleton2 getInstance(){
		return hungrySingleton2;
	}
}
