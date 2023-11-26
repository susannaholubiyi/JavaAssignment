public class Account{

 private String name;

  private double balance;

       
    public Account(String name, double balance){
		this.name = name;
	if (balance > 0){
		this.balance  = balance;
		}
		
	}

        public void deposit(double depositAmount){
		if (depositAmount >0.0){
		balance = balance + depositAmount;
		if (depositAmount < 0.0) System.out.print ("Can only accept deposits above $0");
		}
	}

          public double getBalance(){
		return balance;
	}


            public void setName(String name){
		this.name = name;
	}

             public String getName(){
		return name;
	}

              public double withdraw(double withdrawAmount){
		
		if (withdrawAmount > 0)

		if (withdrawAmount < balance){
		balance  = balance - withdrawAmount;
             
		System.out.print("Withdrawal successful!");
                 return balance;
                 
		}
	
                if(withdrawAmount > balance) { 
		System.out.print("Withdrawal amount has exceeded balance");
		
		
	}

		return balance;
       }    


}