package Week02;

public class Labs7_8 {

	public static void main(String[] args) {
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.10;
				break;
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
			default:
				loyaltyMemberDiscount = 0.0;
						
		}
		System.out.println("Your discount is $" + loyaltyMemberDiscount);
		
		double billTotal = 1500.95;
		double adjustedTotal = billTotal - billTotal * loyaltyMemberDiscount;
		System.out.format("Your adjusted total is $" + String.format("%.2f", adjustedTotal) + "." + '\n');
		
		if (adjustedTotal > 500) {
			switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberStatus = "GOLD";
				System.out.println("Congratulations! You are now a " + loyaltyMemberStatus + " member!");
				break;
			case "GOLD":
				loyaltyMemberStatus = "PLATINUM";
				System.out.println("Congratulations! You are now a " + loyaltyMemberStatus + " member!");
				break;	 
			default:
				break;
			}
		}
	}

}
