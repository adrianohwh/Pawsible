
public class Owner {
	public String ownerID;
	public String ownerName;
	public String telephone;
	public String address;
	public String email;

	//Prices
	public float priceForSchool;
	public float priceForBoarding;
	public float priceForTransport;
	public float multiplier = 1; //Offer: 30% = minus 0.3, Peak: 20% = +0.2
	
	public void PeakPeriod(boolean peak) {
		if (peak)
			multiplier += 0.2f;
	}
	
	public void AddDiscount(float discountPerc) {
		multiplier -= discountPerc;
		
		if (multiplier < 0.3f)
			multiplier = 0.3f;
	}
	
	public float GetTotalPrice() {
		return (priceForTransport + priceForSchool + priceForTransport) * multiplier;
	}
	
	public float CalculateFinalTotal(boolean peak, float discountPerc, float staticDiscount) {
		float finalTotal;
		PeakPeriod(peak);
		AddDiscount(discountPerc);
		finalTotal = GetTotalPrice();
		return finalTotal - staticDiscount;
	}
	
	public void main(String[] args) {
		CalculateFinalTotal(true, 0, 20); //(peak, disc%, flatdisc)
	}
}
