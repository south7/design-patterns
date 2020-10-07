package cn.wangfan.single;

/**
 * 懒汉式单例(延迟加载)
 * 
 * @author wangfan
 *
 */
public class LazySingleton {
	// 私有构造
	private LazySingleton() {
	}

	private static LazySingleton lazySingleton = null;

	/**
	 * 双重检查
	 * 避免整个方法被锁，只对需要锁的代码部分加锁，可以提高执行效率
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
