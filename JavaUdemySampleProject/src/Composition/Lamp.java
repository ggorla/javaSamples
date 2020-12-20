package Composition;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public void turnOn(){
        System.out.println("turning on light");
    }
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
}
