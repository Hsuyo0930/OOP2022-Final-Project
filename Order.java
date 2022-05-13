
/**
 * 
 * Define a order information should have.
 * 
 * @author �\����
 *
 */
public interface Order {
	
	String orderNumber = null;// �q��s��
//	OrderState orderState = null; //�q�檬�A(���T�w��ƫ��A)
	String storeAddress = null;// �Ӯa�a�}
	double orderConsumption = 0;// ���O���B
	String orderTime = null;// �q�榨�߮ɶ�
	String orderArriveTime = null;// �q���F�ɶ�
	String deliveryAddress = null;// �t�e�a�}
	String consumerName = null;// ���O�̦W�r
	String delivererName = null;// �~�e���W�r
	
	public String toString();// show all of the information about the order.
	
	public void setOrderNumber();// to set up the order number.
	
	public void setStoreAddress();// to set up the store address.
	
	public void setOrderConsumption();// to set up the consumption.
	
	public void setOrderTime();// to set up the order time
}
