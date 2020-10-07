package cn.wangfan.factory.method;
/**
 * 具体工厂角色
 * @author wangfan
 *
 */
public class BmwTruckFactory implements TruckFactory{

	@Override
	public Truck_m produceTruck() {
		return new BmwTruck_m();
	}

}
