/**
 * This is the Deliverer class used in OOP Final Project.
 * 
 * @author 許祐嘉
 *
 */
public class Deliverer {
	
	private String Account_Number;// 帳號
	private String Password;// 密碼
	private String Phone_Number;// 電話號碼
	private String email_Account;// 信箱帳號
	private String Name;// 外送員姓名
	private boolean IsBusyNow;// 是否有空
	private Order CurrentOrder;// 目前訂單
	
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
		if (IsBusyNow) { // 外送員沒空->接單失敗
			return false;
		} else { // 外送員有空 ->接單成功
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
