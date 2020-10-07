package cn.wangfan.factory.simple;
/**
 * 新增具体产品角色：大众卡车
 * 这需要修改工厂类角色中的代码才可以创建出对象
 * @author wangfan
 *
 */
public class VolkTruck_s implements Truck_s{

	@Override
	public void run() {
		System.out.println("大众卡车启动");
	}

}
