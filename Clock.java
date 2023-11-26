public class Clock{

  private int hour;

  private int minute;

  private int second;


    public Clock(int hour, int minute, int second){

		this.hour = hour;

		this.minute = minute;
		
		this.second = second;
	}


      public void setHour(int hour){
		if((hour >= 0) || (hour <24)){
		}
			if (hour > 23 ){
			hour = 00;
			}
		this.hour = hour;
	}


      public int getHour(){
		return hour;
	}


      public void setMinute (int minute){
		if((minute >= 1) || (minute <60)){
		this.minute = minute;
		}
			if (minute > 59){
			minute = 00;
			}
		this.minute = 0;
	}


      public int getMinute(){
		return minute;
	}


      public void setSecond (int second){
		if((second >= 1) || (second <60)){
		}
			if (second > 59){
			second = 00;
			}
		this.second = second;
	}

      public int getSecond(){
		return second;
	}
  

      public String displayTime(){
		String displayTime = ("The time is " + hour + ":" + minute + ":" + second );
		return displayTime;
	}

}