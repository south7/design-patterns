package cn.wangfan.factory.method;
/**
 * 新增具体工厂角色：大众卡车工厂
 * @author wangfan
 *
 */
public class volkTruckFactory implements TruckFactory{

	@Override
	public Truck_m produceTruck() {
		return new VolkTruck_m();
	}

}
