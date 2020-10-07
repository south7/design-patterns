package cn.wangfan.factory.simple;
/**
 * 具体产品角色
 * @author wangfan
 *
 */
public class BmwTruck_s implements Truck_s{

	@Override
	public void run() {
		System.out.println("宝马卡车启动");
	}

}
