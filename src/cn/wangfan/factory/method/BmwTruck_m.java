package cn.wangfan.factory.method;
/**
 * 具体产品角色
 * @author wangfan
 *
 */
public class BmwTruck_m implements Truck_m{

	@Override
	public void run() {
		System.out.println("宝马卡车启动");
	}

}
