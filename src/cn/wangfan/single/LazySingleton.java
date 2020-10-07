package cn.wangfan.single;

/**
 * ����ʽ����(�ӳټ���)
 * 
 * @author wangfan
 *
 */
public class LazySingleton {
	// ˽�й���
	private LazySingleton() {
	}

	private static LazySingleton lazySingleton = null;

	/**
	 * ˫�ؼ��
	 * ������������������ֻ����Ҫ���Ĵ��벿�ּ������������ִ��Ч��
	 * @return lazySingleton
	 */
	public static LazySingleton getInstance() {
		if (null == lazySingleton) {
			synchronized (LazySingleton.class) {
				if (null == lazySingleton) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}

}
