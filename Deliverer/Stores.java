
public class Stores {
	// �U�д��Ѫ��Ӯa��T���W��w�q
	
	private String account; // �b��
	private String password; // �K�X
	private String email; // email
	private int discount_threshold; // ���Bx����i�o��馩
	private int discount_amount; // ���B��o�쪺�馩���B
	
	// ���a��L��T�]����json�ɡ^
	
	private String name;
	private Position position;
	private String phone;
	private String store_description;
	private String order_description;
	private String[] type;
	private Items[] itemList; // �ӫ~�M��
	private String[] businessTime; // ��~�ɶ�
	
	private Orders[] orderList; // �q�檺list
	private Orders[] historyOrders; // ���v�q�檺list
	
	public String getAccount() {
		return account;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getDiscountThreshold() {
		return discount_threshold;
	}
	
	public int getDiscountAmount() {
		return discount_amount;
	}
	
	public String getName() {
		return name;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getStoreDescription() {
		return store_description;
	}
	
	public String getOrderDescription() {
		return order_description;
	}
	
	public String[] getType() {
		return type;
	}
	
	public Items[] getItemList() {
		return itemList;
	}
	
	public String[] getBusinessTime() {
		return businessTime;
	}
	
	public Orders[] getOrderList() {
		return orderList;
	}
	
	public Orders[] getHistoryOrders() {
		return historyOrders;
	}
}

/*
 * ���D�G 1.�ڭ̭n�����O���V���a���{����ܡH���p��M�U�д��Ѫ�json�@�_�ϥΡH 2.�e�ݪ������H
 */
