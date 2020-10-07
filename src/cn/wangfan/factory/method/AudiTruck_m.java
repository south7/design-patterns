package cn.wangfan.factory.method;
/**
 * 具体产品角色
 * @author wangfan
 *
 */
public class AudiTruck_m implements Truck_m{

	@Override
	public void run() {
           System.out.println("奥迪卡车启动");		
	}

}
