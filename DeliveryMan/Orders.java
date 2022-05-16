
public class Orders {
	private int number;// �q��s��
	private Items[] items;// �\�I
	
	private state currentState;// �q�檬�A
	
	private int amount;// �q����B
	private String orderTime;// �U��ɶ�
	private String deliverTime;// �e�F�ɶ�
	private String deliverAddress;// �t�e��m
	private String customerName;// ���O�̩m�W
	private String deliveryManName;// �~�e���W�r
	private String storeName;// ���a�W�r
	
	// Constructor
	/**
	 * 
	 * @param number          - �q��s��
	 * @param items           - �q�椺�e
	 * @param orderTime       - �U��ɶ�
	 * @param deliverTime     - �e�F�ɶ�
	 * @param deliverAddress  - �t�e��m
	 * @param customerName    - ���O�̦W�r
	 * @param deliveryManName - �~�e���W�r
	 * @param store           - ���a��T
	 */
	public Orders(int number, Items items[], String orderTime, String deliverTime, String deliverAddress,
			String customerName, String deliveryManName, Stores store) {
		this.number = number;
		this.orderTime = orderTime;
		this.deliverAddress = deliverAddress;
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
	
	public Items[] getItems() {
		return items;
	}
	
	public void setItems(Items items[]) {
		this.items = new Items[items.length];
		for (int i = 0; i < items.length; i++) {
			this.items[i] = items[i];
		}
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
	
	public String getOrderTime() {
		return orderTime;
	}
	
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	public String getDeliverTime() {
		return deliverTime;
	}
	
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}
	
	public String getDeliverAddress() {
		return deliverAddress;
	}
	
	public void setDeliverAddress(String deliverAddress) {
		this.deliverAddress = deliverAddress;
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