public class Bike {

    private int speed;
    private boolean isOn;
    private int gear;


    public int getGear(){
        return gear;
    }

    public int getSpeed(){
       return speed;
    }

    public boolean isOn() {

            return isOn;

    }

    public void toggle() {
        isOn = !isOn;
        if (isOn) gear =1;
    }

    public void changeGear(){
        if(speed >= 0 && speed <= 20){
            gear = 1;
        }

        else if (speed >= 21 && speed <= 30){
            gear = 2;
        }
        else if (speed >= 31 && speed <= 40) {
            gear = 3;
        }
        else if(speed >= 41){
            gear = 4;
        }
    }
    public void accelerateSpeed(){

        if(isOn && gear == 1) {
            speed++;
        } else if (isOn && gear == 2){
            speed +=2;
        } else if (isOn && gear == 3) {
            speed +=3;
        } else if (isOn && gear == 4) {
            speed +=4;
        }

        changeGear();

    }

    public void decelerateSpeed(){
        if(isOn && gear == 1) {
            speed--;
        } else if (isOn && gear == 2){
            speed -=2;
        } else if (isOn && gear == 3) {
            speed -=3;
        } else if (isOn && gear == 4) {
            speed -=4;
        }
        if (isOn && speed <= 0) speed = 0;

        changeGear();
    }
}
