package main.com.adventure.world.objects;
import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content;
    private boolean isCovered;

    /**
     *
     * @param key Assign the class variable to the method variable
     *
     */
    public HoleContent(Key key) {
        this.content = key;
        this.isCovered = true;
    }

    public void setCovered(boolean isHoleCovered) {
        this.isCovered = isHoleCovered;
    }
    public boolean isCovered() {
        return this.isCovered;
    }

    public Key getKey() {
        return this.content;
    }
}

