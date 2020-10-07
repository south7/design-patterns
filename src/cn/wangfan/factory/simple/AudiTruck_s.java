package cn.wangfan.factory.simple;
/**
 * 具体产品角色
 * @author wangfan
 *
 */
public class AudiTruck_s implements Truck_s{

	@Override
	public void run() {
           System.out.println("奥迪卡车启动");		
	}

}
