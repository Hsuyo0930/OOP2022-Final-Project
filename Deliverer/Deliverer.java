/**
 * This is the Deliverer class used in OOP Final Project.
 * 
 * @author �\����
 *
 */
public class Deliverer {
	
	private String Account_Number;// �b��
	private String Password;// �K�X
	private String Phone_Number;// �q�ܸ��X
	private String email_Account;// �H�c�b��
	private String Name;// �~�e���m�W
	private boolean IsBusyNow;// �O�_����
	private Order CurrentOrder;// �ثe�q��
	
	/**
	 * Default Constructor
	 */
	public Deliverer() {
		Account_Number = null;
		Password = null;
		Phone_Number = null;
		email_Account = null;
		Name = null;
		IsBusyNow = false;
		CurrentOrder = null;
	}
	
	/**
	 * Constructor
	 * 
	 * @param Account_Number - The app account of the deliverer.
	 * @param Password       - The app password of the deliverer.
	 * @param Phone_Number   - The Phone number of the deliverer.
	 * @param email_Account  - The email account of the deliverer.
	 * @param Name           - The name of the deliverer.
	 */
	public Deliverer(String Account_Number, String Password, String Phone_Number, String email_Account, String Name,
			Order order) {
		this.Account_Number = Account_Number;
		this.Password = Password;
		this.Phone_Number = Phone_Number;
		this.email_Account = email_Account;
		this.Name = Name;
		IsBusyNow = false;
		this.CurrentOrder = order;
	}
	
	public boolean getOrder(Order order) {
		if (IsBusyNow) { // �~�e���S��->���楢��
			return false;
		} else { // �~�e������ ->���榨�\
			CurrentOrder = order;
			return true;
		}
	}
	
	/**
	 * To check if the order is received by the deliverer.
	 * 
	 * @return {@code true} if deliverer already received the order, {@code false}
	 *         otherwise.
	 */
	public boolean IsOrderReceived() {
		
		return true;
	}
	
}
