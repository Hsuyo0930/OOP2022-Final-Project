import java.util.LinkedList;
import java.util.Queue;

/**
 * This is the Delivery Man class for OOP Final Project.
 * 
 * @author �\����,deanchenn
 * @version 2022/5/31 ver.3
 * @changes added: <br>
 *          1. �s�W�~�e����m:
 *          {@code Position deliveryManPosition}�B{@code String globalDeliveryManPosition}<br>
 *          2. �s�W�~�e��API: {@code deliveryManAPI}�A���٤��T�wAPI method����J���X�O����<br>
 *          3. �p��q��B�e�һݮɶ�: {@code calcDeliverTime()}�A�p���k�ݭn��API��k�T�{�A�ק�<br>
 *          changed:
 *          ��setOrder�g��addOrder�A�]�N�O�P�_��U�~�e���i�����A��o�ӭq��[�i�ثe�w�g����currentOrder��
 *          �NcurrentOrder�]�ثe�q��^�q��@�q��令�@�ӥi�s�Ƽƭq�檺Queue
 *          �ڧ�IsOrderArrived�]�O�_�e�F�q��^������method��comment���A�O�_���ӧ令��Orders
 *          class����state�Ӭ������X�z�H
 * 
 */
public class DeliveryMan {
	
	private int phoneNumber;// �~�e�����q�ܸ��X
	private String deliveryManName;// �~�e�����m�W
	private boolean receiveOrNot = true;// �O�_�n���q��
	private Queue<Orders> currentOrder;// �ثe�q��
	private Position deliveryManPosition;// �~�e����m
	private API deliveryManAPI;
	private String account;
	private String password;
//	private boolean isOrderArrived = false;// �O�_�e�F�q��
	
	/**
	 * Constructor
	 * 
	 * @param account             - �~�e���b��
	 * @param password            - �~�e���K�X
	 * @param phoneNumber         - �~�e���q��
	 * @param emailAccount        - �~�e���H�c
	 * @param deliveryManName     - �~�e���W�r
	 * @param orders              - �q��
	 * @param deliveryManPosition - �~�e����m
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
			// �~�e���S�� ->���楢��
			throw new deliveryManException(deliveryManException.exceptionType.ImBusyNow);
		} else {
			// �~�e������ ->���榨�\
			if (this.currentOrder.isEmpty()) {
				this.currentOrder = new LinkedList<Orders>();
			}
			this.currentOrder.offer(order);
			currentOrder.element().setCurrentState(state.mealDelivering);// �q�檬�A�令�B�e��
			
		}
		
	}
	
	public Queue<Orders> getOrder() {
		Queue<Orders> copy = new LinkedList<Orders>(this.currentOrder);
		return copy;
	}
	
	/**
	 * @return �B�e�һ��`�ɶ�
	 */
	public int calcDeliverTime() {
		String str1 = deliveryManAPI.toGlobal(currentOrder.element().getDeliverAddress());// �ȤH�a�}��global
		String str2 = deliveryManAPI.toGlobal(deliveryManPosition);// �~�e����m��global
		String str3 = deliveryManAPI.toGlobal(currentOrder.element().getStoreAddress());// ���a�a�}��global
		// �p��ϥ�travelTime()�Ӻ�ɶ�?
		String[] str = { str1, str2, str3 };// �O�o�˶�?
		currentOrder.element().setDeliverTime(currentOrder.element().getOrderTime() + deliveryManAPI.travelTime(str));// ��F�ɶ�=�U��ɶ�+�B�e�ɶ�
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
	 * �d�ݾ��v�q��
	 * 
	 * @param store - Object in the type of Class Stores
	 * @return History order list of the store.
	 */
	public Queue<Orders> getOrderList(Stores store) {
		Queue<Orders> copy = new LinkedList<Orders>(store.getOrderList());
		return copy;
	}
}