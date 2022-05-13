
/**
 * 
 * Define a order information should have.
 * 
 * @author 許祐嘉
 *
 */
public interface Order {
	
	String orderNumber = null;// 訂單編號
//	OrderState orderState = null; //訂單狀態(不確定資料型態)
	String storeAddress = null;// 商家地址
	double orderConsumption = 0;// 消費金額
	String orderTime = null;// 訂單成立時間
	String orderArriveTime = null;// 訂單抵達時間
	String deliveryAddress = null;// 配送地址
	String consumerName = null;// 消費者名字
	String delivererName = null;// 外送員名字
	
	public String toString();// show all of the information about the order.
	
	public void setOrderNumber();// to set up the order number.
	
	public void setStoreAddress();// to set up the store address.
	
	public void setOrderConsumption();// to set up the consumption.
	
	public void setOrderTime();// to set up the order time
}
