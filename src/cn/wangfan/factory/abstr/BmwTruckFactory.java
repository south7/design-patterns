package cn.wangfan.factory.abstr;

public class BmwTruckFactory implements VehicleFactory{

	@Override
	public Truck_a produceTruck() {
		return new BmwTruck();
	}

	@Override
	public Sedan produceSedan() {
		return new BmwSedan();
	}

}
