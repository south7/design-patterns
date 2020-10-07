package cn.wangfan.factory.simple;
/**
 * 工厂类角色
 * @author wangfan
 *
 */
public class TruckFactory {

	public static Truck_s produceTruck(String message){
		if(message.equals("宝马")){
			return new BmwTruck_s();
		}else if(message.equals("奥迪")){
			return new AudiTruck_s(); 
		}else{
			return null;
		}
	}
}
