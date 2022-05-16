	enum state {
		storeChecking, mealMaking, mealDelivering, mealArrived;
		
		public void setState() {
			
		}
		
		public String getState() {
			switch (this.name()) {
			case "storeChecking":
				return "正在等待商家確認訂單";
			case "mealMaking":
				return "餐點製作中";
			case "mealDelivering":
				return "餐點運送中";
			case "mealArrived":
				return "餐點已抵達";
			default:
				return "unknown state";
			}
		}
		
	}