/**
 * 
 * Possible current states of the order.
 * 
 * @author �\����
 *
 */
enum state {
	storeChecking, mealMaking, mealDelivering, mealArrived;
	
	/**
	 * @return State of the order.
	 */
	public String getState() {
		switch (this.name()) {
		case "storeChecking":
			return "���b���ݰӮa�T�{�q��";
		case "mealMaking":
			return "�\�I�s�@��";
		case "mealDelivering":
			return "�\�I�B�e��";
		case "mealArrived":
			return "�\�I�w��F";
		default:
			return "unknown state";
		}
	}
	
}