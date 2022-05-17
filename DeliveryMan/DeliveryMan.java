
/**
 * This is the Delivery Man class for OOP Final Project.
 * 
 * @author �\����
 *
 */
public class DeliveryMan {
	
	private int phoneNumber;// �~�e�����q�ܸ��X
	private String deliveryManName;// �~�e�����m�W
	private boolean receiveOrNot = true;// �O�_�n���q��
	private Orders currentOrder;// �ثe�q��
	private boolean isOrderArrived = false;// �O�_�e�F�q��
	
	/**
	 * Constructor
	 * 
	 * @param phoneNumber     - �~�e�����q�ܸ��X
	 * @param deliveryManName - �~�e���m�W
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
		if (!receiveOrNot) { // �~�e���S��->���楢��
			throw new deliveryManException(deliveryManException.exceptionType.ImBusyNow);
		} else { // �~�e������ ->���榨�\
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
	 * �d�ݾ��v�q��
	 * 
	 * @param store - Object in the type of Class Stores
	 * @return History order list of the store.
	 */
	public Orders[] getOrderList(Stores store) {
		return store.getOrderList();
	}
}
