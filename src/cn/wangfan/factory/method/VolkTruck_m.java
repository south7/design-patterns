package cn.wangfan.factory.method;
/**
 * 新增具体产品角色：大众卡车
 * @author wangfan
 *
 */
public class VolkTruck_m implements Truck_m{

	@Override
	public void run() {
		System.out.println("大众卡车启动");
	}

}
