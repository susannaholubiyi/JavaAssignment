public class PetrolPurchase{

 private String location;

  private String type;

   private int quantity;

    private double price;

     private double percentageDiscount;



       public PetrolPurchase(String location, String type, int quantity, double price, double percentageDiscount){

        	this.location = location;

		this.type = type;

		if (quantity > 0){
			this.quantity = quantity;
			}
		if (price > 0.0){
			this.price = price;
			}
		if (percentageDiscount  > 0.0){
			this.percentageDiscount = percentageDiscount;
			}
	}

     

           public void setLocation(String location){
 		this.location = location;
	}

	   public String getLocation(){
		return location;
	}
              
           public void setType(String type){
		this.type = type;
	}

           public String getType(){
		return location;
	}

           public void setQuantity(int quantity){
		if (quantity > 0){
		this.quantity = quantity;
			}
	}

	   public int getQuantity(){
		return quantity;
	}


           public void setPrice(double price){
		if (price >0.0){
		this.price = price;
			}
	}

           public double getPrice(){
		return price;
	}

	   public void setPercentageDiscount(double percentageDiscount){
		if (percentageDiscount > 0.0){
		this.percentageDiscount = percentageDiscount;
			}
	}


	   public void setPurchaseAmount(){
		
		
	}
	public double getPurchaseAmount(){
		double purchaseAmount = ((quantity * price) - (quantity * price * percentageDiscount));
		return purchaseAmount;
	}

	   

        





}