package cn.wangfan.factory.method;
/**
 * ���幤����ɫ
 * @author wangfan
 *
 */
public class AudiTruckFactory implements TruckFactory{

	@Override
	public Truck_m produceTruck() {
		return new AudiTruck_m();
	}

}
