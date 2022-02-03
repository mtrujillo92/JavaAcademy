package com.globant.miguel.exercise1;

public class MusicPlayer {
    private final Color color;
    private final Battery battery;
    private final Storage storage;

    public MusicPlayer (Color color, Battery battery, Storage storage){
        this.color = color;
        this.battery = battery;
        this.storage = storage;
    }

    public Color getColor() {
        return color;
    }

    public Battery getBattery() {
        return battery;
    }

    public Storage getStorage() {
        return storage;
    }
}
