package cn.wangfan.factory.abstr;

public class Customer_a {

	public static void main(String[] args) {
		VehicleFactory bmwTruckFactory = new BmwTruckFactory();
		bmwTruckFactory.produceTruck().run();
		bmwTruckFactory.produceSedan().run();
		
		VehicleFactory audiTruckFactory = new AudiTruckFactory();
		audiTruckFactory.produceTruck().run();
		audiTruckFactory.produceSedan().run();
	}
}
