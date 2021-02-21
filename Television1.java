
public class Television1 {
    private String Manufacturer;
    private  int ScreenSize;
    boolean powerOn;
    int Channel;
    int volume;

    public Television1(String Manufacturer, int ScreenSize) {
        this.Manufacturer = Manufacturer;
        this.ScreenSize = ScreenSize;

        powerOn = false;
        Channel = 20 ;
        volume = 3;
    }
        public void setChannel(int station){
            this.Channel = Channel;
        }
        public void setVolume(int volume){
        this.volume = volume;
        }
        public void increaseVolume(int volume){
        volume += 1;
        }
        public void decreaseVolume(int volume) {
        volume -= 1;
        }
        public int getChannel(){
        return Channel;
        }
        public int getVolume(){
        return volume;
        }
        public String getManufacturer(){
        return Manufacturer;
        }
        public int getScreenSize(){
         return ScreenSize;
        }
        public boolean isPowerOn(){
        return  powerOn;
        }
        public int getIncreaseVolume(){
        return volume = volume + 1;
        }
        public int getDecreaseVolume(){
        return volume = volume - 1;
    }
}
