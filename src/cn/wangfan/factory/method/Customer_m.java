package cn.wangfan.factory.method;

public class Customer_m {

	public static void main(String[] args) {
		TruckFactory bmwTruckFactory = new BmwTruckFactory();
		TruckFactory audiTruckFactory = new AudiTruckFactory();
		bmwTruckFactory.produceTruck().run();
		audiTruckFactory.produceTruck().run();
	}
}
