package cn.wangfan.factory.method;
/**
 * �������幤����ɫ�����ڿ�������
 * @author wangfan
 *
 */
public class volkTruckFactory implements TruckFactory{

	@Override
	public Truck_m produceTruck() {
		return new VolkTruck_m();
	}

}
