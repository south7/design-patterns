package cn.wangfan.factory.method;
/**
 * ���幤����ɫ
 * @author wangfan
 *
 */
public class BmwTruckFactory implements TruckFactory{

	@Override
	public Truck_m produceTruck() {
		return new BmwTruck_m();
	}

}
