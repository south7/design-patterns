package cn.wangfan.factory.simple;
/**
 * �������ɫ
 * @author wangfan
 *
 */
public class TruckFactory {

	public static Truck_s produceTruck(String message){
		if(message.equals("����")){
			return new BmwTruck_s();
		}else if(message.equals("�µ�")){
			return new AudiTruck_s(); 
		}else{
			return null;
		}
	}
}
