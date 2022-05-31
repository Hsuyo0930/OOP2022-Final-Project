import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author 許祐嘉, deanchenn
 * @version 2022/5/29 ver.2
 * @changes added: none <br>
 *          changed: <br>
 *          1. 將Address type 改成Position以符合class {@code API} 裡面 method
 *          {@code toGlobal()} 要求.<br>
 *          2. 將{@code orderTime}跟{@code deliverTime} 資料型態改成int以符合class
 *          {@code API}裡面{@code travelTime}的回傳值，後面getter跟setter也改了<br>
 * 			
 */
public class Orders {
	private int number;// 訂單編號
	private Queue<Items> itemList;// 餐點
	
	private state currentState;// 訂單狀態
	
	private int amount;// 訂單金額
	private int orderTime;// 下單時間
	private int deliverTime;// 送達時間
	private Position deliverAddress;// 配送位置
	private Position storeAddress;// 店家位置
	private String customerName;// 消費者姓名
	private String deliveryManName;// 外送員名字
	private String storeName;// 店家名字
	
	// Constructor
	/**
	 * 
	 * @param number          - 訂單編號
	 * @param items           - 訂單內容
	 * @param orderTime       - 下單時間
	 * @param deliverTime     - 送達時間
	 * @param deliverAddress  - 配送位置
	 * @param customerName    - 消費者名字
	 * @param deliveryManName - 外送員名字
	 * @param store           - 店家資訊
	 */
	public Orders(int number, Queue<Items> itemList, int orderTime, int deliverTime, Position deliverAddress,
			Position storeAddress, String customerName, String deliveryManName, Stores store) {
		this.number = number;
		this.itemList = itemList;
		this.orderTime = orderTime;
		this.deliverTime = deliverTime;
		this.deliverAddress = deliverAddress;
		this.storeAddress = storeAddress;
		this.customerName = customerName;
		this.deliveryManName = deliveryManName;
		this.storeName = store.getName();
	}
	
	// get set
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Queue<Items> getItemList() {
		return itemList;
	}
	
	public void setItems(Queue<Items> itemList) {
		this.itemList = new LinkedList<Items>(itemList);
	}
	
	public String getCurrentState() {
		return currentState.getState();
	}
	
	public void setCurrentState(state currentState) {
		this.currentState = currentState;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}
	
	public int getDeliverTime() {
		return deliverTime;
	}
	
	public void setDeliverTime(int deliverTime) {
		this.deliverTime = deliverTime;
	}
	
	public Position getDeliverAddress() {
		return deliverAddress;
	}
	
	public void setDeliverAddress(Position deliverAddress) {
		this.deliverAddress = deliverAddress;
	}
	
	public Position getStoreAddress() {
		return storeAddress;
	}
	
	public void setStoreAddress(Position storeAddress) {
		this.storeAddress = storeAddress;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getDeliveryManName() {
		return deliveryManName;
	}
	
	public void setDeliveryManName(String deliveryManName) {
		this.deliveryManName = deliveryManName;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(Stores store) {
		this.storeName = store.getName();
	}
	
}