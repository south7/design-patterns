package cn.wangfan.factory.abstr;

public class AudiTruckFactory implements VehicleFactory{

	@Override
	public Truck_a produceTruck() {
		return new AudiTruck();
	}

	@Override
	public Sedan produceSedan() {
		return new AudiSedan();
	}

}
