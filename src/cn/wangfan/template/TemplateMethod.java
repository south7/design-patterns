package cn.wangfan.template;

/**
 * 模板方法模式 Template Method
 * 
 * @author thehe
 *
 */
public class TemplateMethod {

	// 模式定义：定义一个操作的算法骨架，而将一些步骤延迟到子类中。
	// Template Method 使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
	public static void main(String[] args) {
		AbstractClass subClass = new SubClass();
		subClass.operation();
		AbstractClass subClass2 = new SubClass2();
		subClass2.operation();

	}
}

// 定义一个操作的算法骨架
abstract class AbstractClass {
	public void operation() {
		System.out.println("pre ...");
		System.out.println("setp1 ...");
		System.out.println("step2 ...");
		templateMethod();
		System.out.println("complete ...");
	}

	// 将一些步骤延迟到子类中
	abstract protected void templateMethod();
}

// 子类
class SubClass extends AbstractClass {

	@Override
	protected void templateMethod() {
		System.out.println("SubClass executed ...");
	}

}

// 子类
class SubClass2 extends AbstractClass {

	@Override
	protected void templateMethod() {
		System.out.println("SubClass2 executed ...");
	}

}
