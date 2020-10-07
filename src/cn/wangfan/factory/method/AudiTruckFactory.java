package cn.wangfan.factory.method;
/**
 * 具体工厂角色
 * @author wangfan
 *
 */
public class AudiTruckFactory implements TruckFactory{

	@Override
	public Truck_m produceTruck() {
		return new AudiTruck_m();
	}

}
