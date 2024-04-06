class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distance;
    int battery=100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;
        this.batteryDrain=batteryDrain;
    }

    public boolean batteryDrained() {
        return battery<=0;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
       if(battery!=0){
            distance+=speed;
            battery-=batteryDrain;
       }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance=distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        if(distance%car.speed==0){
            return ((distance/car.speed)*car.batteryDrain)<=100;
        }
        return ((distance/car.speed)+1)*car.batteryDrain<=100;
    }
}
