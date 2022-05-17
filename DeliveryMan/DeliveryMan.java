
/**
 * This is the Delivery Man class for OOP Final Project.
 * 
 * @author 許祐嘉
 *
 */
public class DeliveryMan {
	
	private int phoneNumber;// 外送員的電話號碼
	private String deliveryManName;// 外送員的姓名
	private boolean receiveOrNot = true;// 是否要接訂單
	private Orders currentOrder;// 目前訂單
	private boolean isOrderArrived = false;// 是否送達訂單
	
	/**
	 * Constructor
	 * 
	 * @param phoneNumber     - 外送員的電話號碼
	 * @param deliveryManName - 外送員姓名
	 */
	public DeliveryMan(String account, String password, int phoneNumber, String emailAccount, String deliveryManName,
			Orders order) {
		this.phoneNumber = phoneNumber;
		this.deliveryManName = deliveryManName;
		this.currentOrder = order;
	}
	// get set
	
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
	public void setOrder(Orders order) throws deliveryManException {
		if (!receiveOrNot) { // 外送員沒空->接單失敗
			throw new deliveryManException(deliveryManException.exceptionType.ImBusyNow);
		} else { // 外送員有空 ->接單成功
			this.currentOrder = order;
		}
		
	}
	
	public Orders getOrder() {
		return this.currentOrder;
	}
	
	/**
	 * @param isOrderArrived - {@code true} if the meal arrives, {@code false}
	 *                       otherwise.
	 */
	public void setIsOrderArrived(boolean isOrderArrived) {
		this.isOrderArrived = isOrderArrived;
		if (isOrderArrived) {
			this.currentOrder.setCurrentState(state.mealArrived);
		} else {
			this.currentOrder.setCurrentState(state.mealDelivering);
		}
	}
	
	public boolean getIsOrderArrived() {
		return this.isOrderArrived;
	}
	
	/**
	 * 
	 * 查看歷史訂單
	 * 
	 * @param store - Object in the type of Class Stores
	 * @return History order list of the store.
	 */
	public Orders[] getOrderList(Stores store) {
		return store.getOrderList();
	}
}
