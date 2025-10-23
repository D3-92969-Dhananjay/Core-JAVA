package code.string;

public enum TraficLight {
    red(30), 
    green(45), 
    yellow(5);

    private int duration; 

   
    TraficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

