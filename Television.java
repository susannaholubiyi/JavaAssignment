import java.util.ArrayList;

public class Television {

    private boolean isOn;
    private int volume;
    private ArrayList<String> channels;

    public Television(){
        channels = new ArrayList<>;
        volume = 0;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public int getVolume() {
        return volume;
    }

    public ArrayList<String> getChannels() {
        return channels;
    }

    public int increaseButton() {
        if(isOn)
            if(volume < 100)
                return volume ++;
            else
                return volume;
        else
            return volume;
    }

    public int decreaseButton(){
        if(isOn)
            if(volume > 0)
                return volume --;
            else
                return volume;
        else
            return volume;
    }

    public int[] changeChannel(){
        for(int channel = 0; channel < channels.size())
    }
}
