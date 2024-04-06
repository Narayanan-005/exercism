public class ElonsToyCar {
    int driven;
    int battery=100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+driven+" meters";
    }

    public String batteryDisplay() {
        if(battery==0){
            return "Battery empty";
        }
        return "Battery at "+battery+"%";
    }

    public void drive() {
        if(battery!=0){
            driven+=20;
            battery--;
        }
    }
}
