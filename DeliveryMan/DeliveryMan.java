import java.util.LinkedList;
import java.util.Queue;

/**
 * This is the Delivery Man class for OOP Final Project.
 * 
 * @author 許祐嘉,deanchenn
 * @version 2022/5/31 ver.3
 * @changes added: <br>
 *          1. 新增外送員位置:
 *          {@code Position deliveryManPosition}、{@code String globalDeliveryManPosition}<br>
 *          2. 新增外送員API: {@code deliveryManAPI}，但還不確定API method的輸入跟輸出是什麼<br>
 *          3. 計算訂單運送所需時間: {@code calcDeliverTime()}，計算方法需要跟API方法確認再修改<br>
 *          changed:
 *          把setOrder寫成addOrder，也就是判斷當下外送員可接單後，把這個訂單加進目前已經接的currentOrder當中
 *          將currentOrder（目前訂單）從單一訂單改成一個可存複數訂單的Queue
 *          我把IsOrderArrived（是否送達訂單）相關的method先comment掉，是否應該改成用Orders
 *          class中的state來紀錄較合理？
 * 
 */
public class DeliveryMan {
	
	private int phoneNumber;// 外送員的電話號碼
	private String deliveryManName;// 外送員的姓名
	private boolean receiveOrNot = true;// 是否要接訂單
	private Queue<Orders> currentOrder;// 目前訂單
	private Position deliveryManPosition;// 外送員位置
	private API deliveryManAPI;
	private String account;
	private String password;
//	private boolean isOrderArrived = false;// 是否送達訂單
	
	/**
	 * Constructor
	 * 
	 * @param account             - 外送員帳號
	 * @param password            - 外送員密碼
	 * @param phoneNumber         - 外送員電話
	 * @param emailAccount        - 外送員信箱
	 * @param deliveryManName     - 外送員名字
	 * @param orders              - 訂單
	 * @param deliveryManPosition - 外送員位置
	 */
	public DeliveryMan(String account, String password, int phoneNumber, String emailAccount, String deliveryManName,
			Queue<Orders> orders, API deliveryManAPI, Position deliveryManPosition) {
		this.account = account;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.deliveryManName = deliveryManName;
		this.currentOrder = orders;
		this.deliveryManAPI = deliveryManAPI;
		this.deliveryManPosition = deliveryManPosition;
	}
	
	// get set
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getAccount() {
		return account;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setDeliveryManAPI(API deliveryManAPI) {
		this.deliveryManAPI = deliveryManAPI;
	}
	
	public API getDeliveryManAPI() {
		return deliveryManAPI;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setDeliveryManName(String deliveryManName) {
		this.deliveryManName = deliveryManName;
	}
	
	public String getDeliveryManName() {
		return deliveryManName;
	}
	
	/**
	 * @param order - Order constructed by store(or customer?).
	 * @throws deliveryManException If delivery man is not able to receive the
	 *                              order.
	 */
	public void addOrder(Orders order) throws deliveryManException {
		if (!receiveOrNot) {
			// 外送員沒空 ->接單失敗
			throw new deliveryManException(deliveryManException.exceptionType.ImBusyNow);
		} else {
			// 外送員有空 ->接單成功
			if (this.currentOrder.isEmpty()) {
				this.currentOrder = new LinkedList<Orders>();
			}
			this.currentOrder.offer(order);
			currentOrder.element().setCurrentState(state.mealDelivering);// 訂單狀態改成運送中
			
		}
		
	}
	
	public Queue<Orders> getOrder() {
		Queue<Orders> copy = new LinkedList<Orders>(this.currentOrder);
		return copy;
	}
	
	/**
	 * @return 運送所需總時間
	 */
	public int calcDeliverTime() {
		String str1 = deliveryManAPI.toGlobal(currentOrder.element().getDeliverAddress());// 客人地址轉global
		String str2 = deliveryManAPI.toGlobal(deliveryManPosition);// 外送員位置轉global
		String str3 = deliveryManAPI.toGlobal(currentOrder.element().getStoreAddress());// 店家地址轉global
		// 如何使用travelTime()來算時間?
		String[] str = { str1, str2, str3 };// 是這樣嗎?
		currentOrder.element().setDeliverTime(currentOrder.element().getOrderTime() + deliveryManAPI.travelTime(str));// 抵達時間=下單時間+運送時間
		return deliveryManAPI.travelTime(str);
	}
	
//	/**
//	 * @param isOrderArrived - {@code true} if the meal arrives, {@code false}
//	 *                       otherwise.
//	 */
//	public void setIsOrderArrived(boolean isOrderArrived) {
//		this.isOrderArrived = isOrderArrived;
//		if (isOrderArrived) {
//			this.currentOrder.setCurrentState(state.mealArrived);
//		} else {
//			this.currentOrder.setCurrentState(state.mealDelivering);
//		}
//	}
//	
//	public boolean getIsOrderArrived() {
//		return this.isOrderArrived;
//	}
	
	/**
	 * 
	 * 查看歷史訂單
	 * 
	 * @param store - Object in the type of Class Stores
	 * @return History order list of the store.
	 */
	public Queue<Orders> getOrderList(Stores store) {
		Queue<Orders> copy = new LinkedList<Orders>(store.getOrderList());
		return copy;
	}
}