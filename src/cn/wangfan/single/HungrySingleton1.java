package cn.wangfan.single;
/**
 * ����ʽ�������������ط�ʽ��
 * @author wangfan
 *
 */
public class HungrySingleton1 {
    //˽�й���
	private HungrySingleton1(){}
	private static HungrySingleton1 hungrySingleton1=new HungrySingleton1();
	//��̬��������
	public static HungrySingleton1 getInstance(){
		return hungrySingleton1;
	}
}
