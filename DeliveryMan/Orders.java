import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author �\����, deanchenn
 * @version 2022/5/29 ver.2
 * @changes added: none <br>
 *          changed: <br>
 *          1. �NAddress type �令Position�H�ŦXclass {@code API} �̭� method
 *          {@code toGlobal()} �n�D.<br>
 *          2. �N{@code orderTime}��{@code deliverTime} ��ƫ��A�令int�H�ŦXclass
 *          {@code API}�̭�{@code travelTime}���^�ǭȡA�᭱getter��setter�]��F<br>
 * 			
 */
public class Orders {
	private int number;// �q��s��
	private Queue<Items> itemList;// �\�I
	
	private state currentState;// �q�檬�A
	
	private int amount;// �q����B
	private int orderTime;// �U��ɶ�
	private int deliverTime;// �e�F�ɶ�
	private Position deliverAddress;// �t�e��m
	private Position storeAddress;// ���a��m
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