
public class Car{
 
 private String model;

   private String year;

     private double price;


      public Car (String model, String year, double price){
	
		this.model = model;
		
		this.year = year;

		if (price < 0){
		this.price = price;
		}
		if (price > 0){
		this.price = price;
		}
	}

	public void setModel(){
		this.model = model;
	}

	public String getModel(){
		return model;
	}

	public void setYear(){
		this.year = year;
	}

	public String getYear(){
		return year;
	}

	public void setPrice(double price){
		if(price > 0 ){
		this.price = price;
		}
	}

	public double getPrice(){
		return price;
	}

	public double getFivePercentDiscount(){
		double fivePercentDiscount = (price - (price * 0.05));
		return fivePercentDiscount;
	}
	
	public double getSevenPercentDiscount(){
		double sevenPercentDiscount = (price - (price * 0.7));
		return sevenPercentDiscount;
	}




}