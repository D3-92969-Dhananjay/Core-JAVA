package code.string;

public class TraficlightTest {
    public static void main(String[] args) {
        System.out.println("Traffic Light Timings:");

        for (TraficLight light : TraficLight.values()) {
            System.out.println(light + " light stays for " + light.getDuration() + " seconds.");
        }
    }
}

